package com.jagroop.materialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class CardViewActivity extends AppCompatActivity {

    private CardView cardViewImage1, cardViewImage2;
    private ImageView cardImage1, cardImage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        cardViewImage1 = findViewById(R.id.cardViewImage1);
        cardViewImage2 = findViewById(R.id.cardViewImage2);
        cardImage1 = findViewById(R.id.cardImage1);
        cardImage2 = findViewById(R.id.cardImage2);

        cardViewImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardImage1.setImageResource(R.drawable.card3);
            }
        });

        cardViewImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardImage2.setImageResource(R.drawable.card4);
            }
        });
    }
}
