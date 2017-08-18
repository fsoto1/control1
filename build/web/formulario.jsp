<%-- 
    Document   : formulario
    Created on : 18-08-2017, 13:55:52
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style type="text/css">

    .Estilo1 {
    color: #FFFFFF;
    font-weight: bold;
    }
    .Estilo21 {
        color: #003333; 
        font-weight: bold; 
        font-family: "Courier New", Courier, monospace; 
        font-size: 14px; 
    }

    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        /*El formulario enviara los datos a url-pattern del xml  nuevorecibir*/

        <form name="form" method="post" action="Calcular">
            <table width="460" height="250" border="1" cellpadding="0" cellspacing="0">
                <tr>
                    <td colspan="2" bgcolor="white"><span class="Estilo1">FORMULARIO</span></td>
                </tr>
                <tr>
                    <td width="164" bgcolor="#FFFF99"><span class="Estilo21">Nombre</span></td>
                    <td width="227" bgcolor="#FFFF99"><input name="nombre" type="text"></td>
                </tr>
                <tr>
                    <td bgcolor="#FFFF99"><span class="Estilo21">Rut</span></td>
                    <td bgcolor="#FFFF99"><input name="rut" type="text"></td>
                </tr>
                <tr>
                    <td bgcolor="#FFFF99"><span class="Estilo21">Cargo</span></td>
                    <td bgcolor="#FFFF99"><input name="cargo" type="text"></td>
                </tr>
                <tr>
                    <td bgcolor="#FFFF99"><span class="Estilo21">Sueldo Base</span></td>
                    <td bgcolor="#FFFF99"><input name="sueldo_base" type="text"></td>
                </tr>
                <tr>
                    <td bgcolor="#FFFF99"><span class="Estilo21">Cantidad de horas extras</span></td>
                    <td bgcolor="#FFFF99"><input name="hora_extra" type="text"></td>
                </tr>
                <tr>
                    <td bgcolor="#FFFF99"><span class="Estilo21">Cantidad de días de ausencias</span></td>
                    <td bgcolor="#FFFF99"><input name="dia_ausencia" type="text"></td>
                </tr>
                <tr>
                    <td height="36" colspan="2" bgcolor="#FFFF99"><input type="submit" name="enviar" value="enviar"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
