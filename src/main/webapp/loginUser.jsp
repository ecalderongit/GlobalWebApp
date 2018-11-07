
		<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
		<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
		<fmt:setLocale value="es" />
		<fmt:setBundle basename="com.globalapps.web.common.resources.Resources" />
		
		<!-- Main Slider Section -->
			<section class="page_content_main_slider clearfix"
				style="background-image: url(images/slider_slide_5.jpg); height: 650px;"
				id="home">
				<form  action="/globalapp/showLogin.do" id="loginForm" method="post">
					<div class="flex-content"
						style="margin-top: 180px; height: 300px; width: 100%; z-index: 9999 !important">
						<figure class="flex-item log-photo"
							style="background-color: #b0b1b1; background-image: url(images/login_logo.png); background-size: contain; background-repeat: no-repeat;">
						</figure>
						<div class="flex-item" style="height: 50px; text-align: center;">
							<input class="form_inputs login-input" type="email" name="email" placeholder="e-mail@example.com">
							<input class="login-btn" type="button" id="goButon" name="go" value="GO" onclick="document.getElementById('loginForm').submit();" >
							<c:if test = "${not empty errorCode}">
						        <div class="loginErrorContainer">
									<p class="loginError"><fmt:message key = "common.app.login.errorCode.${errorCode}"/></p>
								</div>
						    </c:if>
						</div>
					</div>
				</form>	
			</section>
		<!-- /Main Slider Section -->