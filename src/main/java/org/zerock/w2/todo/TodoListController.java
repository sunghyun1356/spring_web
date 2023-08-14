package org.zerock.w2.todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.net.HttpRetryException;
import org.zerock.w2.todo.dto.TodoDTO;
import org.zerock.w2.todo.service.TodoService;
@WebServlet(name = "todoListController", urlPatterns = "/todo/List")
public class TodoListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
    {
        System.out.println("/todo/List");
        List<TodoDTO> dtoList = TodoService.INSTANCE.getList();
        req.setAttribute("List", dtoList);
        req.getRequestDispatcher("/WEB-INF/todo/List.jsp").forward(req,resp);
    }
}
