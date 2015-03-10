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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.pacnet.connect.service.FacilityStaffMappingLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author CloudSmartz
 */
public class FacilityStaffMappingClp extends BaseModelImpl<FacilityStaffMapping>
	implements FacilityStaffMapping {
	public FacilityStaffMappingClp() {
	}

	public Class<?> getModelClass() {
		return FacilityStaffMapping.class;
	}

	public String getModelClassName() {
		return FacilityStaffMapping.class.getName();
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("facilityId", getFacilityId());
		attributes.put("staffUserId", getStaffUserId());
		attributes.put("isActive", getIsActive());
		attributes.put("createdOn", getCreatedOn());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedOn", getUpdatedOn());
		attributes.put("updatedBy", getUpdatedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long facilityId = (Long)attributes.get("facilityId");

		if (facilityId != null) {
			setFacilityId(facilityId);
		}

		Long staffUserId = (Long)attributes.get("staffUserId");

		if (staffUserId != null) {
			setStaffUserId(staffUserId);
		}

		Boolean isActive = (Boolean)attributes.get("isActive");

		if (isActive != null) {
			setIsActive(isActive);
		}

		Date createdOn = (Date)attributes.get("createdOn");

		if (createdOn != null) {
			setCreatedOn(createdOn);
		}

		String createdBy = (String)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date updatedOn = (Date)attributes.get("updatedOn");

		if (updatedOn != null) {
			setUpdatedOn(updatedOn);
		}

		String updatedBy = (String)attributes.get("updatedBy");

		if (updatedBy != null) {
			setUpdatedBy(updatedBy);
		}
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getFacilityId() {
		return _facilityId;
	}

	public void setFacilityId(long facilityId) {
		_facilityId = facilityId;
	}

	public long getStaffUserId() {
		return _staffUserId;
	}

	public void setStaffUserId(long staffUserId) {
		_staffUserId = staffUserId;
	}

	public String getStaffUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getStaffUserId(), "uuid", _staffUserUuid);
	}

	public void setStaffUserUuid(String staffUserUuid) {
		_staffUserUuid = staffUserUuid;
	}

	public boolean getIsActive() {
		return _isActive;
	}

	public boolean isIsActive() {
		return _isActive;
	}

	public void setIsActive(boolean isActive) {
		_isActive = isActive;
	}

	public Date getCreatedOn() {
		return _createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		_createdOn = createdOn;
	}

	public String getCreatedBy() {
		return _createdBy;
	}

	public void setCreatedBy(String createdBy) {
		_createdBy = createdBy;
	}

	public Date getUpdatedOn() {
		return _updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		_updatedOn = updatedOn;
	}

	public String getUpdatedBy() {
		return _updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		_updatedBy = updatedBy;
	}

	public BaseModel<?> getFacilityStaffMappingRemoteModel() {
		return _facilityStaffMappingRemoteModel;
	}

	public void setFacilityStaffMappingRemoteModel(
		BaseModel<?> facilityStaffMappingRemoteModel) {
		_facilityStaffMappingRemoteModel = facilityStaffMappingRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			FacilityStaffMappingLocalServiceUtil.addFacilityStaffMapping(this);
		}
		else {
			FacilityStaffMappingLocalServiceUtil.updateFacilityStaffMapping(this);
		}
	}

	@Override
	public FacilityStaffMapping toEscapedModel() {
		return (FacilityStaffMapping)Proxy.newProxyInstance(FacilityStaffMapping.class.getClassLoader(),
			new Class[] { FacilityStaffMapping.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FacilityStaffMappingClp clone = new FacilityStaffMappingClp();

		clone.setId(getId());
		clone.setFacilityId(getFacilityId());
		clone.setStaffUserId(getStaffUserId());
		clone.setIsActive(getIsActive());
		clone.setCreatedOn(getCreatedOn());
		clone.setCreatedBy(getCreatedBy());
		clone.setUpdatedOn(getUpdatedOn());
		clone.setUpdatedBy(getUpdatedBy());

		return clone;
	}

	public int compareTo(FacilityStaffMapping facilityStaffMapping) {
		long primaryKey = facilityStaffMapping.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		FacilityStaffMappingClp facilityStaffMapping = null;

		try {
			facilityStaffMapping = (FacilityStaffMappingClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = facilityStaffMapping.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", facilityId=");
		sb.append(getFacilityId());
		sb.append(", staffUserId=");
		sb.append(getStaffUserId());
		sb.append(", isActive=");
		sb.append(getIsActive());
		sb.append(", createdOn=");
		sb.append(getCreatedOn());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append(", updatedOn=");
		sb.append(getUpdatedOn());
		sb.append(", updatedBy=");
		sb.append(getUpdatedBy());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.pacnet.connect.model.FacilityStaffMapping");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>facilityId</column-name><column-value><![CDATA[");
		sb.append(getFacilityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>staffUserId</column-name><column-value><![CDATA[");
		sb.append(getStaffUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isActive</column-name><column-value><![CDATA[");
		sb.append(getIsActive());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdOn</column-name><column-value><![CDATA[");
		sb.append(getCreatedOn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updatedOn</column-name><column-value><![CDATA[");
		sb.append(getUpdatedOn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updatedBy</column-name><column-value><![CDATA[");
		sb.append(getUpdatedBy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _facilityId;
	private long _staffUserId;
	private String _staffUserUuid;
	private boolean _isActive;
	private Date _createdOn;
	private String _createdBy;
	private Date _updatedOn;
	private String _updatedBy;
	private BaseModel<?> _facilityStaffMappingRemoteModel;
}