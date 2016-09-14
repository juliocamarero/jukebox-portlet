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

package org.liferay.jukebox.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Album. This utility wraps
 * {@link org.liferay.jukebox.service.impl.AlbumServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Julio Camarero
 * @see AlbumService
 * @see org.liferay.jukebox.service.base.AlbumServiceBaseImpl
 * @see org.liferay.jukebox.service.impl.AlbumServiceImpl
 * @generated
 */
@ProviderType
public class AlbumServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.liferay.jukebox.service.impl.AlbumServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static int getAlbumsCount(long groupId) {
		return getService().getAlbumsCount(groupId);
	}

	public static int getAlbumsCount(long groupId, java.lang.String keywords) {
		return getService().getAlbumsCount(groupId, keywords);
	}

	public static int getAlbumsCountByArtistId(long groupId, long artistId) {
		return getService().getAlbumsCountByArtistId(groupId, artistId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<org.liferay.jukebox.model.Album> getAlbums(
		long groupId) {
		return getService().getAlbums(groupId);
	}

	public static java.util.List<org.liferay.jukebox.model.Album> getAlbums(
		long groupId, int start, int end) {
		return getService().getAlbums(groupId, start, end);
	}

	public static java.util.List<org.liferay.jukebox.model.Album> getAlbums(
		long groupId, java.lang.String keywords) {
		return getService().getAlbums(groupId, keywords);
	}

	public static java.util.List<org.liferay.jukebox.model.Album> getAlbumsByArtistId(
		long groupId, long artistId) {
		return getService().getAlbumsByArtistId(groupId, artistId);
	}

	public static org.liferay.jukebox.model.Album addAlbum(long artistId,
		java.lang.String name, int year, java.io.InputStream inputStream,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .addAlbum(artistId, name, year, inputStream, serviceContext);
	}

	public static org.liferay.jukebox.model.Album deleteAlbum(long albumId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteAlbum(albumId, serviceContext);
	}

	public static org.liferay.jukebox.model.Album moveAlbumToTrash(long albumId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().moveAlbumToTrash(albumId);
	}

	public static org.liferay.jukebox.model.Album restoreAlbumFromTrash(
		long albumId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().restoreAlbumFromTrash(albumId);
	}

	public static org.liferay.jukebox.model.Album updateAlbum(long albumId,
		long artistId, java.lang.String name, int year,
		java.io.InputStream inputStream,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateAlbum(albumId, artistId, name, year, inputStream,
			serviceContext);
	}

	public static AlbumService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AlbumService, AlbumService> _serviceTracker = ServiceTrackerFactory.open(AlbumService.class);
}