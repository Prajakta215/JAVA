<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Create Customer</h1>
<form:form method="post" modelAttribute="customer" action="/create-customer">
    <table border="2">
        <tr>
            <td>Id: </td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Name: </td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Phone: </td>
            <td><form:input path="number"/></td>
        </tr>
        <tr>
            <td>Username: </td>
            <td><form:input path="username"/></td>
        </tr>
        <tr>
            <td>Password: </td>
            <td><form:input path="pasword"/></td>
        </tr>
        <tr>
            <td>Email: </td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Create"/></td>
        </tr>
    </table>
</form:form>
