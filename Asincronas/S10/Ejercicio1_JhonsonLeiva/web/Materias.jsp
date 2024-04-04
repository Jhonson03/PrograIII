<%-- 
    Document   : Materias
    Created on : 3 abr 2024, 19:41:07
    Author     : jhons
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Conexion.jsp"%>
<%
    String estudianteId = request.getParameter("id");

    PreparedStatement consultaMaterias = conexion.prepareStatement("SELECT materia.nombre FROM carga JOIN materia ON carga.materia = materia.id WHERE carga.estudiante = ?");
    consultaMaterias.setString(1, estudianteId);
    ResultSet materiasResultados = consultaMaterias.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Materias del Estudiante</title>
</head>
<body>
    <h1>Materias del Estudiante</h1>
    <ul>
        <% while(materiasResultados.next()) { %>
            <li><%= materiasResultados.getString("nombre") %></li>
        <% } %>
    </ul>
</body>
</html>


