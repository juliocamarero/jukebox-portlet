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
 * Provides the local service utility for Album. This utility wraps
 * {@link org.liferay.jukebox.service.impl.AlbumLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Julio Camarero
 * @see AlbumLocalService
 * @see org.liferay.jukebox.service.base.AlbumLocalServiceBaseImpl
 * @see org.liferay.jukebox.service.impl.AlbumLocalServiceImpl
 * @generated
 */
@ProviderType
public class AlbumLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.liferay.jukebox.service.impl.AlbumLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of albums.
	*
	* @return the number of albums
	*/
	public static int getAlbumsCount() {
		return getService().getAlbumsCount();
	}

	public static int getAlbumsCount(long groupId) {
		return getService().getAlbumsCount(groupId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.liferay.jukebox.model.impl.AlbumModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.liferay.jukebox.model.impl.AlbumModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the albums.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.liferay.jukebox.model.impl.AlbumModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of albums
	* @param end the upper bound of the range of albums (not inclusive)
	* @return the range of albums
	*/
	public static java.util.List<org.liferay.jukebox.model.Album> getAlbums(
		int start, int end) {
		return getService().getAlbums(start, end);
	}

	public static java.util.List<org.liferay.jukebox.model.Album> getAlbums(
		long groupId) {
		return getService().getAlbums(groupId);
	}

	public static java.util.List<org.liferay.jukebox.model.Album> getAlbums(
		long groupId, int start, int end) {
		return getService().getAlbums(groupId, start, end);
	}

	public static java.util.List<org.liferay.jukebox.model.Album> getAlbumsByArtistId(
		long artistId) {
		return getService().getAlbumsByArtistId(artistId);
	}

	/**
	* Returns all the albums matching the UUID and company.
	*
	* @param uuid the UUID of the albums
	* @param companyId the primary key of the company
	* @return the matching albums, or an empty list if no matches were found
	*/
	public static java.util.List<org.liferay.jukebox.model.Album> getAlbumsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getAlbumsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of albums matching the UUID and company.
	*
	* @param uuid the UUID of the albums
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of albums
	* @param end the upper bound of the range of albums (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching albums, or an empty list if no matches were found
	*/
	public static java.util.List<org.liferay.jukebox.model.Album> getAlbumsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<org.liferay.jukebox.model.Album> orderByComparator) {
		return getService()
				   .getAlbumsByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static org.liferay.jukebox.model.Album addAlbum(long userId,
		long artistId, java.lang.String name, int year,
		java.io.InputStream inputStream,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .addAlbum(userId, artistId, name, year, inputStream,
			serviceContext);
	}

	/**
	* Adds the album to the database. Also notifies the appropriate model listeners.
	*
	* @param album the album
	* @return the album that was added
	*/
	public static org.liferay.jukebox.model.Album addAlbum(
		org.liferay.jukebox.model.Album album) {
		return getService().addAlbum(album);
	}

	/**
	* Creates a new album with the primary key. Does not add the album to the database.
	*
	* @param albumId the primary key for the new album
	* @return the new album
	*/
	public static org.liferay.jukebox.model.Album createAlbum(long albumId) {
		return getService().createAlbum(albumId);
	}

	/**
	* Deletes the album with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param albumId the primary key of the album
	* @return the album that was removed
	* @throws PortalException if a album with the primary key could not be found
	*/
	public static org.liferay.jukebox.model.Album deleteAlbum(long albumId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteAlbum(albumId);
	}

	/**
	* Deletes the album from the database. Also notifies the appropriate model listeners.
	*
	* @param album the album
	* @return the album that was removed
	*/
	public static org.liferay.jukebox.model.Album deleteAlbum(
		org.liferay.jukebox.model.Album album) {
		return getService().deleteAlbum(album);
	}

	public static org.liferay.jukebox.model.Album fetchAlbum(long albumId) {
		return getService().fetchAlbum(albumId);
	}

	/**
	* Returns the album matching the UUID and group.
	*
	* @param uuid the album's UUID
	* @param groupId the primary key of the group
	* @return the matching album, or <code>null</code> if a matching album could not be found
	*/
	public static org.liferay.jukebox.model.Album fetchAlbumByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchAlbumByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the album with the primary key.
	*
	* @param albumId the primary key of the album
	* @return the album
	* @throws PortalException if a album with the primary key could not be found
	*/
	public static org.liferay.jukebox.model.Album getAlbum(long albumId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getAlbum(albumId);
	}

	/**
	* Returns the album matching the UUID and group.
	*
	* @param uuid the album's UUID
	* @param groupId the primary key of the group
	* @return the matching album
	* @throws PortalException if a matching album could not be found
	*/
	public static org.liferay.jukebox.model.Album getAlbumByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getAlbumByUuidAndGroupId(uuid, groupId);
	}

	public static org.liferay.jukebox.model.Album moveAlbumToTrash(
		long userId, long albumId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().moveAlbumToTrash(userId, albumId);
	}

	public static org.liferay.jukebox.model.Album restoreAlbumFromTrash(
		long userId, long albumId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().restoreAlbumFromTrash(userId, albumId);
	}

	public static org.liferay.jukebox.model.Album updateAlbum(long userId,
		long albumId, long artistId, java.lang.String name, int year,
		java.io.InputStream inputStream,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateAlbum(userId, albumId, artistId, name, year,
			inputStream, serviceContext);
	}

	/**
	* Updates the album in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param album the album
	* @return the album that was updated
	*/
	public static org.liferay.jukebox.model.Album updateAlbum(
		org.liferay.jukebox.model.Album album) {
		return getService().updateAlbum(album);
	}

	public static void addEntryResources(
		org.liferay.jukebox.model.Album album, boolean addGroupPermissions,
		boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService()
			.addEntryResources(album, addGroupPermissions, addGuestPermissions);
	}

	public static void addEntryResources(
		org.liferay.jukebox.model.Album album,
		java.lang.String[] groupPermissions, java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().addEntryResources(album, groupPermissions, guestPermissions);
	}

	public static void deleteAlbums(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().deleteAlbums(groupId);
	}

	public static void updateAsset(long userId,
		org.liferay.jukebox.model.Album album, long[] assetCategoryIds,
		java.lang.String[] assetTagNames, long[] assetLinkEntryIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService()
			.updateAsset(userId, album, assetCategoryIds, assetTagNames,
			assetLinkEntryIds);
	}

	public static AlbumLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AlbumLocalService, AlbumLocalService> _serviceTracker =
		ServiceTrackerFactory.open(AlbumLocalService.class);
}