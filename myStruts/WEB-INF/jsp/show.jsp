<%@ taglib uri="/tags/struts-html" prefix="html" %> 
<%@ taglib uri="/tags/struts-bean" prefix="bean" %> 
<%@page contentType="text/html;charset=GBK"%>
<html:html locale="true"> 
<head> 
<title><bean:message key="title"/></title> 
<html:base/> 
</head> 
<body bgcolor="white"> 
<html:errors/>
<html:messages id="msg"> 
    <bean:write name="msg"/> 
</html:messages>
<%
String str = (String)request.getAttribute("helloWorld");
%>
<body> 
    <form name="HelloWorld" action="/myStruts/helloWorld.do" method="post"> 
        <bean:message key="input"/>"${helloWorld}"<br> 
    </form> 
</body> 
</html:html>
