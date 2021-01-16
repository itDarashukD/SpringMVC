<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>

<html>
<body>

<H2>Dear Employee please enter your details</H2>
<br>
<br>

<form:form action="showDetails" modelAttribute="employeeAtribute">

    Enter name <form:input path="name"/>
    <br> <br>
    Enter surname <form:input path="surname"/>
    <br> <br>
    Enter salary <form:input path="salary"/>
    <br> <br>
    Enter department <form:select path="department">
    <br>
    <br> <br>

    <%--     Если используем МАР для хранеиния списка департаментов--%>
    <form:options items="${employeeAtribute.mapDepartments}"/>

    <%--     Если жестко закрепляем значения:--%>
    <%--     <form:option value="IT" label="Info tchnologi"/>--%>
    <%--     <form:option value="HH" label="Head hunter"/>--%>
    <%--     <form:option value="Sales" label="Sales technologi"/>--%>
</form:select>
    <%--        Форма выбора пункта--%>
    <br>
    What car do you want?

    <%--    Если закрепить жесткие значения--%>
    <%--    <br>--%>
    <%--    BMW <form:radiobutton path="markAuto" value="BMV"/>--%>
    <%--    <br> <br>--%>
    <%--    WV <form:radiobutton path="markAuto" value="WV"/>--%>
    <%--    <br> <br>--%>
    <%--    MB <form:radiobutton path="markAuto" value="MB"/>--%>
    <%--     Если используем МАР для хранеиния списка авто--%>
    <form:radiobuttons path="markAuto" items="${employeeAtribute.mapOfCars}"/>

    <input type="submit" value="Ok">


</form:form>


</body>
</html>