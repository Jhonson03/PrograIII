<%-- 
    Document   : jornada
    Created on : 19 abr 2024, 20:41:45
    Author     : jhons
--%>

<%@ page language="java" import="java.sql.*" %>
<%@ include file="conexion.jsp" %>
<html>
<head>
    <title>Mostrar Jornada</title>
</head>
<body>
    <h1>Jornada</h1>
    <table border="1">
        <tr>
            <th>Equipo</th>
            <th>Fecha del Partido</th>
            <th>Resultado</th>
            <th>Marcador</th>
        </tr>
        <% 
            try {
                st = conexion.prepareStatement("SELECT * FROM jornada");
                rs = st.executeQuery();
                while (rs.next()) { 
                    int equipoId = rs.getInt("equipo");
                    PreparedStatement equipoSt = conexion.prepareStatement("SELECT * FROM equipo WHERE id = ?");
                    equipoSt.setInt(1, equipoId);
                    ResultSet equipoRs = equipoSt.executeQuery();
                    equipoRs.next(); 
                    String nombreEquipo = equipoRs.getString("nombre");
                    String entrenadorEquipo = equipoRs.getString("entrenador");
                    
                    int partidoId = rs.getInt("partido");
                    PreparedStatement partidoSt = conexion.prepareStatement("SELECT * FROM partido WHERE id = ?");
                    partidoSt.setInt(1, partidoId);
                    ResultSet partidoRs = partidoSt.executeQuery();
                    partidoRs.next(); 
                    String fechaPartido = partidoRs.getString("fecha");
                    String resultadoPartido = partidoRs.getString("resultado");
                    String marcadorPartido = partidoRs.getString("marcador");
                    
                %>
                    <tr>
                        <td><%= nombreEquipo %></td>
                        <td><%= fechaPartido %></td>
                        <td><%= resultadoPartido %></td>
                        <td><%= marcadorPartido %></td>
                    </tr>
                <% 
                    equipoRs.close();
                    equipoSt.close();
                    partidoRs.close();
                    partidoSt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (rs != null) rs.close();
                    if (st != null) st.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        %>
    </table>
</body>
</html>