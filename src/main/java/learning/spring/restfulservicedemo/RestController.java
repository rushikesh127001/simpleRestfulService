package learning.spring.restfulservicedemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicInteger;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    private String greeting="Hello,%s";
    private AtomicInteger id=new AtomicInteger();

    @RequestMapping("/greetingss")
    public GreetingService sayGreeting(@RequestParam(value = "name",defaultValue = "World") String name){
        return new GreetingService(id.incrementAndGet(),String.format(greeting,name));

    }



}
