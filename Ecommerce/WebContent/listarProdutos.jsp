<%@ page language="java" 
   contentType="text/html; charset=UTF-8"
   import="java.util.*,com.rodrigor.exemplos.ecommerce.*"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<th>
<td>Nome do produto</td><td>Preço</td>
</th>
<% List<Produto> produtos = (List)request.getAttribute("listaProdutos"); 
   for(Produto p:produtos){
	   out.println("<tr><td>"+p.getNome()+"</td><td>"+p.getPreco()+"</td></tr>");
   }
%>
</table>

</body>
</html>