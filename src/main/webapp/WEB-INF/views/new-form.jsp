<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--상대경로사용, [현재 URL이 속한 계층 경로 + /save]--%>
<%--/save면 절대 경로로 이동 없으면 상대경로로 이동--%>
<form action="save" method="post">
    username: <input type="text" name="username"/>
    age: <input type="text" name="age"/>
    <button type="submit">전송</button>
</form>
</body>
</html>
