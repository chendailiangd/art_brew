<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>注册</title>
	<link rel="shortcut icon" href="favicon.ico">
	<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login_css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login_css/animate.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login_css/style.css">
	<!-- Modernizr JS -->
	<script src="${pageContext.request.contextPath}/js/login_js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->
	<script type="text/javascript">
	function checkUsername(){
		var username=document.getElementById("username").value;
		if(username.indexOf(" ")>=0){
			$("#msg").html("<span style='color:red'>"+"有空格"+"</span>");
		}
		else{
		$.post(
			"${pageContext.request.contextPath}/checkUsername.do?username="+username,function(data){
				if(data=="yes"){
					$("#msg").html("该用户名可以注册");
				}
				if(data=="no"){
					$("#msg").html("<span style='color:red'>"+"该用户名被占用"+"</span>");
				}
			}
		)
	}
	}
	
	function checkForm(){
		var username=document.getElementById("username").value;
		var password=document.getElementById("password").value;
		var repassword=document.getElementById("repassword").value;
		var email=document.getElementById("email").value;
		if(username==""||username==null){
			$("#msg").html("<span style='color:red'>"+"用户名不能为空"+"</span>");
			return false;
		}
		if(email==""||email==null){
			$("#msg").html("<span style='color:red'>"+"邮箱不能为空"+"</span>");
			return false;
		}
		if(password==""||password==null){
			$("#msg").html("<span style='color:red'>"+"密码不能为空"+"</span>");
			return false;
		}
		if(repassword==""||repassword==null){
			$("#msg").html("<span style='color:red'>"+"确认密码不能为空"+"</span>");
			return false;
		}
		if(password!=repassword){
			$("#msg").html("<span style='color:red'>"+"用户名和密码不相等"+"</span>");
			return false;
		}
		
	}
	
	function sendMail(){
		var email = document.getElementById("email").value;
		$.post("${pageContext.request.contextPath}/sendMail.do?email="+email);
		var wait=5; 
		function time(o) { 
       	 	if (wait == 0) { 
            o.removeAttribute("disabled");           
            o.value="免费获取验证码"; 
            wait = 5; 
        } else { 
            o.setAttribute("disabled", true); 
            o.value=wait+"秒后可以重新发送"; 
            wait--; 
            setTimeout(function() { 
                time(o) 
            }, 
            1000) 
        } 
    } 
document.getElementById("btn").onclick=function(){time(this);} 
}
	</script>
	
	
	</head>
	<body class="style-3">

			<div class="row">
				<div class="col-md-4 col-md-push-8">
					

					<!-- Start Sign In Form -->
<form action="${pageContext.request.contextPath }/regist.do" method="post" onsubmit="return checkForm()"
 class="fh5co-form animate-box" data-animate-effect="fadeInRight">
						<h2>Sign Up</h2>
						<div class="form-group">
							<div class="alert alert-success" id="msg" role="alert">请准确填写信息 ${msg } </div>
						</div>
						<div class="form-group">
							<label for="username" class="sr-only">用户名</label>
							<input type="text" class="form-control" id="username" name="username" placeholder="usernmae" autocomplete="off" onblur="checkUsername()">
						</div>
						<div class="form-group">
							<label for="email" class="sr-only">Email</label>
							<input type="email" class="form-control" id="email" name="email" placeholder="Email" autocomplete="off">
						</div>
						<div class="form-group">
							<label for="password" class="sr-only">Password</label>
							<input type="password" class="form-control" id="password" name="password" placeholder="Password" autocomplete="off">
						</div>
						<div class="form-group">
							<label for="re-password" class="sr-only">Re-type Password</label>
							<input type="password" class="form-control" id="repassword" name="repassword" placeholder="Re-type Password" autocomplete="off">
						</div>
						<div class="form-group">
							<input type="text" value="验证码" id="active_code" name="active_code" style="width:80px" />
							<input type="button" id="btn" value="获取验证码" onclick="sendMail()"/>
						</div>
						<div class="form-group">
							<p>Already registered? <a href="index3.html">Sign In</a></p>
						</div>
						<div class="form-group">
							<input type="submit" value="Sign Up" class="btn btn-primary" >
						</div>
</form>
					<!-- END Sign In Form -->


				</div>
			</div>
			<div class="row" style="padding-top: 60px; clear: both;">
				<div class="col-md-12 text-center"><p><small>&copy; All Rights Reserved. More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></small></p></div>
			
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

	</body>
</html>
