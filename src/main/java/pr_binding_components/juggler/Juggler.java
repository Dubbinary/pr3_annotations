package pr_binding_components.juggler;

import pr_binding_components.interfaces.Performer;

/**
 * Created by dubbinary on 10.02.15.
 */
public class Juggler implements Performer {

    private int beanBugs = 3;

    public Juggler(){}
    public Juggler(int beanBugs){
        this.beanBugs = beanBugs;
    }


    @Override
    public void perform() {
        System.out.println("Juggling \""+beanBugs+"\" beanbugs");
    }
}

