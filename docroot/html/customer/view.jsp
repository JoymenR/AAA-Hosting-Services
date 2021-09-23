<%@ include file="/html/init.jsp" %>
<%
	String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<aui:button-row>
	<portlet:renderURL var="addCustomerURL">
		<portlet:param name="mvcPath" value="/html/customer/edit_customer.jsp"></portlet:param>
		<portlet:param name="redirect" value="<%=redirect%>"></portlet:param>
	</portlet:renderURL>
	
	
	<aui:button onClick="<%=addCustomerURL.toString()%>" value="Add Customer"></aui:button>

</aui:button-row>

<liferay-ui:search-container>
	<liferay-ui:search-container-results
		results="<%= CustomerLocalServiceUtil.getCustomersByGroupId(scopeGroupId, searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= CustomerLocalServiceUtil.getCustomersCountByGroupId(scopeGroupId) %>">
	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row className="Customer" keyProperty="customerId" modelVar="customer" escapedModel="<%=true%>">
		<liferay-ui:search-container-column-text name="name" value="<%=customer.getName()%>"></liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="email" property="email" ></liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="address" property="address" ></liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="nicNumber" property="nicNumber" ></liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="contactNumber" property="contactNumber" ></liferay-ui:search-container-column-text>
		
		

		<%
			String servicName = "";
			try {
				servicName = ServicLocalServiceUtil.getServic(customer.getServicId()).getServicName();
			} catch (Exception e) {
			}
		%>

		<liferay-ui:search-container-column-text name="servic" value="<%=servicName%>"></liferay-ui:search-container-column-text>

		
		
		<%
            String servicPrice = null;


            try {
            	servicPrice = ServicLocalServiceUtil.getServic(customer.getServicId()).getServicPrice();
            } catch (Exception e) {
            }

            
        %>

        <liferay-ui:search-container-column-text name="servicPrice" value="<%=servicPrice%>"></liferay-ui:search-container-column-text>


	<liferay-ui:search-container-column-jsp align="right" path="/html/customer/customer_actions.jsp"></liferay-ui:search-container-column-jsp>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator></liferay-ui:search-iterator>
</liferay-ui:search-container>