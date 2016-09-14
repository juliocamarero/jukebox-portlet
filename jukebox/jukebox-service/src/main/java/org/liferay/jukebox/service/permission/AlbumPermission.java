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

package org.liferay.jukebox.service.permission;

import com.liferay.exportimport.kernel.staging.permission.StagingPermissionUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.BaseModelPermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionChecker;

import org.liferay.jukebox.model.Album;
import org.liferay.jukebox.service.AlbumLocalService;
import org.liferay.jukebox.util.PortletKeys;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Julio Camarero
 * @author Sergio González
 * @author Eudaldo Alonso
 */
@Component(
	property = {"model.class.name=org.liferay.jukebox.model.Album"},
	service = BaseModelPermissionChecker.class
)
public class AlbumPermission implements BaseModelPermissionChecker {

	public static void check(
			PermissionChecker permissionChecker, Album album, String actionId)
		throws PortalException {

		if (!contains(permissionChecker, album, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(
			PermissionChecker permissionChecker, long albumId, String actionId)
		throws PortalException {

		Album album = _albumLocalService.getAlbum(albumId);

		check(permissionChecker, album, actionId);
	}

	public static boolean contains(
			PermissionChecker permissionChecker, Album album, String actionId)
		throws PortalException {

		Boolean hasPermission = StagingPermissionUtil.hasPermission(
			permissionChecker, album.getGroupId(), Album.class.getName(),
			album.getAlbumId(), PortletKeys.ALBUMS, actionId);

		if (hasPermission != null) {
			return hasPermission.booleanValue();
		}

		return permissionChecker.hasPermission(
			album.getGroupId(), Album.class.getName(), album.getAlbumId(),
			actionId);
	}

	public static boolean contains(
			PermissionChecker permissionChecker, long albumId, String actionId)
		throws PortalException {

		Album album = _albumLocalService.getAlbum(albumId);

		return contains(permissionChecker, album, actionId);
	}

	@Override
	public void checkBaseModel(
			PermissionChecker permissionChecker, long groupId, long primaryKey,
			String actionId)
		throws PortalException {

		check(permissionChecker, primaryKey, actionId);
	}

	@Reference(unbind = "-")
	protected void setAlbumLocalService(AlbumLocalService albumLocalService) {
		_albumLocalService = albumLocalService;
	}

	private static AlbumLocalService _albumLocalService;

}