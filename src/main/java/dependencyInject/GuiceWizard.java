package dependencyInject;

import com.google.inject.Inject;

/**
 * Created by zhengwenzhan on 2019-03-17
 */
public class GuiceWizard implements Wizard {

    private Tobacco tobacco;

    @Inject
    public GuiceWizard(Tobacco tobacco) {
        this.tobacco = tobacco;
    }

    @Override
    public void smoke() {
        tobacco.smoke(this);
    }
}
