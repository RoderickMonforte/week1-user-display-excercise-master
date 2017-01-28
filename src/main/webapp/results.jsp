<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>


<html>
<style>
    table, th, td {
        border: 2px solid black;
    }
</style>
<body>

<%--TODO <done> Pretty up the results!--%>
<div class="container-fluid">
    <h2>Search Results: </h2>
    <table cellpadding="15" width="40%">
        <tr>
            <th>User ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Birth Date</th>
            <th>Age</th>
        </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.userid}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.birthDate}</td>
            <td>${user.age}</td>
        </tr>
    </c:forEach>
    </table>
</div>

</body>
</html>
