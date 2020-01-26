package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView title_text =(TextView)findViewById(R.id.title_text);
        final ImageView ball_image=(ImageView)findViewById(R.id.ball_image);
        Button ask_button =(Button)findViewById(R.id.ask_button);

       final int [] ball_array={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random_number_generetor= new Random();
                int number=random_number_generetor.nextInt(5);
                ball_image.setImageResource(ball_array[number]);
            }
        });


    }
}
