<html>
<h1> Welcome to display JSP page</h1>
<%

out.print("Hello Friends");
int x=10;
out.print("X value is:"+x);
Employee employee=session.getAttribute("emp");
out.print(employee);
%>

</html>