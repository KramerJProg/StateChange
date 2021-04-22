package com.example.statechange;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import androidx.annotation.NonNull;
import android.widget.EditText;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "StateChange";
    private static final String EDIT_TEXT_KEY = "savedText";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");

        final EditText editText =
                findViewById(R.id.editText);
        CharSequence userText = editText.getText();
        outState.putCharSequence(EDIT_TEXT_KEY, userText);

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");

        final EditText editText =
                findViewById(R.id.editText);

        CharSequence userText =
                savedInstanceState.getCharSequence(EDIT_TEXT_KEY);

        editText.setText(userText);

    }
}