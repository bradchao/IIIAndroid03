package tw.org.iii.iiiandroid03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView lottery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lottery = findViewById(R.id.lottery);

        Log.v("brad", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        lottery.setText("" + (int)(Math.random()*49+1));
        Log.v("brad", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("brad", "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("brad", "onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("brad", "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("brad", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("brad", "onRestart");
    }

    public void gotoPage2(View view) {
        Log.v("brad", "Click");

        Intent intent = new Intent(this, Page2Activity.class);
        startActivity(intent);

    }

}
