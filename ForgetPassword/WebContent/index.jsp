<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>App login</title>
</head>
<body>
<center>
<form action="Login_servlet" method="post">
Enter Username:<input type="text" name="uname"><br><br>
Enter Password:<input type="text" name="upass"><br><br>
<button type="submit">Submit</button>
</form>
<a href="sendmail.jsp">Forget password...</a>
</center>

</body>
</html>