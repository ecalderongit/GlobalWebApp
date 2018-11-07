<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<fmt:setLocale value="es" />
<fmt:setBundle basename="com.globalapps.web.common.resources.Resources" />

<!DOCTYPE html>
<!--ovindas-->
<html lang="es">
<head>
<meta charset="UTF-8">

<meta http-equiv="X-UA-Compatible" content="IE=edge">

<meta name="viewport" content="width=device-width, initial-scale=1">

<meta name="description" content="">

<meta name="author" content="">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="js/globalapp_util.js"></script>

		
<title><fmt:message key="common.app.title" /></title>
<!-- <link rel="stylesheet" href="css/estilos.css"> -->
<!-- Insert Favicon Here -->
<link href="images/favicon.png" rel="icon">


<!-- Bootstrap CSS File -->
<link rel="stylesheet" href="css/bootstrap.css">

<!-- Font-Awesome CSS File -->
<link rel="stylesheet" href="css/font-four.css">

<!-- Slider Revolution CSS File -->
<link rel="stylesheet" href="css/settings.css">

<!--  Fancy Box CSS File -->
<link rel="stylesheet" href="css/jquery.fancybox.css">

<!-- Circleful CSS File -->
<link rel="stylesheet" href="css/jquery.circliful.css">

<!-- Animate CSS File -->
<link rel="stylesheet" href="css/animate.css">

<!-- Cube Portfolio CSS File -->
<link rel="stylesheet" href="css/cubeportfolio.min.css">

<!-- Owl Carousel CSS File -->
<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/owl.theme.default.min.css">

<!-- Swiper CSS File -->
<link rel="stylesheet" href="css/swiper.min.css">

<!-- Custom Style CSS File -->
<link rel="stylesheet" href="css/style.css">

<!-- Color StyleSheet CSS File -->
<link href="css/orange.css" rel="stylesheet" id="color" type="text/css">

<!--Style CSS Propio de GlobalAppsSolutions-->
    <link rel="stylesheet" href="css/globalapps-style.css">
    
</head>
<!-- <body class="body"> -->
<body data-spy="scroll" data-target=".navbar" data-offset="50" id="body"
	class="index-light">
	<div class="loader">
		<div class="loader-inner">
			<div class="spinner">
				<div class="dot1"></div>
				<div class="dot2"></div>
			</div>
		</div>
	</div>
	<section class="page_content_parent_section">
		<!-- Header Section -->
		<header>

			<tiles:insert attribute="header"/>
			
			<tiles:insert attribute="loginForm"/>

		</header>


		<!-- /Header Section -->

	</section>
	<!-- <div class="container">
	         		<div class="row">
	         		<div  class="col-xs-10  col-sm-6  col-md-2 col-lg-2 offset-xs-1  offset-sm-3  offset-md-5 offset-lg-5">
	         		<img class="logo" src="images/GLOBALAPPlogoblanco.png" alt="ifz" />
	         		</div>
			 		</div>
			 		
			  <form  action="/fec/showLogin.do" id="loginForm" method="post">			   
			 		<div class="row">
					<div class="col-xs-10 col-sm-6 col-md-2 col-lg-2 offset-xs-1 offset-sm-3 offset-md-5 offset-lg-5">
					<input class="input-text"  type="text" name="email" placeholder="some@email.com"/>
					</div>
					<c:if test = "${not empty errorCode}">
						<div class="col-xs-10 col-sm-6 col-md-2 col-lg-2 offset-xs-1 offset-sm-3 offset-md-5 offset-lg-5">
							<p><fmt:message key="common.app.login.errorCode.${errorCode}"/><p>
						</div>
				    </c:if>
				    <c:if test = "${not empty messageCode}">
						<div class="col-xs-10 col-sm-6 col-md-2 col-lg-2 offset-xs-1 offset-sm-3 offset-md-5 offset-lg-5">
							<p><fmt:message key="common.app.login.errorCode.messageCode.${messageCode}"/><p>
						</div>
				    </c:if>
					</div>
						<div class="row">
						<div class="col-xs-10 col-sm-6 col-md-2 col-lg-2 offset-xs-1 offset-sm-3 offset-md-5 offset-lg-5" >
						<input class="buttonBig" type="button" onclick="document.getElementById('loginForm').submit();" value="<fmt:message key="common.app.login.getSecurityCode"/>"/></div >
						
					</div>
			</form>	
		</div> -->

	<!-- jQuery 2.2.0-->
	<script src="js/jquery.js"></script>



	<!-- REVOLUTION JS FILES -->
	<script type="text/javascript" src="js/jquery.themepunch.tools.min.js"></script>
	<script type="text/javascript"
		src="js/jquery.themepunch.revolution.min.js"></script>

	<!-- SLIDER REVOLUTION 5.0 EXTENSIONS  (Load Extensions only on Local File Systems !  The following part can be removed on Server for On Demand Loading) -->
	<script type="text/javascript"
		src="js/extensions/revolution.extension.actions.min.js"></script>
	<script type="text/javascript"
		src="js/extensions/revolution.extension.carousel.min.js"></script>
	<script type="text/javascript"
		src="js/extensions/revolution.extension.kenburn.min.js"></script>
	<script type="text/javascript"
		src="js/extensions/revolution.extension.layeranimation.min.js"></script>
	<script type="text/javascript"
		src="js/extensions/revolution.extension.migration.min.js"></script>
	<script type="text/javascript"
		src="js/extensions/revolution.extension.navigation.min.js"></script>
	<script type="text/javascript"
		src="js/extensions/revolution.extension.parallax.min.js"></script>
	<script type="text/javascript"
		src="js/extensions/revolution.extension.slideanims.min.js"></script>
	<script type="text/javascript"
		src="js/extensions/revolution.extension.video.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

	<!-- Owl Carousel 2 Core JavaScript -->
	<script src="js/owl.carousel.js"></script>
	<script src="js/owl.animate.js"></script>
	<script src="js/owl.autoheight.js"></script>
	<script src="js/owl.autoplay.js"></script>
	<script src="js/owl.autorefresh.js"></script>
	<script src="js/owl.hash.js"></script>
	<script src="js/owl.lazyload.js"></script>
	<script src="js/owl.navigation.js"></script>
	<script src="js/owl.support.js"></script>
	<script src="js/owl.video.js"></script>

	<!-- Fancy Box Javacript -->
	<script src="js/jquery.fancybox.js"></script>

	<!-- Wow Js -->
	<script src="js/wow.min.js"></script>

	<!-- Appear Js-->
	<script src="js/jquery.appear.js"></script>

	<!-- Countdown Js -->
	<script src="js/jquery.countdown.js"></script>

	<!-- Parallax Js -->
	<script src="js/parallax.min.js"></script>

	<!-- Cube Portfolio Core JavaScript -->
	<script src="js/jquery.cubeportfolio.min.js"></script>

	<!-- Circliful Core JavaScript -->
	<script src="js/jquery.circliful.min.js"></script>

	<!-- Swiper Slider Core JavaScript -->
	<script src="js/swiper.min.js"></script>

	<!-- Custom JavaScript -->
	<script src="js/script.js"></script>
	
</body>
</html>