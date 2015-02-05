<%@ taglib uri="/tags/struts-html" prefix="html" %> 
<%@ taglib uri="/tags/struts-bean" prefix="bean" %> 

<%@page contentType="text/html;charset=GBK"%>
<html:html locale="true"> 
<head> 
<title><bean:message key="title"/></title> 
<html:base/> 
</head> 
<html:messages id="msg"> 
    <bean:write name="msg"/> 
</html:messages>
<body> 
    <form name="HelloWorld" action="/myStruts/helloWorld.do" method="post"> 
        <bean:message key="welcome"/><input type="text" name="msg" value=""/><br> 
        <input type="submit" name="method" value="<bean:message key="submit"/>"/> 
    </form> 
</body> 
</html:html>
