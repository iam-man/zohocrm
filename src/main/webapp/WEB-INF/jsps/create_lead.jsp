<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead</title>
</head>
<body>
	<h2>Create Leads</h2>
	<form  action="saveLead" method="post">
		<pre>
<label for="fname">First Name</label><br />
<input type="text" name="firstName" id="fname" />
<label for="lname">Last Name</label><br />
<input type="text" name="lastName" id="lname" />
<label for="emal">Email</label><br />
<input type="text" name="email" id="emal" />
<label for="mob">Mobile</label><br />
<input type="text" name="mobile" id="mob" />
<label for="source">Source:</label>
<select name="source" id="source">
	<option value="newspaper">News Paper</option>
	<option value="online">Online</option>
	<option value="webinar">Webinar</option>
	<option value="radio">Radio </option>
</select>
<input type="submit" value="save" />
</pre>
	</form>
</body>
</html>