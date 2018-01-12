<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="model.doctorAppointBean"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>eNno Bootstrap Template</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="css/animate.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/font-awesome.css">
	<link rel="stylesheet" href="css/jquery.bxslider.css">
	<link rel="stylesheet" href="css/jquery.bxslider.css">
	<link rel="stylesheet" type="text/css" href="css/normalize.css" />
	<link rel="stylesheet" type="text/css" href="css/demo.css" />
	<link rel="stylesheet" type="text/css" href="css/set1.css" />
	<link href="css/overwrite.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
	<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse.collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.html"><span>KK old family </span></a>
			</div>
			<div class="navbar-collapse collapse">							
				<div class="menu">
					<ul class="nav nav-tabs" role="tablist">
						<li role="presentation" class="active"><a href="index.html">หน้าหลัก</a></li>
						<li role="presentation"><a href="services.html">บริการของเรา</a></li>
						<li role="presentation"><a href="blog.html">ค่าบริการ</a></li>
						<li role="presentation"><a href="contact.html">ติดต่อ</a></li>
						<li role="presentation"><a href="User.html">ข้อมูลคนชรา</a></li>
						<li role="presentation"><a href="User1.html">กิจกรรม</a></li>
						<li role="presentation"><a href="User3.html">ตารางนัดหมอ</a></li>
						<li role="presentation"><a href="User2.html">ค่าใช้จ่าย</a></li>
				</ul>
				</div>
			</div>			
		</div>
	</nav>
	
	<div class="container">
		<div class="row">
			<div class="service">
				<div class="col-md-6 col-md-offset-3">
					<div class="text-center">
						<h2>ตารางนัดหมอ</h2>
						<p>ลายละเอียดวันเวลาการพบหมอของคนชรา<br>
						</p>
					</div>
					<hr>
				</div>
			</div>
		</div>
	</div>

	<center>
		<table width="80%" cellspacing="1" bgcolor="#CCCCCC">
  <caption></caption>
  <col align="center"></col>
  <col align="left"></col>
  <col align="right"></col> 
  <%ArrayList<doctorAppointBean> DoctorList = (ArrayList<doctorAppointBean>) request.getAttribute("Doctor");
					doctorAppointBean bean;
				
   
    %>
				
  <thead>
  <tr>
    <th width="20%" bgcolor="#FFFFCC">กิจกรรม</th>
    <th bgcolor="#FFCCCC">รายละเอียด</th>
    
  </tr>
  </thead>
  <tbody>
  	<%
  	for(int i =0;i<DoctorList.size();i++){
  	bean = new doctorAppointBean();
	bean = DoctorList.get(i);
   
    %>
  <tr bgcolor="#FFFFFF" >
    <td><%=bean.getDoctorID() %></td>
    <td><%=bean.getDoctorName() %></td>
    <td><%=bean.getDoctorLastName() %></td>
    <td><%=bean.getDoctorAdress() %></td>
    <td><%=bean.getDoctorTel() %></td>
    
  </tr>
  <%} %>
  </tbody>
  
</table>
	</center>
	
	
	<footer>
		
			
		<div class="last-div">
			<div class="container">
				<div class="row">
					<div class="copyright">
						© 2014 eNno Multi-purpose theme | <a target="_blank" href="http://bootstraptaste.com">Bootstraptaste</a>
					</div>
                    <!-- 
                        All links in the footer should remain intact. 
                        Licenseing information is available at: http://bootstraptaste.com/license/
                        You can buy this theme without footer links online at: http://bootstraptaste.com/buy/?theme=eNno
                    -->
				</div>
			</div>
			<div class="container">
				<div class="row">
					<ul class="social-network">
						<li><a href="#" data-placement="top" title="Facebook"><i class="fa fa-facebook fa-1x"></i></a></li>
						<li><a href="#" data-placement="top" title="Twitter"><i class="fa fa-twitter fa-1x"></i></a></li>
						<li><a href="#" data-placement="top" title="Linkedin"><i class="fa fa-linkedin fa-1x"></i></a></li>
						<li><a href="#" data-placement="top" title="Pinterest"><i class="fa fa-pinterest fa-1x"></i></a></li>
						<li><a href="#" data-placement="top" title="Google plus"><i class="fa fa-google-plus fa-1x"></i></a></li>
					</ul>
				</div>
			</div>
			<a href="" class="scrollup"><i class="fa fa-chevron-up"></i></a>	
		</div>			
	</footer>
	
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery-2.1.1.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
	<script src="js/wow.min.js"></script>
	<script src="js/jquery.easing.1.3.js"></script>
	<script src="js/jquery.isotope.min.js"></script>
	<script src="js/jquery.bxslider.min.js"></script>
	<script type="text/javascript" src="js/fliplightbox.min.js"></script>
	<script src="js/functions.js"></script>
	<script type="text/javascript">$('.portfolio').flipLightBox()</script>
  </body>
</html>
