<%@ page import="helllo.servlet.domain.member.Member" %>
<%@ page import="helllo.servlet.domain.member.MemberRepository" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    MemberRepository memberRepository = MemberRepository.getInstance();

    System.out.println("MemberSaveServlet.service");

    //request, response 그대로 사용가능
    String username = request.getParameter("username");
    int age = Integer.parseInt(request.getParameter("age"));

    Member member = new Member(username, age);
    memberRepository.save(member);
%>

<%--html부분은 그대로 http response에 담긴다--%>

<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
    <li>id=<%=member.getId()%></li>
    <li>id=<%=member.getUsername()%></li>
    <li>id=<%=member.getAge()%></li>
</ul>
<a href = "/index.html">메인</a>

</body>
</html>
