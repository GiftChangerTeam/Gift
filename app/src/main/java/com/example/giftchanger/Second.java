package com.example.giftchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ImageButton button = findViewById(R.id.buttonwomen0_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),kidWomenthree.class);
                startActivity(intent);
            }
        });
        ImageButton button1 = findViewById(R.id.buttonwomen4_6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), kidWomensix.class);
                startActivity(intent1);
            }
        });
        ImageButton button2 = findViewById(R.id.buttonwomen7_11);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplicationContext(), kidWomenelewen.class);
            }
        });

        ImageButton button3 = findViewById(R.id.buttonwomen12_17);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getApplicationContext(), kidWomentwelve.class);
            }
        });
        ImageButton button4 = findViewById(R.id.buttonwomen18_34);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getApplicationContext(), kidWomeneighteen.class);
            }
        });
        ImageButton button5 = findViewById(R.id.buttonWomen35);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(getApplicationContext(), Womenthirty_five.class);
            }
        });
        ImageButton button6 = findViewById(R.id.buttonman0_3);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(getApplicationContext(), kidManthree.class);
            }
        });
        ImageButton button7 = findViewById(R.id.buttonman4_6);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(getApplicationContext(), kidMantsix.class);
            }
        });
        ImageButton button8 = findViewById(R.id.buttonman7_11);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9 = new Intent(getApplicationContext(), kidMantelewen.class);
            }
        });
        ImageButton button9 = findViewById(R.id.buttonman12_17);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10 = new Intent(getApplicationContext(), kidMantwelve.class);
            }
        });
        ImageButton button10 = findViewById(R.id.buttonman18_34);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11 = new Intent(getApplicationContext(), kidManeighteen.class);
            }
        });
        ImageButton button11 = findViewById(R.id.buttonman35);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12 = new Intent(getApplicationContext(), Manthirty_five.class);
            }
        });
    }

        }


