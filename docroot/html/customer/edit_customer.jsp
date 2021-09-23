<%@ include file="/html/init.jsp" %>

<%
	Customer customer = null;
	long customerId = ParamUtil.getLong(request, "customerId");
	if (customerId > 0) {
		customer = CustomerLocalServiceUtil.getCustomer(customerId);
	}
	List<Servic> servics = ServicLocalServiceUtil.getServicsByGroupId(scopeGroupId);
	String redirect = ParamUtil.getString(request, "redirect");
%>

<aui:model-context bean="<%=customer%>" model="<%=Customer.class%>"></aui:model-context>
	<portlet:renderURL var="viewCustomerURL"></portlet:renderURL>
	<portlet:actionURL name='<%=customer == null ? "addCustomer" : "updateCustomer"%>' var="editCustomerURL" windowState="normal"></portlet:actionURL>

<liferay-ui:header backURL="<%=viewCustomerURL%>" title='<%=(customer != null) ? customer.getName() : "New Customer"%>'></liferay-ui:header>

<aui:form action="<%=editCustomerURL%>" method="POST" name="fm">
	<aui:fieldset>
		<aui:input name="redirect" type="hidden" value="<%=redirect%>"></aui:input>

		<aui:input name="customerId" type="hidden" value='<%=customer == null ? "" : customer.getCustomerId()%>'></aui:input>

		<aui:input name="name"></aui:input>

		<aui:input name="email"></aui:input>
		<aui:input name="address"></aui:input>
		<aui:input name="nicNumber"></aui:input>
		<aui:input name="contactNumber"></aui:input>

		<aui:select label="servic" name="servicId" showEmptyOption="<%=true%>">

	 		<%
				for (Servic servic : servics) {
			%>

			<aui:option selected="<%=customer != null && servic.getServicId() == servic.getServicId() %>" value="<%= servic.getServicId() %>"><%=servic.getServicName()%></aui:option>

			<%
				}
			%>

		</aui:select>

		
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>

		<aui:button onClick="<%=viewCustomerURL%>"  type="cancel"></aui:button>
	</aui:button-row>
</aui:form>