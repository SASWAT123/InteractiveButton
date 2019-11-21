package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.time.Clock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This method is called when the button is clicked
    public void submitOrder(View view){
        display(100);
    }

    public void increaseValue(View view){
        System.out.println("Increase clicked");
    }

    public void decreaseValue(View view){
        System.out.println("Decrease clicked");
    }

    //This method will display the count content
    public void display(int i){
        TextView quantityTextView = (TextView)findViewById(R.id.count_text_view);
        quantityTextView.setText(""+i);
    }
}
