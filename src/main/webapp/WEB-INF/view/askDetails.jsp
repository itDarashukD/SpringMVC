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
     <input type="submit" value="Ok">



 </form:form>


</body>
</html>