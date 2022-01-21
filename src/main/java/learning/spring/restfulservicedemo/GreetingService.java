package learning.spring.restfulservicedemo;

import org.springframework.stereotype.Service;


public class GreetingService {

    private final String name;
    private final Integer id;

    public GreetingService(Integer id,String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }
}
