			
			<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
			
			<%@ taglib uri = "com.global.apps.util.tld" prefix = "g" %>
			<!-- Navbar Section -->
			
			
			

			<nav class="navbar navbar-fixed-top ">
				<div class="container-fluid">
					


					<div class="container">
						<div class="navbar-header">
							<a class="navbar-brand orange_logo" href="#"> <svg
									width="250" height="50">
			<circle cx="10" cy="10" r="1" stroke="#FF3700" stroke-width="4"
													fill="#FF3700"></circle>
			<circle cx="20" cy="10" r="1" stroke="#FF3700" stroke-width="4"
													fill="#FF3700"></circle>
			<circle cx="30" cy="10" r="1" stroke="#FF3700" stroke-width="4"
													fill="#FF3700"></circle>
			
			<circle cx="20" cy="20" r="1" stroke="#607D8B" stroke-width="4"
													fill="#607D8B"></circle>
			<circle cx="30" cy="20" r="1" stroke="#607D8B" stroke-width="4"
													fill="#607D8B"></circle>
			
			<circle cx="30" cy="30" r="1" stroke="#b5b5b5" stroke-width="4"
													fill="#b5b5b5"></circle>
			<text fill="#FF3700" font-size="32" font-family="Comfortaa" x="40"
										y="32">Global</text>
			<text fill="#607D8B" font-size="32" font-family="Comfortaa" x="150"
										y="32">Apps</text>
		Sorry, your browser does not support inline SVG.
		</svg>
							</a>
						</div>
						<!-- Collect the nav links, forms, and other content for toggling -->
						
					
                
                
     			
						<!-- /.navbar-collapse -->
					</div>
					
					<form action="/globalapp/logout.do" id="loginForm" method="post">
						<ul class="nav navbar-nav ml-auto">
		                    <li class="dropdown"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#"> 
		                    
		                    <img  style="background-color: #fff;"  src="<c:choose><c:when test="${not empty userSessionInfo.credential.avatar}">/globalapp/getAvatar.do</c:when><c:otherwise>images/userAvatar.png</c:otherwise></c:choose>" class="dropdown-image"></a>
		                        <div class="dropdown-menu dropdown-menu-right" role="menu">

		                       

		                        <g:hasAccess credential="${userSessionInfo.credential}" rules="ALL">

		                        	<a class="dropdown-item" role="presentation" href="/globalapp/myProfile.do" value="01">Mi perfil</a>
		                        </g:hasAccess>
		                        <a class="dropdown-item" role="presentation" href="/globalapp/showHome.do" value="01">Inicio</a>
		                        <a class="dropdown-item" role="presentation" href="/globalapp/logout.do" value="01">Salir</a>
		                        
		                       <!-- <a class="dropdown-item" role="presentation" href="#" >Payments </a>
		                        <a class="dropdown-item" role="presentation" href="#" >Logout </a>-->
		                        </div>
		                    </li>
		                </ul>
					</form>
					
					
				</div>
			</nav>
			
			<figure class="snip1253">
