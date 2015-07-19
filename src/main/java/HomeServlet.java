import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by 1 on 16.07.2015.
 */
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Writer wr = response.getWriter();
        wr.write("<head>");
        wr.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\">");
        wr.write("<title>Students List</title>");
        wr.write("</head>");
        wr.write("<body>");
        wr.write("<p><a href=\"Главная.html\">на Главную</a></p>");
        wr.write("<p><p><h1 align=\"center\">Система управления студентами и их успеваемостью</h1></p></p>");
        wr.write("<table border=\"1\" width=\"300\" bgcolor=\"#b9c9fe\">");
        wr.write("<tr>");
        wr.write("<th>Успеваемость выбранных студентов</th>");
        wr.write("</table>");
        wr.write("<br>");
        wr.write("<table border=\"1\" width=\"300\" bgcolor=\"#b9c9fe\">");
        wr.write("<tr>");
        wr.write("<th>Модификация выбранного студента</th>");
        wr.write("</table>");
        wr.write("<br>");
        wr.write("<table border=\"1\" width=\"300\" bgcolor=\"#b9c9fe\" align=700 style='position:absolute; top: 117px; left:30%;'><tbody>");
        wr.write("<tr>");
        wr.write("<th>Создать студента</th>");
        wr.write("</tbody>");
        wr.write("</table>");
        wr.write("<br>");
        wr.write("<table border=\"1\" width=\"300\" bgcolor=\"#b9c9fe\" align=700 style='position:absolute; top: 167px; left:30%;'><tbody>");
        wr.write("<tr>");
        wr.write("<th>Удалить студента</th>");
        wr.write("</tbody>");
        wr.write("</table>");
        wr.write("<br>");
        wr.write("<table border=\"1\" width=\"90%\" cols = \"5\" align=\"left\">");
        wr.write("<tr bgcolor=#b9c9fe>");
        wr.write("<th width=30px height=40px> </th>");
        wr.write("<th width=120px>Фамилия</th>");
        wr.write("<th width=100px>Имя</th>");
        wr.write("<th width=60px>Группа</th>");
        wr.write("<th width=60px>Дата поступления</th>");
        wr.write("</tr>");
        wr.write("<tr align=center>");
        wr.write("<td><input type=\"checkbox\"></td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("</tr>");
        wr.write("<tr align=center>");
        wr.write("<td><input type=\"checkbox\"></td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("</tr>");
        wr.write("<tr align=center>");
        wr.write("<td><input type=\"checkbox\"></td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("</tr>");
        wr.write("<tr align=center>");
        wr.write("<td><input type=\"checkbox\"></td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("</tr>");
        wr.write("<tr align=center>");
        wr.write("<td><input type=\"checkbox\"></td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("</tr>");
        wr.write("<tr align=center>");
        wr.write("<td><input type=\"checkbox\"></td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("</tr>");
        wr.write("<tr align=center>");
        wr.write("<td><input type=\"checkbox\"></td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("</tr>");
        wr.write("<tr align=center>");
        wr.write("<td><input type=\"checkbox\"></td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("<td> </td>");
        wr.write("</tr>");
        wr.write("</table>");
        wr.write("</body>");
        wr.write("<FORM action= \"/home\"method=\"POST\">");
        wr.write("<INPUT type=\"text\"name=\"Students_List\">");
        wr.write("<INPUT type=\"submit\"></FORM>");
        wr.write("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        Writer wr = response.getWriter();
        wr.write("<html>");
        String text = request.getParameter("Students_List");
        wr.write("Hello," + text);
        wr.write("</html>");
    }
}