<%-- 
    Document   : agregar
    Created on : 19 abr 2024, 20:37:35
    Author     : jhons
--%>

<%@ page language="java" import="java.sql.*" %>
<%@ include file="conexion.jsp" %>

<%
    if (request.getParameter("nombre") != null && request.getParameter("entrenador") != null &&
        request.getParameter("fecha") != null && request.getParameter("resultado") != null &&
        request.getParameter("marcador") != null) {

        String nombre = request.getParameter("nombre");
        String entrenador = request.getParameter("entrenador");
        String fecha = request.getParameter("fecha");
        String resultado = request.getParameter("resultado");
        String marcador = request.getParameter("marcador");

        try {
            // Agregar equipo
            PreparedStatement equipoStatement = conexion.prepareStatement("INSERT INTO equipo (nombre, entrenador) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
            equipoStatement.setString(1, nombre);
            equipoStatement.setString(2, entrenador);
            equipoStatement.executeUpdate();
            ResultSet equipoKeys = equipoStatement.getGeneratedKeys();
            int equipoId = -1;
            if (equipoKeys.next()) {
                equipoId = equipoKeys.getInt(1);
            }

            // Agregar partido
            PreparedStatement partidoStatement = conexion.prepareStatement("INSERT INTO partido (fecha, resultado, marcador) VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            partidoStatement.setString(1, fecha);
            partidoStatement.setString(2, resultado);
            partidoStatement.setString(3, marcador);
            partidoStatement.executeUpdate();
            ResultSet partidoKeys = partidoStatement.getGeneratedKeys();
            int partidoId = -1;
            if (partidoKeys.next()) {
                partidoId = partidoKeys.getInt(1);
            }

            // Agregar jornada
            if (equipoId != -1 && partidoId != -1) {
                PreparedStatement jornadaStatement = conexion.prepareStatement("INSERT INTO jornada (equipo, partido) VALUES (?, ?)");
                jornadaStatement.setInt(1, equipoId);
                jornadaStatement.setInt(2, partidoId);
                jornadaStatement.executeUpdate();
            }

            response.sendRedirect("index.jsp"); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
%>

<html>
<head>
    <title>Agregar Equipo, Partido y Jornada</title>
</head>
<body>
    <h1>Agregar Equipo, Partido y Jornada</h1>
    <form action="agregar.jsp" method="post">
        <h2>Agregar Equipo</h2>
        Nombre: <input type="text" name="nombre"><br>
        Entrenador: <input type="text" name="entrenador"><br>

        <h2>Agregar Partido</h2>
        Fecha: <input type="text" name="fecha"><br>
        Resultado: <input type="text" name="resultado"><br>
        Marcador: <input type="text" name="marcador"><br>

        <input type="submit" value="Agregar">
    </form>
</body>
</html>

