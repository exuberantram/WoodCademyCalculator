package com.example.victoria.woodcalculator;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class wcPile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wc_pile);
    }

    public void addListenerOnButton() {

        //creates a listener that sends the user to AddWidth on click
        Button btn = findViewById(R.id.calcbutton2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(wcPile.this, wcBoardFoot.class));
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

}
