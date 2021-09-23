<%@page import="com.liferay.portal.security.permission.ActionKeys"%>
<%@ include file="/html/init.jsp" %>

<%
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Servic servic = (Servic) row.getObject();
	long groupId = servic.getGroupId();
	String name = Servic.class.getName();
	long servicId = servic.getServicId();
	String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<liferay-ui:icon-menu>
	<c:if test="<%=ServicPermission.contains(permissionChecker, servic.getServicId(), ActionKeys.UPDATE)%>">
	<portlet:renderURL var="editURL">
		<portlet:param name="mvcPath" value="/html/service/edit_servic.jsp"></portlet:param>
		<portlet:param name="servicId" value="<%=String.valueOf(servicId)%>"></portlet:param>
		<portlet:param name="redirect" value="<%=redirect%>"></portlet:param>
	</portlet:renderURL>
	
	<liferay-ui:icon image="edit" url="<%=editURL.toString()%>"></liferay-ui:icon>
	</c:if>
	<c:if test="<%=ServicPermission.contains(permissionChecker, servic.getServicId(), ActionKeys.DELETE)%>">
		<portlet:actionURL name="deleteServic" var="deleteURL">
			<portlet:param name="servicId" value="<%=String.valueOf(servicId)%>"></portlet:param>
			<portlet:param name="redirect" value="<%=redirect%>"></portlet:param>
		</portlet:actionURL>
	
		<liferay-ui:icon-delete url="<%=deleteURL.toString()%>" />
	</c:if>
	<%-- Permission Button --%>
	<c:if test="<%=ServicPermission.contains(permissionChecker, servic.getServicId(), ActionKeys.PERMISSIONS) %>">
		<liferay-security:permissionsURL modelResource="<%=Servic.class.getName()%>" modelResourceDescription="<%=servic.getServicName()%>" resourcePrimKey="<%=String.valueOf(servic.getServicId())%>" var="permissionURL">
		</liferay-security:permissionsURL>
		
		<liferay-ui:icon image="permissions" url="<%=permissionURL.toString()%>"></liferay-ui:icon>
	</c:if>
</liferay-ui:icon-menu>