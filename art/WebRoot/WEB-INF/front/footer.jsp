<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<section id="contact">

			<!-- Section title -->
			<h1 class="sr-only">Contact</h1>

			<div class="container">
				
				<div class="row">

					<div class="col-md-6 col-md-offset-3">

						<h2 class="sr-only">Subscribe to our newsletter</h2>
							
						<form class="subscribe-form">

							<div class="row">

								<div class="col-sm-8">

									<label class="sr-only" for="Email">Email</label>
									<input type="email" id="Email" placeholder="Email Address">

								</div>

								<div class="col-sm-4">

									<button type="submit" class="btn btn-default red-white">Subscribe</button>

								</div>

							</div> <!-- /.row -->

						</form> <!-- /.subscribe-form -->
						
					</div>
					
				</div> <!-- /.row -->

				<div class="row contact-holder">
					
					<div class="col-md-4 col-sm-6">

						<div class="contact-info">

							<a href="tel:998-776-54321098">
							
								<img class="icon" src="${pageContext.request.contextPath}/img/contact/phone.png" alt="Phone Icon">

								<span class="data">998 776 54321098</span>

							</a>

						</div> <!-- /.contact-info -->

					</div>

					<div class="col-md-4 col-sm-6">

						<div class="contact-info">

							<a href="mailto:gonex@mail.com">
							
								<img class="icon" src="${pageContext.request.contextPath}/img/contact/mail.png" alt="Mail Icon">

								<span class="data">gonex@mail.com</span>

							</a>

						</div> <!-- /.contact-info -->

					</div>

					<div class="col-md-4 col-sm-6">

						<div class="contact-info">

							<button id="toggle-map" data-toggle="modal" data-target="#map-modal">
							
								<img class="icon" src="${pageContext.request.contextPath}/img/contact/map.png" alt="Map Icon">

								<span class="data">787 Gonex Avenue, New York</span>

							</button>

						</div> <!-- /.contact-info -->

					</div>

				</div> <!-- /.row -->

				<div class="row social-holder">
					
					<div class="col-md-4 col-md-offset-4">
						
						<div class="social-info">
							
							<a href="#" class="-facebook"><span class="ico ico-facebook" aria-hidden="true"></span></a>

							<a href="#" class="-twitter"><span class="ico ico-twitter" aria-hidden="true"></span></a>

							<a href="#" class="-dribbble"><span class="ico ico-dribbble" aria-hidden="true"></span></a>

							<a href="#" class="-googleplus"><span class="ico ico-google-plus" aria-hidden="true"></span></a>

							<a href="#" class="-youtube"><span class="ico ico-youtube" aria-hidden="true"></span></a>

						</div>

					</div>

				</div> <!-- /.row -->


			</div> <!-- /.container -->
			
		</section>


	<footer id="footer">

		<!-- Section title -->
		<h1 class="sr-only">Footer</h1>

		<p class="copyright text-green"> © <span id="year">2016</span> - Gonex All Rights Reserved. More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>

	</footer>

	<div id="map-modal" class="modal fade" tabindex="-1" role="dialog">

		<div class="modal-dialog modal-lg" role="document">

			<div class="modal-content">

				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
					<h1 class="modal-title h4">787 Gonex Avenue, New York</h1>
				</div>

				<div class="modal-body">
					<!-- GOOGLE MAP -->
					<div id="google-map" class="google-map"></div>
				</div>

			</div><!-- /.modal-content -->

		</div><!-- /.modal-dialog -->

	</div><!-- /.modal -->