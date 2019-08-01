<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 8/1/2019
  Time: 10:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form action="/create" method="post">
        <div>
            Full name <input type="text" name="fullname">
        </div>
        <div>
            DOB <input type="date" name="dob">
        </div>
        <div>
            Address <input type="text" name="address">
        </div>
        <div>
            Position <input type="text" name="position">
        </div>
        <div>
            Department <input type="text" name="depar">
        </div>
        <div>
            <input type="reset" value="reset">
            <input type="submit" value="submit">

        </div>
    </form>
</div>

</body>
</html>
