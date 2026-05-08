<%
String name = request.getParameter("name");
String roll = request.getParameter("roll");
String faculty = request.getParameter("faculty");
%>

<html>
<body>

<h2>Student Details</h2>

Name: <%= name %> <br><br>
Roll No: <%= roll %> <br><br>
Faculty: <%= faculty %> <br><br>

</body>
</html>