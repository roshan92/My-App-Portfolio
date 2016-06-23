package co.cimply.roshan.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button app1Btn, app2Btn, app3Btn, app4Btn, app5Btn, app6Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        app1Btn = (Button) findViewById(R.id.app1Btn);
        app1Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch my popular movies app!", Toast.LENGTH_SHORT).show();
            }
        });

        app2Btn = (Button) findViewById(R.id.app2Btn);
        app2Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(), "This button will launch my stock hawk app!", Toast.LENGTH_SHORT).show();
            }
        });

        app3Btn = (Button) findViewById(R.id.app3Btn);
        app3Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(), "This button will launch my build it bigger app!", Toast.LENGTH_SHORT).show();
            }
        });

        app4Btn = (Button) findViewById(R.id.app4Btn);
        app4Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(), "This button will launch my make your app material app!", Toast.LENGTH_SHORT).show();
            }
        });

        app5Btn = (Button) findViewById(R.id.app5Btn);
        app5Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(), "This button will launch my go ubiquitous app!", Toast.LENGTH_SHORT).show();
            }
        });

        app6Btn = (Button) findViewById(R.id.app6Btn);
        app6Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(), "This button will launch my capstone app!", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
