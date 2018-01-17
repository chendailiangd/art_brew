<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>所有商品</title>
		<link href="${pageContext.request.contextPath}/introduction/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/introduction/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css" />

		<link href="${pageContext.request.contextPath}/introduction/basic/css/demo.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/introduction/css/hmstyle.css" rel="stylesheet" type="text/css" />
	
		<script src="${pageContext.request.contextPath}/introduction/AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath}/introduction/AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>
	</head>
	<body>
	
		


					<!--甜点1-->
					<div id="f3">
					<div class="am-container ">
						<div class="shopTitle ">
							<h4>甜品</h4>
							<h3>每一道甜品都有一个故事</h3>
							<div class="today-brands ">
								<a href="# ">桂花糕</a>
								<a href="# ">奶皮酥</a>
								<a href="# ">栗子糕 </a>
								<a href="# ">马卡龙</a>
								<a href="# ">铜锣烧</a>
								<a href="# ">豌豆黄</a>
							</div>
							<span class="more ">
                                 <a href="# ">更多美味<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                            </span>
						</div>
					</div>
					
					<div class="am-g am-g-fixed floodFive ">
												
						<div class="am-u-sm-5 am-u-md-3 text-one list">
							<div class="word">
								<a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>	
								<a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>									
							</div>						
							<a href="# ">
							
								<img src="${pageContext.request.contextPath}/introduction/images/act1.png " />
								<div class="outer-con ">
									<div class="title ">
										零食大礼包开抢啦
									</div>
									<div class="sub-title ">
										当小鱼儿恋上软豆腐
									</div>
								</div>
								
								
							</a>
							<div class="triangle-topright"></div>	
						</div>
						
<c:forEach items="${pageBean.list}" var = "p">				
						
						<div class="am-u-sm-7 am-u-md-5 am-u-lg-2 text-two">
								<div class="outer-con ">
									<div class="title ">
										${p.goods_name }
									</div>
									<div class="sub-title ">
										¥13.8
									</div>
<i class="am-icon-shopping-basket am-icon-md  seprate"></i>									
								</div>
								<a href="# "><img src="${pageContext.request.contextPath}/introduction/images/1.jpg " /></a>						
						</div>
</c:forEach>								
					</div>
					<div class="am-container ">
						<div class="shopTitle ">
							<h4>甜品</h4>
							<h3>每一道甜品都有一个故事</h3>
							<div class="today-brands ">
		
	<c:if test="${pageBean.currentPage!=1 }">				
								<a href="${pageContext.request.contextPath }/findAllBrew.do?currentPage=1 ">首页</a>
								<a href="${pageContext.request.contextPath }/findAllBrew.do?currentPage=${pageBean.currentPage-1 } ">上一页 </a>
	</c:if>						
	
	
	<c:if test="pageBean.currentPage!=pageBean.totalPage">	
								<a href="${pageContext.request.contextPath }/findAllBrew.do?currentPage=${pageBean.currentPage+1  }">下一页</a>
								<a href="${pageContext.request.contextPath }/findAllBrew.do?currentPage=${pageBean.totalPage } ">末页</a>
	</c:if>	
		
	当前页：${pageBean.currentPage },总页码：${pageBean.totalPage }	
		
							</div>
							<span class="more ">
                                 <a href="# ">更多美味<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                            </span>
						</div>
					</div>
					
	
	
	
	
	
	
	
	
					<div class="am-g am-g-fixed floodFive ">
												
						<div class="am-u-sm-5 am-u-md-3 text-one list">
							<div class="word">
								<a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>	
								<a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
								<a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>									
							</div>						
							<a href="# ">
							
								<img src="${pageContext.request.contextPath}/introduction/images/act1.png " />
								<div class="outer-con ">
									<div class="title ">
										零食大礼包开抢啦
									</div>
									<div class="sub-title ">
										当小鱼儿恋上软豆腐
									</div>
								</div>
								
								
							</a>
							<div class="triangle-topright"></div>	
						</div>
						
<c:forEach items="${pageBean.list}" var = "p">				
						
						<div class="am-u-sm-7 am-u-md-5 am-u-lg-2 text-two">
								<div class="outer-con ">
									<div class="title ">
										${p.goods_name }
									</div>
									<div class="sub-title ">
										¥13.8
									</div>
<i class="am-icon-shopping-basket am-icon-md  seprate"></i>									
								</div>
								<a href="# "><img src="${pageContext.request.contextPath}/introduction/images/1.jpg " /></a>						
						</div>
</c:forEach>								
					</div>




























					<div class="footer ">
						<div class="footer-hd ">
							<p>
								<a href="# ">恒望科技</a>
								<b>|</b>
								<a href="# ">商城首页</a>
								<b>|</b>
								<a href="# ">支付宝</a>
								<b>|</b>
								<a href="# ">物流</a>
							</p>
						</div>
						<div class="footer-bd ">
							<p>
								<a href="# ">关于恒望</a>
								<a href="# ">合作伙伴</a>
								<a href="# ">联系我们</a>
								<a href="# ">网站地图</a>
								<em>© 2015-2025 Hengwang.com 版权所有. 更多模板 <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></em>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		</div>

	</body>

</html>