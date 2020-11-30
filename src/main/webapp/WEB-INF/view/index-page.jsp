<%--
  Created by IntelliJ IDEA.
  User: k0k03lc
  Date: 30/11/20
  Time: 11:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Love Calculator</title>
</head>
<body>
<h1 align="center">Love Calculator</h1>
<hr>
<form:form action ="lc/calculate" method="get" modelAttribute="request">
    <div align="center">
        <p>
            <label> Your Name : </label>
            <form:input type="text" id ="yourName-id" path="yourName"/>
        </p>
        <p>
            <label> Crush Name : </label>
            <form:input type="text" id ="crushName-id" path ="crushName"/>
        </p>
        <input type="submit" value ="calculate"/>
    </div>
</form:form>
</body>
</html>
