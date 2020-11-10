package com.example.helloworld;

import androidx.annotation.ContentView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);



    }

    public void onClick(View v) {
        Button btn = v.findViewById(v.getId());
        String textBtn = btn.getText().toString();
        String textVisor = textView.getText().toString() + textBtn;
        if (!textView.getText().equals("")) {
            if (!textView.getText().toString().matches(".*[0-9]$") && !textBtn.matches("[0-9]")) {
                StringBuilder operator = new StringBuilder(textView.getText());
                System.out.println("op:");
                operator.delete(operator.length() - 1, operator.length());
                textVisor= operator.toString() + textBtn;
            }
        }
        textView.setText(textVisor);

    }

    public void onClickLimpar(View v) {
        textView.setText("");
    }

    public void onClickCalc(View v) {
        
    }

    public void onClickDel(View v) {
        textView.setText("");
    }
}