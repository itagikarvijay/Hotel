<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
 <body>
        <h1 id="banner">Login to Security Demo</h1>  
        <form name="f" action="/login"
                    method="POST">
            <table>
                <tr>
                    <td>Username:</td>
                    <td><input type='text' name='username' /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type='password' name='password'></td>
                </tr>
                <tr>
                    <td colspan="2">&nbsp;</td>
                </tr>
                <tr>
                    <td colspan='2'><input name="submit" type="submit">&nbsp;<input name="reset" type="reset"></td>
                </tr>
            </table>
        </form>
    </body>
</html>