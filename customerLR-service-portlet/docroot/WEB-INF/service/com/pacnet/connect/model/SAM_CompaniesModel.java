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
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the SAM_Companies service. Represents a row in the &quot;SAM_companies&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.pacnet.connect.model.impl.SAM_CompaniesModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.pacnet.connect.model.impl.SAM_CompaniesImpl}.
 * </p>
 *
 * @author CloudSmartz
 * @see SAM_Companies
 * @see com.pacnet.connect.model.impl.SAM_CompaniesImpl
 * @see com.pacnet.connect.model.impl.SAM_CompaniesModelImpl
 * @generated
 */
public interface SAM_CompaniesModel extends BaseModel<SAM_Companies> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a s a m_ companies model instance should use the {@link SAM_Companies} interface instead.
	 */

	/**
	 * Returns the primary key of this s a m_ companies.
	 *
	 * @return the primary key of this s a m_ companies
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this s a m_ companies.
	 *
	 * @param primaryKey the primary key of this s a m_ companies
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this s a m_ companies.
	 *
	 * @return the ID of this s a m_ companies
	 */
	public long getId();

	/**
	 * Sets the ID of this s a m_ companies.
	 *
	 * @param id the ID of this s a m_ companies
	 */
	public void setId(long id);

	/**
	 * Returns the customer_id of this s a m_ companies.
	 *
	 * @return the customer_id of this s a m_ companies
	 */
	public long getCustomer_id();

	/**
	 * Sets the customer_id of this s a m_ companies.
	 *
	 * @param customer_id the customer_id of this s a m_ companies
	 */
	public void setCustomer_id(long customer_id);

	/**
	 * Returns the company name of this s a m_ companies.
	 *
	 * @return the company name of this s a m_ companies
	 */
	@AutoEscape
	public String getCompanyName();

	/**
	 * Sets the company name of this s a m_ companies.
	 *
	 * @param companyName the company name of this s a m_ companies
	 */
	public void setCompanyName(String companyName);

	/**
	 * Returns the domains of this s a m_ companies.
	 *
	 * @return the domains of this s a m_ companies
	 */
	@AutoEscape
	public String getDomains();

	/**
	 * Sets the domains of this s a m_ companies.
	 *
	 * @param domains the domains of this s a m_ companies
	 */
	public void setDomains(String domains);

	/**
	 * Returns the groupname of this s a m_ companies.
	 *
	 * @return the groupname of this s a m_ companies
	 */
	@AutoEscape
	public String getGroupname();

	/**
	 * Sets the groupname of this s a m_ companies.
	 *
	 * @param groupname the groupname of this s a m_ companies
	 */
	public void setGroupname(String groupname);

	/**
	 * Returns the attribute of this s a m_ companies.
	 *
	 * @return the attribute of this s a m_ companies
	 */
	@AutoEscape
	public String getAttribute();

	/**
	 * Sets the attribute of this s a m_ companies.
	 *
	 * @param attribute the attribute of this s a m_ companies
	 */
	public void setAttribute(String attribute);

	/**
	 * Returns the op of this s a m_ companies.
	 *
	 * @return the op of this s a m_ companies
	 */
	@AutoEscape
	public String getOp();

	/**
	 * Sets the op of this s a m_ companies.
	 *
	 * @param op the op of this s a m_ companies
	 */
	public void setOp(String op);

	/**
	 * Returns the value of this s a m_ companies.
	 *
	 * @return the value of this s a m_ companies
	 */
	@AutoEscape
	public String getValue();

	/**
	 * Sets the value of this s a m_ companies.
	 *
	 * @param value the value of this s a m_ companies
	 */
	public void setValue(String value);

	/**
	 * Returns the max user of this s a m_ companies.
	 *
	 * @return the max user of this s a m_ companies
	 */
	public int getMaxUser();

	/**
	 * Sets the max user of this s a m_ companies.
	 *
	 * @param maxUser the max user of this s a m_ companies
	 */
	public void setMaxUser(int maxUser);

	/**
	 * Returns the is active of this s a m_ companies.
	 *
	 * @return the is active of this s a m_ companies
	 */
	public int getIsActive();

	/**
	 * Sets the is active of this s a m_ companies.
	 *
	 * @param IsActive the is active of this s a m_ companies
	 */
	public void setIsActive(int IsActive);

	/**
	 * Returns the created_ on of this s a m_ companies.
	 *
	 * @return the created_ on of this s a m_ companies
	 */
	public Date getCreated_On();

	/**
	 * Sets the created_ on of this s a m_ companies.
	 *
	 * @param Created_On the created_ on of this s a m_ companies
	 */
	public void setCreated_On(Date Created_On);

	/**
	 * Returns the created_ by of this s a m_ companies.
	 *
	 * @return the created_ by of this s a m_ companies
	 */
	@AutoEscape
	public String getCreated_By();

	/**
	 * Sets the created_ by of this s a m_ companies.
	 *
	 * @param Created_By the created_ by of this s a m_ companies
	 */
	public void setCreated_By(String Created_By);

	/**
	 * Returns the updated_ on of this s a m_ companies.
	 *
	 * @return the updated_ on of this s a m_ companies
	 */
	public Date getUpdated_On();

	/**
	 * Sets the updated_ on of this s a m_ companies.
	 *
	 * @param Updated_On the updated_ on of this s a m_ companies
	 */
	public void setUpdated_On(Date Updated_On);

	/**
	 * Returns the updated_ by of this s a m_ companies.
	 *
	 * @return the updated_ by of this s a m_ companies
	 */
	@AutoEscape
	public String getUpdated_By();

	/**
	 * Sets the updated_ by of this s a m_ companies.
	 *
	 * @param Updated_By the updated_ by of this s a m_ companies
	 */
	public void setUpdated_By(String Updated_By);

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

	public int compareTo(SAM_Companies sam_Companies);

	public int hashCode();

	public CacheModel<SAM_Companies> toCacheModel();

	public SAM_Companies toEscapedModel();

	public String toString();

	public String toXmlString();
}