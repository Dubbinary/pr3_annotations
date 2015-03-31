package pr_binding_components.instrumentalist;

import org.springframework.stereotype.Component;
import pr_binding_components.interfaces.Instrument;

/**
 * Created by dubbinary on 24.02.15.
 */
@Component("piano")
public class Piano implements Instrument {

    @Override
    public void play() {
        System.out.println("PLINK piy Plink");
    }
}
