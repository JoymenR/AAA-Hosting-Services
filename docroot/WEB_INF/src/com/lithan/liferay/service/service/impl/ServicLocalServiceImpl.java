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

package com.lithan.liferay.service.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import com.lithan.liferay.service.model.Servic;
import com.lithan.liferay.service.service.base.ServicLocalServiceBaseImpl;

/**
 * The implementation of the servic local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.lithan.liferay.service.service.ServicLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author joymen
 * @see com.lithan.liferay.service.service.base.ServicLocalServiceBaseImpl
 * @see com.lithan.liferay.service.service.ServicLocalServiceUtil
 */
public class ServicLocalServiceImpl extends ServicLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.lithan.liferay.service.service.ServicLocalServiceUtil} to access the servic local service.
	 */
	public List<Servic> getServicsByGroupId(long groupId)throws SystemException {

	    return servicPersistence.findByGroupId(groupId);
	}
	
	public List<Servic> getServicsByGroupId(long groupId, int start, int end)throws SystemException {

	    return servicPersistence.findByGroupId(groupId, start, end);
	}
	
	public int getServicsCountByGroupId(long groupId) throws SystemException {

	    return servicPersistence.countByGroupId(groupId);
	}
	
	public Servic addServic(long userId, long groupId, String servicName, 
			String servicPrice, String servicDescription, 
			ServiceContext serviceContext)throws PortalException, SystemException {

	    User user = userPersistence.findByPrimaryKey(userId);

	    Date now = new Date();

	    long servicId = counterLocalService.increment(Servic.class.getName());

	    Servic servic = servicPersistence.create(servicId);

	    servic.setServicName(servicName);
	    servic.setServicPrice(servicPrice);
	    servic.setServicDescription(servicDescription);
	    

	    servic.setGroupId(groupId);
	    servic.setCompanyId(user.getCompanyId());
	    servic.setUserId(user.getUserId());
	    servic.setCreateDate(serviceContext.getCreateDate(now));
	    servic.setModifiedDate(serviceContext.getModifiedDate(now));

	    super.addServic(servic);
	    resourceLocalService.addResources(user.getCompanyId(), groupId, userId, 
	    		Servic.class.getName(), servicId, false, true, true);
	    return servic;
	}

	public Servic deleteServic(Servic servic)throws SystemException {

	    return servicPersistence.remove(servic);
	}

	public Servic deleteServic(long servicId)throws PortalException, SystemException {

		Servic servic = servicPersistence.fetchByPrimaryKey(servicId);

	    return deleteServic(servic);
	}

	public Servic updateServic(long userId, long servicId, String servicName, String servicPrice, String servicDescription, ServiceContext serviceContext)throws PortalException, SystemException {

	    //User user = userPersistence.findByPrimaryKey(userId);

	    Date now = new Date();

	    Servic servic = servicPersistence.findByPrimaryKey(servicId);

	    servic.setServicName(servicName);
	    servic.setServicPrice(servicPrice);
	    servic.setServicDescription(servicDescription);;
	    servic.setModifiedDate(serviceContext.getModifiedDate(now));

	    super.updateServic(servic);
	    return servic;
	}
	
}