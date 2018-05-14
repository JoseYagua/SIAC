<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <title>Dashboard Banco Neverland</title>
        <jsp:include page="encabezado_admin.jsp"></jsp:include>
    </head>
    <body>
        <div id="header">
            <h1><a href="index_admin.htm">Dashboard</a></h1>
        </div>
        <jsp:include page="menu_top.jsp"></jsp:include>
        <jsp:include page="menu_izquierdo.jsp"></jsp:include>
            <div id="content">
                <div id="content-header">
                    <div id="breadcrumb"> <a href="index_admin.htm" title="Regresar Al Inicio" class="tip-bottom"><i class="icon-home"></i>Inicio</a></div>
                </div>
                <div class="container-fluid">

                </div>
            </div>
        <jsp:include page="footer_admin.jsp"></jsp:include>
        <jsp:include page="js_admin.jsp"></jsp:include>
    </body>
</html>
