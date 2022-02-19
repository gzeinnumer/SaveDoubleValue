package com.gzeinnumer.savedoublevalue;

import static com.gzeinnumer.savedoublevalue.GblFunction.saveDoubleText;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.text.NumberFormat;
import android.os.Bundle;
import android.util.Log;

import java.text.DecimalFormat;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "afafafasfaasf";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String value = "5.120";

        Log.d(TAG, "onCreate: "+saveDoubleText("5.0000"));
        Log.d(TAG, "onCreate: "+saveDoubleText("5.1000"));
        Log.d(TAG, "onCreate: "+saveDoubleText("5.1200"));
        Log.d(TAG, "onCreate: "+saveDoubleText("5.1230"));
        Log.d(TAG, "onCreate: "+saveDoubleText("5.1234"));
        Log.d(TAG, "onCreate: "+saveDoubleText("5.0003"));
        Log.d(TAG, "onCreate: "+saveDoubleText("5.0023"));

        Log.d(TAG, "onCreate: "+saveDoubleText("0.0000"));
        Log.d(TAG, "onCreate: "+saveDoubleText("0.1000"));
        Log.d(TAG, "onCreate: "+saveDoubleText("0.1200"));
        Log.d(TAG, "onCreate: "+saveDoubleText("0.1230"));
        Log.d(TAG, "onCreate: "+saveDoubleText("0.1234"));
    }
}