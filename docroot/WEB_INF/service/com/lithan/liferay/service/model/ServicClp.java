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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.lithan.liferay.service.service.ClpSerializer;
import com.lithan.liferay.service.service.ServicLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author joymen
 */
public class ServicClp extends BaseModelImpl<Servic> implements Servic {
	public ServicClp() {
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
	public long getPrimaryKey() {
		return _servicId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setServicId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _servicId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_servicRemoteModel != null) {
			try {
				Class<?> clazz = _servicRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_servicRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getServicId() {
		return _servicId;
	}

	@Override
	public void setServicId(long servicId) {
		_servicId = servicId;

		if (_servicRemoteModel != null) {
			try {
				Class<?> clazz = _servicRemoteModel.getClass();

				Method method = clazz.getMethod("setServicId", long.class);

				method.invoke(_servicRemoteModel, servicId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_servicRemoteModel != null) {
			try {
				Class<?> clazz = _servicRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_servicRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_servicRemoteModel != null) {
			try {
				Class<?> clazz = _servicRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_servicRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_servicRemoteModel != null) {
			try {
				Class<?> clazz = _servicRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_servicRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_servicRemoteModel != null) {
			try {
				Class<?> clazz = _servicRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_servicRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_servicRemoteModel != null) {
			try {
				Class<?> clazz = _servicRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_servicRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_servicRemoteModel != null) {
			try {
				Class<?> clazz = _servicRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_servicRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServicName() {
		return _servicName;
	}

	@Override
	public void setServicName(String servicName) {
		_servicName = servicName;

		if (_servicRemoteModel != null) {
			try {
				Class<?> clazz = _servicRemoteModel.getClass();

				Method method = clazz.getMethod("setServicName", String.class);

				method.invoke(_servicRemoteModel, servicName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServicPrice() {
		return _servicPrice;
	}

	@Override
	public void setServicPrice(String servicPrice) {
		_servicPrice = servicPrice;

		if (_servicRemoteModel != null) {
			try {
				Class<?> clazz = _servicRemoteModel.getClass();

				Method method = clazz.getMethod("setServicPrice", String.class);

				method.invoke(_servicRemoteModel, servicPrice);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServicDescription() {
		return _servicDescription;
	}

	@Override
	public void setServicDescription(String servicDescription) {
		_servicDescription = servicDescription;

		if (_servicRemoteModel != null) {
			try {
				Class<?> clazz = _servicRemoteModel.getClass();

				Method method = clazz.getMethod("setServicDescription",
						String.class);

				method.invoke(_servicRemoteModel, servicDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Servic.class.getName()));
	}

	public BaseModel<?> getServicRemoteModel() {
		return _servicRemoteModel;
	}

	public void setServicRemoteModel(BaseModel<?> servicRemoteModel) {
		_servicRemoteModel = servicRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _servicRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_servicRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ServicLocalServiceUtil.addServic(this);
		}
		else {
			ServicLocalServiceUtil.updateServic(this);
		}
	}

	@Override
	public Servic toEscapedModel() {
		return (Servic)ProxyUtil.newProxyInstance(Servic.class.getClassLoader(),
			new Class[] { Servic.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ServicClp clone = new ServicClp();

		clone.setUuid(getUuid());
		clone.setServicId(getServicId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setServicName(getServicName());
		clone.setServicPrice(getServicPrice());
		clone.setServicDescription(getServicDescription());

		return clone;
	}

	@Override
	public int compareTo(Servic servic) {
		int value = 0;

		value = getServicName().compareTo(servic.getServicName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServicClp)) {
			return false;
		}

		ServicClp servic = (ServicClp)obj;

		long primaryKey = servic.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", servicId=");
		sb.append(getServicId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", servicName=");
		sb.append(getServicName());
		sb.append(", servicPrice=");
		sb.append(getServicPrice());
		sb.append(", servicDescription=");
		sb.append(getServicDescription());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.lithan.liferay.service.model.Servic");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>servicId</column-name><column-value><![CDATA[");
		sb.append(getServicId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>servicName</column-name><column-value><![CDATA[");
		sb.append(getServicName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>servicPrice</column-name><column-value><![CDATA[");
		sb.append(getServicPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>servicDescription</column-name><column-value><![CDATA[");
		sb.append(getServicDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _servicId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _servicName;
	private String _servicPrice;
	private String _servicDescription;
	private BaseModel<?> _servicRemoteModel;
	private Class<?> _clpSerializerClass = com.lithan.liferay.service.service.ClpSerializer.class;
}