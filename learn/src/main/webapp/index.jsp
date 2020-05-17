<%@ page import="servlet.LoginServlet" %>
<html>
<head>
    <title>Hello World!</title>
</head>
<body>
<h2>Example servlet.LoginServlet</h2>
<%
    LoginServlet serve = new LoginServlet();
    serve.processRequest(request, response);
%>
</body>
</html>
