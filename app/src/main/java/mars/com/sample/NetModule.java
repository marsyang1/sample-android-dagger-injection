package mars.com.sample;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yangyuchi on 28/05/2017.
 */
@Module
public class NetModule {

//    String mBaseUrl;
//
//    // Constructor needs one parameter to instantiate.
//    public NetModule(String baseUrl) {
//        this.mBaseUrl = baseUrl;
//    }

    @Provides
    @Singleton
    public Gson provideGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        return gsonBuilder.create();
    }
//
//    @Provides
//    @Singleton
//    OkHttpClient provideOkHttpClient() {
//        OkHttpClient client = new OkHttpClient();
//        return client;
//    }

}
