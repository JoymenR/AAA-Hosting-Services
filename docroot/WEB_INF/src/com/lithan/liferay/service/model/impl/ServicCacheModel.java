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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.lithan.liferay.service.model.Servic;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Servic in entity cache.
 *
 * @author joymen
 * @see Servic
 * @generated
 */
public class ServicCacheModel implements CacheModel<Servic>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", servicId=");
		sb.append(servicId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", servicName=");
		sb.append(servicName);
		sb.append(", servicPrice=");
		sb.append(servicPrice);
		sb.append(", servicDescription=");
		sb.append(servicDescription);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Servic toEntityModel() {
		ServicImpl servicImpl = new ServicImpl();

		if (uuid == null) {
			servicImpl.setUuid(StringPool.BLANK);
		}
		else {
			servicImpl.setUuid(uuid);
		}

		servicImpl.setServicId(servicId);
		servicImpl.setGroupId(groupId);
		servicImpl.setCompanyId(companyId);
		servicImpl.setUserId(userId);

		if (userName == null) {
			servicImpl.setUserName(StringPool.BLANK);
		}
		else {
			servicImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			servicImpl.setCreateDate(null);
		}
		else {
			servicImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			servicImpl.setModifiedDate(null);
		}
		else {
			servicImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (servicName == null) {
			servicImpl.setServicName(StringPool.BLANK);
		}
		else {
			servicImpl.setServicName(servicName);
		}

		if (servicPrice == null) {
			servicImpl.setServicPrice(StringPool.BLANK);
		}
		else {
			servicImpl.setServicPrice(servicPrice);
		}

		if (servicDescription == null) {
			servicImpl.setServicDescription(StringPool.BLANK);
		}
		else {
			servicImpl.setServicDescription(servicDescription);
		}

		servicImpl.resetOriginalValues();

		return servicImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		servicId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		servicName = objectInput.readUTF();
		servicPrice = objectInput.readUTF();
		servicDescription = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(servicId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (servicName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(servicName);
		}

		if (servicPrice == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(servicPrice);
		}

		if (servicDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(servicDescription);
		}
	}

	public String uuid;
	public long servicId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String servicName;
	public String servicPrice;
	public String servicDescription;
}