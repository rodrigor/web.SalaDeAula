<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<h1>Entre com seu login e senha:</h1>
<%=(request.getParameter("msg")==null?"":request.getParameter("msg")) %>
<form action="login" method="POST">
<table border="0">
<tr>
<td>Login:</td><td><input type="text" name="login"/></td>
<td>Senha:</td><td><input type="password" name="senha"/></td>
</tr>
<tr>
<td><input type="submit" value="Enviar"/></td>
</tr>
</table>
</form>
</body>
</html>