package dependencyInject;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by zhengwenzhan on 2019-03-17
 */
public class App {
    public static void main(String[] args) {
        Wizard simpleWizard = new SimpleWizard();
        simpleWizard.smoke();

        Wizard advancedWizard = new AdvancedWizard(new SecondBreakfastTobacco());
        advancedWizard.smoke();

        Injector injector = Guice.createInjector(new TobaccoModule());
        Wizard guiceWizard = injector.getInstance(GuiceWizard.class);
        guiceWizard.smoke();

    }
}
