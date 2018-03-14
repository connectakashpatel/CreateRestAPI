<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Read Me</title>

<style>
td {
    text-align: center;
}
</style>
</head>
<body align="center">

<h1>Read ME:</h1>


<table border="1" align="center">

	<tr>
		<th>Mapping</th><th>Values</th><th>URI</th>
	</tr>
	<tr>
		<td>Servlet</td><td>/*</td><td>N/A</td>
	</tr>
	<tr>
		<td>Controller</td><td>/person</td><td>N/A</td>
	</tr>
	<tr>
		<td>Get one user from Model</td><td>/get</td><td>/person/get</td>
	</tr>
	<tr>
		<td>Get all user name from database</td><td>/all</td><td>/person/all</td>
	</tr>
	<tr>
		<td>Get all user from database inform of JSON</td><td>/alljson</td><td>/person/alljson</td>
	</tr>
	<tr>
		<td>PathParam</td><td>/pathparam</td><td>/person/pathparam/akash</td>
	</tr>
	<tr>
		<td>QueryParam</td><td>/queryparam</td><td>/person/queryparam?search_name=akash</td>
	</tr>
	<tr>
		<td>MatrixParam</td><td>/martixparam</td><td>/person/martixparam;name=akash</td>
	</tr>

</table>

</body>
</html>