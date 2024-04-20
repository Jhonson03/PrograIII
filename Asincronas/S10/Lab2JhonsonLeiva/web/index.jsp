<%-- 
    Document   : index
    Created on : 19 abr 2024, 19:35:13
    Author     : jhons
--%>

<%@ page language="java" import="java.sql.*" %>
<%@ include file="conexion.jsp" %>
<%
    try {
        String consultaEquipos = "SELECT * FROM equipo";
        st = conexion.prepareStatement(consultaEquipos);
        rs = st.executeQuery();
    } catch (SQLException e) {
        e.printStackTrace();
    }
%>
<html>
<head>
    <title>Equipos</title>
</head>
<body>
    <h1>Equipos</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Entrenador</th>
        </tr>
        <% while (rs != null && rs.next()) { %>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("nombre") %></td>
            <td><%= rs.getString("entrenador") %></td>
        </tr>
        <% }
        if (rs != null) {
            rs.close();
        }
        if (st != null) {
            st.close();
        }
        %>
    </table>
    <td>
        <a href="agregar.jsp">Agregar</a>
        <a href="jornada.jsp">jornada</a>
    </td>
</body>
</html>

