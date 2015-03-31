package pr_binding_components;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pr_binding_components.hello.HelloService;
import pr_binding_components.interfaces.*;
import pr_binding_components.juggler.*;
import pr_binding_components.instrumentalist.*;
import pr_binding_components.onemanband.*;



public class BindCompTester {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //Say "Hello"
        HelloService helloService = context.getBean(HelloService.class);
        helloService.setName("Arachnid42");
        System.out.println(helloService.sayHello());

        //Juggling
        Juggler juggler = context.getBean("juggler", Juggler.class);
        juggler.setBeanBugs(8);
        juggler.perform();

        Performer poetic_juggler = context.getBean("poeticJuggler", PoeticJuggler.class);
        poetic_juggler.perform();

        //Factory
        //Stage stage = context.getBean(Stage.class);
        Stage stage = Stage.getInstance();
        stage.checkStage();

        //Instrumentalists
        Instrumentalist kenny = context.getBean(Instrumentalist.class);
        kenny.perform();
        Instrumentalist kenny2 = context.getBean(Instrumentalist.class);
        kenny2.perform();

        //List & Map
        OneManBand omb = (OneManBand) context.getBean("hank");
        omb.perform();
        OneManBand ombn = (OneManBandNew) context.getBean("hank2");
        ombn.perform();

    }
}
