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

package com.pacnet.connect.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.pacnet.connect.model.FacilityAccess;
import com.pacnet.connect.model.FacilityAccessModel;
import com.pacnet.connect.model.FacilityAccessSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the FacilityAccess service. Represents a row in the &quot;Facility_Service&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.pacnet.connect.model.FacilityAccessModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FacilityAccessImpl}.
 * </p>
 *
 * @author CloudSmartz
 * @see FacilityAccessImpl
 * @see com.pacnet.connect.model.FacilityAccess
 * @see com.pacnet.connect.model.FacilityAccessModel
 * @generated
 */
@JSON(strict = true)
public class FacilityAccessModelImpl extends BaseModelImpl<FacilityAccess>
	implements FacilityAccessModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a facility access model instance should use the {@link com.pacnet.connect.model.FacilityAccess} interface instead.
	 */
	public static final String TABLE_NAME = "Facility_Service";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "Name", Types.VARCHAR },
			{ "Label", Types.VARCHAR },
			{ "IsActive", Types.BOOLEAN },
			{ "Created_On", Types.TIMESTAMP },
			{ "Created_By", Types.VARCHAR },
			{ "Updated_On", Types.TIMESTAMP },
			{ "Updated_By", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table Facility_Service (ID LONG not null primary key IDENTITY,Name VARCHAR(75) null,Label VARCHAR(75) null,IsActive BOOLEAN,Created_On DATE null,Created_By VARCHAR(75) null,Updated_On DATE null,Updated_By VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Facility_Service";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.pacnet.connect.model.FacilityAccess"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.pacnet.connect.model.FacilityAccess"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.pacnet.connect.model.FacilityAccess"),
			true);
	public static long NAME_COLUMN_BITMASK = 1L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static FacilityAccess toModel(FacilityAccessSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		FacilityAccess model = new FacilityAccessImpl();

		model.setId(soapModel.getId());
		model.setName(soapModel.getName());
		model.setLabel(soapModel.getLabel());
		model.setIsActive(soapModel.getIsActive());
		model.setCreatedOn(soapModel.getCreatedOn());
		model.setCreatedBy(soapModel.getCreatedBy());
		model.setUpdatedOn(soapModel.getUpdatedOn());
		model.setUpdatedBy(soapModel.getUpdatedBy());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<FacilityAccess> toModels(FacilityAccessSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<FacilityAccess> models = new ArrayList<FacilityAccess>(soapModels.length);

		for (FacilityAccessSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.pacnet.connect.model.FacilityAccess"));

	public FacilityAccessModelImpl() {
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

	public Class<?> getModelClass() {
		return FacilityAccess.class;
	}

	public String getModelClassName() {
		return FacilityAccess.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("label", getLabel());
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String label = (String)attributes.get("label");

		if (label != null) {
			setLabel(label);
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

	@JSON
	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	@JSON
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	public void setName(String name) {
		_columnBitmask |= NAME_COLUMN_BITMASK;

		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	@JSON
	public String getLabel() {
		if (_label == null) {
			return StringPool.BLANK;
		}
		else {
			return _label;
		}
	}

	public void setLabel(String label) {
		_label = label;
	}

	@JSON
	public boolean getIsActive() {
		return _isActive;
	}

	public boolean isIsActive() {
		return _isActive;
	}

	public void setIsActive(boolean isActive) {
		_isActive = isActive;
	}

	@JSON
	public Date getCreatedOn() {
		return _createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		_createdOn = createdOn;
	}

	@JSON
	public String getCreatedBy() {
		if (_createdBy == null) {
			return StringPool.BLANK;
		}
		else {
			return _createdBy;
		}
	}

	public void setCreatedBy(String createdBy) {
		_createdBy = createdBy;
	}

	@JSON
	public Date getUpdatedOn() {
		return _updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		_updatedOn = updatedOn;
	}

	@JSON
	public String getUpdatedBy() {
		if (_updatedBy == null) {
			return StringPool.BLANK;
		}
		else {
			return _updatedBy;
		}
	}

	public void setUpdatedBy(String updatedBy) {
		_updatedBy = updatedBy;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			FacilityAccess.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public FacilityAccess toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (FacilityAccess)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		FacilityAccessImpl facilityAccessImpl = new FacilityAccessImpl();

		facilityAccessImpl.setId(getId());
		facilityAccessImpl.setName(getName());
		facilityAccessImpl.setLabel(getLabel());
		facilityAccessImpl.setIsActive(getIsActive());
		facilityAccessImpl.setCreatedOn(getCreatedOn());
		facilityAccessImpl.setCreatedBy(getCreatedBy());
		facilityAccessImpl.setUpdatedOn(getUpdatedOn());
		facilityAccessImpl.setUpdatedBy(getUpdatedBy());

		facilityAccessImpl.resetOriginalValues();

		return facilityAccessImpl;
	}

	public int compareTo(FacilityAccess facilityAccess) {
		long primaryKey = facilityAccess.getPrimaryKey();

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

		FacilityAccess facilityAccess = null;

		try {
			facilityAccess = (FacilityAccess)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = facilityAccess.getPrimaryKey();

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
	public void resetOriginalValues() {
		FacilityAccessModelImpl facilityAccessModelImpl = this;

		facilityAccessModelImpl._originalName = facilityAccessModelImpl._name;

		facilityAccessModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<FacilityAccess> toCacheModel() {
		FacilityAccessCacheModel facilityAccessCacheModel = new FacilityAccessCacheModel();

		facilityAccessCacheModel.id = getId();

		facilityAccessCacheModel.name = getName();

		String name = facilityAccessCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			facilityAccessCacheModel.name = null;
		}

		facilityAccessCacheModel.label = getLabel();

		String label = facilityAccessCacheModel.label;

		if ((label != null) && (label.length() == 0)) {
			facilityAccessCacheModel.label = null;
		}

		facilityAccessCacheModel.isActive = getIsActive();

		Date createdOn = getCreatedOn();

		if (createdOn != null) {
			facilityAccessCacheModel.createdOn = createdOn.getTime();
		}
		else {
			facilityAccessCacheModel.createdOn = Long.MIN_VALUE;
		}

		facilityAccessCacheModel.createdBy = getCreatedBy();

		String createdBy = facilityAccessCacheModel.createdBy;

		if ((createdBy != null) && (createdBy.length() == 0)) {
			facilityAccessCacheModel.createdBy = null;
		}

		Date updatedOn = getUpdatedOn();

		if (updatedOn != null) {
			facilityAccessCacheModel.updatedOn = updatedOn.getTime();
		}
		else {
			facilityAccessCacheModel.updatedOn = Long.MIN_VALUE;
		}

		facilityAccessCacheModel.updatedBy = getUpdatedBy();

		String updatedBy = facilityAccessCacheModel.updatedBy;

		if ((updatedBy != null) && (updatedBy.length() == 0)) {
			facilityAccessCacheModel.updatedBy = null;
		}

		return facilityAccessCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", label=");
		sb.append(getLabel());
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
		sb.append("com.pacnet.connect.model.FacilityAccess");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>label</column-name><column-value><![CDATA[");
		sb.append(getLabel());
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

	private static ClassLoader _classLoader = FacilityAccess.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			FacilityAccess.class
		};
	private long _id;
	private String _name;
	private String _originalName;
	private String _label;
	private boolean _isActive;
	private Date _createdOn;
	private String _createdBy;
	private Date _updatedOn;
	private String _updatedBy;
	private long _columnBitmask;
	private FacilityAccess _escapedModelProxy;
}