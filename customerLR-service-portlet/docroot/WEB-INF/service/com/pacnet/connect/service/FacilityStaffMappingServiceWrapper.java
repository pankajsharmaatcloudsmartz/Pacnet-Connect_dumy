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
 * This class is a wrapper for {@link FacilityStaffMappingService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       FacilityStaffMappingService
 * @generated
 */
public class FacilityStaffMappingServiceWrapper
	implements FacilityStaffMappingService,
		ServiceWrapper<FacilityStaffMappingService> {
	public FacilityStaffMappingServiceWrapper(
		FacilityStaffMappingService facilityStaffMappingService) {
		_facilityStaffMappingService = facilityStaffMappingService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _facilityStaffMappingService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_facilityStaffMappingService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _facilityStaffMappingService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public FacilityStaffMappingService getWrappedFacilityStaffMappingService() {
		return _facilityStaffMappingService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedFacilityStaffMappingService(
		FacilityStaffMappingService facilityStaffMappingService) {
		_facilityStaffMappingService = facilityStaffMappingService;
	}

	public FacilityStaffMappingService getWrappedService() {
		return _facilityStaffMappingService;
	}

	public void setWrappedService(
		FacilityStaffMappingService facilityStaffMappingService) {
		_facilityStaffMappingService = facilityStaffMappingService;
	}

	private FacilityStaffMappingService _facilityStaffMappingService;
}