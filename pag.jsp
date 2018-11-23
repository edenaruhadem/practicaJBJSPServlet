<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Numero</title>
    </head>
    <body>
        <h1>Numero inicial</h1>
        ${laBean.num}<p>
        <form action="servletNum" method="post">
            <input name="Enviar" type="submit" value="Suma">
        </form>
    </body>
</html>

