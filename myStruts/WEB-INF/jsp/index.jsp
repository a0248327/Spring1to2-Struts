<%@page contentType="text/html;charset=GBK"%>
<html> 
<head><title>��һ��Strutsʵ��</title></head> 
<%
String str = (String)request.getAttribute("helloWorld");
%>
<body> 
    <H1><%=str%></H1> 
</body> 
</html>
