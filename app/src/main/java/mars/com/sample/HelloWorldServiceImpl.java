package mars.com.sample;

/**
 * Created by yangyuchi on 28/05/2017.
 */

public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String hello() {
        return "hello from Service!!!!";
    }
}
