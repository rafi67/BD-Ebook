package com.example.rafi.bde_book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Main12Activity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        b1 = findViewById((R.id.btn1));
        b2 = findViewById((R.id.btn2));
        b3 = findViewById((R.id.btn3));
        b4 = findViewById((R.id.btn4));
        b5 = findViewById((R.id.btn5));
        b6 = findViewById((R.id.btn6));
        b7 = findViewById((R.id.btn7));
        b8 = findViewById((R.id.btn8));
        b9 = findViewById((R.id.btn9));
        b10 = findViewById((R.id.btn10));

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main12Activity.this, Main39Activity.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main12Activity.this, Main40Activity.class);
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main12Activity.this, Main41Activity.class);
                startActivity(intent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main12Activity.this, Main42Activity.class);
                startActivity(intent);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main12Activity.this, Main43Activity.class);
                startActivity(intent);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main12Activity.this, Main44Activity.class);
                startActivity(intent);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main12Activity.this, Main45Activity.class);
                startActivity(intent);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main12Activity.this, Main46Activity.class);
                startActivity(intent);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main12Activity.this, Main47Activity.class);
                startActivity(intent);
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main12Activity.this, Main48Activity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                Intent intent = new Intent (Main12Activity.this, HomeActivity.class);
                startActivity(intent);
                break;

            case R.id.general:
                Intent intent2 = new Intent(Main12Activity.this, Main2Activity.class);
                startActivity(intent2);
                break;

            case R.id.Primary:
                Intent intent3 = new Intent(Main12Activity.this, Main3Activity.class);
                startActivity(intent3);
                break;

            case R.id.high:
                Intent intent4 = new Intent(Main12Activity.this, Main7Activity.class);
                startActivity(intent4);
                break;

            case R.id.about:
                Intent intent5 = new Intent(Main12Activity.this, Main49Activity.class);
                startActivity(intent5);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
