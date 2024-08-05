package com.example.myporject1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
     int m =0;
    public void tagButton(View view)
    {
        ImageView img = (ImageView) view;
        Button bu = findViewById(R.id.button2);
        int val = Integer.parseInt(bu.getTag().toString());
        if(val == 0) {
            if(m ==3 || m >= 0) {
                int btag = m + 1;
                if (btag == 1) {
                    img.setImageResource(R.drawable.fly);
                    img.setTranslationY(-1000f);
                } else if (btag == 2) {
                    img.setImageResource(R.drawable.flower1);
                    img.setTranslationY(-1000f);
                } else if (btag == 3) {
                    img.setImageResource(R.drawable.ic_launcher_background);
                    img.setTranslationY(-1000f);
                }
            }
            else{
                m =0;}
            m++;
            img.animate().translationYBy(1000f).setDuration(300);
        }
        Button b = findViewById(R.id.button1);
        int va = Integer.parseInt(b.getTag().toString());
        if(va == 1) {
            if(m ==3 || m >= 0) {
                int btag = m + 1;
                if (btag == 1) {
                    img.setImageResource(R.drawable.ic_launcher_background);
                    img.setTranslationY(-1000f);
                } else if (btag == 2) {
                    img.setImageResource(R.drawable.flower1);
                    img.setTranslationY(-1000f);
                } else if (btag == 3) {
                    img.setImageResource(R.drawable.fly);
                    img.setTranslationY(-1000f);
                }
            }
            else{
                m =0;}
            m++;
            img.animate().translationYBy(1000f).setDuration(300);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}