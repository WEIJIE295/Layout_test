package edu.fjnu.cse.mylayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.LinearLayout);
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this,LinearActivity.class);
                        startActivity(intent);
                    }
                });

        Button button2  = (Button) findViewById(R.id.RelativeLayout);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RelativeActivity.class);
                startActivity(intent);
            }
        });
        Button button3  = (Button) findViewById(R.id.TableLayout);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TableActivity.class);
                startActivity(intent);
            }
        });

    }
}
