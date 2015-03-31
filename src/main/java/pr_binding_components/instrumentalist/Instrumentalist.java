package pr_binding_components.instrumentalist;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pr_binding_components.interfaces.Instrument;
import pr_binding_components.interfaces.Performer;

/**
 * Created by dubbinary on 17.02.15.
 */
@Component
public class Instrumentalist implements Performer {

    private String song;
    @Autowired//(required=false)
    @Qualifier("saxophone")
    private Instrument instrument;
    public Instrumentalist(){}

    @Override
    public void perform() {
        System.out.println("Plaing \""+song+"\" : ");
        instrument.play();
    }

    public void setSong(String song){
        this.song = song;
    }
    public String getString(){
        return song;
    }
    public String screamSong(){
        return song;
    }

    public void setInstrument(Instrument instrument){
        this.instrument = instrument;
    }

}
