package com.example.meipiru.silentvoice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.os.Vibrator;


public class SubActivity extends AppCompatActivity {

    private Vibrator vib;
    private long pattern[] = {1000, 200, 700, 200, 400, 200 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Button returnButton = (Button) findViewById(R.id.finish);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        vib = (Vibrator)getSystemService(VIBRATOR_SERVICE);

int num = 3;//ここの値によって表示する画像変更

        switch (num){
            case 1: // 救急車
                ((ImageView) findViewById(R.id.sound)).setImageResource(R.drawable.ambulance);
                vib.vibrate(5000);
                break;
            case 2: // 自転車
                ((ImageView) findViewById(R.id.sound)).setImageResource(R.drawable.bycycle);
                vib.vibrate(pattern, 0);
                break;
            case 3: // 踏切
                ((ImageView) findViewById(R.id.sound)).setImageResource(R.drawable.railload);
                vib.vibrate(1000);
        }

    }
}
