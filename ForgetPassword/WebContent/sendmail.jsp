<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Send mail</title>
<form action="Sendmail_servlet" method ="get">
<center>
From Email:<input type="text" name="fromEmail"><br></br>
To Email :<input type="text" name="toEmail"><br></br>
<button type="submit">Submit</button>

<button type="button" name="back" onclick="history.back()">back</button>

</center>

</form>
</head>
<body>

</body>
</html>