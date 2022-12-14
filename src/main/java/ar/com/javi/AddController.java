package ar.com.javi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.AddService;

import javax.servlet.http.*;

@Controller
public class AddController {
    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){

        int i = Integer.parseInt(request.getParameter("t1"));
        int j = Integer.parseInt(request.getParameter("t2"));

        AddService ad = new AddService();
        int k = ad.add(i, j);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result", k);
        return mv;
    }
}
