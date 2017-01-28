<%@include file="head.jsp"%>
<html>
<body>
<h2>User Display Exercise - Week 1</h2>
<form action="searchUser" method="GET">
    <input type="radio" name="options" value="All" checked/> &ensp; Search All
    <br/>
    <input type="radio" name="options" value="LastName" /> &ensp;
    Search Last Name: &ensp;
    <input type="text" name="param1" />
    <br />
    <br />
    <input type="submit" name="" value="Enter" />
</form>
<!-- <a href = "searchUser">Go to the User Search</a> -->
</body>
</html>