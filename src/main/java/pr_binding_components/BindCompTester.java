package pr_binding_components;

import pr_binding_components.interfaces.Performer;
import pr_binding_components.onemanband.OneManBand;
import pr_binding_components.onemanband.OneManBandNew;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pr_binding_components.hello.HelloService;
import pr_binding_components.instrumentalist.Instrumentalist;
import pr_binding_components.instrumentalist.Stage;


public class BindCompTester {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //Say "Hello"
        HelloService helloService = (HelloService) context.getBean("helloBean");
        System.out.println(helloService.sayHello());
        //Juggling
        Performer performer= (Performer)context.getBean("poeticDuke");
        performer.perform();
        //Factory
        Stage stage = (Stage) context.getBean("theStage");
        stage.checkStage();
        //Instrumentalists
        Instrumentalist kenny = (Instrumentalist) context.getBean("kenny");
        kenny.perform();
        Instrumentalist kenny2 = (Instrumentalist) context.getBean("kenny2");
        kenny2.perform();
        //List & Map
        OneManBand omb = (OneManBand) context.getBean("hank");
        omb.perform();
        OneManBand ombn = (OneManBandNew) context.getBean("hank2");
        ombn.perform();
    }
}
