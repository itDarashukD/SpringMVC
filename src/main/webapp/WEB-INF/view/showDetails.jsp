<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<h2>Your was interred this data: </h2>


yourName ${employeeAtribute.name}
<br>
yourSurname ${employeeAtribute.surname}
<br>
yourSalary ${employeeAtribute.salary}
<br>
yourDepartment ${employeeAtribute.department}
<br>
your Auto ${employeeAtribute.markAuto}
<br>
your Langvich
<ui>
    <%--перебор значений в массиве и присваивание его "lang",показ  ${lang}--%>
    <c:forEach var="lang" items="${employeeAtribute.langviches}">
        <li>
                ${lang}
        </li>

    </c:forEach>

</ui>
<br>
Phone number ${employeeAtribute.phoneNumber}
<br>
Email ${employeeAtribute.eMail}
<br>
<body>

</body>
</html>
