<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<fmt:setLocale value="es" />
<fmt:setBundle basename="com.globalapps.web.common.resources.Resources" />

<script>
$( document ).ready(function() {
$( "#email" ).keypress(function(e) {
       if(e.which == 13) {
       	validateAndSubmit();
       }else{
       	$("#loginMessage").text("");
       }
   });
});
$( document ).ready(function() {
	$( "#email" ).keypress(function(e) {
	       if(e.which == 13) {
	       	validateAndSubmit();
	       }else{
	       	$("#loginError").text("");
	       }
	   });
	});

function validateAndSubmit(){

if($("#email").val() != ''){
if(isEmail($("#email").val())){
document.getElementById('loginForm').submit();
}else{
$("#loginError").text("<fmt:message key = "common.app.login.errorCode.lgn01"/>");
$("#email").focus();
}
}else{
$("#loginError").text("<fmt:message key = "common.app.login.errorCode.lgn01"/>");
$("#email").focus();
}
}

</script>

<!-- Main Slider Section -->
<section class="page_content_main_slider clearfix" id="home">
<form  action="/globalapp/showLogin.do" id="loginForm" method="post">
<div class="flex-content"
style="margin-top: 80px; height: 300px; width: 100%; z-index: 9999 !important">
<figure class="flex-item log-photo"
style="background-color: #fff; background-image: url(images/userAvatar.png); background-size: contain; background-repeat: no-repeat;">
</figure>
<div class="flex-item" style="height: 50px; text-align: center;">
<input class="form_inputs login-input" type="email" name="email" id="email" placeholder="example@e-mail.com">
<input class="login-btn" type="button" id="goButon" name="go" value="GO" onclick="validateAndSubmit()" >
<div class="loginErrorContainer">
<p class="loginError" id="loginError">
<c:if test = "${not empty errorCode}">
<fmt:message key = "common.app.login.errorCode.${errorCode}"/>
   </c:if>
   	</p>
   </div>
   
   
   <div class="loginMessageContainer">
<p class="loginMessage" id="loginMessage">
<c:if test = "${not empty messageCode}">
<fmt:message key = "common.app.login.messageCode.${messageCode}"/>
   </c:if>
   
   	</p>
   </div>
</div>
</div>
</form>	
</section>
<!-- /Main Slider Section -->