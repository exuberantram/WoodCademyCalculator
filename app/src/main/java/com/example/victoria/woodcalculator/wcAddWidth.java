package com.example.victoria.woodcalculator;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class wcAddWidth extends AppCompatActivity {

    public EditText tNum;
    public EditText lNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wc_add_width);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        //creates a listener that sends the user to AddWidth on click
        Button btn = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tOut = findViewById(R.id.userthick);
                TextView lOut = findViewById(R.id.userlength);
                tOut.setText(tNum.getText().toString());
                lOut.setText(lNum.getText().toString());
                startActivity(new Intent(wcAddWidth.this, wcPile.class));
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
