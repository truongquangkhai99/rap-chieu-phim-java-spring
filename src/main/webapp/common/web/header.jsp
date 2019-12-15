<%@ page import="com.qnu.util.SecurityUtils" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-light fixed-top py-3"
	id="mainNav">
	<div class="container">
		<a class="navbar-brand js-scroll-trigger"
			href="<c:url value='/home'/>">QNU Cinemas</a>
		<button class="navbar-toggler navbar-toggler-right" type="button"
			data-toggle="collapse" data-target="#navbarResponsive"
			aria-controls="navbarResponsive" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto my-2 my-lg-0">
				
				<li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="<c:url value='/list-film?page=1&limit=9'/>">Phim</a></li>
				
				<li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="<c:url value='/schedule'/>">Lịch chiếu phim</a></li>
				
				<li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="#services">Khuyến mãi</a></li>
				
				<li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="#contact">Liên hệ</a></li>
					
				<security:authorize access="isAnonymous()">
					<li class="nav-item"><a class="nav-link js-scroll-trigger"
						href="<c:url value='/login'/>">Đăng nhập</a></li>
					<li class="nav-item"><a class="nav-link js-scroll-trigger"
						href="<c:url value='/registry'/>">Đăng ký</a></li>
				</security:authorize>
				
				<security:authorize access="isAuthenticated()">
					<li class="nav-item"><a class="nav-link js-scroll-trigger"
						href="#contact">Chào <%=SecurityUtils.getPrincipal().getFullName()%></a>
					</li>
					<li class="nav-item"><a class="nav-link js-scroll-trigger"
						href="<c:url value='/logout'/>">Thoát</a></li>
				</security:authorize>
				
			</ul>
		</div>
	</div>
</nav>