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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Servic. This utility wraps
 * {@link com.lithan.liferay.service.service.impl.ServicLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author joymen
 * @see ServicLocalService
 * @see com.lithan.liferay.service.service.base.ServicLocalServiceBaseImpl
 * @see com.lithan.liferay.service.service.impl.ServicLocalServiceImpl
 * @generated
 */
public class ServicLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.lithan.liferay.service.service.impl.ServicLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the servic to the database. Also notifies the appropriate model listeners.
	*
	* @param servic the servic
	* @return the servic that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.lithan.liferay.service.model.Servic addServic(
		com.lithan.liferay.service.model.Servic servic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addServic(servic);
	}

	/**
	* Creates a new servic with the primary key. Does not add the servic to the database.
	*
	* @param servicId the primary key for the new servic
	* @return the new servic
	*/
	public static com.lithan.liferay.service.model.Servic createServic(
		long servicId) {
		return getService().createServic(servicId);
	}

	/**
	* Deletes the servic with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param servicId the primary key of the servic
	* @return the servic that was removed
	* @throws PortalException if a servic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lithan.liferay.service.model.Servic deleteServic(
		long servicId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteServic(servicId);
	}

	/**
	* Deletes the servic from the database. Also notifies the appropriate model listeners.
	*
	* @param servic the servic
	* @return the servic that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.lithan.liferay.service.model.Servic deleteServic(
		com.lithan.liferay.service.model.Servic servic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteServic(servic);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.lithan.liferay.service.model.Servic fetchServic(
		long servicId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchServic(servicId);
	}

	/**
	* Returns the servic with the matching UUID and company.
	*
	* @param uuid the servic's UUID
	* @param companyId the primary key of the company
	* @return the matching servic, or <code>null</code> if a matching servic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lithan.liferay.service.model.Servic fetchServicByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchServicByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the servic matching the UUID and group.
	*
	* @param uuid the servic's UUID
	* @param groupId the primary key of the group
	* @return the matching servic, or <code>null</code> if a matching servic could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lithan.liferay.service.model.Servic fetchServicByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchServicByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the servic with the primary key.
	*
	* @param servicId the primary key of the servic
	* @return the servic
	* @throws PortalException if a servic with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lithan.liferay.service.model.Servic getServic(
		long servicId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getServic(servicId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static com.lithan.liferay.service.model.Servic getServicByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getServicByUuidAndCompanyId(uuid, companyId);
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
	public static com.lithan.liferay.service.model.Servic getServicByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getServicByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<com.lithan.liferay.service.model.Servic> getServics(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getServics(start, end);
	}

	/**
	* Returns the number of servics.
	*
	* @return the number of servics
	* @throws SystemException if a system exception occurred
	*/
	public static int getServicsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getServicsCount();
	}

	/**
	* Updates the servic in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param servic the servic
	* @return the servic that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.lithan.liferay.service.model.Servic updateServic(
		com.lithan.liferay.service.model.Servic servic)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateServic(servic);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<com.lithan.liferay.service.model.Servic> getServicsByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getServicsByGroupId(groupId);
	}

	public static java.util.List<com.lithan.liferay.service.model.Servic> getServicsByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getServicsByGroupId(groupId, start, end);
	}

	public static int getServicsCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getServicsCountByGroupId(groupId);
	}

	public static com.lithan.liferay.service.model.Servic addServic(
		long userId, long groupId, java.lang.String servicName,
		java.lang.String servicPrice, java.lang.String servicDescription,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addServic(userId, groupId, servicName, servicPrice,
			servicDescription, serviceContext);
	}

	public static com.lithan.liferay.service.model.Servic updateServic(
		long userId, long servicId, java.lang.String servicName,
		java.lang.String servicPrice, java.lang.String servicDescription,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateServic(userId, servicId, servicName, servicPrice,
			servicDescription, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static ServicLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ServicLocalService.class.getName());

			if (invokableLocalService instanceof ServicLocalService) {
				_service = (ServicLocalService)invokableLocalService;
			}
			else {
				_service = new ServicLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ServicLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ServicLocalService service) {
	}

	private static ServicLocalService _service;
}