package pr_binding_components.instrumentalist;

import org.springframework.stereotype.Component;

/**
 * Created by dubbinary on 17.02.15.
 */
@Component
public class Stage {
    private Stage(){}

    private static class StageSingletonHolder{
        static Stage instance = new Stage();
    }

    public static Stage getInstance(){
        return StageSingletonHolder.instance;
    }

    public void checkStage(){
        System.out.println("---Inside Stage---");
    }

}
