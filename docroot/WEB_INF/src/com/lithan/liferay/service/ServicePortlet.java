package com.lithan.liferay.service;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.lithan.liferay.service.model.Servic;
import com.lithan.liferay.service.service.ServicLocalServiceUtil;


/**
 * Portlet implementation class ServicePortlet
 */
public class ServicePortlet extends MVCPortlet {

	public void addServic(ActionRequest request, ActionResponse response)throws Exception {

        _updateServic(request);

        sendRedirect(request, response);
  }

 public void deleteServic(ActionRequest request, ActionResponse response)throws Exception {

        long servicId = ParamUtil.getLong(request, "servicId");

        ServicLocalServiceUtil.deleteServic(servicId);

        sendRedirect(request, response);
  }

  public void updateServic(ActionRequest request, ActionResponse response)throws Exception {

        _updateServic(request);

        sendRedirect(request, response);
   }

  private Servic _updateServic(ActionRequest request)throws PortalException, SystemException {

        long servicId = (ParamUtil.getLong(request, "servicId"));
        String servicName = (ParamUtil.getString(request, "servicName"));
        String servicPrice = (ParamUtil.getString(request, "servicPrice"));
        String servicDescription = (ParamUtil.getString(request, "servicDescription"));
        
        ServiceContext serviceContext = ServiceContextFactory.getInstance(Servic.class.getName(), request);

        Servic servic = null;

        if (servicId <= 0) {

        	servic = ServicLocalServiceUtil.addServic(serviceContext.getUserId(), serviceContext.getScopeGroupId(), servicName, servicPrice, servicDescription, serviceContext);
        }
        else {
        	servic = ServicLocalServiceUtil.getServic(servicId);

        	servic = ServicLocalServiceUtil.updateServic(serviceContext.getUserId(), servicId, servicName, servicPrice, servicDescription, serviceContext);
        }
        return servic;
    }

}
