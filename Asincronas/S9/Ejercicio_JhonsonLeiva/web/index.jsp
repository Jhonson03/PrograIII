<%-- 
    Document   : index
    Created on : 20 mar 2024, 18:25:03
    Author     : jhons
--%>

<%@ page import="java.util.*" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page language="java" %>
<%
    String nombre = "Jhonson Humberto";
    String apellido = "Leiva Salinas";
    String correo = "ls0303032022@unab.edu.sv";
    int edad = 20;

    List<String> alumno = new ArrayList<>();
    alumno.add(nombre);
    alumno.add(apellido);
    alumno.add(correo);
    alumno.add(String.valueOf(edad));

    session.setAttribute("alumno", alumno);
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Principal</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <style>
        .navbar-brand {
            font-size: 1.5rem;
            font-weight: bold;
        }

        .navbar-nav .nav-item {
            margin-right: 10px;
        }

        .navbar-nav .nav-link {
            font-size: 1.1rem;
        }
    </style>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container">
            <a class="navbar-brand" href="#">Principal</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="CargaAcademica.jsp">Carga Académica</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>

