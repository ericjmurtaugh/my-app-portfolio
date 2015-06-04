package com.eric.murtaugh.myappportfolio;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Make colors for buttons // I learned to do the color state from a stack overflow topic
        // about issues with lollipop and backgroundtint not working right
        ColorStateList colorAll = new ColorStateList(new int[][]{new int[0]}, new int[]{Color.argb(255,66,66,66)});
        ColorStateList colorMain = new ColorStateList(new int[][]{new int[0]}, new int[]{Color.argb(255,150,0,0)});

        // Inflate buttons
        AppCompatButton button1 = (AppCompatButton) findViewById(R.id.button1);
        AppCompatButton button2 = (AppCompatButton) findViewById(R.id.button2);
        AppCompatButton button3 = (AppCompatButton) findViewById(R.id.button3);
        AppCompatButton button4 = (AppCompatButton) findViewById(R.id.button4);
        AppCompatButton button5 = (AppCompatButton) findViewById(R.id.button5);
        AppCompatButton buttonCapstone = (AppCompatButton) findViewById(R.id.button6);

        // Set Button Colors
        button1.setSupportBackgroundTintList(colorAll);
        button2.setSupportBackgroundTintList(colorAll);
        button3.setSupportBackgroundTintList(colorAll);
        button4.setSupportBackgroundTintList(colorAll);
        button5.setSupportBackgroundTintList(colorAll);
        buttonCapstone.setSupportBackgroundTintList(colorMain);

        // Create button onClick events
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This will open my Spotify Streamer", Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This will open my Scores App", Toast.LENGTH_SHORT).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This will open my Library App", Toast.LENGTH_SHORT).show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This will open my Build it Bigger App", Toast.LENGTH_SHORT).show();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This will open my XYZ Reader", Toast.LENGTH_SHORT).show();
            }
        });
        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This will open my Capstone", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // not needed as of now because there are no settings
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
