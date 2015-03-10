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
 * This class is a wrapper for {@link FacilityStaffMappingLocalService}.
 * </p>
 *
 * @author    CloudSmartz
 * @see       FacilityStaffMappingLocalService
 * @generated
 */
public class FacilityStaffMappingLocalServiceWrapper
	implements FacilityStaffMappingLocalService,
		ServiceWrapper<FacilityStaffMappingLocalService> {
	public FacilityStaffMappingLocalServiceWrapper(
		FacilityStaffMappingLocalService facilityStaffMappingLocalService) {
		_facilityStaffMappingLocalService = facilityStaffMappingLocalService;
	}

	/**
	* Adds the facility staff mapping to the database. Also notifies the appropriate model listeners.
	*
	* @param facilityStaffMapping the facility staff mapping
	* @return the facility staff mapping that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityStaffMapping addFacilityStaffMapping(
		com.pacnet.connect.model.FacilityStaffMapping facilityStaffMapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityStaffMappingLocalService.addFacilityStaffMapping(facilityStaffMapping);
	}

	/**
	* Creates a new facility staff mapping with the primary key. Does not add the facility staff mapping to the database.
	*
	* @param id the primary key for the new facility staff mapping
	* @return the new facility staff mapping
	*/
	public com.pacnet.connect.model.FacilityStaffMapping createFacilityStaffMapping(
		long id) {
		return _facilityStaffMappingLocalService.createFacilityStaffMapping(id);
	}

	/**
	* Deletes the facility staff mapping with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the facility staff mapping
	* @return the facility staff mapping that was removed
	* @throws PortalException if a facility staff mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityStaffMapping deleteFacilityStaffMapping(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _facilityStaffMappingLocalService.deleteFacilityStaffMapping(id);
	}

	/**
	* Deletes the facility staff mapping from the database. Also notifies the appropriate model listeners.
	*
	* @param facilityStaffMapping the facility staff mapping
	* @return the facility staff mapping that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityStaffMapping deleteFacilityStaffMapping(
		com.pacnet.connect.model.FacilityStaffMapping facilityStaffMapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityStaffMappingLocalService.deleteFacilityStaffMapping(facilityStaffMapping);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _facilityStaffMappingLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityStaffMappingLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityStaffMappingLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityStaffMappingLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityStaffMappingLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.pacnet.connect.model.FacilityStaffMapping fetchFacilityStaffMapping(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityStaffMappingLocalService.fetchFacilityStaffMapping(id);
	}

	/**
	* Returns the facility staff mapping with the primary key.
	*
	* @param id the primary key of the facility staff mapping
	* @return the facility staff mapping
	* @throws PortalException if a facility staff mapping with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityStaffMapping getFacilityStaffMapping(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _facilityStaffMappingLocalService.getFacilityStaffMapping(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _facilityStaffMappingLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the facility staff mappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of facility staff mappings
	* @param end the upper bound of the range of facility staff mappings (not inclusive)
	* @return the range of facility staff mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityStaffMapping> getFacilityStaffMappings(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityStaffMappingLocalService.getFacilityStaffMappings(start,
			end);
	}

	/**
	* Returns the number of facility staff mappings.
	*
	* @return the number of facility staff mappings
	* @throws SystemException if a system exception occurred
	*/
	public int getFacilityStaffMappingsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityStaffMappingLocalService.getFacilityStaffMappingsCount();
	}

	/**
	* Updates the facility staff mapping in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param facilityStaffMapping the facility staff mapping
	* @return the facility staff mapping that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityStaffMapping updateFacilityStaffMapping(
		com.pacnet.connect.model.FacilityStaffMapping facilityStaffMapping)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityStaffMappingLocalService.updateFacilityStaffMapping(facilityStaffMapping);
	}

	/**
	* Updates the facility staff mapping in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param facilityStaffMapping the facility staff mapping
	* @param merge whether to merge the facility staff mapping with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the facility staff mapping that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityStaffMapping updateFacilityStaffMapping(
		com.pacnet.connect.model.FacilityStaffMapping facilityStaffMapping,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityStaffMappingLocalService.updateFacilityStaffMapping(facilityStaffMapping,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _facilityStaffMappingLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_facilityStaffMappingLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _facilityStaffMappingLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public com.pacnet.connect.model.FacilityStaffMapping createFacilityStaff(
		long faciltyId, long staffUserId, boolean isActive,
		java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn) {
		return _facilityStaffMappingLocalService.createFacilityStaff(faciltyId,
			staffUserId, isActive, createdBy, createdOn, updatedBy, updatedOn);
	}

	public com.pacnet.connect.model.FacilityStaffMapping updateFacilityStaff(
		long id, long faciltyId, long staffUserId, boolean isActive,
		java.lang.String createdBy, java.sql.Date createdOn,
		java.lang.String updatedBy, java.sql.Date updatedOn) {
		return _facilityStaffMappingLocalService.updateFacilityStaff(id,
			faciltyId, staffUserId, isActive, createdBy, createdOn, updatedBy,
			updatedOn);
	}

	public boolean deleteFacilityStaffMappingById(long id) {
		return _facilityStaffMappingLocalService.deleteFacilityStaffMappingById(id);
	}

	public java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findByFacilityStaffByFacility(
		long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityStaffMappingLocalService.findByFacilityStaffByFacility(faciltyId);
	}

	/**
	* Returns a range of all the facility staff mappings where faciltyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param faciltyId the facilty ID
	* @param start the lower bound of the range of facility staff mappings
	* @param end the upper bound of the range of facility staff mappings (not inclusive)
	* @return the range of matching facility staff mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findByFacilityStaffByFacility(
		long faciltyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityStaffMappingLocalService.findByFacilityStaffByFacility(faciltyId,
			start, end);
	}

	public java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findByFacilityStaffByStaffUserId(
		long staffUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityStaffMappingLocalService.findByFacilityStaffByStaffUserId(staffUserId);
	}

	/**
	* Returns a range of all the facility staff mappings where staffUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param staffUserId the staff user ID
	* @param start the lower bound of the range of facility staff mappings
	* @param end the upper bound of the range of facility staff mappings (not inclusive)
	* @return the range of matching facility staff mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findByFacilityStaffByStaffUserId(
		long staffUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityStaffMappingLocalService.findByFacilityStaffByStaffUserId(staffUserId,
			start, end);
	}

	/**
	* Returns an ordered range of all the facility staff mappings where staffUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param staffUserId the staff user ID
	* @param start the lower bound of the range of facility staff mappings
	* @param end the upper bound of the range of facility staff mappings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching facility staff mappings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findByFacilityStaffByStaffUserId(
		long staffUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityStaffMappingLocalService.findByFacilityStaffByStaffUserId(staffUserId,
			start, end, orderByComparator);
	}

	/**
	* Returns the first facility staff mapping in the ordered set where staffUserId = &#63;.
	*
	* @param staffUserId the staff user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility staff mapping
	* @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a matching facility staff mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityStaffMapping findByFacilityStaffByStaffUserId_First(
		long staffUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityStaffMappingException {
		return _facilityStaffMappingLocalService.findByFacilityStaffByStaffUserId_First(staffUserId,
			orderByComparator);
	}

	/**
	* Returns the first facility staff mapping in the ordered set where staffUserId = &#63;.
	*
	* @param staffUserId the staff user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching facility staff mapping, or <code>null</code> if a matching facility staff mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityStaffMapping fetchByFacilityStaffByStaffUserId_First(
		long staffUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityStaffMappingLocalService.fetchByFacilityStaffByStaffUserId_First(staffUserId,
			orderByComparator);
	}

	/**
	* Returns the last facility staff mapping in the ordered set where staffUserId = &#63;.
	*
	* @param staffUserId the staff user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching facility staff mapping
	* @throws com.pacnet.connect.NoSuchFacilityStaffMappingException if a matching facility staff mapping could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.pacnet.connect.model.FacilityStaffMapping findByFacilityStaffByStaffUserId_Last(
		long staffUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchFacilityStaffMappingException {
		return _facilityStaffMappingLocalService.findByFacilityStaffByStaffUserId_Last(staffUserId,
			orderByComparator);
	}

	public java.util.List<com.pacnet.connect.model.FacilityStaffMapping> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facilityStaffMappingLocalService.findAll();
	}

	public void removeByFacilityStaffByFacility(long faciltyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_facilityStaffMappingLocalService.removeByFacilityStaffByFacility(faciltyId);
	}

	/**
	* Removes all the facility staff mappings where staffUserId = &#63; from the database.
	*
	* @param staffUserId the staff user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFacilityStaffByStaffUserId(long staffUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_facilityStaffMappingLocalService.removeByFacilityStaffByStaffUserId(staffUserId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public FacilityStaffMappingLocalService getWrappedFacilityStaffMappingLocalService() {
		return _facilityStaffMappingLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedFacilityStaffMappingLocalService(
		FacilityStaffMappingLocalService facilityStaffMappingLocalService) {
		_facilityStaffMappingLocalService = facilityStaffMappingLocalService;
	}

	public FacilityStaffMappingLocalService getWrappedService() {
		return _facilityStaffMappingLocalService;
	}

	public void setWrappedService(
		FacilityStaffMappingLocalService facilityStaffMappingLocalService) {
		_facilityStaffMappingLocalService = facilityStaffMappingLocalService;
	}

	private FacilityStaffMappingLocalService _facilityStaffMappingLocalService;
}