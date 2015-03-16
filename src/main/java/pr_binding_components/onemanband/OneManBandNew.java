package pr_binding_components.onemanband;

import pr_binding_components.interfaces.Instrument;

import java.util.Map;

/**
 * Created by dubbinary on 02.03.15.
 */
public class OneManBandNew extends OneManBand {

    private Map<String, Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }

    @Override
    public void perform() {
        for(String key:instruments.keySet()){
        System.out.println(key+": ");
            Instrument inst = instruments.get(key);
            inst.play();
        }
    }
}
