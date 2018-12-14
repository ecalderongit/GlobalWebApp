<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<fmt:setLocale value="es" />
<fmt:setBundle basename="com.globalapps.web.common.resources.Resources" />




		
		<div class="myProfile-container">
		<form action="/globalapp/updateAvatar.do" id="ProfileForm" method="post" enctype="multipart/form-data">
			<label for="nuevo_avatar" style="display: flex;">
				
				<div class="myProfile-avatarContainer"
				style="background-image: url(<c:choose><c:when test="${not empty userSessionInfo.credential.avatar}">/globalapp/getAvatar.do</c:when><c:otherwise>images/userAvatar.png</c:otherwise></c:choose>);
						background-repeat: no-repeat;
					    background-position: center; "> 
				<div id="leyendaAvatar" class="leyendaAvatar">Cambiar Avatar</div>
				<button class="Profile-gbtn" type="button" id="Profile-gbtn"   onclick="defaultAvatar();" ><span></span></button>
				
			</div>
				<input id="nuevo_avatar" name="avatar" type="file"  accept="image/*" data-max-size="2048" onchange="changeAvatar();"  style="display: none;"/>
			</label>
				
			</br>
			
				<div class= "myProfile-profileData">
				
						<p style="font-size: 30px;"><c:out value = "${userSessionInfo.credential.name}"/></p>
						<hr id= "linea"/>
						<p><c:out value = "${userSessionInfo.credential.email}"/></p>
						
				</div>
			</form>
		</div>
			
			
	<script>
		function defaultAvatar(){
			$("#ProfileForm").submit();

		}
		function changeAvatar(){
			$("#ProfileForm").submit();
		}
	</script>
	