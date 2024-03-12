package luo.servlet;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest,javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView andView = new ModelAndView();
        String str="HelloServlet";
        andView.addObject("msg",str);
        andView.setViewName("hello");
        return andView;
    }
}
