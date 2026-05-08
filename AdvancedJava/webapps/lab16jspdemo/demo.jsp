<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<body>

<h2>JSP Tag Example by Samchita Pandey</h2>

<%-- Declaration Tag --%>
<%! 
    int a = 10;
    int b = 20;

    int add() {
        return a + b;
    }
%>

<hr>

<%-- Scriptlet Tag --%>
<%
    int sum = add();
    out.println("This is Scriptlet Tag Output: " + sum);
%>

<hr>

<%-- Expression Tag --%>
Expression Result: <%= add() %>

</body>
</html>