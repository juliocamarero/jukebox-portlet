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
 * Provides the remote service utility for Artist. This utility wraps
 * {@link org.liferay.jukebox.service.impl.ArtistServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Julio Camarero
 * @see ArtistService
 * @see org.liferay.jukebox.service.base.ArtistServiceBaseImpl
 * @see org.liferay.jukebox.service.impl.ArtistServiceImpl
 * @generated
 */
@ProviderType
public class ArtistServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.liferay.jukebox.service.impl.ArtistServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static int getArtistsCount(long groupId) {
		return getService().getArtistsCount(groupId);
	}

	public static int getArtistsCount(long groupId, java.lang.String keywords) {
		return getService().getArtistsCount(groupId, keywords);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<org.liferay.jukebox.model.Artist> getArtists(
		long groupId) {
		return getService().getArtists(groupId);
	}

	public static java.util.List<org.liferay.jukebox.model.Artist> getArtists(
		long groupId, int start, int end) {
		return getService().getArtists(groupId, start, end);
	}

	public static java.util.List<org.liferay.jukebox.model.Artist> getArtists(
		long groupId, java.lang.String keywords) {
		return getService().getArtists(groupId, keywords);
	}

	public static org.liferay.jukebox.model.Artist addArtist(
		java.lang.String name, java.lang.String bio,
		java.io.InputStream inputStream,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().addArtist(name, bio, inputStream, serviceContext);
	}

	public static org.liferay.jukebox.model.Artist deleteArtist(long artistId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteArtist(artistId, serviceContext);
	}

	public static org.liferay.jukebox.model.Artist updateArtist(long artistId,
		java.lang.String name, java.lang.String bio,
		java.io.InputStream inputStream,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateArtist(artistId, name, bio, inputStream,
			serviceContext);
	}

	public static ArtistService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ArtistService, ArtistService> _serviceTracker = ServiceTrackerFactory.open(ArtistService.class);
}