<%-- 
    Document   : Conexion
    Created on : 3 abr 2024, 19:01:34
    Author     : jhons
--%>

<%@ page language="java" import="java.sql.*" %>
<%
    Connection conexion = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    Class.forName("org.mariadb.jdbc.Driver");
    conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3307/progra3", "root", "liebe1890");
%>
