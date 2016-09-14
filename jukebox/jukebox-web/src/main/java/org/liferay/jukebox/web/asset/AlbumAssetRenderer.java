/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.liferay.jukebox.web.asset;

import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.BaseJSPAssetRenderer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.LayoutConstants;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.trash.TrashRenderer;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;

import javax.servlet.http.HttpServletRequest;

import org.liferay.jukebox.model.Album;
import org.liferay.jukebox.service.permission.AlbumPermission;
import org.liferay.jukebox.util.PortletKeys;

/**
 * @author Julio Camarero
 */
public class AlbumAssetRenderer
	extends BaseJSPAssetRenderer<Album> implements TrashRenderer {

	public AlbumAssetRenderer(Album album) {
		_album = album;
	}

	@Override
	public Album getAssetObject() {
		return _album;
	}

	@Override
	public String getClassName() {
		return Album.class.getName();
	}

	@Override
	public long getClassPK() {
		return _album.getAlbumId();
	}

	@Override
	public long getGroupId() {
		return _album.getGroupId();
	}

	@Override
	public String getJspPath(HttpServletRequest request, String template) {
		if (template.equals(TEMPLATE_FULL_CONTENT)) {
			request.setAttribute("jukebox_album", _album);

			return "/html/albums/asset/" + template + ".jsp";
		}
		else {
			return null;
		}
	}

	public String getPortletId() {
		AssetRendererFactory assetRendererFactory = getAssetRendererFactory();

		return assetRendererFactory.getPortletId();
	}

	@Override
	public String getSummary(
		PortletRequest portletRequest, PortletResponse portletResponse) {

		String summary = _album.getName();

		return summary;
	}

	@Override
	public String getThumbnailPath(PortletRequest portletRequest)
		throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay)portletRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		String thumbnailSrc = _album.getImageURL(themeDisplay);

		if (Validator.isNotNull(thumbnailSrc)) {
			return thumbnailSrc;
		}

		return themeDisplay.getPortalURL() +
			"/jukebox-portlet/icons/albums.png";
	}

	@Override
	public String getTitle(Locale locale) {
		return _album.getName();
	}

	public String getType() {
		return AlbumAssetRendererFactory.TYPE;
	}

	@Override
	public PortletURL getURLEdit(
			LiferayPortletRequest liferayPortletRequest,
			LiferayPortletResponse liferayPortletResponse)
		throws Exception {

		PortletURL portletURL = liferayPortletResponse.createLiferayPortletURL(
			getControlPanelPlid(liferayPortletRequest), PortletKeys.ALBUMS,
			PortletRequest.RENDER_PHASE);

		portletURL.setParameter("jspPage", "/html/albums/edit_album.jsp");
		portletURL.setParameter("albumId", String.valueOf(_album.getAlbumId()));

		return portletURL;
	}

	@Override
	public String getURLView(
			LiferayPortletResponse liferayPortletResponse,
			WindowState windowState)
		throws Exception {

		PortletURL portletURL = liferayPortletResponse.createLiferayPortletURL(
			PortletKeys.ALBUMS, PortletRequest.RENDER_PHASE);

		portletURL.setParameter("jspPage", "/html/albums/view_album.jsp");
		portletURL.setParameter("albumId", String.valueOf(_album.getAlbumId()));
		portletURL.setWindowState(windowState);

		return portletURL.toString();
	}

	@Override
	public String getURLViewInContext(
		LiferayPortletRequest liferayPortletRequest,
		LiferayPortletResponse liferayPortletResponse,
		String noSuchEntryRedirect) {

		try {
			long plid = PortalUtil.getPlidFromPortletId(
				_album.getGroupId(), PortletKeys.ALBUMS);

			if (plid == LayoutConstants.DEFAULT_PLID) {
				return StringPool.BLANK;
			}

			PortletURL portletURL = PortletURLFactoryUtil.create(
				liferayPortletRequest, PortletKeys.ALBUMS, plid,
				PortletRequest.RENDER_PHASE);

			portletURL.setParameter("jspPage", "/html/albums/view_album.jsp");
			portletURL.setParameter(
				"albumId", String.valueOf(_album.getAlbumId()));

			return portletURL.toString();
		}
		catch (Exception e) {
		}

		return StringPool.BLANK;
	}

	@Override
	public long getUserId() {
		return _album.getUserId();
	}

	@Override
	public String getUserName() {
		return _album.getUserName();
	}

	@Override
	public String getUuid() {
		return _album.getUuid();
	}

	public boolean hasDeletePermission(PermissionChecker permissionChecker)
		throws PortalException {

		return AlbumPermission.contains(
			permissionChecker, _album.getAlbumId(), ActionKeys.DELETE);
	}

	@Override
	public boolean hasEditPermission(PermissionChecker permissionChecker)
		throws PortalException {

		return AlbumPermission.contains(
			permissionChecker, _album.getAlbumId(), ActionKeys.UPDATE);
	}

	@Override
	public boolean hasViewPermission(PermissionChecker permissionChecker)
		throws PortalException {

		return AlbumPermission.contains(
			permissionChecker, _album.getAlbumId(), ActionKeys.VIEW);
	}

	@Override
	public boolean isPrintable() {
		return true;
	}

	private Album _album;

}