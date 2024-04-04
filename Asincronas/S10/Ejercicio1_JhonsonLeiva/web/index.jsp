<%-- 
    Document   : index
    Created on : 3 abr 2024, 18:38:07
    Author     : jhons
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="Conexion.jsp"%>
<%
    PreparedStatement consultaEstudiantes = conexion.prepareStatement("SELECT * FROM estudiante");
    ResultSet estudiantesResultados = consultaEstudiantes.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Index</title>
</head>
<body>
    <form action="Estudiante.jsp" method="POST">
        <input type="text" id="nombre" name="nombre" placeholder="Ingrese los nombres" required><br/>
        <input type="text" id="apellido" name="apellido" placeholder="Ingrese los apellidos" required> <br/>
        <input type="submit" value="Guardar">
    </form>
    <h1>Lista de Estudiantes</h1>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Acción</th>
            </tr>
        </thead>
        <tbody>
            <% while(estudiantesResultados.next()) { %>
                <tr>
                    <td><%= estudiantesResultados.getInt("id") %></td>
                    <td><%= estudiantesResultados.getString("nombre") %></td>
                    <td><%= estudiantesResultados.getString("apellido") %></td>
                    <td><a href="Materias.jsp?id=<%= estudiantesResultados.getString("id") %>">Mostrar Materias</a></td>
                </tr>
            <% } %>
        </tbody>
    </table>
    <br/>
</body>
</html>
