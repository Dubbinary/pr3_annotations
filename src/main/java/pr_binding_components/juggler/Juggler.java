package pr_binding_components.juggler;

import org.springframework.stereotype.Component;
import pr_binding_components.interfaces.Performer;

/**
 * Created by dubbinary on 10.02.15.
 */
@Component("juggler")
public class Juggler implements Performer {

    private int beanBugs;

    public Juggler(){
        this.beanBugs = 3;
    }

    public void setBeanBugs(int beanBugs){ this.beanBugs = beanBugs; }
    public int getBeanBugs(){ return this.beanBugs; }

    @Override
    public void perform() {
        System.out.println("Juggling \""+beanBugs+"\" beanbugs");
    }
}

