package org.zerock.w2.calc;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.rmi.ServerException;

@WebServlet(name = "CalcController", urlPatterns = "/calc/makeResult")
public class CalcController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServerException, IOException{
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        System.out.printf(" num1: %s", num1);
        System.out.printf(" num2: %s", num2);
    }
}
