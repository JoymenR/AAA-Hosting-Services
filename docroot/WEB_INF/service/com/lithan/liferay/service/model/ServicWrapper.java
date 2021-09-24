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

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Servic}.
 * </p>
 *
 * @author joymen
 * @see Servic
 * @generated
 */
public class ServicWrapper implements Servic, ModelWrapper<Servic> {
	public ServicWrapper(Servic servic) {
		_servic = servic;
	}

	@Override
	public Class<?> getModelClass() {
		return Servic.class;
	}

	@Override
	public String getModelClassName() {
		return Servic.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("servicId", getServicId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("servicName", getServicName());
		attributes.put("servicPrice", getServicPrice());
		attributes.put("servicDescription", getServicDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long servicId = (Long)attributes.get("servicId");

		if (servicId != null) {
			setServicId(servicId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String servicName = (String)attributes.get("servicName");

		if (servicName != null) {
			setServicName(servicName);
		}

		String servicPrice = (String)attributes.get("servicPrice");

		if (servicPrice != null) {
			setServicPrice(servicPrice);
		}

		String servicDescription = (String)attributes.get("servicDescription");

		if (servicDescription != null) {
			setServicDescription(servicDescription);
		}
	}

	/**
	* Returns the primary key of this servic.
	*
	* @return the primary key of this servic
	*/
	@Override
	public long getPrimaryKey() {
		return _servic.getPrimaryKey();
	}

	/**
	* Sets the primary key of this servic.
	*
	* @param primaryKey the primary key of this servic
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_servic.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this servic.
	*
	* @return the uuid of this servic
	*/
	@Override
	public java.lang.String getUuid() {
		return _servic.getUuid();
	}

	/**
	* Sets the uuid of this servic.
	*
	* @param uuid the uuid of this servic
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_servic.setUuid(uuid);
	}

	/**
	* Returns the servic ID of this servic.
	*
	* @return the servic ID of this servic
	*/
	@Override
	public long getServicId() {
		return _servic.getServicId();
	}

	/**
	* Sets the servic ID of this servic.
	*
	* @param servicId the servic ID of this servic
	*/
	@Override
	public void setServicId(long servicId) {
		_servic.setServicId(servicId);
	}

	/**
	* Returns the group ID of this servic.
	*
	* @return the group ID of this servic
	*/
	@Override
	public long getGroupId() {
		return _servic.getGroupId();
	}

	/**
	* Sets the group ID of this servic.
	*
	* @param groupId the group ID of this servic
	*/
	@Override
	public void setGroupId(long groupId) {
		_servic.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this servic.
	*
	* @return the company ID of this servic
	*/
	@Override
	public long getCompanyId() {
		return _servic.getCompanyId();
	}

	/**
	* Sets the company ID of this servic.
	*
	* @param companyId the company ID of this servic
	*/
	@Override
	public void setCompanyId(long companyId) {
		_servic.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this servic.
	*
	* @return the user ID of this servic
	*/
	@Override
	public long getUserId() {
		return _servic.getUserId();
	}

	/**
	* Sets the user ID of this servic.
	*
	* @param userId the user ID of this servic
	*/
	@Override
	public void setUserId(long userId) {
		_servic.setUserId(userId);
	}

	/**
	* Returns the user uuid of this servic.
	*
	* @return the user uuid of this servic
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servic.getUserUuid();
	}

	/**
	* Sets the user uuid of this servic.
	*
	* @param userUuid the user uuid of this servic
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_servic.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this servic.
	*
	* @return the user name of this servic
	*/
	@Override
	public java.lang.String getUserName() {
		return _servic.getUserName();
	}

	/**
	* Sets the user name of this servic.
	*
	* @param userName the user name of this servic
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_servic.setUserName(userName);
	}

	/**
	* Returns the create date of this servic.
	*
	* @return the create date of this servic
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _servic.getCreateDate();
	}

	/**
	* Sets the create date of this servic.
	*
	* @param createDate the create date of this servic
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_servic.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this servic.
	*
	* @return the modified date of this servic
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _servic.getModifiedDate();
	}

	/**
	* Sets the modified date of this servic.
	*
	* @param modifiedDate the modified date of this servic
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_servic.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the servic name of this servic.
	*
	* @return the servic name of this servic
	*/
	@Override
	public java.lang.String getServicName() {
		return _servic.getServicName();
	}

	/**
	* Sets the servic name of this servic.
	*
	* @param servicName the servic name of this servic
	*/
	@Override
	public void setServicName(java.lang.String servicName) {
		_servic.setServicName(servicName);
	}

	/**
	* Returns the servic price of this servic.
	*
	* @return the servic price of this servic
	*/
	@Override
	public java.lang.String getServicPrice() {
		return _servic.getServicPrice();
	}

	/**
	* Sets the servic price of this servic.
	*
	* @param servicPrice the servic price of this servic
	*/
	@Override
	public void setServicPrice(java.lang.String servicPrice) {
		_servic.setServicPrice(servicPrice);
	}

	/**
	* Returns the servic description of this servic.
	*
	* @return the servic description of this servic
	*/
	@Override
	public java.lang.String getServicDescription() {
		return _servic.getServicDescription();
	}

	/**
	* Sets the servic description of this servic.
	*
	* @param servicDescription the servic description of this servic
	*/
	@Override
	public void setServicDescription(java.lang.String servicDescription) {
		_servic.setServicDescription(servicDescription);
	}

	@Override
	public boolean isNew() {
		return _servic.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_servic.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _servic.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_servic.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _servic.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _servic.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_servic.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _servic.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_servic.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_servic.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_servic.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ServicWrapper((Servic)_servic.clone());
	}

	@Override
	public int compareTo(com.lithan.liferay.service.model.Servic servic) {
		return _servic.compareTo(servic);
	}

	@Override
	public int hashCode() {
		return _servic.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.lithan.liferay.service.model.Servic> toCacheModel() {
		return _servic.toCacheModel();
	}

	@Override
	public com.lithan.liferay.service.model.Servic toEscapedModel() {
		return new ServicWrapper(_servic.toEscapedModel());
	}

	@Override
	public com.lithan.liferay.service.model.Servic toUnescapedModel() {
		return new ServicWrapper(_servic.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _servic.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _servic.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_servic.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServicWrapper)) {
			return false;
		}

		ServicWrapper servicWrapper = (ServicWrapper)obj;

		if (Validator.equals(_servic, servicWrapper._servic)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _servic.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Servic getWrappedServic() {
		return _servic;
	}

	@Override
	public Servic getWrappedModel() {
		return _servic;
	}

	@Override
	public void resetOriginalValues() {
		_servic.resetOriginalValues();
	}

	private Servic _servic;
}