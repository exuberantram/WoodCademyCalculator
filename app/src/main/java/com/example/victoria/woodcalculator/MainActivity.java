package com.example.victoria.woodcalculator;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    public EditText tNum;
    public EditText lNum;
    public TextView tOut;
    public TextView lOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wc_thickness_length);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        //creates a listener that sends the user to AddWidth on click
        //also "saves" the length and thickness values input as a string
        Button btn = findViewById(R.id.calcButton1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tNum = (EditText)findViewById(R.id.enterThick);
                lNum = (EditText)findViewById(R.id.enterLength);
                tOut = (TextView)findViewById(R.id.userthick);
                lOut = (TextView)findViewById(R.id.userlength);
                tNum.setText(tOut.getText().toString());
                lNum.setText(lOut.getText().toString());
                startActivity(new Intent(MainActivity.this, wcAddWidth.class));
            }
        });

        //creates a listener that directs the user to woodcademy.com on click
        ImageButton btnweb = findViewById(R.id.woodcademyFull);

        btnweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://woodcademy.com"));
                startActivity(browserIntent);
            }
        });
    }

    public void wc_add_width(View v) {
        Intent intent = new Intent(this, wcAddWidth.class);
        startActivity(intent);
    }
}
