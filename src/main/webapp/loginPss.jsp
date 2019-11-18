		<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
		<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
		<fmt:setLocale value="es" />
		<fmt:setBundle basename="com.globalapps.web.common.resources.Resources" />
					<section class="page_content_main_slider clearfix" >
					
					
					

						
						
						
						
						<form action="/globalapp/login.do" id="loginForm" method="post">
	
							<div class="flex-content" style="margin-top: 80px; height: 300px; width: 100%; z-index: 9999 !important">
							
		<div  style="width: 229px; display:block; margin: 0 auto; ">
			<div  style=" width: 150px;  margin: 0 auto;">
			
								<img style="background-color: #fff;" class="flex-item log-photo " src="<c:choose><c:when test="${not empty credential.avatar}">/globalapp/getAvatar.do</c:when><c:otherwise>images/userAvatar.png</c:otherwise></c:choose>"/>												
			</div>

			<div style="width: 229px;  display:block; margin: 0 auto;">
			<div style="margin: 0 auto; display: inline-block;  ">
			<div class="flex-item">
				
				<input class="form_inputs login-input" type="password" name="securityCode" placeholder="password" style="float: left;">
			
									<input class="login-btn" type="button" name="go" value="GO" onclick="document.getElementById('loginForm').submit();" >
									<c:if test = "${not empty errorCode}">
								        <div class="loginErrorContainer">
											<p class="loginError"><fmt:message key = "common.app.login.errorCode.${errorCode}"/></p>
										</div>
								    </c:if>
								  
			<div class="loginErrorContainer">


		   </div></div>
		   </div>
		   </div>
								</div>
							</div>
						</form>	
						
						
						
						
						
						
						
						
						
						
						
						
						
					</section>
		