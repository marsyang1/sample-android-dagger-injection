package mars.com.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Gson gson;
    @Inject
    HelloWorldService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        service.hello();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApp)getApplication()).getNetComponent().inject(this);
        String message = service.hello();
        Log.d("I", message);
        TextView textView = (TextView) findViewById(R.id.textView_main_1);

        if(textView != null){
            textView.setText(message);
        }else{
            Log.d("I","textView is null");
        }
    }



}
