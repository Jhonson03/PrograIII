<%-- 
    Document   : conexion
    Created on : 19 abr 2024, 19:36:35
    Author     : jhons
--%>

<%@ page language="java" import="java.sql.*" %>
<%
    Connection conexion = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    Class.forName("org.mariadb.jdbc.Driver");
    conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3307/ligamayor", "root", "liebe1890");
%>

