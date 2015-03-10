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

package com.pacnet.connect.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link FacilityExternalVisitorService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       FacilityExternalVisitorService
 * @generated
 */
public class FacilityExternalVisitorServiceWrapper
	implements FacilityExternalVisitorService,
		ServiceWrapper<FacilityExternalVisitorService> {
	public FacilityExternalVisitorServiceWrapper(
		FacilityExternalVisitorService facilityExternalVisitorService) {
		_facilityExternalVisitorService = facilityExternalVisitorService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _facilityExternalVisitorService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_facilityExternalVisitorService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _facilityExternalVisitorService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public FacilityExternalVisitorService getWrappedFacilityExternalVisitorService() {
		return _facilityExternalVisitorService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedFacilityExternalVisitorService(
		FacilityExternalVisitorService facilityExternalVisitorService) {
		_facilityExternalVisitorService = facilityExternalVisitorService;
	}

	public FacilityExternalVisitorService getWrappedService() {
		return _facilityExternalVisitorService;
	}

	public void setWrappedService(
		FacilityExternalVisitorService facilityExternalVisitorService) {
		_facilityExternalVisitorService = facilityExternalVisitorService;
	}

	private FacilityExternalVisitorService _facilityExternalVisitorService;
}