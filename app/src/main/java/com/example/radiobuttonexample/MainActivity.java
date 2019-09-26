package com.example.radiobuttonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {


    RadioGroup radioGroup;
    RadioButton radioBtn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        textView = findViewById(R.id.tvSelLang);

        radioGroup.setOnCheckedChangeListener(this);

    }


    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int selectedRBId) {
        radioBtn = findViewById(selectedRBId);
        String selBranch = radioBtn.getText().toString();
        textView.setText(selBranch);
    }



   /* public void submit(View view) {

        int selRadioBtnId = radioGroup.getCheckedRadioButtonId();
        radioBtn = findViewById(selRadioBtnId);
        String selBranch = radioBtn.getText().toString();

     *//*   String selBranch = "";
        if (radioBtnEce.isChecked()) {
            selBranch = radioBtnEce.getText().toString();
        } else if (radioBtnCse.isChecked()) {
            selBranch = radioBtnCse.getText().toString();
        } else if (radioBtnEee.isChecked()) {
            selBranch = radioBtnEee.getText().toString();
        }*//*

        ((TextView) findViewById(R.id.tvSelLang)).setText(selBranch);
    }*/
}
