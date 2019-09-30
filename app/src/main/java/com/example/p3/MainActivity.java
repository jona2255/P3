package com.example.p3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.time.LocalDateTime;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ABCD";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG,"onCreate");

        textView = findViewById(R.id.textView);

        textView.setText(textView.getText() + "\n" + LocalDateTime.now() + ": onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.e(TAG,"onStart");

        textView.setText(textView.getText() + "\n" + LocalDateTime.now() + ": onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.e(TAG,"onResume");

        textView.setText(textView.getText() + "\n" + LocalDateTime.now() + ": onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.e(TAG,"onPause");

        textView.setText(textView.getText() + "\n" + LocalDateTime.now() + ": onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.e(TAG,"onStop");

        textView.setText(textView.getText() + "\n" + LocalDateTime.now() + ": onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.e(TAG,"onRestart");

        textView.setText(textView.getText() + "\n" + LocalDateTime.now() + ": onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e(TAG,"onDestroy");

        textView.setText(textView.getText() + "\n" + LocalDateTime.now() + ": onDestroy");
    }
}
