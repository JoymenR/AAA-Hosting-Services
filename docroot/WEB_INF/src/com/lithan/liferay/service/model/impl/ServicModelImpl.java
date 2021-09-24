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

package com.lithan.liferay.service.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.lithan.liferay.service.model.Servic;
import com.lithan.liferay.service.model.ServicModel;
import com.lithan.liferay.service.model.ServicSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Servic service. Represents a row in the &quot;AAA_Servic&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.lithan.liferay.service.model.ServicModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ServicImpl}.
 * </p>
 *
 * @author joymen
 * @see ServicImpl
 * @see com.lithan.liferay.service.model.Servic
 * @see com.lithan.liferay.service.model.ServicModel
 * @generated
 */
@JSON(strict = true)
public class ServicModelImpl extends BaseModelImpl<Servic>
	implements ServicModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a servic model instance should use the {@link com.lithan.liferay.service.model.Servic} interface instead.
	 */
	public static final String TABLE_NAME = "AAA_Servic";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "servicId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "servicName", Types.VARCHAR },
			{ "servicPrice", Types.VARCHAR },
			{ "servicDescription", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table AAA_Servic (uuid_ VARCHAR(75) null,servicId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,servicName VARCHAR(75) null,servicPrice VARCHAR(75) null,servicDescription VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table AAA_Servic";
	public static final String ORDER_BY_JPQL = " ORDER BY servic.servicName ASC";
	public static final String ORDER_BY_SQL = " ORDER BY AAA_Servic.servicName ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.lithan.liferay.service.model.Servic"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.lithan.liferay.service.model.Servic"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.lithan.liferay.service.model.Servic"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long UUID_COLUMN_BITMASK = 4L;
	public static long SERVICNAME_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Servic toModel(ServicSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Servic model = new ServicImpl();

		model.setUuid(soapModel.getUuid());
		model.setServicId(soapModel.getServicId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setServicName(soapModel.getServicName());
		model.setServicPrice(soapModel.getServicPrice());
		model.setServicDescription(soapModel.getServicDescription());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Servic> toModels(ServicSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Servic> models = new ArrayList<Servic>(soapModels.length);

		for (ServicSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.lithan.liferay.service.model.Servic"));

	public ServicModelImpl() {
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

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getServicId() {
		return _servicId;
	}

	@Override
	public void setServicId(long servicId) {
		_servicId = servicId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getServicName() {
		if (_servicName == null) {
			return StringPool.BLANK;
		}
		else {
			return _servicName;
		}
	}

	@Override
	public void setServicName(String servicName) {
		_columnBitmask = -1L;

		_servicName = servicName;
	}

	@JSON
	@Override
	public String getServicPrice() {
		if (_servicPrice == null) {
			return StringPool.BLANK;
		}
		else {
			return _servicPrice;
		}
	}

	@Override
	public void setServicPrice(String servicPrice) {
		_servicPrice = servicPrice;
	}

	@JSON
	@Override
	public String getServicDescription() {
		if (_servicDescription == null) {
			return StringPool.BLANK;
		}
		else {
			return _servicDescription;
		}
	}

	@Override
	public void setServicDescription(String servicDescription) {
		_servicDescription = servicDescription;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Servic.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Servic.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Servic toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Servic)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ServicImpl servicImpl = new ServicImpl();

		servicImpl.setUuid(getUuid());
		servicImpl.setServicId(getServicId());
		servicImpl.setGroupId(getGroupId());
		servicImpl.setCompanyId(getCompanyId());
		servicImpl.setUserId(getUserId());
		servicImpl.setUserName(getUserName());
		servicImpl.setCreateDate(getCreateDate());
		servicImpl.setModifiedDate(getModifiedDate());
		servicImpl.setServicName(getServicName());
		servicImpl.setServicPrice(getServicPrice());
		servicImpl.setServicDescription(getServicDescription());

		servicImpl.resetOriginalValues();

		return servicImpl;
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

		if (!(obj instanceof Servic)) {
			return false;
		}

		Servic servic = (Servic)obj;

		long primaryKey = servic.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		ServicModelImpl servicModelImpl = this;

		servicModelImpl._originalUuid = servicModelImpl._uuid;

		servicModelImpl._originalGroupId = servicModelImpl._groupId;

		servicModelImpl._setOriginalGroupId = false;

		servicModelImpl._originalCompanyId = servicModelImpl._companyId;

		servicModelImpl._setOriginalCompanyId = false;

		servicModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Servic> toCacheModel() {
		ServicCacheModel servicCacheModel = new ServicCacheModel();

		servicCacheModel.uuid = getUuid();

		String uuid = servicCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			servicCacheModel.uuid = null;
		}

		servicCacheModel.servicId = getServicId();

		servicCacheModel.groupId = getGroupId();

		servicCacheModel.companyId = getCompanyId();

		servicCacheModel.userId = getUserId();

		servicCacheModel.userName = getUserName();

		String userName = servicCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			servicCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			servicCacheModel.createDate = createDate.getTime();
		}
		else {
			servicCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			servicCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			servicCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		servicCacheModel.servicName = getServicName();

		String servicName = servicCacheModel.servicName;

		if ((servicName != null) && (servicName.length() == 0)) {
			servicCacheModel.servicName = null;
		}

		servicCacheModel.servicPrice = getServicPrice();

		String servicPrice = servicCacheModel.servicPrice;

		if ((servicPrice != null) && (servicPrice.length() == 0)) {
			servicCacheModel.servicPrice = null;
		}

		servicCacheModel.servicDescription = getServicDescription();

		String servicDescription = servicCacheModel.servicDescription;

		if ((servicDescription != null) && (servicDescription.length() == 0)) {
			servicCacheModel.servicDescription = null;
		}

		return servicCacheModel;
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

	private static ClassLoader _classLoader = Servic.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Servic.class };
	private String _uuid;
	private String _originalUuid;
	private long _servicId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _servicName;
	private String _servicPrice;
	private String _servicDescription;
	private long _columnBitmask;
	private Servic _escapedModel;
}