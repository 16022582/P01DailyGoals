package rp.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    int radioButton1;
    int radioButton2;
    int radioButton3;

    Button btnDone;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnDone = (Button) findViewById(R.id.normalButton) ;
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){

                RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
                int selectedButtonId = radioGroup1.getCheckedRadioButtonId();
                RadioButton radioAns1 = (RadioButton) findViewById(selectedButtonId);
                radioButton1 = selectedButtonId;

                RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
                int selectedButtonId2 = radioGroup2.getCheckedRadioButtonId();
                RadioButton radioAns2 = (RadioButton) findViewById(selectedButtonId2);
                radioButton2 = selectedButtonId2;

                RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.radioGroup3);
                int selectedButtonId3 = radioGroup3.getCheckedRadioButtonId();
                RadioButton radioAns3 = (RadioButton) findViewById(selectedButtonId3);
                radioButton3 = selectedButtonId3;

                EditText editText = (EditText) findViewById(R.id.editText);

                String[] info = {radioAns1.getText().toString(), radioAns2.getText().toString(), radioAns3.getText().toString(), editText.getText().toString() };
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("info", info);
                startActivity(intent);
            }
        });
    }

}
