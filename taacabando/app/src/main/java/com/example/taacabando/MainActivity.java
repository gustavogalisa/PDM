package com.example.taacabando;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = findViewById(R.id.image);
        Switch curso = findViewById(R.id.switch1);

        curso.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    image.setImageDrawable(getDrawable(R.drawable.ic_baseline_battery_alert_24));
                }else{
                    image.setImageDrawable(getDrawable(R.drawable.ic_baseline_battery_charging_full_24));
                }
            }
        });
    }
}