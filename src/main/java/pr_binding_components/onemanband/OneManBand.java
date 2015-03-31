package pr_binding_components.onemanband;

import java.util.Collection;
import pr_binding_components.interfaces.Instrument;
import pr_binding_components.interfaces.Performer;

/**
 * Created by dubbinary on 02.03.15.
 */

public class OneManBand implements Performer {

    private Collection<Instrument> instruments;

    public OneManBand(){}

    @Override
    public void perform() {
        for(Instrument instrument:instruments){
            instrument.play();
        }
    }

    public void setInstruments(Collection<Instrument> instruments){
        this.instruments = instruments;
    }
}
