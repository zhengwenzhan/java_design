package dependencyInject;

import com.google.inject.AbstractModule;

/**
 * Created by zhengwenzhan on 2019-03-17
 */
public class TobaccoModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Tobacco.class).to(RivendellTobacco.class);
    }
}
