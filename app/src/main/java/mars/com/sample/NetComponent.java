package mars.com.sample;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by yangyuchi on 28/05/2017.
 */
@Singleton
@Component(modules={NetModule.class,ServiceModule.class})
public interface NetComponent {
    void inject(MainActivity activity);
    // void inject(MyFragment fragment);
    // void inject(MyService service);
}
