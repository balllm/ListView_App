package com.example.materialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ItemActivity extends AppCompatActivity {
    TextView text;
    ImageView image;
    TextView describe;
    TextView priceSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        text = findViewById(R.id.title);
        image = findViewById(R.id.image);
        describe = findViewById(R.id.desc);
        priceSet = findViewById(R.id.price);


        Intent intent = getIntent();
        String name = intent.getStringExtra("title");
        int img = intent.getIntExtra("image", 0);
        String desc = intent.getStringExtra("desc");
        int price = intent.getIntExtra("price", 0);

        text.setText(name);
        image.setImageResource(img);
        describe.setText(desc);
        priceSet.setText(String.valueOf(price) +  "$");

    }
}