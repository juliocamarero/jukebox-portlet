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

import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.BaseAssetRendererFactory;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;

import org.liferay.jukebox.model.Song;
import org.liferay.jukebox.service.SongLocalService;
import org.liferay.jukebox.service.permission.SongPermission;
import org.liferay.jukebox.util.PortletKeys;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Julio Camarero
 */
@Component(
	immediate = true, property = {"javax.portlet.name=" + PortletKeys.SONGS},
	service = AssetRendererFactory.class
)
public class SongAssetRendererFactory extends BaseAssetRendererFactory<Song> {

	public static final String CLASS_NAME = Song.class.getName();

	public static final String TYPE = "song";

	public AssetRenderer<Song> getAssetRenderer(long classPK, int type)
		throws PortalException {

		Song song = _songLocalService.getSong(classPK);

		return new SongAssetRenderer(song);
	}

	public String getClassName() {
		return CLASS_NAME;
	}

	public String getType() {
		return TYPE;
	}

	@Override
	public boolean hasPermission(
			PermissionChecker permissionChecker, long classPK, String actionId)
		throws Exception {

		return SongPermission.contains(permissionChecker, classPK, actionId);
	}

	@Override
	public boolean isLinkable() {
		return _LINKABLE;
	}

	@Reference(unbind = "-")
	protected void setSongLocalService(SongLocalService songLocalService) {
		_songLocalService = songLocalService;
	}

	private static final boolean _LINKABLE = true;

	private static SongLocalService _songLocalService;

}