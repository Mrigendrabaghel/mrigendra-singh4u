<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reset password</title>
<form action="Forget_servlet" method ="post">
<center>
Enter Username:<input type="text" name="uname3"><br></br>
Enter New Password:<input type="Password" name="newpass"><br></br>
Confirm Password  :<input type="text" name="conpass"><br></br>
<button type="submit">Submit</button>

<button type="button" name="back" onclick="history.back()">back</button>

</center>

</form>
</head>
<body>

</body>
</html>