package com.example.lottie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.utilis.LocaleHelper;
import com.example.utilis.LocaleWrapper;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button changeLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setButtonEvent();
    }


    private void setButtonEvent() {
        changeLanguage = (Button) findViewById(R.id.enBtn);
        changeLanguage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //change Languate and restart
//                LocaleHelper.setLocale(getBaseContext(), "en");
//                LocaleWrapper.setLocale("en");
//                recreate();
                changeLocale("en");
            }
        });
        changeLanguage = (Button) findViewById(R.id.koBtn);
        changeLanguage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //change Languate and restart
//                LocaleHelper.setLocale(getBaseContext(), "ko");
//                LocaleWrapper.setLocale("ko");
//                recreate();
                changeLocale("ko");
            }
        });
        changeLanguage = (Button) findViewById(R.id.zaBtn);
        changeLanguage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //change Languate and restart
//                LocaleHelper.setLocale(getBaseContext(), "za");
//                LocaleWrapper.setLocale("za");
//                recreate();
                changeLocale("za");
            }
        });

    }


    private void changeLocale(String language) {
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        recreate();
    }
}