<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="for" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>

<html>
<body>

<H2>Dear Employee please enter your details</H2>
<br>
<br>

 <form:form action="showDetails" modelAttribute="employeeAtribute">

  Enter name   <form:input path="name"/>
     <br> <br>
  Enter surname    <form:input path="surname"/>
     <br> <br>
  Enter salary   <form:input path="salary"/>
     <br> <br>
     Enter department <form:select path="department" >
<%--     Если используем МАР для хранеиния списка департаментов--%>
     <form:options items="${employeeAtribute.mapDepartments}"/>

<%--     Если жестко закрепляем значения:--%>
<%--     <form:option value="IT" label="Info tchnologi"/>--%>
<%--     <form:option value="HH" label="Head hunter"/>--%>
<%--     <form:option value="Sales" label="Sales technologi"/>--%>

 </form:select>
     <input type="submit" value="Ok">



 </form:form>


</body>
</html>