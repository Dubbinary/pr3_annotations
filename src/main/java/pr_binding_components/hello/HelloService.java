package pr_binding_components.hello;

import org.springframework.stereotype.Component;

@Component
public class HelloService {
    String name;

    public void setName(String name){
        this.name = name;
    }

    public String sayHello() {
        return "Hello "+name;
    }
}
