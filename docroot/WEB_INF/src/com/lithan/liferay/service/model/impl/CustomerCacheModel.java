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

import com.lithan.liferay.service.model.Customer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Customer in entity cache.
 *
 * @author joymen
 * @see Customer
 * @generated
 */
public class CustomerCacheModel implements CacheModel<Customer>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", customerId=");
		sb.append(customerId);
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
		sb.append(", servicId=");
		sb.append(servicId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", email=");
		sb.append(email);
		sb.append(", address=");
		sb.append(address);
		sb.append(", nicNumber=");
		sb.append(nicNumber);
		sb.append(", contactNumber=");
		sb.append(contactNumber);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Customer toEntityModel() {
		CustomerImpl customerImpl = new CustomerImpl();

		if (uuid == null) {
			customerImpl.setUuid(StringPool.BLANK);
		}
		else {
			customerImpl.setUuid(uuid);
		}

		customerImpl.setCustomerId(customerId);
		customerImpl.setGroupId(groupId);
		customerImpl.setCompanyId(companyId);
		customerImpl.setUserId(userId);

		if (userName == null) {
			customerImpl.setUserName(StringPool.BLANK);
		}
		else {
			customerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			customerImpl.setCreateDate(null);
		}
		else {
			customerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			customerImpl.setModifiedDate(null);
		}
		else {
			customerImpl.setModifiedDate(new Date(modifiedDate));
		}

		customerImpl.setServicId(servicId);

		if (name == null) {
			customerImpl.setName(StringPool.BLANK);
		}
		else {
			customerImpl.setName(name);
		}

		if (email == null) {
			customerImpl.setEmail(StringPool.BLANK);
		}
		else {
			customerImpl.setEmail(email);
		}

		if (address == null) {
			customerImpl.setAddress(StringPool.BLANK);
		}
		else {
			customerImpl.setAddress(address);
		}

		if (nicNumber == null) {
			customerImpl.setNicNumber(StringPool.BLANK);
		}
		else {
			customerImpl.setNicNumber(nicNumber);
		}

		if (contactNumber == null) {
			customerImpl.setContactNumber(StringPool.BLANK);
		}
		else {
			customerImpl.setContactNumber(contactNumber);
		}

		customerImpl.resetOriginalValues();

		return customerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		customerId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		servicId = objectInput.readLong();
		name = objectInput.readUTF();
		email = objectInput.readUTF();
		address = objectInput.readUTF();
		nicNumber = objectInput.readUTF();
		contactNumber = objectInput.readUTF();
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

		objectOutput.writeLong(customerId);
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
		objectOutput.writeLong(servicId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (nicNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nicNumber);
		}

		if (contactNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactNumber);
		}
	}

	public String uuid;
	public long customerId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long servicId;
	public String name;
	public String email;
	public String address;
	public String nicNumber;
	public String contactNumber;
}