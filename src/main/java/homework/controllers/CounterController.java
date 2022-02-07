package homework.controllers;

import homework.exceptions.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/counter")
public class CounterController {

    @GetMapping(value = "/get")
    public String getException() throws MyException {
        throw new MyException("Error!");
    }

    @RequestMapping(value = "/start", method = RequestMethod.GET)
    public String getSecondException() throws MyException {
        throw new MyException("Error2!");
    }
}
