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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.pacnet.connect.service.http.SMAReservationServiceSoap}.
 *
 * @author    CloudSmartz
 * @see       com.pacnet.connect.service.http.SMAReservationServiceSoap
 * @generated
 */
public class SMAReservationSoap implements Serializable {
	public static SMAReservationSoap toSoapModel(SMAReservation model) {
		SMAReservationSoap soapModel = new SMAReservationSoap();

		soapModel.setId(model.getId());
		soapModel.setName(model.getName());
		soapModel.setStartDate(model.getStartDate());
		soapModel.setEndDate(model.getEndDate());
		soapModel.setOwner(model.getOwner());
		soapModel.setProvision(model.getProvision());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedOn(model.getCreatedOn());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedOn(model.getUpdatedOn());
		soapModel.setUpdatedBy(model.getUpdatedBy());

		return soapModel;
	}

	public static SMAReservationSoap[] toSoapModels(SMAReservation[] models) {
		SMAReservationSoap[] soapModels = new SMAReservationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SMAReservationSoap[][] toSoapModels(SMAReservation[][] models) {
		SMAReservationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SMAReservationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SMAReservationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SMAReservationSoap[] toSoapModels(List<SMAReservation> models) {
		List<SMAReservationSoap> soapModels = new ArrayList<SMAReservationSoap>(models.size());

		for (SMAReservation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SMAReservationSoap[soapModels.size()]);
	}

	public SMAReservationSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public Date getStartDate() {
		return _startDate;
	}

	public void setStartDate(Date startDate) {
		_startDate = startDate;
	}

	public Date getEndDate() {
		return _endDate;
	}

	public void setEndDate(Date endDate) {
		_endDate = endDate;
	}

	public String getOwner() {
		return _owner;
	}

	public void setOwner(String owner) {
		_owner = owner;
	}

	public int getProvision() {
		return _provision;
	}

	public void setProvision(int provision) {
		_provision = provision;
	}

	public int getIsActive() {
		return _isActive;
	}

	public void setIsActive(int isActive) {
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

	private long _id;
	private String _name;
	private Date _startDate;
	private Date _endDate;
	private String _owner;
	private int _provision;
	private int _isActive;
	private Date _createdOn;
	private String _createdBy;
	private Date _updatedOn;
	private String _updatedBy;
}