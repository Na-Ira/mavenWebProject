<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 16.07.2015
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<!doctype html>
<%@ page contentType="text/html; charset=utf-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <title>Students List</title>
</head>
<body>
<p><a href="Главная.html">на Главную</a></p>
<p><p><h1 align="center">Система управления студентами и их успеваемостью</h1></p></p>
<table border="1" width="300" bgcolor="#b9c9fe">
    <tr>
        <th>Успеваемость выбранных студентов</th>
</table>
<br>
<table border="1" width="300" bgcolor="#b9c9fe">
    <tr>
        <th>Модификация выбранного студента</th>
</table>
<br>
<table border="1" width="300" bgcolor="#b9c9fe" align=700 style='position:absolute; top: 117px; left:30%;'><tbody>
<tr>
    <th>Создать студента</th>
</tbody>
</table>
<br>
<table border="1" width="300" bgcolor="#b9c9fe" align=700 style='position:absolute; top: 167px; left:30%;'><tbody>
<tr>
    <th>Удалить студента</th>
</tbody>
</table>
<br>
<table border="1" width="90%" cols = "5" align="left">
    <tr bgcolor=#b9c9fe>
        <th width=30px height=40px>&nbsp</th>
        <th width=120px>Фамилия</th>
        <th width=100px>Имя</th>
        <th width=60px>Группа</th>
        <th width=60px>Дата поступления</th>
    </tr>
    <tr align=center>
        <td><input type="checkbox"></td>
        <td>&nbsp</td>
        <td>&nbsp</td>
        <td>&nbsp</td>
        <td>&nbsp</td>
    </tr>
    <tr align=center>
        <td><input type="checkbox"></td>
        <td>&nbsp</td>
        <td>&nbsp</td>
        <td>&nbsp</td>
        <td>&nbsp</td>
    </tr>
    <tr align=center>
        <td><input type="checkbox"></td>
        <td>&nbsp</td>
        <td>&nbsp</td>
        <td>&nbsp</td>
        <td>&nbsp</td>
    </tr>
    <tr align=center>
        <td><input type="checkbox"></td>
        <td>&nbsp</td>
        <td>&nbsp</td>
        <td>&nbsp</td>
        <td>&nbsp</td>
    </tr>
    <tr align=center>
        <td><input type="checkbox"></td>
        <td>&nbsp</td>
        <td>&nbsp</td>
        <td>&nbsp</td>
        <td>&nbsp</td>
    </tr>
    <tr align=center>
        <td><input type="checkbox"></td>
        <td>&nbsp</td>
        <td>&nbsp</td>
        <td>&nbsp</td>
        <td>&nbsp</td>
    </tr>
    <tr align=center>
        <td><input type="checkbox"></td>
        <td>&nbsp</td>
        <td>&nbsp</td>
        <td>&nbsp</td>
        <td>&nbsp</td>
    </tr>
    <tr align=center>
        <td><input type="checkbox"></td>
        <td>&nbsp</td>
        <td>&nbsp</td>
        <td>&nbsp</td>
        <td>&nbsp</td>
    </tr>
</table>
<FORM action="/home" method="POST">
    <INPUT type=\"text\" name=\"Students_List\">
    <INPUT type="submit"></FORM>
</body>
</html>


