<%--
  Created by IntelliJ IDEA.
  User: k0k03lc
  Date: 30/11/20
  Time: 11:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Love Calculator</title>
</head>
<body>
<h1 align="center">Love Calculator</h1>
<hr>
<form action ="lc/calculate" method="get">
    <div align="center">
        <p>
            <label> Your Name : </label>
            <input type="text" id ="yourName-id" name="yourName" />
        </p>
        <p>
            <label> Crush Name : </label>
            <input type="text" id ="crushName-id" name ="crushName"/>
        </p>
        <input type="submit" value ="calculate"/>
    </div>

</form>
</body>
</html>
