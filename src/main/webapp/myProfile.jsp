<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<fmt:setLocale value="es" />
<fmt:setBundle basename="com.globalapps.web.common.resources.Resources" />

		
			<div class="myProfile-container">
				<img class="myProfile-avatarContainer"
					src= "<c:choose><c:when test="${not empty userSessionInfo.credential.avatar}">/globalapp/getAvatar.do</c:when><c:otherwise>images/userAvatar.png</c:otherwise></c:choose>" style=" background-repeat: no-repeat;"/>
				</br>
				<form class="myProfile-form">
					<div class= "myProfile-profileData">
					
							<p style="font-size: 30px;"><c:out value = "${userSessionInfo.credential.name}"/></p>
							<hr id= "linea"/>
							<p><c:out value = "${userSessionInfo.credential.email}"/></p>
							
					</div>
				</form>
			</div>
			
			
	