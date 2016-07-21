<%@ include file="../layout/taglib.jsp"%>
<%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html>

<head>

</head>

<body>

<h1>
<tiles:getAsString name="title" />
</h1>

 <h3>**** Header ****</h3>
<tiles:insertAttribute name="body"></tiles:insertAttribute>
</body>
</html>