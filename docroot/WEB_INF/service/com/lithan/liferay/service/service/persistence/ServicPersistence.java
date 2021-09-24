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

package com.lithan.liferay.service.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.lithan.liferay.service.model.Servic;

/**
 * The persistence interface for the servic service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author joymen
 * @see ServicPersistenceImpl
 * @see ServicUtil
 * @generated
 */
public interface ServicPersistence extends BasePersistence<Servic> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ServicUtil} to access the servic persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the servics where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching servics
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lithan.liferay.service.model.Servic> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the servics where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lithan.liferay.service.model.impl.ServicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of servics
	* @param end the upper bound of the range of servics (not inclusive)
	* @return the range of matching servics
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lithan.liferay.service.model.Servic> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the servics where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lithan.liferay.service.model.impl.ServicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of servics
	* @param end the upper bound of the range of servics (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching servics
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lithan.liferay.service.model.Servic> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first servic in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching servic
	* @throws com.lithan.liferay.service.NoSuchServicException if a matching servic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.lithan.liferay.service.NoSuchServicException;

	/**
	* Returns the first servic in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching servic, or <code>null</code> if a matching servic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last servic in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching servic
	* @throws com.lithan.liferay.service.NoSuchServicException if a matching servic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.lithan.liferay.service.NoSuchServicException;

	/**
	* Returns the last servic in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching servic, or <code>null</code> if a matching servic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the servics before and after the current servic in the ordered set where uuid = &#63;.
	*
	* @param servicId the primary key of the current servic
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next servic
	* @throws com.lithan.liferay.service.NoSuchServicException if a servic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic[] findByUuid_PrevAndNext(
		long servicId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.lithan.liferay.service.NoSuchServicException;

	/**
	* Removes all the servics where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of servics where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching servics
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the servic where uuid = &#63; and groupId = &#63; or throws a {@link com.lithan.liferay.service.NoSuchServicException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching servic
	* @throws com.lithan.liferay.service.NoSuchServicException if a matching servic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.lithan.liferay.service.NoSuchServicException;

	/**
	* Returns the servic where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching servic, or <code>null</code> if a matching servic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the servic where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching servic, or <code>null</code> if a matching servic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the servic where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the servic that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.lithan.liferay.service.NoSuchServicException;

	/**
	* Returns the number of servics where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching servics
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the servics where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching servics
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lithan.liferay.service.model.Servic> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the servics where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lithan.liferay.service.model.impl.ServicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of servics
	* @param end the upper bound of the range of servics (not inclusive)
	* @return the range of matching servics
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lithan.liferay.service.model.Servic> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the servics where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lithan.liferay.service.model.impl.ServicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of servics
	* @param end the upper bound of the range of servics (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching servics
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lithan.liferay.service.model.Servic> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first servic in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching servic
	* @throws com.lithan.liferay.service.NoSuchServicException if a matching servic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.lithan.liferay.service.NoSuchServicException;

	/**
	* Returns the first servic in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching servic, or <code>null</code> if a matching servic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last servic in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching servic
	* @throws com.lithan.liferay.service.NoSuchServicException if a matching servic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.lithan.liferay.service.NoSuchServicException;

	/**
	* Returns the last servic in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching servic, or <code>null</code> if a matching servic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the servics before and after the current servic in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param servicId the primary key of the current servic
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next servic
	* @throws com.lithan.liferay.service.NoSuchServicException if a servic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic[] findByUuid_C_PrevAndNext(
		long servicId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.lithan.liferay.service.NoSuchServicException;

	/**
	* Removes all the servics where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of servics where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching servics
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the servics where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching servics
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lithan.liferay.service.model.Servic> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the servics where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lithan.liferay.service.model.impl.ServicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of servics
	* @param end the upper bound of the range of servics (not inclusive)
	* @return the range of matching servics
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lithan.liferay.service.model.Servic> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the servics where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lithan.liferay.service.model.impl.ServicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of servics
	* @param end the upper bound of the range of servics (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching servics
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lithan.liferay.service.model.Servic> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first servic in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching servic
	* @throws com.lithan.liferay.service.NoSuchServicException if a matching servic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.lithan.liferay.service.NoSuchServicException;

	/**
	* Returns the first servic in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching servic, or <code>null</code> if a matching servic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last servic in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching servic
	* @throws com.lithan.liferay.service.NoSuchServicException if a matching servic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.lithan.liferay.service.NoSuchServicException;

	/**
	* Returns the last servic in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching servic, or <code>null</code> if a matching servic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the servics before and after the current servic in the ordered set where groupId = &#63;.
	*
	* @param servicId the primary key of the current servic
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next servic
	* @throws com.lithan.liferay.service.NoSuchServicException if a servic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic[] findByGroupId_PrevAndNext(
		long servicId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.lithan.liferay.service.NoSuchServicException;

	/**
	* Returns all the servics that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching servics that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lithan.liferay.service.model.Servic> filterFindByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the servics that the user has permission to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lithan.liferay.service.model.impl.ServicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of servics
	* @param end the upper bound of the range of servics (not inclusive)
	* @return the range of matching servics that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lithan.liferay.service.model.Servic> filterFindByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the servics that the user has permissions to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lithan.liferay.service.model.impl.ServicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of servics
	* @param end the upper bound of the range of servics (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching servics that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lithan.liferay.service.model.Servic> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the servics before and after the current servic in the ordered set of servics that the user has permission to view where groupId = &#63;.
	*
	* @param servicId the primary key of the current servic
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next servic
	* @throws com.lithan.liferay.service.NoSuchServicException if a servic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic[] filterFindByGroupId_PrevAndNext(
		long servicId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.lithan.liferay.service.NoSuchServicException;

	/**
	* Removes all the servics where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of servics where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching servics
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of servics that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching servics that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the servic in the entity cache if it is enabled.
	*
	* @param servic the servic
	*/
	public void cacheResult(com.lithan.liferay.service.model.Servic servic);

	/**
	* Caches the servics in the entity cache if it is enabled.
	*
	* @param servics the servics
	*/
	public void cacheResult(
		java.util.List<com.lithan.liferay.service.model.Servic> servics);

	/**
	* Creates a new servic with the primary key. Does not add the servic to the database.
	*
	* @param servicId the primary key for the new servic
	* @return the new servic
	*/
	public com.lithan.liferay.service.model.Servic create(long servicId);

	/**
	* Removes the servic with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param servicId the primary key of the servic
	* @return the servic that was removed
	* @throws com.lithan.liferay.service.NoSuchServicException if a servic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic remove(long servicId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.lithan.liferay.service.NoSuchServicException;

	public com.lithan.liferay.service.model.Servic updateImpl(
		com.lithan.liferay.service.model.Servic servic)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the servic with the primary key or throws a {@link com.lithan.liferay.service.NoSuchServicException} if it could not be found.
	*
	* @param servicId the primary key of the servic
	* @return the servic
	* @throws com.lithan.liferay.service.NoSuchServicException if a servic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic findByPrimaryKey(
		long servicId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.lithan.liferay.service.NoSuchServicException;

	/**
	* Returns the servic with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param servicId the primary key of the servic
	* @return the servic, or <code>null</code> if a servic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lithan.liferay.service.model.Servic fetchByPrimaryKey(
		long servicId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the servics.
	*
	* @return the servics
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lithan.liferay.service.model.Servic> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the servics.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lithan.liferay.service.model.impl.ServicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of servics
	* @param end the upper bound of the range of servics (not inclusive)
	* @return the range of servics
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lithan.liferay.service.model.Servic> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the servics.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lithan.liferay.service.model.impl.ServicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of servics
	* @param end the upper bound of the range of servics (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of servics
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lithan.liferay.service.model.Servic> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the servics from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of servics.
	*
	* @return the number of servics
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}