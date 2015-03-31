package pr_binding_components.instrumentalist;

import org.springframework.stereotype.Component;
import pr_binding_components.interfaces.Instrument;

/**
 * Created by dubbinary on 24.02.15.
 */
@Component("saxophone")
public class Saxophone implements Instrument {

    private static int id=0;

    public Saxophone() {
        id++;
        System.out.println("Created Saxophone: \nid="+id);
    }
    @Override
    public void play() {
        System.out.println("TOO TO TO TOO TO TO");
    }
}
