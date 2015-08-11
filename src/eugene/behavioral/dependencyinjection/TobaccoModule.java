package eugene.behavioral.dependencyinjection;

/**
 * Created by Jian on 2015/8/11.
 */

import com.google.inject.AbstractModule;

/**
 *
 * Guice module for binding certain concrete Tobacco implementation.
 *
 */
public class TobaccoModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Tobacco.class).to(RivendellTobacco.class);
    }
}
