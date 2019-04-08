<%--
  Created by IntelliJ IDEA.
  User: LI
  Date: 2019/4/8
  Time: 12:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>hello</title>
</head>
<body>
<table>
    <c:forEach var="star" items="${starList}">
        <tr>
            <td>${star.id}</td>
            <td>${star.name}</td>
            <td>${star.age}</td>
            <td>${star.score}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
