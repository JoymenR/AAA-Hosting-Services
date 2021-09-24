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
 * Provides the local service utility for Customer. This utility wraps
 * {@link com.lithan.liferay.service.service.impl.CustomerLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author joymen
 * @see CustomerLocalService
 * @see com.lithan.liferay.service.service.base.CustomerLocalServiceBaseImpl
 * @see com.lithan.liferay.service.service.impl.CustomerLocalServiceImpl
 * @generated
 */
public class CustomerLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.lithan.liferay.service.service.impl.CustomerLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the customer to the database. Also notifies the appropriate model listeners.
	*
	* @param customer the customer
	* @return the customer that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.lithan.liferay.service.model.Customer addCustomer(
		com.lithan.liferay.service.model.Customer customer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addCustomer(customer);
	}

	/**
	* Creates a new customer with the primary key. Does not add the customer to the database.
	*
	* @param customerId the primary key for the new customer
	* @return the new customer
	*/
	public static com.lithan.liferay.service.model.Customer createCustomer(
		long customerId) {
		return getService().createCustomer(customerId);
	}

	/**
	* Deletes the customer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param customerId the primary key of the customer
	* @return the customer that was removed
	* @throws PortalException if a customer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lithan.liferay.service.model.Customer deleteCustomer(
		long customerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCustomer(customerId);
	}

	/**
	* Deletes the customer from the database. Also notifies the appropriate model listeners.
	*
	* @param customer the customer
	* @return the customer that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.lithan.liferay.service.model.Customer deleteCustomer(
		com.lithan.liferay.service.model.Customer customer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCustomer(customer);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lithan.liferay.service.model.impl.CustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lithan.liferay.service.model.impl.CustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.lithan.liferay.service.model.Customer fetchCustomer(
		long customerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCustomer(customerId);
	}

	/**
	* Returns the customer with the matching UUID and company.
	*
	* @param uuid the customer's UUID
	* @param companyId the primary key of the company
	* @return the matching customer, or <code>null</code> if a matching customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lithan.liferay.service.model.Customer fetchCustomerByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCustomerByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the customer matching the UUID and group.
	*
	* @param uuid the customer's UUID
	* @param groupId the primary key of the group
	* @return the matching customer, or <code>null</code> if a matching customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lithan.liferay.service.model.Customer fetchCustomerByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCustomerByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the customer with the primary key.
	*
	* @param customerId the primary key of the customer
	* @return the customer
	* @throws PortalException if a customer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lithan.liferay.service.model.Customer getCustomer(
		long customerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCustomer(customerId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the customer with the matching UUID and company.
	*
	* @param uuid the customer's UUID
	* @param companyId the primary key of the company
	* @return the matching customer
	* @throws PortalException if a matching customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lithan.liferay.service.model.Customer getCustomerByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCustomerByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the customer matching the UUID and group.
	*
	* @param uuid the customer's UUID
	* @param groupId the primary key of the group
	* @return the matching customer
	* @throws PortalException if a matching customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lithan.liferay.service.model.Customer getCustomerByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCustomerByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the customers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lithan.liferay.service.model.impl.CustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customers
	* @param end the upper bound of the range of customers (not inclusive)
	* @return the range of customers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.lithan.liferay.service.model.Customer> getCustomers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCustomers(start, end);
	}

	/**
	* Returns the number of customers.
	*
	* @return the number of customers
	* @throws SystemException if a system exception occurred
	*/
	public static int getCustomersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCustomersCount();
	}

	/**
	* Updates the customer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param customer the customer
	* @return the customer that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.lithan.liferay.service.model.Customer updateCustomer(
		com.lithan.liferay.service.model.Customer customer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCustomer(customer);
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

	public static java.util.List<com.lithan.liferay.service.model.Customer> getCustomersByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCustomersByGroupId(groupId, start, end);
	}

	public static java.util.List<com.lithan.liferay.service.model.Customer> getCustomersByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCustomersByGroupId(groupId);
	}

	public static int getCustomersCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCustomersCountByGroupId(groupId);
	}

	public static com.lithan.liferay.service.model.Customer addCustomer(
		long userId, long groupId, java.lang.String name,
		java.lang.String email, java.lang.String address,
		java.lang.String nicNumber, java.lang.String contactNumber,
		long servicId, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addCustomer(userId, groupId, name, email, address,
			nicNumber, contactNumber, servicId, serviceContext);
	}

	public static com.lithan.liferay.service.model.Customer updateCustomer(
		long userId, long customerId, long groupId, java.lang.String name,
		java.lang.String email, java.lang.String address,
		java.lang.String nicNumber, java.lang.String contactNumber,
		long servicId, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateCustomer(userId, customerId, groupId, name, email,
			address, nicNumber, contactNumber, servicId, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static CustomerLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CustomerLocalService.class.getName());

			if (invokableLocalService instanceof CustomerLocalService) {
				_service = (CustomerLocalService)invokableLocalService;
			}
			else {
				_service = new CustomerLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(CustomerLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CustomerLocalService service) {
	}

	private static CustomerLocalService _service;
}