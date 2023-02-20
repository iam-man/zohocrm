<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>billing</title>
</head>
<body>
	<h2>Bill</h2>
	<form  action="saveBill" method="post">
		<pre>
<label for="fname">First Name</label><br />
<input type="text" name="firstName" id="fname" value="${contact.firstName}"/>
<label for="lname">Last Name</label><br />
<input type="text" name="lastName" id="lname" value="${ contact.lastName}"/>
<label for="emal">Email</label><br />
<input type="text" name="email" id="emal" value="${contact.email}"/>
<label for="mob">Mobile</label><br />
<input type="text" name="mobile" id="mob" value="${contact.mobile }"/>
Product Name<input type="text" name="product" />
Quantity <input type="text" name="quantity" />
Amount <input type="text" name="amount" />
<input type="submit" value="save" />
</pre>
	</form>
</body>
</html>