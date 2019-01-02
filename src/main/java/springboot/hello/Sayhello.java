package springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sayhello {
    @RequestMapping("/hello")
    public String say()
    {
        return "hello";
    }
    @RequestMapping("/hi")
    public String sayh()
    {
        return "hi";
    }

}
