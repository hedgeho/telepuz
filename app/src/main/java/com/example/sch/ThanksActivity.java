package com.example.sch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import static com.example.sch.LoginActivity.log;

public class ThanksActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks);

        ImageView smile = findViewById(R.id.img_smile);
        smile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                log("clicked " + count + " times");
                if(count == 5)
                    Toast.makeText(getApplicationContext(), "Вы открыли пасхалку!", Toast.LENGTH_LONG).show();
            }
        });
        Button esc = findViewById(R.id.btn_ok);
        esc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}