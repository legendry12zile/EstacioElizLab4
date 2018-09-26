package eliz.estacio.com.estacioelizlab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.design.widget.Snackbar;

public class MainActivity extends AppCompatActivity {

    protected Button Back, Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View eliz) {
        Toast.makeText(MainActivity.this, "Back Button is pressed", Toast.LENGTH_SHORT).show();
    }

    public void showSnackbar(View estacio) {
        Snackbar.make(estacio, "Next Button is pressed", Snackbar.LENGTH_SHORT).show();
    }

    protected void onStart(){
        super.onStart();
        Log.d("4ITE", "onStart() has started");
    }

    protected void onResume(){
        super.onResume();
        Log.d("4ITE", "onResume() has started");
    }

    protected void onPause(){
        super.onPause();
        Log.d("4ITE", "onPause() has started");
    }

    protected void onStop(){
        super.onStop();
        Log.d("4ITE", "onStop() has started");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d("4ITE", "onRestart() has started");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d("4ITE", "onDestroy() has started");
    }

}
