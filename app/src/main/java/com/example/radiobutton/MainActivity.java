package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        image = (ImageView)findViewById(R.id.iv);
        radioGroup = findViewById(R.id.radiogroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId)
                {
                    case R.id.bluetooth:
                        image.setImageResource(R.drawable.ic_bluetooth);
                        break;
                    case R.id.wifi:
                        image.setImageResource(R.drawable.ic_wifi);
                        break;
                    case R.id.battery:
                        image.setImageResource(R.drawable.ic_battery);
                        break;
                    case R.id.speaker:
                        image.setImageResource(R.drawable.ic_speaker);
                        break;
                }
            }
        });

    }

    }
