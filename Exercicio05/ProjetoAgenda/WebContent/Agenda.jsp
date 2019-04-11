<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="model.Agenda"%>
<!DOCTYPEhtml>
<html>
<head>
<meta http-equiv="Content-Type"content="text/html; charset=UTF-8">
<title>Agenda</title>
</head>
<body>
<%Agenda agenda = (Agenda) request.getAttribute("agenda"); %>
Id: <%=agenda.getId() %><br> <!-- ${agenda.id} -->
Nome: <%=agenda.getNome() %><br> <!-- ${agenda.nome} -->
Email: <%=agenda.getEmail() %><br> <!-- ${agenda.email} -->
Telefone: <%=agenda.getTelefone() %><br> <!-- ${agenda.telefone} -->
Endereco: <%=agenda.getEndereco() %><br> <!-- ${agenda.endereco} -->
</body>
</html>