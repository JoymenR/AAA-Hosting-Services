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

package com.lithan.liferay.service.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import com.lithan.liferay.service.model.Customer;
import com.lithan.liferay.service.service.CustomerService;
import com.lithan.liferay.service.service.persistence.CustomerPersistence;
import com.lithan.liferay.service.service.persistence.ServicPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the customer remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.lithan.liferay.service.service.impl.CustomerServiceImpl}.
 * </p>
 *
 * @author joymen
 * @see com.lithan.liferay.service.service.impl.CustomerServiceImpl
 * @see com.lithan.liferay.service.service.CustomerServiceUtil
 * @generated
 */
public abstract class CustomerServiceBaseImpl extends BaseServiceImpl
	implements CustomerService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.lithan.liferay.service.service.CustomerServiceUtil} to access the customer remote service.
	 */

	/**
	 * Returns the customer local service.
	 *
	 * @return the customer local service
	 */
	public com.lithan.liferay.service.service.CustomerLocalService getCustomerLocalService() {
		return customerLocalService;
	}

	/**
	 * Sets the customer local service.
	 *
	 * @param customerLocalService the customer local service
	 */
	public void setCustomerLocalService(
		com.lithan.liferay.service.service.CustomerLocalService customerLocalService) {
		this.customerLocalService = customerLocalService;
	}

	/**
	 * Returns the customer remote service.
	 *
	 * @return the customer remote service
	 */
	public com.lithan.liferay.service.service.CustomerService getCustomerService() {
		return customerService;
	}

	/**
	 * Sets the customer remote service.
	 *
	 * @param customerService the customer remote service
	 */
	public void setCustomerService(
		com.lithan.liferay.service.service.CustomerService customerService) {
		this.customerService = customerService;
	}

	/**
	 * Returns the customer persistence.
	 *
	 * @return the customer persistence
	 */
	public CustomerPersistence getCustomerPersistence() {
		return customerPersistence;
	}

	/**
	 * Sets the customer persistence.
	 *
	 * @param customerPersistence the customer persistence
	 */
	public void setCustomerPersistence(CustomerPersistence customerPersistence) {
		this.customerPersistence = customerPersistence;
	}

	/**
	 * Returns the servic local service.
	 *
	 * @return the servic local service
	 */
	public com.lithan.liferay.service.service.ServicLocalService getServicLocalService() {
		return servicLocalService;
	}

	/**
	 * Sets the servic local service.
	 *
	 * @param servicLocalService the servic local service
	 */
	public void setServicLocalService(
		com.lithan.liferay.service.service.ServicLocalService servicLocalService) {
		this.servicLocalService = servicLocalService;
	}

	/**
	 * Returns the servic remote service.
	 *
	 * @return the servic remote service
	 */
	public com.lithan.liferay.service.service.ServicService getServicService() {
		return servicService;
	}

	/**
	 * Sets the servic remote service.
	 *
	 * @param servicService the servic remote service
	 */
	public void setServicService(
		com.lithan.liferay.service.service.ServicService servicService) {
		this.servicService = servicService;
	}

	/**
	 * Returns the servic persistence.
	 *
	 * @return the servic persistence
	 */
	public ServicPersistence getServicPersistence() {
		return servicPersistence;
	}

	/**
	 * Sets the servic persistence.
	 *
	 * @param servicPersistence the servic persistence
	 */
	public void setServicPersistence(ServicPersistence servicPersistence) {
		this.servicPersistence = servicPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Customer.class;
	}

	protected String getModelClassName() {
		return Customer.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = customerPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.lithan.liferay.service.service.CustomerLocalService.class)
	protected com.lithan.liferay.service.service.CustomerLocalService customerLocalService;
	@BeanReference(type = com.lithan.liferay.service.service.CustomerService.class)
	protected com.lithan.liferay.service.service.CustomerService customerService;
	@BeanReference(type = CustomerPersistence.class)
	protected CustomerPersistence customerPersistence;
	@BeanReference(type = com.lithan.liferay.service.service.ServicLocalService.class)
	protected com.lithan.liferay.service.service.ServicLocalService servicLocalService;
	@BeanReference(type = com.lithan.liferay.service.service.ServicService.class)
	protected com.lithan.liferay.service.service.ServicService servicService;
	@BeanReference(type = ServicPersistence.class)
	protected ServicPersistence servicPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private CustomerServiceClpInvoker _clpInvoker = new CustomerServiceClpInvoker();
}