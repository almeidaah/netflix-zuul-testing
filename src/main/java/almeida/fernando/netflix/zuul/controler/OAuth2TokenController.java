package almeida.fernando.netflix.zuul.controler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test/")
public class OAuth2TokenController {

    @RequestMapping(method = RequestMethod.GET, value = "/check_token/{id}")
    public boolean findById(@PathVariable long id, HttpServletRequest req, HttpServletResponse res) {
        if (req.getHeader("Test") != null) {
            res.addHeader("Test", req.getHeader("Test"));
        }
        
        //check token aqui.
        
        return true;
    }
    
}
