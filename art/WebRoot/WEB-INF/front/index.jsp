<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

</head>
<body>
<%@include file="header.jsp" %>

	<main>
		<section id="home">

			<!-- Section title -->
			<h1 class="sr-only">Home</h1>

			<div id="carousel-hero" class="carousel slide" data-ride="carousel">

				<!-- Wrapper for slides -->
				<div class="carousel-inner" role="listbox" >
			
					<div class="item active" >
					<!--这里是调节slider亮度的css  -->
						<div class="overlay"></div>

						<div class="carousel-caption">

							<span class="h1">We are gonex</span>

							<p>Dui aliquam quisque. Nec feugiat ut neque odio quo, proin interdum, quis elit varius et duis, dui augue vehicula nam tinc.</p>

							<a href="#" class="btn btn-default green-white">Show me more</a>

						</div>

					</div> <!-- /.item -->

					<div class="item">

						<div class="overlay"></div>

						<div class="carousel-caption">

							<span class="h1">We are gonex</span>

							<p>Dui aliquam quisque. Nec feugiat ut neque odio quo, proin interdum, quis elit varius et duis, dui augue vehicula nam tinc.</p>

							<a href="#" class="btn btn-default green-white">Show me more</a>

						</div>

					</div> <!-- /.item -->

					<div class="item">

						<div class="overlay"></div>

						<div class="carousel-caption">

							<span class="h1">We are gonex</span>

							<p>Dui aliquam quisque. Nec feugiat ut neque odio quo, proin interdum, quis elit varius et duis, dui augue vehicula nam tinc.</p>

							<a href="#" class="btn btn-default green-white">Show me more</a>

						</div>

					</div> <!-- /.item -->
				
				</div> <!-- /.carousel-inner -->

				<!-- Controls -->
				<a class="left carousel-control" href="#carousel-hero" role="button" data-slide="prev">
					<span class="ico ico-arrow_left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a>
				<a class="right carousel-control" href="#carousel-hero" role="button" data-slide="next">
					<span class="ico ico-arrow_right" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>

			</div> <!-- /.carousel -->

		</section>

		<section id="services">

			<!-- Section title -->
			<h1 class="sr-only">Services</h1>

			<div class="container">
				
<!-- 最新商品	 -->				
<nav class="navbar navbar-default" role="navigation">
	<div class="container-fluid">
	<div class="navbar-header">
		<a class="navbar-brand" href="#">最新商品</a>
	</div>
	</div>
</nav>

<table width="200" border="0">

  
  <c:forEach items="${glist}" var="g"  varStatus="a">
  <tr>
    <td colspan="2"><img alt=""  src="${pageContext.request.contextPath }/img/goods_img/c01.jpg "
								style="width:250px;height:230px"/>
	</td>
	</tr>
  <tr>
    <td colspan="2" height="30">
<a href="${pageContext.request.contextPath }/goods_detail.do?gid="+${g.gid}
target="_blank""> ${g.goods_description }</a></td>
  </tr>
  <tr>
    <td width="86" height="30">danjia:999</td>
    <td width="98" height="30" class="service" >jcar</td>
    
   </tr> 
    
  
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
   </c:forEach>
  
</table>
			
	
	
	
	
	
	
			







	

<br/>
		<section id="video">

			<!-- Section title -->
			<h1 class="sr-only">Video</h1>

			<div class="container">
				
				<div class="row">

					<div class="col-md-6 col-md-offset-3">

						<div class="title-content">

							<img class="logo-img" src="${pageContext.request.contextPath}/img/svg/logo.svg" title="Gonex logo" alt="Uppercase red letter G">
							<span class="sr-only">Gonex logo</span>
							
							<h2 class="section-title">Show me the video</h2>

							<p>Just hit play and relax...</p>

						</div> <!-- /.title-content -->

					</div>
					
				</div> <!-- /.row -->

			</div> <!-- /.container -->

			<figure id="video-container">

				<video id="video-player" controls preload="none" poster="${pageContext.request.contextPath}/img/transparent.png">
					<source src="video/movie.mp4" type="video/mp4">
					<source src="video/movie.webm" type="video/webm">
					<source src="video/movie.ogv" type="video/ogg">
					<!-- Fallback -->
					<p class="video-fallback">
						<span class="text">Your browser doesn't support HTML5 video.<br>
							<a class="download" href="video/movie.mp4" download>Download</a> the video instead.
						</span>
				    </p>
				</video>

				<figcaption class="sr-only">This is the description of the video.</figcaption>

			</figure>

			<ul id="video-controls" class="video-controls">

				<li class="video-progress">
					<progress id="video-progress" value="0" min="0">
						<span id="video-progress-bar"></span>
					</progress>
				</li>

				<li class="volume-control">
					<button id="mute" type="button">
						<i class="fa fa-volume-down" aria-hidden="true"></i>
					</button>
					<div class="volume-slider">
						<input id="volume-slider" class="volume-bar" type="range" min="0" max="1" step="0.01">
					</div>
				</li>

				<li id="video-timer">
					<span id="current-time">0:00</span> / <span id="video-duration">0:00</span>
				</li>

				<ul class="controls-mid">

					<li>
						<button id="rew-back" type="button">
							<span class="ico ico-rew_left" aria-hidden="true"></span>
						</button>
					</li>

					<li>
						<button id="playpause" type="button">
							<i class="fa fa-play" aria-hidden="true"></i>
						</button>
					</li>

					<li>
						<button id="rew-forward" type="button">
							<span class="ico ico-rew_right" aria-hidden="true"></span>
						</button>
					</li>

				</ul> <!-- /.controls-mid -->

				<li class="pull-right">

					<button id="share-video" type="button" title="Share video">
						<span class="ico ico-share_icoon" aria-hidden="true"></span>
					</button>

					<div id="share-social" class="share-social">

						<a href="#" class="-facebook"><span class="ico ico-facebook" aria-hidden="true"></span></a>

						<a href="#" class="-twitter"><span class="ico ico-twitter" aria-hidden="true"></span></a>

						<a href="#" class="-google-plus"><span class="ico ico-google-plus" aria-hidden="true"></span></a>

					</div>

				</li>
				
			</ul> <!-- /#video-controls -->
			

		</section>
        <div class="copyrights">Collect from <a href="http://www.cssmoban.com/"  title="网站模板">网站模板</a></div>

		<section id="work">

			<div class="container">

				<div class="row">
					
					<div class="col-md-6 col-md-offset-3">

						<div class="title-content">
							
							<h2 class="section-title">Works</h2>

							<p>Dui aliquam quisque. Nec feugiat ut neque odio quo, proin interdum, 
							quis elit varius et duis, dui augue vehicula nam tinc.</p>

						</div> <!-- /.title-content -->

					</div>

				</div> <!-- /.row -->

			<div class="row">
					
					<div class="col-md-12">
						
						<nav id="works-navigation" class="navbar">

							<!-- Section title -->
							<h1 class="sr-only">Works navigation</h1>

							<ul class="nav navbar-nav">
								<li><button class="filter mixitup-control-active" type="button" data-mixitup-control data-filter="all">All</button></li>
								<li><button class="filter" type="button" data-mixitup-control data-filter=".photography">Photography</button></li>
								<li><button class="filter" type="button" data-mixitup-control data-filter=".graphic_design">Graphic design</button></li>
								<li><button class="filter" type="button" data-mixitup-control data-filter=".app">App</button></li>
								<li><button class="filter" type="button" data-mixitup-control data-filter=".programming">Programming</button></li>
								<li><button class="filter" type="button" data-mixitup-control data-filter=".web">Web</button></li>
							</ul>

						</nav> <!-- /#works-navigation -->

					</div>

				</div> <!-- /.row -->

			</div> <!-- /.container -->

			<div class="works-container">
				
				<div id="works-grid" class="grid">

					<div class="grid-sizer"></div>

					<div class="grid-item -width3 -height2 mix all app">
						<img src="${pageContext.request.contextPath}/img/works/works_01.jpg" alt="Picture of work number 1">
						
						<div class="overlay">
							<div class="content">
								<p class="description">Awesome image</p>
								<p class="likes">
									<a href="#"><span class="ico ico-heart_icon" aria-hidden="true"></span></a>
									<span class="count">76</span> Likes
								</p>
							</div>
						</div>

					</div>

					<div class="grid-item -width2 mix all programming">
						<img src="${pageContext.request.contextPath}/img/works/works_02.jpg" alt="Picture of work number 2">

						<div class="overlay">
							<div class="content">
								<p class="description">Awesome image</p>
								<p class="likes">
									<a href="#"><span class="ico ico-heart_icon" aria-hidden="true"></span></a>
									<span class="count">76</span> Likes
								</p>
							</div>
						</div>
						
					</div>

					<div class="grid-item -width2 mix all graphic_design">
						<img src="${pageContext.request.contextPath}/img/works/works_03.jpg" alt="Picture of work number 3">

						<div class="overlay">
							<div class="content">
								<p class="description">Awesome image</p>
								<p class="likes">
									<a href="#"><span class="ico ico-heart_icon" aria-hidden="true"></span></a>
									<span class="count">76</span> Likes
								</p>
							</div>
						</div>
						
					</div>

					<div class="grid-item -width3 mix all graphic_design">
						<img src="${pageContext.request.contextPath}/img/works/works_04.jpg" alt="Picture of work number 4">

						<div class="overlay">
							<div class="content">
								<p class="description">Awesome image</p>
								<p class="likes">
									<a href="#"><span class="ico ico-heart_icon" aria-hidden="true"></span></a>
									<span class="count">76</span> Likes
								</p>
							</div>
						</div>
						
					</div>

					<div class="grid-item -width2 mix all web">
						<img src="${pageContext.request.contextPath}/img/works/works_05.jpg" alt="Picture of work number 5">

						<div class="overlay">
							<div class="content">
								<p class="description">Awesome image</p>
								<p class="likes">
									<a href="#"><span class="ico ico-heart_icon" aria-hidden="true"></span></a>
									<span class="count">76</span> Likes
								</p>
							</div>
						</div>
						
					</div>

					<div class="grid-item -width5 mix all photography">
						<img src="${pageContext.request.contextPath}/img/works/works_06.jpg" alt="Picture of work number 6">

						<div class="overlay">
							<div class="content">
								<p class="description">Awesome image</p>
								<p class="likes">
									<a href="#"><span class="ico ico-heart_icon" aria-hidden="true"></span></a>
									<span class="count">76</span> Likes
								</p>
							</div>
						</div>
						
					</div>

				</div> <!-- /.grid -->

			</div> <!-- /.works-container -->
			
		</section>
</main>
		

		
<%@include file="footer.jsp" %>
</body>
</html>