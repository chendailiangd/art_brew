<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
    <title>艺术精酿</title>
    <!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lora:400,400i" rel="stylesheet">
    <!-- Styles -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css"  href="${pageContext.request.contextPath}/css/gonex-icons.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
	<link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css" />	
		<!-- Scripts -->
	<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/smooth-scroll.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/modernizr.mq.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/mixitup.min.js"></script>
	<!-- Latest compiled and minified JavaScript Bootstrap-->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
	<!-- Custom JS -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/google-map.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/video.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/custom.js"></script>
</head>
<body>

	<header id="header">
		
		<!-- Section title -->
		
		<nav id="main-navigation" class="navbar navbar-default navbar-fixed-top">
		  <!-- Section title -->
		  <h1 class="sr-only">Main navigation</h1>

		  <div class="container">
		    <!-- Brand and toggle get grouped for better mobile display -->
		    <div class="navbar-header">
		      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#main-navbar" aria-expanded="false">
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="sr-only">Toggle navigation</span>
		      </button>
		      <a id="brand-mobile" class="navbar-brand navbar-brand-center smoothScroll" 
		      href="${pageContext.request.contextPath }/index.do">
		        <img alt="Gonex" src="${pageContext.request.contextPath}/img/svg/logo.jpg">
		      </a>
		    </div>

		    <!-- Collect the nav links, forms, and other content for toggling -->
		    <div class="collapse navbar-collapse" id="main-navbar">

		    	<form class="navbar-form navbar-right" role="search">

		    		<button type="button" id="btn-togglesearch" class="btn-search">
		    			<span class="ico ico-search-icon" aria-hidden="true"></span>
						<span class="sr-only">Toggle search</span>
					</button>

					<div id="search-input" class="search-input">
						<input type="text" placeholder="Search">
					</div>

					<button type="submit" id="btn-submitsearch" class="btn-search">
						<span class="ico ico-search-icon" aria-hidden="true"></span>
						<span class="sr-only">Submit search</span>
					</button>

				</form>
			  
				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a class="smoothScroll" href="${pageContext.request.contextPath }/index.do">首页 <span class="sr-only">(current)</span></a></li>
					<li><a class="smoothScroll" href="#services">所有商品</a></li>
					<li><a class="smoothScroll" href="#work">企业动态</a></li>
					<li><a class="smoothScroll" href="#about">About us</a></li>
					<li><a class="smoothScroll" href="#skills">关于我们</a></li>
<c:choose>
	<c:when test="${existUser==null}">
		<li><a href="${pageContext.request.contextPath}/to_login.do ">登录/注册</a></li>
	</c:when>
	<c:otherwise>
		<li class="dropdown" id="accountmenu">
             <a class="dropdown-toggle" data-toggle="dropdown" href="#">${existUser.nickname }<b class="caret"></b></a>
                <ul class="dropdown-menu">
                     <li><a href="#">我的订单</a></li>
                     <li><a href="#">购物车</a></li>
                     <li class="divider"></li>
                     <li><a href="${pageContext.request.contextPath }/exit.do">注销</a></li>
                </ul>
         </li>
	</c:otherwise>
</c:choose>
		
					
					
					
				</ul>
			
	
		    </div><!-- /.navbar-collapse -->

		  </div><!-- /.container -->

		</nav>

	</header>