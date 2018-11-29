		<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
		<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
		<fmt:setLocale value="es" />
		<fmt:setBundle basename="com.globalapps.web.common.resources.Resources" />
					<section class="page_content_main_slider clearfix" >
						<form action="/globalapp/login.do" id="loginForm" method="post">
							<div class="flex-content" style="margin-top: 80px; height: 300px; width: 100%; z-index: 9999 !important">
							
								<img style="background-color: #fff;" class="flex-item log-photo " src="<c:choose><c:when test="${not empty credential.avatar}">/globalapp/getAvatar.do</c:when><c:otherwise>images/userAvatar.png</c:otherwise></c:choose>"/>												
			
								<c:if test = ""></c:if>
								<div class="flex-item" style="height: 50px; text-align: center;">
									<input class="form_inputs login-input" type="password" name="securityCode" placeholder="password">
									<input class="login-btn" type="button" name="go" value="GO" onclick="document.getElementById('loginForm').submit();" >
									<c:if test = "${not empty errorCode}">
								        <div class="loginErrorContainer">
											<p class="loginError"><fmt:message key = "common.app.login.errorCode.${errorCode}"/></p>
										</div>
								    </c:if>
								</div>
							</div>
						</form>	
					</section>
		