<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <title> 商家管理页面</title>
  </head>
  
  <body>
  <%@include file ="header.jsp" %>
  <h3>请选择要上传的商城图片</h3>
  <form action="uploadGoodsImage.do" method ="post" enctype="multipart/form-data">
	选择图片1：<input type="file" name="file"/><br>
	选择图片2：<input type="file" name="file"/><br>
	选择图片3：<input type="file" name="file"/><br>
	选择图片4：<input type="file" name="file"/><br>
	选择图片5：<input type="file" name="file"/><br>
	选择图片6：<input type="file" name="file"/><br>
	选择图片7：<input type="file" name="file"/><br>
	描述：<input type="text" name="goods_description" />
	<input type="submit" value="提交">
</form>
  
  
  
    
  </body>
</html>
