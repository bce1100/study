<%--
  Created by IntelliJ IDEA.
  User: bce1100
  Date: 2018/8/21
  Time: 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%="you made it"%>
<br>
<a href="/user/index">toIndex</a>
<br>
商品名称：${requestScope.goods.name}<br/>
商品价格：${requestScope.goods.price}
</body>
</html>
