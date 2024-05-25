<%-- 
    Document   : panel
    Created on : 25/05/2024, 10:50:54 a. m.
    Author     : Jeffry Guerrero
    ficha:     : 2721454
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css" media="screen">
            .titulos {
                height: 6.75em;
            }

            #h1_dategusto {
                display: inline;
                font-family: cursive;
                font-size: 5em;
                padding: 0.5em;
                text-shadow: 2px 2px 4px rgba(0, 0, 0, 1);
                color: rgb(246, 158, 22);
            }

            .barra_nav_registrate {
                background-color: rgb(83, 44, 44);
                transition: all 0.2s;
            }

            .barra_nav {
                float: right;
                font-size: 2em;
                padding: 1em;
                width: 50%;
            }

            .barra_nav a {
                padding-left: 0.2em;
                padding-right: 0.2em;
                color: goldenrod;
                text-decoration: none;
                text-shadow: 2px 2px 4px rgba(0, 0, 0, 1);
                border-radius: 45px;

            }

            a:hover {
                color: aqua;
            }

            .content {
                background: radial-gradient(circle, rgb(246, 158, 22), rgb(255, 102, 0));
                height: 40em;
                width: 100%;

            }

            .content img {
                float: right;
                width: 50%;
            }

            /*.content{
                    display: flex;
                    justify-content: center;
                    position: relative;
                }*/
            aside {
                display: inline;
                background-color: rgb(255, 196, 0);
                color: rgb(177, 166, 166);  
                width: 250px;
                /* Ajusta el ancho según tus necesidades */
                height: 100%;
                float: left;
                /* Esto hará que el aside se alinee a la izquierda */
                font-size: 30px;
                text-shadow: 1px 0px 2px rgb(0, 0, 0);
            }

            aside ul {
                list-style-type: none;
                /* Elimina los estilos predeterminados de lista */
                padding: 0;
                /* Elimina el padding predeterminado */
            }

            aside ul li {
                margin-bottom: 10px;
                /* Espacio entre las opciones de la lista */
            }

            main {
                display: inline;
                display: flex;
                justify-content: center;
                position: relative;
            }



            .form-container {
                width: 300px;
                height: fit-content;
                padding: 20px;
                background-color: rgba(255, 255, 255, 0.5);
                border-radius: 5px;
                box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
                display: flex;
                justify-content: center;
                position: absolute;
                top: 100px;
            }

            /*aqui empieza lo otro */
            form {
                display: flex;
                flex-direction: column;
            }

            label {
                margin-bottom: 5px;
            }

            input[type="text"],
            input[type="password"],
            input[type="email"] {
                margin-bottom: 20px;
                padding: 10px;
                border-radius: 5px;
                border: 1px solid #ccc;
            }

            input[type="submit"] {
                padding: 10px;
                border-radius: 5px;
                border: none;
                background-color: #007BFF;
                color: white;
                cursor: pointer;
            }
        </style>
    </head>
    <body style="background:linear-gradient(to right, rgb(192, 68, 19), rgb(233, 103, 103));">
        <%
            if(session.getAttribute("usuario") == null){
            response.sendRedirect("index.html");
            return;}
        %>        
        <header class="titulos">
            <h1 id="h1_dategusto">date gusto</h1>
            <div class="barra_nav">
                <a href="../index.html" class="barra_nav_incio">Inicio</a>
                <a href="./menu.html">menu</a>
                <a href="./nosotros.html">nosotros</a>
                <a href="#" class="barra_nav_registrate">Inciar sesion</a>
            </div>
        </header>
        <div class="content">
            <aside>
                <ul>
                    <li>modificar menu</li>
                    <li>revisar estadisticas</li>
                    <li>administrar cuenta</li>
                </ul>
            </aside>
            <main>
                <h1>anything</h1>
            </main>
        </div>
    </body>
</html>
