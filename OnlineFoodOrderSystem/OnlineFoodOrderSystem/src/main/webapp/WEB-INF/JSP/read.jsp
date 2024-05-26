<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Read Customers</h1>
    <table border="2" width="70%" cellpadding="2">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Phone</th>
            <th>Username</th>
            <th>Password</th>
            <th>Email</th>
        </tr>
        <c:forEach var="contact" items="${customer}">
            <tr>
                <td>${customer.cus_id}</td>
                <td>${customer.cus_name}</td>
                <td>${customer.cus_email}</td>
                <td>${customer.cus_Password}</td>
                <td><a href="/update-contact/${customer.cus_id}">Update</a></td>
                <td><a href="/delete-contact/${customer.cus_id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
<br/>
<a href="/create-customer">Create Customer</a>
