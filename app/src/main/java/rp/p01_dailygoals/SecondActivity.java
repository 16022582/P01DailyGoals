package rp.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String[] info = intent.getStringArrayExtra("info");

        TextView textView = (TextView)findViewById(R.id.concludingText);
        textView.setText("Read up on materials before class: " + info[0] + "\nArrive on time so as not to miss important part of the lesson: " + info[1] + "\nAttempt the problem myself: " + info[2] + "\nReflection: " + info[3]);

        Button btn = (Button) findViewById(R.id.anotherButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
