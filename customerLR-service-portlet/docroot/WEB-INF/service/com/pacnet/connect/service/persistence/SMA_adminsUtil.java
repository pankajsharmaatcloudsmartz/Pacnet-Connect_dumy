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

package com.pacnet.connect.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.pacnet.connect.model.SMA_admins;

import java.util.List;

/**
 * The persistence utility for the s m a_admins service. This utility wraps {@link SMA_adminsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloudSmartz
 * @see SMA_adminsPersistence
 * @see SMA_adminsPersistenceImpl
 * @generated
 */
public class SMA_adminsUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(SMA_admins sma_admins) {
		getPersistence().clearCache(sma_admins);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SMA_admins> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SMA_admins> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SMA_admins> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static SMA_admins update(SMA_admins sma_admins, boolean merge)
		throws SystemException {
		return getPersistence().update(sma_admins, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static SMA_admins update(SMA_admins sma_admins, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(sma_admins, merge, serviceContext);
	}

	/**
	* Caches the s m a_admins in the entity cache if it is enabled.
	*
	* @param sma_admins the s m a_admins
	*/
	public static void cacheResult(
		com.pacnet.connect.model.SMA_admins sma_admins) {
		getPersistence().cacheResult(sma_admins);
	}

	/**
	* Caches the s m a_adminses in the entity cache if it is enabled.
	*
	* @param sma_adminses the s m a_adminses
	*/
	public static void cacheResult(
		java.util.List<com.pacnet.connect.model.SMA_admins> sma_adminses) {
		getPersistence().cacheResult(sma_adminses);
	}

	/**
	* Creates a new s m a_admins with the primary key. Does not add the s m a_admins to the database.
	*
	* @param id the primary key for the new s m a_admins
	* @return the new s m a_admins
	*/
	public static com.pacnet.connect.model.SMA_admins create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the s m a_admins with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the s m a_admins
	* @return the s m a_admins that was removed
	* @throws com.pacnet.connect.NoSuchSMA_adminsException if a s m a_admins with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_admins remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_adminsException {
		return getPersistence().remove(id);
	}

	public static com.pacnet.connect.model.SMA_admins updateImpl(
		com.pacnet.connect.model.SMA_admins sma_admins, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(sma_admins, merge);
	}

	/**
	* Returns the s m a_admins with the primary key or throws a {@link com.pacnet.connect.NoSuchSMA_adminsException} if it could not be found.
	*
	* @param id the primary key of the s m a_admins
	* @return the s m a_admins
	* @throws com.pacnet.connect.NoSuchSMA_adminsException if a s m a_admins with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_admins findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.pacnet.connect.NoSuchSMA_adminsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the s m a_admins with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the s m a_admins
	* @return the s m a_admins, or <code>null</code> if a s m a_admins with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.pacnet.connect.model.SMA_admins fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the s m a_adminses.
	*
	* @return the s m a_adminses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMA_admins> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the s m a_adminses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a_adminses
	* @param end the upper bound of the range of s m a_adminses (not inclusive)
	* @return the range of s m a_adminses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMA_admins> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the s m a_adminses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s m a_adminses
	* @param end the upper bound of the range of s m a_adminses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of s m a_adminses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.pacnet.connect.model.SMA_admins> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the s m a_adminses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of s m a_adminses.
	*
	* @return the number of s m a_adminses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SMA_adminsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SMA_adminsPersistence)PortletBeanLocatorUtil.locate(com.pacnet.connect.service.ClpSerializer.getServletContextName(),
					SMA_adminsPersistence.class.getName());

			ReferenceRegistry.registerReference(SMA_adminsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(SMA_adminsPersistence persistence) {
	}

	private static SMA_adminsPersistence _persistence;
}