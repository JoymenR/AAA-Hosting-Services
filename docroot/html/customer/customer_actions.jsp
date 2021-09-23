<%@page import="com.liferay.portal.security.permission.ActionKeys"%>
<%@ include file="/html/init.jsp" %>

<%
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Customer customer = (Customer) row.getObject();
	long groupId = customer.getGroupId();
	String name = Customer.class.getName();
	long customerId = customer.getCustomerId();
	String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<liferay-ui:icon-menu>

	<portlet:renderURL var="editURL">
		<portlet:param name="mvcPath" value="/html/customer/edit_customer.jsp"></portlet:param>
		<portlet:param name="customerId" value="<%=String.valueOf(customerId)%>"></portlet:param>
		<portlet:param name="redirect" value="<%=redirect%>"></portlet:param>
	</portlet:renderURL>
	
	<liferay-ui:icon image="edit" url="<%=editURL.toString()%>"></liferay-ui:icon>

	

	
	<portlet:actionURL name="deleteCustomer" var="deleteURL">
		<portlet:param name="customerId" value="<%=String.valueOf(customerId)%>"></portlet:param>
		<portlet:param name="redirect" value="<%=redirect%>"></portlet:param>
	</portlet:actionURL>

	<liferay-ui:icon-delete url="<%=deleteURL.toString()%>"></liferay-ui:icon-delete>

	
	

</liferay-ui:icon-menu>