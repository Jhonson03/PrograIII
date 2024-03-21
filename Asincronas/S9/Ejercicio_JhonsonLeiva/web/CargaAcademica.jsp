<%-- 
    Document   : CargaAcademica
    Created on : 20 mar 2024, 18:39:21
    Author     : jhons
--%>

<%@ page import="java.util.*" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Carga Academica</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <table class="table table-striped">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Apellido</th>
                    <th scope="col">Correo</th>
                    <th scope="col">Edad</th>
                    <th scope="col">Regresar</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<String> alumno = (List<String>) session.getAttribute("alumno");
                    if (alumno != null) {
                %>
                <tr>
                    <td>1</td>
                    <td><%= alumno.get(0) %></td>
                    <td><%= alumno.get(1) %></td>
                    <td><%= alumno.get(2) %></td>
                    <td><%= alumno.get(3) %></td>
                    <td><a href="index.jsp" class="btn btn-primary">Principal</a></td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </div>
</body>
</html>
