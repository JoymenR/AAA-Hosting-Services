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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.lithan.liferay.service.service.http.ServicServiceSoap}.
 *
 * @author joymen
 * @see com.lithan.liferay.service.service.http.ServicServiceSoap
 * @generated
 */
public class ServicSoap implements Serializable {
	public static ServicSoap toSoapModel(Servic model) {
		ServicSoap soapModel = new ServicSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setServicId(model.getServicId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setServicName(model.getServicName());
		soapModel.setServicPrice(model.getServicPrice());
		soapModel.setServicDescription(model.getServicDescription());

		return soapModel;
	}

	public static ServicSoap[] toSoapModels(Servic[] models) {
		ServicSoap[] soapModels = new ServicSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ServicSoap[][] toSoapModels(Servic[][] models) {
		ServicSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ServicSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ServicSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ServicSoap[] toSoapModels(List<Servic> models) {
		List<ServicSoap> soapModels = new ArrayList<ServicSoap>(models.size());

		for (Servic model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ServicSoap[soapModels.size()]);
	}

	public ServicSoap() {
	}

	public long getPrimaryKey() {
		return _servicId;
	}

	public void setPrimaryKey(long pk) {
		setServicId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getServicId() {
		return _servicId;
	}

	public void setServicId(long servicId) {
		_servicId = servicId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getServicName() {
		return _servicName;
	}

	public void setServicName(String servicName) {
		_servicName = servicName;
	}

	public String getServicPrice() {
		return _servicPrice;
	}

	public void setServicPrice(String servicPrice) {
		_servicPrice = servicPrice;
	}

	public String getServicDescription() {
		return _servicDescription;
	}

	public void setServicDescription(String servicDescription) {
		_servicDescription = servicDescription;
	}

	private String _uuid;
	private long _servicId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _servicName;
	private String _servicPrice;
	private String _servicDescription;
}