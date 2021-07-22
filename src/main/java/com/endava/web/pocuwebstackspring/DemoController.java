package com.endava.web.pocuwebstackspring;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

    @GetMapping("/")
    public HttpEntity<String> index() {
         return new ResponseEntity<String>("<html><body><h1>Hello Spring</h1></body></html>", HttpStatus.I_AM_A_TEAPOT);
        //return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
        //return ResponseEntity.ok("<html><body><h1>Hello Spring</h1></body></html>");
    }

    @GetMapping("/withView")
    public ModelAndView withWiew(ModelAndView modelAndView) {
        modelAndView.setViewName("myView");
        modelAndView.getModel().put("name", "Endava");
        return modelAndView;
    }

}
