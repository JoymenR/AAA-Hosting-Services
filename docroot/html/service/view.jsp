<%@page import="com.lithan.liferay.service.permission.ServicModelPermission"%>
<%@ include file="/html/init.jsp" %>



<%
	String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<aui:button-row>
	<portlet:renderURL var="addServicURL">
		<portlet:param name="mvcPath" value="/html/service/edit_servic.jsp"></portlet:param>
		<portlet:param name="redirect" value="<%= redirect %>"></portlet:param>
	</portlet:renderURL>

	
	<c:if test='<%=ServicModelPermission.contains(permissionChecker, scopeGroupId, "ADD_SERVICE")%>'>
			<aui:button onClick="<%=addServicURL.toString()%>" value="Add Service"></aui:button>
	</c:if>
	
</aui:button-row>

		<liferay-ui:search-container>
			<liferay-ui:search-container-results
				results="<%= ServicLocalServiceUtil.getServicsByGroupId(scopeGroupId, searchContainer.getStart(), searchContainer.getEnd()) %>"
				total="<%= ServicLocalServiceUtil.getServicsCountByGroupId(scopeGroupId) %>">
			</liferay-ui:search-container-results>

			<liferay-ui:search-container-row className="Servic" keyProperty="servicId" modelVar="servic" escapedModel="<%= true %>">
				<liferay-ui:search-container-column-text name="servicName" value="<%= servic.getServicName() %>"></liferay-ui:search-container-column-text>
				<liferay-ui:search-container-column-text name="servicPrice" value="<%= servic.getServicPrice() %>"></liferay-ui:search-container-column-text>
				<liferay-ui:search-container-column-text name="servicDescription" value="<%= servic.getServicDescription() %>"></liferay-ui:search-container-column-text>
				<liferay-ui:search-container-column-jsp align="right" path="/html/service/servic_actions.jsp"></liferay-ui:search-container-column-jsp>
			</liferay-ui:search-container-row>

			<liferay-ui:search-iterator></liferay-ui:search-iterator>

		</liferay-ui:search-container>
