package aikya.com.myfirstapplication;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String Tag = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ();
        Log.d(Tag,"In onCreate");

    }

    private void setListener() {
        Button showToast = (Button) findViewById(R.id.buttonToast);
        showToast.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),"Hello ",Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Tag,"In onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Tag,"In onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(Tag,"In onRestart");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Tag,"In onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag,"In onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Tag,"In onDestroy");
    }


    public void showToast(View view) {
        // Toast is pre defined text

        // Notify User for fraction of time
        Toast.makeText(this,"Hi Give Me Toast ",Toast.LENGTH_LONG).show();
    }

    @Override
    public View findViewById(@IdRes int id) {
        return super.findViewById(id);
    }
}
