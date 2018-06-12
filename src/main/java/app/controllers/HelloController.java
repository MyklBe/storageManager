package app.controllers;



import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping(value = "/world")
    @ResponseBody
    public String sayHello(){
        return JSONParser.quote("Hello World");
    }


}
