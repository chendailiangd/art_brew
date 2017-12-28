<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>登录</title>
	<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
	<link rel="shortcut icon" href="favicon.ico">
	<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login_css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login_css/animate.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login_css/style.css">
	<!-- Modernizr JS -->
	<script src="${pageContext.request.contextPath}/js/login_js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="${pageContext.request.contextPath}/js/login_js/respond.min.js"></script>
	<![endif]-->
<script type="text/javascript">
function checkForm(){
	var username=document.getElementById("username").value;
	if(username==null||username==''){
	$("#username_span").html("用户名不能为空！");
		return false;
	}
	var password=document.getElementById("password").value;
	if(password==null||password==''){
		$("#password_span").html("密码不能为空！");
		return false;
	}
	


}

</script>

	</head>
	
<%@include file="header.jsp" %>
	<body class="style-3">
		<div class="container">
			<div class="row">
				<div class="col-md-12 text-center">
					<ul class="menu">
					</ul>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4 col-md-push-8">
					

					<!-- Start Sign In Form -->
<form action="${pageContext.request.contextPath }/login.do" method="post" onsubmit="return checkForm();"
class="fh5co-form animate-box" data-animate-effect="fadeInRight" >
						<h2>登录</h2>
						<div class="form-group">
							<label for="username" class="sr-only">Username</label>
							<input type="text" class="form-control" id="username" name="username" placeholder="Username" autocomplete="off">
							<span id="username_span" style="color:red">${umsg }</span>
						</div>
						<div class="form-group">
							<label for="password" class="sr-only">Password</label>
							<input type="password" class="form-control" id="password" name="password" placeholder="Password" autocomplete="off">
							<span id="password_span" style="color:red">${pmsg}</span>
						</div>
						<span style="color:red">${smsg}</span>
						<div class="form-group">
							<label for="remember"><input type="checkbox" id="remember"> Remember Me</label>
						</div>
						<div class="form-group">
							<p>Not registered? <a href="${pageContext.request.contextPath }/toRegist.do">Sign Up</a> | <a href="forgot3.html">Forgot Password?</a></p>
						</div>
						<div class="form-group">
							<input type="submit" value="登录" class="btn btn-primary" >
						</div>
					</form>
					<!-- END Sign In Form -->


				</div>
			</div>
			<div class="row" style="padding-top: 60px; clear: both;">
				<div class="col-md-12 text-center"><p><small>&copy; All Rights Reserved. More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></small></p></div>
			</div>
		</div>
	
	<!-- jQuery -->
	<script src="${pageContext.request.contextPath}/js/login_js/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="${pageContext.request.contextPath}/js/login_js/bootstrap.min.js"></script>
	<!-- Placeholder -->
	<script src="${pageContext.request.contextPath}/js/login_js/jquery.placeholder.min.js"></script>
	<!-- Waypoints -->
	<script src="${pageContext.request.contextPath}/js/login_js/jquery.waypoints.min.js"></script>
	<!-- Main JS -->
	<script src="${pageContext.request.contextPath}/js/login_js/main.js"></script>