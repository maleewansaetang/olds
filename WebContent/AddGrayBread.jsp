<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import= " model.GrayBreadBean"%>
<%@ page import ="service.AddGrayBreadDao" %>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Simple Responsive Admin</title>
<!-- BOOTSTRAP STYLES-->
<link href="assets/css/bootstrap.css" rel="stylesheet" />
<!-- FONTAWESOME STYLES-->
<link href="assets/css/font-awesome.css" rel="stylesheet" />
<!-- CUSTOM STYLES-->
<link href="assets/css/custom.css" rel="stylesheet" />
<!-- GOOGLE FONTS-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
</head>
<body>

	<form action ="AddGrayBreadServlet" method ="post">
			<input type="text" placeholder="graybeardID"  name= "graybeardID" id="graybeardID"> 
			<input type="text" placeholder="userID"  name= "userID" id="userID"> 
			<input type="text" placeholder="graybeardName"  name= "graybeardName" id="graybeardName"> 
			<input type="text" placeholder="graybeardLastName" name ="graybeardLastName" id="graybeardLastName">
			<input type="text" placeholder="graybeardOld"  name= "graybeardOld" id="graybeardOld"> 
			<input type="text" placeholder="cult" name ="cult" id="cult">
			<input type="text" placeholder="foodAllergy" name ="foodAllergy" id="foodAllergy">
			<input type="text" placeholder="drugAllergy" name ="drugAllergy" id="drugAllergy">
			<input type="text" placeholder="graybeardAdress" name ="graybeardAdress" id="graybeardAdress">
			<input type="text" placeholder="drugAllergy" name ="drugAllergy" id="drugAllergy">
			<input type="text" placeholder="doctorID" name ="doctorID" id="doctorID">
			<input type="submit" value="ตกลง">
	</form>
				
					
					
				
				
				
						
						
					
					
				


		
	<!-- /. WRAPPER  -->
	<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
	<!-- JQUERY SCRIPTS -->
	<script src="assets/js/jquery-1.10.2.js"></script>
	<!-- BOOTSTRAP SCRIPTS -->
	<script src="assets/js/bootstrap.min.js"></script>
	<!-- CUSTOM SCRIPTS -->
	<script src="assets/js/custom.js"></script>


</body>
</html>
