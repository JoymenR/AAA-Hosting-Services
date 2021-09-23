<%@ include file="/html/init.jsp" %>

<%
	Servic servic = null;
	long servicId = ParamUtil.getLong(request, "servicId");
	if (servicId > 0) {
		servic = ServicLocalServiceUtil.getServic(servicId);
	}
	String redirect = ParamUtil.getString(request, "redirect");
%>

<aui:model-context bean="<%= servic %>" model="<%= Servic.class %>"></aui:model-context>
	<portlet:renderURL var="viewServicURL"></portlet:renderURL>
	<portlet:actionURL name='<%= servic == null ? "addServic" : "updateServic" %>' var="editServicURL" windowState="normal"></portlet:actionURL>

<liferay-ui:header backURL="<%= viewServicURL %>" title='<%= (servic != null) ? servic.getServicName() : "New Service" %>'></liferay-ui:header>

<aui:form action="<%= editServicURL %>" method="POST" name="fm">
	<aui:fieldset>
		<aui:input name="redirect" type="hidden" value="<%= redirect %>"></aui:input>

		<aui:input name="servicId" type="hidden" value='<%= servic == null ? "" : servic.getServicId() %>'/>

		<aui:input name="servicName"></aui:input>
		<aui:input name="servicPrice"></aui:input>
		<aui:input name="servicDescription"></aui:input>
	
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
		<aui:button onClick="<%=viewServicURL%>"  type="cancel"></aui:button>
	</aui:button-row>
</aui:form>