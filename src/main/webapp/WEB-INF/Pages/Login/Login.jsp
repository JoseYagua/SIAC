<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <title>Autenticación SIAC</title>
        <jsp:include page="Encabezado_Login.jsp"></jsp:include>
        </head>
        <body>
        <div id="loginbox">   
            <form:form class="form-vertical" commandName="Seguridad" method="post">
                <div class="control-group normal_text"> <h3><img src="${pageContext.request.contextPath}/public/Administrador/img/logo.png" alt="Logo" /></h3></div>
                <div class="control-group">
                    <form:errors path="*" element="div" cssClass="alert alert-danger"/> 
                </div>
                <div class="control-group">
                    <div class="controls">
                        <div class="main_input_box">
                            <span class="add-on bg_lg"><i class="icon-user"> </i></span><form:input  path="user" type="text" placeholder="Ingrese su Usuario." requered=""/>
                        </div>
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <div class="main_input_box">
                            <span class="add-on bg_ly"><i class="icon-lock"></i></span><form:input type="password" path="contra" placeholder="Ingrese su Contraseña." requered=""/>
                        </div>
                    </div>
                </div>
                <div class="form-actions">
                    <span class="pull-right"><a type="submit" href="Bienvenida.htm" class="btn btn-success espacio-derecha" />Inicio</a></span>
                    <span class="pull-right"><input type="submit" value="Ingresar" class="btn btn-success espacio-derecha" /></span>
                </div>
            </form:form>
        </div>
        <script src="${pageContext.request.contextPath}/public/Administrador/js/jquery.min.js"></script>  
        <script src="${pageContext.request.contextPath}/public/Administrador/js/matrix.login.js"></script> 
    </body>

</html>
