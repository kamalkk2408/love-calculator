<%--
  Created by IntelliJ IDEA.
  User: k0k03lc
  Date: 30/11/20
  Time: 11:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h1 align="center">Love Calculator</h1>
<hr>
<form action ="lc/calculate" method="get">
    <div align="center">
        <p>
            <label> Your Name : </label>${request.yourName}
        </p>
        <p>
            <label> Crush Name : </label> ${request.crushName}
        </p>
    </div>
</form>
</body>
</html>
