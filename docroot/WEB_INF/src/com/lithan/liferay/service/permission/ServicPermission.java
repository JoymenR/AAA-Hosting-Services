package com.lithan.liferay.service.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.lithan.liferay.service.model.Servic;
import com.lithan.liferay.service.service.ServicLocalServiceUtil;


public class ServicPermission {
	
	public static void check(PermissionChecker permissionChecker,	long servicId, String actionId) throws PortalException,SystemException {

        if (!contains(permissionChecker, servicId, actionId)) {
            throw new PrincipalException();
        }
    }

    public static boolean contains(PermissionChecker permissionChecker,long servicId, String actionId) throws PortalException,SystemException {

        Servic servic = ServicLocalServiceUtil.getServic(servicId);

        return permissionChecker.hasPermission(servic.getGroupId(),Servic.class.getName(), servic.getServicId(), actionId);
}

}
