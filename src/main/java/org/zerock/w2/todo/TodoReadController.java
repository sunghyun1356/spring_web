package org.zerock.w2.todo;

import org.zerock.w2.todo.dto.TodoDTO;
import org.zerock.w2.todo.service.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name="todoReadController", urlPatterns = "/todo/read")
public class TodoReadController extends HttpServlet {
    @Override
    protected  void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
    {
        System.out.println("/todo/read");
        // /todo/read?tno=123
        // Long형 tno는 파라미터 tno의 값이고
        // TodoDTO형 dto는 tno에 해당하는 instance를 가져온다
        Long tno = Long.parseLong(req.getParameter("tno"));
        TodoDTO dto = TodoService.INSTANCE.get(tno);
        req.setAttribute("dto", dto);
        req.getRequestDispatcher("/WEB-INF/todo/Read.jsp").forward(req,resp);
    }
}
