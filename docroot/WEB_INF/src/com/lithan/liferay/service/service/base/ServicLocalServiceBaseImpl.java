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
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.lithan.liferay.service.model.Servic;
import com.lithan.liferay.service.service.ServicLocalService;
import com.lithan.liferay.service.service.persistence.CustomerPersistence;
import com.lithan.liferay.service.service.persistence.ServicPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the servic local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.lithan.liferay.service.service.impl.ServicLocalServiceImpl}.
 * </p>
 *
 * @author joymen
 * @see com.lithan.liferay.service.service.impl.ServicLocalServiceImpl
 * @see com.lithan.liferay.service.service.ServicLocalServiceUtil
 * @generated
 */
public abstract class ServicLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements ServicLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.lithan.liferay.service.service.ServicLocalServiceUtil} to access the servic local service.
	 */

	/**
	 * Adds the servic to the database. Also notifies the appropriate model listeners.
	 *
	 * @param servic the servic
	 * @return the servic that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Servic addServic(Servic servic) throws SystemException {
		servic.setNew(true);

		return servicPersistence.update(servic);
	}

	/**
	 * Creates a new servic with the primary key. Does not add the servic to the database.
	 *
	 * @param servicId the primary key for the new servic
	 * @return the new servic
	 */
	@Override
	public Servic createServic(long servicId) {
		return servicPersistence.create(servicId);
	}

	/**
	 * Deletes the servic with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param servicId the primary key of the servic
	 * @return the servic that was removed
	 * @throws PortalException if a servic with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Servic deleteServic(long servicId)
		throws PortalException, SystemException {
		return servicPersistence.remove(servicId);
	}

	/**
	 * Deletes the servic from the database. Also notifies the appropriate model listeners.
	 *
	 * @param servic the servic
	 * @return the servic that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Servic deleteServic(Servic servic) throws SystemException {
		return servicPersistence.remove(servic);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Servic.class,
			clazz.getClassLoader());
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
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return servicPersistence.findWithDynamicQuery(dynamicQuery);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return servicPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return servicPersistence.findWithDynamicQuery(dynamicQuery, start, end,
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return servicPersistence.countWithDynamicQuery(dynamicQuery);
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return servicPersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public Servic fetchServic(long servicId) throws SystemException {
		return servicPersistence.fetchByPrimaryKey(servicId);
	}

	/**
	 * Returns the servic with the matching UUID and company.
	 *
	 * @param uuid the servic's UUID
	 * @param  companyId the primary key of the company
	 * @return the matching servic, or <code>null</code> if a matching servic could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Servic fetchServicByUuidAndCompanyId(String uuid, long companyId)
		throws SystemException {
		return servicPersistence.fetchByUuid_C_First(uuid, companyId, null);
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
	public Servic fetchServicByUuidAndGroupId(String uuid, long groupId)
		throws SystemException {
		return servicPersistence.fetchByUUID_G(uuid, groupId);
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
	public Servic getServic(long servicId)
		throws PortalException, SystemException {
		return servicPersistence.findByPrimaryKey(servicId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return servicPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns the servic with the matching UUID and company.
	 *
	 * @param uuid the servic's UUID
	 * @param  companyId the primary key of the company
	 * @return the matching servic
	 * @throws PortalException if a matching servic could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Servic getServicByUuidAndCompanyId(String uuid, long companyId)
		throws PortalException, SystemException {
		return servicPersistence.findByUuid_C_First(uuid, companyId, null);
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
	public Servic getServicByUuidAndGroupId(String uuid, long groupId)
		throws PortalException, SystemException {
		return servicPersistence.findByUUID_G(uuid, groupId);
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
	public List<Servic> getServics(int start, int end)
		throws SystemException {
		return servicPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of servics.
	 *
	 * @return the number of servics
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getServicsCount() throws SystemException {
		return servicPersistence.countAll();
	}

	/**
	 * Updates the servic in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param servic the servic
	 * @return the servic that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Servic updateServic(Servic servic) throws SystemException {
		return servicPersistence.update(servic);
	}

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

		PersistedModelLocalServiceRegistryUtil.register("com.lithan.liferay.service.model.Servic",
			servicLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.lithan.liferay.service.model.Servic");
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
		return Servic.class;
	}

	protected String getModelClassName() {
		return Servic.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = servicPersistence.getDataSource();

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
	private ServicLocalServiceClpInvoker _clpInvoker = new ServicLocalServiceClpInvoker();
}