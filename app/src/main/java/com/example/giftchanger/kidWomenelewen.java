package com.example.giftchanger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class kidWomenelewen extends AppCompatActivity {// Это активность где будет список подарков выводиться кароч
    List<Present> presents = new ArrayList<Present>();
    private ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_present);
        imageButton = findViewById(R.id.buton);

        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.recyclerview1);
        presentAdapter adapter = new presentAdapter(this, presents);
        recyclerView.setAdapter(adapter);

    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(getApplicationContext(),Second.class);//переход во вторую активность
            startActivity(intent);
        }
    };


    private void setInitialData() {
        presents.add(new Present("Тут девочки","7-11","*картиночка*")); // тут вводим каждый предмет по отдельности
        // по необходимости, дополните список(ctrl + D дублирует предыдущую строку)
    }
}