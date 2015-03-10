/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.pacnet.connect.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the FacilityStaffMapping service. Represents a row in the &quot;Facility_Staff_Mapping&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.pacnet.connect.model.impl.FacilityStaffMappingModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.pacnet.connect.model.impl.FacilityStaffMappingImpl}.
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityStaffMapping
 * @see com.pacnet.connect.model.impl.FacilityStaffMappingImpl
 * @see com.pacnet.connect.model.impl.FacilityStaffMappingModelImpl
 * @generated
 */
public interface FacilityStaffMappingModel extends BaseModel<FacilityStaffMapping> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a facility staff mapping model instance should use the {@link FacilityStaffMapping} interface instead.
	 */

	/**
	 * Returns the primary key of this facility staff mapping.
	 *
	 * @return the primary key of this facility staff mapping
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this facility staff mapping.
	 *
	 * @param primaryKey the primary key of this facility staff mapping
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this facility staff mapping.
	 *
	 * @return the ID of this facility staff mapping
	 */
	public long getId();

	/**
	 * Sets the ID of this facility staff mapping.
	 *
	 * @param id the ID of this facility staff mapping
	 */
	public void setId(long id);

	/**
	 * Returns the facility ID of this facility staff mapping.
	 *
	 * @return the facility ID of this facility staff mapping
	 */
	public long getFacilityId();

	/**
	 * Sets the facility ID of this facility staff mapping.
	 *
	 * @param facilityId the facility ID of this facility staff mapping
	 */
	public void setFacilityId(long facilityId);

	/**
	 * Returns the staff user ID of this facility staff mapping.
	 *
	 * @return the staff user ID of this facility staff mapping
	 */
	public long getStaffUserId();

	/**
	 * Sets the staff user ID of this facility staff mapping.
	 *
	 * @param staffUserId the staff user ID of this facility staff mapping
	 */
	public void setStaffUserId(long staffUserId);

	/**
	 * Returns the staff user uuid of this facility staff mapping.
	 *
	 * @return the staff user uuid of this facility staff mapping
	 * @throws SystemException if a system exception occurred
	 */
	public String getStaffUserUuid() throws SystemException;

	/**
	 * Sets the staff user uuid of this facility staff mapping.
	 *
	 * @param staffUserUuid the staff user uuid of this facility staff mapping
	 */
	public void setStaffUserUuid(String staffUserUuid);

	/**
	 * Returns the is active of this facility staff mapping.
	 *
	 * @return the is active of this facility staff mapping
	 */
	public boolean getIsActive();

	/**
	 * Returns <code>true</code> if this facility staff mapping is is active.
	 *
	 * @return <code>true</code> if this facility staff mapping is is active; <code>false</code> otherwise
	 */
	public boolean isIsActive();

	/**
	 * Sets whether this facility staff mapping is is active.
	 *
	 * @param isActive the is active of this facility staff mapping
	 */
	public void setIsActive(boolean isActive);

	/**
	 * Returns the created on of this facility staff mapping.
	 *
	 * @return the created on of this facility staff mapping
	 */
	public Date getCreatedOn();

	/**
	 * Sets the created on of this facility staff mapping.
	 *
	 * @param createdOn the created on of this facility staff mapping
	 */
	public void setCreatedOn(Date createdOn);

	/**
	 * Returns the created by of this facility staff mapping.
	 *
	 * @return the created by of this facility staff mapping
	 */
	@AutoEscape
	public String getCreatedBy();

	/**
	 * Sets the created by of this facility staff mapping.
	 *
	 * @param createdBy the created by of this facility staff mapping
	 */
	public void setCreatedBy(String createdBy);

	/**
	 * Returns the updated on of this facility staff mapping.
	 *
	 * @return the updated on of this facility staff mapping
	 */
	public Date getUpdatedOn();

	/**
	 * Sets the updated on of this facility staff mapping.
	 *
	 * @param updatedOn the updated on of this facility staff mapping
	 */
	public void setUpdatedOn(Date updatedOn);

	/**
	 * Returns the updated by of this facility staff mapping.
	 *
	 * @return the updated by of this facility staff mapping
	 */
	@AutoEscape
	public String getUpdatedBy();

	/**
	 * Sets the updated by of this facility staff mapping.
	 *
	 * @param updatedBy the updated by of this facility staff mapping
	 */
	public void setUpdatedBy(String updatedBy);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(FacilityStaffMapping facilityStaffMapping);

	public int hashCode();

	public CacheModel<FacilityStaffMapping> toCacheModel();

	public FacilityStaffMapping toEscapedModel();

	public String toString();

	public String toXmlString();
}