package com.lithan.liferay.service;



import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.lithan.liferay.service.service.CustomerLocalServiceUtil;
import com.lithan.liferay.service.model.Customer;



/**
 * Portlet implementation class CustomerPortlet
 */
public class CustomerPortlet extends MVCPortlet {
	
	public void addCustomer(ActionRequest request, ActionResponse response)throws Exception {

        _updateCustomer(request);

        sendRedirect(request, response);
    }
	
	
	public void Customer(ActionRequest request, ActionResponse response)throws Exception {

        _updateCustomer(request);

        sendRedirect(request, response);
    }
	
	public void deleteCustomer(ActionRequest request, ActionResponse response)throws Exception {

        long customerId = ParamUtil.getLong(request, "customerId");

        CustomerLocalServiceUtil.deleteCustomer(customerId);

        sendRedirect(request, response);
    }
	
	 public void updateCustomer(ActionRequest request, ActionResponse response)throws Exception {

	        _updateCustomer(request);

	        sendRedirect(request, response);
	    }
	
	 
	 private Customer _updateCustomer(ActionRequest request)throws PortalException, SystemException {

	        long customerId = ParamUtil.getLong(request, "customerId");
	        String name = ParamUtil.getString(request, "name");
	        String email = ParamUtil.getString(request, "email");
	        String address = ParamUtil.getString(request, "address");
	        String nicNumber = ParamUtil.getString(request, "nicNumber");
	        String contactNumber = ParamUtil.getString(request, "contactNumber");
	        
	        long servicId = ParamUtil.getLong(request, "servicId");

	        ServiceContext serviceContext = ServiceContextFactory.getInstance(
	        		Customer.class.getName(), request);

	        Customer customer = null;

	        if (customerId <= 0) {
//	        	System.out.println("Event Added");
	        	customer = CustomerLocalServiceUtil.addCustomer(serviceContext.getUserId(), serviceContext.getScopeGroupId(), name, email, address, nicNumber, contactNumber, servicId, serviceContext);
	        }
	        else {
//	        	System.out.println("Event Updated");
	        	customer = CustomerLocalServiceUtil.getCustomer(customerId);

	        	customer = CustomerLocalServiceUtil.updateCustomer(serviceContext.getUserId(), customerId, serviceContext.getScopeGroupId(), name, email, address, nicNumber, contactNumber, servicId, serviceContext);
	        }
	        
	        return customer;
	    }

	
	
}
