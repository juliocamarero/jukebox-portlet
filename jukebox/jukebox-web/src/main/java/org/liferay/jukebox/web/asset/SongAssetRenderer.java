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
import com.liferay.trash.kernel.util.TrashUtil;

import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;

import javax.servlet.http.HttpServletRequest;

import org.liferay.jukebox.model.Song;
import org.liferay.jukebox.service.permission.SongPermission;
import org.liferay.jukebox.util.PortletKeys;

/**
 * @author Julio Camarero
 */
public class SongAssetRenderer
	extends BaseJSPAssetRenderer<Song> implements TrashRenderer {

	public SongAssetRenderer(Song song) {
		_song = song;
	}

	@Override
	public Song getAssetObject() {
		return _song;
	}

	@Override
	public String getClassName() {
		return Song.class.getName();
	}

	@Override
	public long getClassPK() {
		return _song.getSongId();
	}

	@Override
	public long getGroupId() {
		return _song.getGroupId();
	}

	@Override
	public String getJspPath(HttpServletRequest request, String template) {
		if (template.equals(TEMPLATE_FULL_CONTENT)) {
			request.setAttribute("jukebox_song", _song);

			return "/html/songs/asset/" + template + ".jsp";
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

		String summary = _song.getName();

		return summary;
	}

	@Override
	public String getThumbnailPath(PortletRequest portletRequest)
		throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay)portletRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		String thumbnailSrc = _song.getImageURL(themeDisplay);

		if (Validator.isNotNull(thumbnailSrc)) {
			return thumbnailSrc;
		}

		return themeDisplay.getPortalURL() + "/jukebox-portlet/icons/songs.png";
	}

	@Override
	public String getTitle(Locale locale) {
		if (!_song.isInTrash()) {
			return _song.getName();
		}

		return TrashUtil.getOriginalTitle(_song.getName());
	}

	public String getType() {
		return SongAssetRendererFactory.TYPE;
	}

	@Override
	public PortletURL getURLEdit(
			LiferayPortletRequest liferayPortletRequest,
			LiferayPortletResponse liferayPortletResponse)
		throws Exception {

		PortletURL portletURL = liferayPortletResponse.createLiferayPortletURL(
			getControlPanelPlid(liferayPortletRequest), PortletKeys.SONGS,
			PortletRequest.RENDER_PHASE);

		portletURL.setParameter("jspPage", "/html/songs/edit_song.jsp");
		portletURL.setParameter("songId", String.valueOf(_song.getSongId()));

		return portletURL;
	}

	@Override
	public String getURLView(
			LiferayPortletResponse liferayPortletResponse,
			WindowState windowState)
		throws Exception {

		PortletURL portletURL = liferayPortletResponse.createLiferayPortletURL(
			PortletKeys.SONGS, PortletRequest.RENDER_PHASE);

		portletURL.setParameter("jspPage", "/html/songs/view_song.jsp");
		portletURL.setParameter("songId", String.valueOf(_song.getSongId()));
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
				_song.getGroupId(), PortletKeys.SONGS);

			if (plid == LayoutConstants.DEFAULT_PLID) {
				return StringPool.BLANK;
			}

			PortletURL portletURL = PortletURLFactoryUtil.create(
				liferayPortletRequest, PortletKeys.SONGS, plid,
				PortletRequest.RENDER_PHASE);

			portletURL.setParameter("jspPage", "/html/songs/view_song.jsp");
			portletURL.setParameter(
				"songId", String.valueOf(_song.getSongId()));

			return portletURL.toString();
		}
		catch (Exception e) {
		}

		return StringPool.BLANK;
	}

	@Override
	public long getUserId() {
		return _song.getUserId();
	}

	@Override
	public String getUserName() {
		return _song.getUserName();
	}

	@Override
	public String getUuid() {
		return _song.getUuid();
	}

	public boolean hasDeletePermission(PermissionChecker permissionChecker)
		throws PortalException {

		return SongPermission.contains(
			permissionChecker, _song.getSongId(), ActionKeys.DELETE);
	}

	@Override
	public boolean hasEditPermission(PermissionChecker permissionChecker)
		throws PortalException {

		return SongPermission.contains(
			permissionChecker, _song.getSongId(), ActionKeys.UPDATE);
	}

	@Override
	public boolean hasViewPermission(PermissionChecker permissionChecker)
		throws PortalException {

		return SongPermission.contains(
			permissionChecker, _song.getSongId(), ActionKeys.VIEW);
	}

	@Override
	public boolean isPrintable() {
		return true;
	}

	private Song _song;

}