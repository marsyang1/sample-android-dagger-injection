package mars.com.sample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yangyuchi on 28/05/2017.
 */
@Module
public class ServiceModule {


    @Provides
    @Singleton
    public HelloWorldService provideHelloWorldService() {
        return new HelloWorldServiceImpl();
    }


}
