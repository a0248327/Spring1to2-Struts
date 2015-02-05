<%@page contentType="text/html;charset=GBK"%>
<html> 
<head><title>第一个Struts实例</title></head> 
<%
String str = (String)request.getAttribute("helloWorld");
%>
<body> 
    <H1><%=str%></H1> 
</body> 
</html>
