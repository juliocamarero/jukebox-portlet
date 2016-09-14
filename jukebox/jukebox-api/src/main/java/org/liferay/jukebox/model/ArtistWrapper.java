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

package org.liferay.jukebox.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Artist}.
 * </p>
 *
 * @author Julio Camarero
 * @see Artist
 * @generated
 */
@ProviderType
public class ArtistWrapper implements Artist, ModelWrapper<Artist> {
	public ArtistWrapper(Artist artist) {
		_artist = artist;
	}

	@Override
	public Class<?> getModelClass() {
		return Artist.class;
	}

	@Override
	public String getModelClassName() {
		return Artist.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("artistId", getArtistId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("name", getName());
		attributes.put("bio", getBio());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long artistId = (Long)attributes.get("artistId");

		if (artistId != null) {
			setArtistId(artistId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String bio = (String)attributes.get("bio");

		if (bio != null) {
			setBio(bio);
		}
	}

	@Override
	public Artist toEscapedModel() {
		return new ArtistWrapper(_artist.toEscapedModel());
	}

	@Override
	public Artist toUnescapedModel() {
		return new ArtistWrapper(_artist.toUnescapedModel());
	}

	@Override
	public boolean hasCustomImage()
		throws com.liferay.portal.kernel.exception.PortalException {
		return _artist.hasCustomImage();
	}

	/**
	* Returns <code>true</code> if this artist is approved.
	*
	* @return <code>true</code> if this artist is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _artist.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _artist.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this artist is denied.
	*
	* @return <code>true</code> if this artist is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _artist.isDenied();
	}

	/**
	* Returns <code>true</code> if this artist is a draft.
	*
	* @return <code>true</code> if this artist is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _artist.isDraft();
	}

	@Override
	public boolean isEscapedModel() {
		return _artist.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this artist is expired.
	*
	* @return <code>true</code> if this artist is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _artist.isExpired();
	}

	/**
	* Returns <code>true</code> if this artist is in the Recycle Bin.
	*
	* @return <code>true</code> if this artist is in the Recycle Bin; <code>false</code> otherwise
	*/
	@Override
	public boolean isInTrash() {
		return _artist.isInTrash();
	}

	/**
	* Returns <code>true</code> if the parent of this artist is in the Recycle Bin.
	*
	* @return <code>true</code> if the parent of this artist is in the Recycle Bin; <code>false</code> otherwise
	*/
	@Override
	public boolean isInTrashContainer() {
		return _artist.isInTrashContainer();
	}

	@Override
	public boolean isInTrashExplicitly() {
		return _artist.isInTrashExplicitly();
	}

	@Override
	public boolean isInTrashImplicitly() {
		return _artist.isInTrashImplicitly();
	}

	/**
	* Returns <code>true</code> if this artist is inactive.
	*
	* @return <code>true</code> if this artist is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _artist.isInactive();
	}

	/**
	* Returns <code>true</code> if this artist is incomplete.
	*
	* @return <code>true</code> if this artist is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _artist.isIncomplete();
	}

	@Override
	public boolean isNew() {
		return _artist.isNew();
	}

	/**
	* Returns <code>true</code> if this artist is pending.
	*
	* @return <code>true</code> if this artist is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _artist.isPending();
	}

	/**
	* Returns <code>true</code> if this artist is scheduled.
	*
	* @return <code>true</code> if this artist is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _artist.isScheduled();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _artist.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Artist> toCacheModel() {
		return _artist.toCacheModel();
	}

	@Override
	public com.liferay.portal.kernel.repository.model.FileEntry getCustomImage() {
		return _artist.getCustomImage();
	}

	/**
	* Returns the trash handler for this artist.
	*
	* @return the trash handler for this artist
	*/
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return _artist.getTrashHandler();
	}

	/**
	* Returns the trash entry created when this artist was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this artist.
	*
	* @return the trash entry created when this artist was moved to the Recycle Bin
	*/
	@Override
	public com.liferay.trash.kernel.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException {
		return _artist.getTrashEntry();
	}

	@Override
	public int compareTo(Artist artist) {
		return _artist.compareTo(artist);
	}

	/**
	* Returns the status of this artist.
	*
	* @return the status of this artist
	*/
	@Override
	public int getStatus() {
		return _artist.getStatus();
	}

	@Override
	public int hashCode() {
		return _artist.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _artist.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ArtistWrapper((Artist)_artist.clone());
	}

	/**
	* Returns the bio of this artist.
	*
	* @return the bio of this artist
	*/
	@Override
	public java.lang.String getBio() {
		return _artist.getBio();
	}

	@Override
	public java.lang.String getImageURL(
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _artist.getImageURL(themeDisplay);
	}

	/**
	* Returns the name of this artist.
	*
	* @return the name of this artist
	*/
	@Override
	public java.lang.String getName() {
		return _artist.getName();
	}

	/**
	* Returns the status by user name of this artist.
	*
	* @return the status by user name of this artist
	*/
	@Override
	public java.lang.String getStatusByUserName() {
		return _artist.getStatusByUserName();
	}

	/**
	* Returns the status by user uuid of this artist.
	*
	* @return the status by user uuid of this artist
	*/
	@Override
	public java.lang.String getStatusByUserUuid() {
		return _artist.getStatusByUserUuid();
	}

	/**
	* Returns the user name of this artist.
	*
	* @return the user name of this artist
	*/
	@Override
	public java.lang.String getUserName() {
		return _artist.getUserName();
	}

	/**
	* Returns the user uuid of this artist.
	*
	* @return the user uuid of this artist
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _artist.getUserUuid();
	}

	/**
	* Returns the uuid of this artist.
	*
	* @return the uuid of this artist
	*/
	@Override
	public java.lang.String getUuid() {
		return _artist.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _artist.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _artist.toXmlString();
	}

	/**
	* Returns the create date of this artist.
	*
	* @return the create date of this artist
	*/
	@Override
	public Date getCreateDate() {
		return _artist.getCreateDate();
	}

	/**
	* Returns the modified date of this artist.
	*
	* @return the modified date of this artist
	*/
	@Override
	public Date getModifiedDate() {
		return _artist.getModifiedDate();
	}

	/**
	* Returns the status date of this artist.
	*
	* @return the status date of this artist
	*/
	@Override
	public Date getStatusDate() {
		return _artist.getStatusDate();
	}

	/**
	* Returns the artist ID of this artist.
	*
	* @return the artist ID of this artist
	*/
	@Override
	public long getArtistId() {
		return _artist.getArtistId();
	}

	/**
	* Returns the company ID of this artist.
	*
	* @return the company ID of this artist
	*/
	@Override
	public long getCompanyId() {
		return _artist.getCompanyId();
	}

	/**
	* Returns the group ID of this artist.
	*
	* @return the group ID of this artist
	*/
	@Override
	public long getGroupId() {
		return _artist.getGroupId();
	}

	/**
	* Returns the primary key of this artist.
	*
	* @return the primary key of this artist
	*/
	@Override
	public long getPrimaryKey() {
		return _artist.getPrimaryKey();
	}

	/**
	* Returns the status by user ID of this artist.
	*
	* @return the status by user ID of this artist
	*/
	@Override
	public long getStatusByUserId() {
		return _artist.getStatusByUserId();
	}

	/**
	* Returns the class primary key of the trash entry for this artist.
	*
	* @return the class primary key of the trash entry for this artist
	*/
	@Override
	public long getTrashEntryClassPK() {
		return _artist.getTrashEntryClassPK();
	}

	/**
	* Returns the user ID of this artist.
	*
	* @return the user ID of this artist
	*/
	@Override
	public long getUserId() {
		return _artist.getUserId();
	}

	@Override
	public void persist() {
		_artist.persist();
	}

	/**
	* Sets the artist ID of this artist.
	*
	* @param artistId the artist ID of this artist
	*/
	@Override
	public void setArtistId(long artistId) {
		_artist.setArtistId(artistId);
	}

	/**
	* Sets the bio of this artist.
	*
	* @param bio the bio of this artist
	*/
	@Override
	public void setBio(java.lang.String bio) {
		_artist.setBio(bio);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_artist.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this artist.
	*
	* @param companyId the company ID of this artist
	*/
	@Override
	public void setCompanyId(long companyId) {
		_artist.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this artist.
	*
	* @param createDate the create date of this artist
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_artist.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_artist.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_artist.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_artist.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this artist.
	*
	* @param groupId the group ID of this artist
	*/
	@Override
	public void setGroupId(long groupId) {
		_artist.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this artist.
	*
	* @param modifiedDate the modified date of this artist
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_artist.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this artist.
	*
	* @param name the name of this artist
	*/
	@Override
	public void setName(java.lang.String name) {
		_artist.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_artist.setNew(n);
	}

	/**
	* Sets the primary key of this artist.
	*
	* @param primaryKey the primary key of this artist
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_artist.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_artist.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this artist.
	*
	* @param status the status of this artist
	*/
	@Override
	public void setStatus(int status) {
		_artist.setStatus(status);
	}

	/**
	* Sets the status by user ID of this artist.
	*
	* @param statusByUserId the status by user ID of this artist
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_artist.setStatusByUserId(statusByUserId);
	}

	/**
	* Sets the status by user name of this artist.
	*
	* @param statusByUserName the status by user name of this artist
	*/
	@Override
	public void setStatusByUserName(java.lang.String statusByUserName) {
		_artist.setStatusByUserName(statusByUserName);
	}

	/**
	* Sets the status by user uuid of this artist.
	*
	* @param statusByUserUuid the status by user uuid of this artist
	*/
	@Override
	public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
		_artist.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Sets the status date of this artist.
	*
	* @param statusDate the status date of this artist
	*/
	@Override
	public void setStatusDate(Date statusDate) {
		_artist.setStatusDate(statusDate);
	}

	/**
	* Sets the user ID of this artist.
	*
	* @param userId the user ID of this artist
	*/
	@Override
	public void setUserId(long userId) {
		_artist.setUserId(userId);
	}

	/**
	* Sets the user name of this artist.
	*
	* @param userName the user name of this artist
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_artist.setUserName(userName);
	}

	/**
	* Sets the user uuid of this artist.
	*
	* @param userUuid the user uuid of this artist
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_artist.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this artist.
	*
	* @param uuid the uuid of this artist
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_artist.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ArtistWrapper)) {
			return false;
		}

		ArtistWrapper artistWrapper = (ArtistWrapper)obj;

		if (Objects.equals(_artist, artistWrapper._artist)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _artist.getStagedModelType();
	}

	@Override
	public Artist getWrappedModel() {
		return _artist;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _artist.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _artist.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_artist.resetOriginalValues();
	}

	private final Artist _artist;
}