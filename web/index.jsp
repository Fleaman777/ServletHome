<%--
  Created by IntelliJ IDEA.
  User: bingo-bongo
  Date: 09.10.2018
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Home Work</title>
  </head>

  <style>
    body{
      background-color: azure;
      text-align: center;
      font-family: "Lucida Sans Unicode"
    }
    .auth-forms{
      width: 30%;
      margin: auto;
      background-color: background;
      text-align: center;
      margin-top: 200px;
    }
    .auth-forms input, button{
      margin: 10px;
      height: 30px;
      padding: 3px;
      border: none;
      border-radius: 2px;
    }
    #auth-info{
      margin: 5px;
      height: 50px;
      text-align: center;
      padding: 5px;
    }
  </style>
  <body>
  <button id="get" onclick="functionGet()">GET</button>
  <button id="put" onclick="functionPut()">PUT</button>
  <button id="Post" onclick="functionPost()">POST</button>
  <button id="Delete" onclick="functionDelete()">DELETE</button>

<h2>
  <br/>
  <div id="conclusion">
  </div>
  <br/>
</h2>


  <script src="function.js"> </script>

  </body>
</html>
