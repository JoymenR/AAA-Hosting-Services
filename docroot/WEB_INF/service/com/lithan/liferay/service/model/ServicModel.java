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

package com.lithan.liferay.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Servic service. Represents a row in the &quot;AAA_Servic&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.lithan.liferay.service.model.impl.ServicModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.lithan.liferay.service.model.impl.ServicImpl}.
 * </p>
 *
 * @author joymen
 * @see Servic
 * @see com.lithan.liferay.service.model.impl.ServicImpl
 * @see com.lithan.liferay.service.model.impl.ServicModelImpl
 * @generated
 */
public interface ServicModel extends BaseModel<Servic>, StagedGroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a servic model instance should use the {@link Servic} interface instead.
	 */

	/**
	 * Returns the primary key of this servic.
	 *
	 * @return the primary key of this servic
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this servic.
	 *
	 * @param primaryKey the primary key of this servic
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this servic.
	 *
	 * @return the uuid of this servic
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this servic.
	 *
	 * @param uuid the uuid of this servic
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the servic ID of this servic.
	 *
	 * @return the servic ID of this servic
	 */
	public long getServicId();

	/**
	 * Sets the servic ID of this servic.
	 *
	 * @param servicId the servic ID of this servic
	 */
	public void setServicId(long servicId);

	/**
	 * Returns the group ID of this servic.
	 *
	 * @return the group ID of this servic
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this servic.
	 *
	 * @param groupId the group ID of this servic
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this servic.
	 *
	 * @return the company ID of this servic
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this servic.
	 *
	 * @param companyId the company ID of this servic
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this servic.
	 *
	 * @return the user ID of this servic
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this servic.
	 *
	 * @param userId the user ID of this servic
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this servic.
	 *
	 * @return the user uuid of this servic
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this servic.
	 *
	 * @param userUuid the user uuid of this servic
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this servic.
	 *
	 * @return the user name of this servic
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this servic.
	 *
	 * @param userName the user name of this servic
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this servic.
	 *
	 * @return the create date of this servic
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this servic.
	 *
	 * @param createDate the create date of this servic
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this servic.
	 *
	 * @return the modified date of this servic
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this servic.
	 *
	 * @param modifiedDate the modified date of this servic
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the servic name of this servic.
	 *
	 * @return the servic name of this servic
	 */
	@AutoEscape
	public String getServicName();

	/**
	 * Sets the servic name of this servic.
	 *
	 * @param servicName the servic name of this servic
	 */
	public void setServicName(String servicName);

	/**
	 * Returns the servic price of this servic.
	 *
	 * @return the servic price of this servic
	 */
	@AutoEscape
	public String getServicPrice();

	/**
	 * Sets the servic price of this servic.
	 *
	 * @param servicPrice the servic price of this servic
	 */
	public void setServicPrice(String servicPrice);

	/**
	 * Returns the servic description of this servic.
	 *
	 * @return the servic description of this servic
	 */
	@AutoEscape
	public String getServicDescription();

	/**
	 * Sets the servic description of this servic.
	 *
	 * @param servicDescription the servic description of this servic
	 */
	public void setServicDescription(String servicDescription);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.lithan.liferay.service.model.Servic servic);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.lithan.liferay.service.model.Servic> toCacheModel();

	@Override
	public com.lithan.liferay.service.model.Servic toEscapedModel();

	@Override
	public com.lithan.liferay.service.model.Servic toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}