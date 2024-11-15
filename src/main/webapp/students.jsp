
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Welcome, <%= request.getSession().getAttribute("username") %>!</h1>

<%--    <table>--%>
<%--        <thead>--%>
<%--        <tr>--%>
<%--            <th>Department</th>--%>
<%--            <th>Student ID</th>--%>
<%--            <th>Marks</th>--%>
<%--            <th>Department</th>--%>

<%--        </tr>--%>
<%--        </thead>--%>
<%--    </table>--%>
</body>
</html>
