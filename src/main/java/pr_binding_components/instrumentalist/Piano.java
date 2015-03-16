package pr_binding_components.instrumentalist;

import pr_binding_components.interfaces.Instrument;

/**
 * Created by dubbinary on 24.02.15.
 */
public class Piano implements Instrument {

    @Override
    public void play() {
        System.out.println("PLINK piy Plink");
    }
}
