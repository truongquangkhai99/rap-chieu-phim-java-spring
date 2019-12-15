<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>

<html>

<head> <title>Trang chủ</title> </head>

<body>
  <div class="container">

  <!-- Portfolio Item Heading -->
  <h1 class="my-4">Page Heading
    <small>Secondary Text</small>
  </h1>
  
  <h2 class="my-4">Lịch chiếu phim
    <a href="<c:url value='/schedule'/>">
      	<button type="button" id="btn" class="btn btn-secondary">2019-12-14</button>
    </a>
  </h2>
  
  <!-- Portfolio Item Row -->
  <div class="row">

    <div class="col-md-3">
      <img class="img-fluid" src="http://placehold.it/750x500" alt="">
    </div>

    <div class="col-md-5">
      <h3 class="my-3">Project Description</h3>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque urna varius vitae. Sed dui lorem, adipiscing in adipiscing et, interdum nec metus. Mauris ultricies, justo eu convallis placerat, felis enim.</p>
      <h3 class="my-3">Project Details</h3>
      <ul>
        <li>Lorem Ipsum</li>
        <li>Dolor Sit Amet</li>
        <li>Consectetur</li>
        <li>Adipiscing Elit</li>
      </ul>
    </div>
    
    <div class="col-md-4">
      <a href="<c:url value='/book'/>">
      	<button type="button" id="btn" class="btn btn-secondary">10:00</button>
      </a>
    </div>
  </div>
  <!-- /.row -->
</div>

</body>

</html>