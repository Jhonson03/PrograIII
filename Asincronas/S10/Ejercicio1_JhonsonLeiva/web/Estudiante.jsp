<%-- 
    Document   : Estudiante
    Created on : 3 abr 2024, 19:08:01
    Author     : jhons
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="Conexion.jsp"%>
<%
    st=conexion.prepareStatement("INSERT INTO estudiante (nombre, apellido) "
            + "VALUES ('"+request.getParameter("nombre")+"','"+request.getParameter("apellido")+"')");
    st.executeUpdate();
    conexion.close();
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos ingresados exitosamente</h1>
        <a href='index.jsp'>Inicio</a>
    </body>
</html>

