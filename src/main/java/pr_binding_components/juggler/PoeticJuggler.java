package pr_binding_components.juggler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pr_binding_components.interfaces.Poem;

/**
 * Created by dubbinary on 10.02.15.
 */
@Component("poeticJuggler")
public class PoeticJuggler extends Juggler {

    @Autowired(required = false)
    private Poem poem;

    public PoeticJuggler(){}

    public PoeticJuggler(Poem poem){
        super();
        this.poem = poem;
    }

    @Override
    public void perform() {
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }
}
