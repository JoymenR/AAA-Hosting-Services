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

package com.lithan.liferay.service.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ServicLocalService}.
 *
 * @author joymen
 * @see ServicLocalService
 * @generated
 */
public class ServicLocalServiceWrapper implements ServicLocalService,
	ServiceWrapper<ServicLocalService> {
	public ServicLocalServiceWrapper(ServicLocalService servicLocalService) {
		_servicLocalService = servicLocalService;
	}

	/**
	* Adds the servic to the database. Also notifies the appropriate model listeners.
	*
	* @param servic the servic
	* @return the servic that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.lithan.liferay.service.model.Servic addServic(
		com.lithan.liferay.service.model.Servic servic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.addServic(servic);
	}

	/**
	* Creates a new servic with the primary key. Does not add the servic to the database.
	*
	* @param servicId the primary key for the new servic
	* @return the new servic
	*/
	@Override
	public com.lithan.liferay.service.model.Servic createServic(long servicId) {
		return _servicLocalService.createServic(servicId);
	}

	/**
	* Deletes the servic with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param servicId the primary key of the servic
	* @return the servic that was removed
	* @throws PortalException if a servic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.lithan.liferay.service.model.Servic deleteServic(long servicId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.deleteServic(servicId);
	}

	/**
	* Deletes the servic from the database. Also notifies the appropriate model listeners.
	*
	* @param servic the servic
	* @return the servic that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.lithan.liferay.service.model.Servic deleteServic(
		com.lithan.liferay.service.model.Servic servic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.deleteServic(servic);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _servicLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lithan.liferay.service.model.impl.ServicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lithan.liferay.service.model.impl.ServicModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.lithan.liferay.service.model.Servic fetchServic(long servicId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.fetchServic(servicId);
	}

	/**
	* Returns the servic with the matching UUID and company.
	*
	* @param uuid the servic's UUID
	* @param companyId the primary key of the company
	* @return the matching servic, or <code>null</code> if a matching servic could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.lithan.liferay.service.model.Servic fetchServicByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.fetchServicByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the servic matching the UUID and group.
	*
	* @param uuid the servic's UUID
	* @param groupId the primary key of the group
	* @return the matching servic, or <code>null</code> if a matching servic could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.lithan.liferay.service.model.Servic fetchServicByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.fetchServicByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the servic with the primary key.
	*
	* @param servicId the primary key of the servic
	* @return the servic
	* @throws PortalException if a servic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.lithan.liferay.service.model.Servic getServic(long servicId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.getServic(servicId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the servic with the matching UUID and company.
	*
	* @param uuid the servic's UUID
	* @param companyId the primary key of the company
	* @return the matching servic
	* @throws PortalException if a matching servic could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.lithan.liferay.service.model.Servic getServicByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.getServicByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the servic matching the UUID and group.
	*
	* @param uuid the servic's UUID
	* @param groupId the primary key of the group
	* @return the matching servic
	* @throws PortalException if a matching servic could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.lithan.liferay.service.model.Servic getServicByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.getServicByUuidAndGroupId(uuid, groupId);
	}

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
	@Override
	public java.util.List<com.lithan.liferay.service.model.Servic> getServics(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.getServics(start, end);
	}

	/**
	* Returns the number of servics.
	*
	* @return the number of servics
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getServicsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.getServicsCount();
	}

	/**
	* Updates the servic in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param servic the servic
	* @return the servic that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.lithan.liferay.service.model.Servic updateServic(
		com.lithan.liferay.service.model.Servic servic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.updateServic(servic);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _servicLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_servicLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _servicLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.lithan.liferay.service.model.Servic> getServicsByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.getServicsByGroupId(groupId);
	}

	@Override
	public java.util.List<com.lithan.liferay.service.model.Servic> getServicsByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.getServicsByGroupId(groupId, start, end);
	}

	@Override
	public int getServicsCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.getServicsCountByGroupId(groupId);
	}

	@Override
	public com.lithan.liferay.service.model.Servic addServic(long userId,
		long groupId, java.lang.String servicName,
		java.lang.String servicPrice, java.lang.String servicDescription,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.addServic(userId, groupId, servicName,
			servicPrice, servicDescription, serviceContext);
	}

	@Override
	public com.lithan.liferay.service.model.Servic updateServic(long userId,
		long servicId, java.lang.String servicName,
		java.lang.String servicPrice, java.lang.String servicDescription,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _servicLocalService.updateServic(userId, servicId, servicName,
			servicPrice, servicDescription, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ServicLocalService getWrappedServicLocalService() {
		return _servicLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedServicLocalService(
		ServicLocalService servicLocalService) {
		_servicLocalService = servicLocalService;
	}

	@Override
	public ServicLocalService getWrappedService() {
		return _servicLocalService;
	}

	@Override
	public void setWrappedService(ServicLocalService servicLocalService) {
		_servicLocalService = servicLocalService;
	}

	private ServicLocalService _servicLocalService;
}