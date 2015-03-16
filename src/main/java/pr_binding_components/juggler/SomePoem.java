package pr_binding_components.juggler;

import pr_binding_components.interfaces.Poem;

/**
 * Created by dubbinary on 10.02.15.
 */
public class SomePoem implements Poem {

    private static String[] lines= {
            "\n\"No appenders could be found for logger,",
            "Please initialize the log4j system properly,",
            "See http://logging.apache.org/log4j/1.2/faq.html,",
            "#noconfig\"\n"
    };

    public SomePoem(){}

    @Override
    public void recite() {
        for(int i=0; i<lines.length; i++){
            System.out.println(lines[i]);
        }
    }
}
