package com.example.user.colorcomplimentor;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class Colorview extends AppCompatActivity {
private String color;
private RelativeLayout relativeLayout;
private TextView showText;
private static colors colors=new colors();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colorview);
        Intent intent = getIntent();
        color = intent.getStringExtra(getString(R.string.Key_color));
        showText=(TextView)findViewById(R.id.showText);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativelayout);
        loadcolour();
          }
    private void loadcolour() {


        if (color == null || color.isEmpty()) {
            color = "Black";
        }

           switch (color) {
               case "Black":
                   relativeLayout.setBackgroundColor(Color.BLACK);
                   Toast.makeText(this, "Ooops!you are not entered any color", Toast.LENGTH_SHORT).show();
                   break;
               case "White":
                   relativeLayout.setBackgroundColor(Color.WHITE);
                   showText.setText(colors.b1);
                   break;
               case "Red":
                   relativeLayout.setBackgroundColor(Color.RED);
                   showText.setText(colors.b2);
                   break;
               case "Blue":
                   relativeLayout.setBackgroundColor(Color.BLUE);
                   showText.setText(colors.b3);
                   break;
               case "Green":
                   relativeLayout.setBackgroundColor(Color.GREEN);
                   showText.setText(colors.b4);
                   break;
               case "Yellow":
                   relativeLayout.setBackgroundColor(Color.YELLOW);
                   showText.setText(colors.b5);
                   break;
               case "Magenta":
                   relativeLayout.setBackgroundColor(Color.MAGENTA);
                   showText.setText(colors.b6);
                   break;
               case "Gray":
                   relativeLayout.setBackgroundColor(Color.GRAY);
                   showText.setText(colors.b7);
                   break;
               case "Cyan":
                   relativeLayout.setBackgroundColor(Color.CYAN);
                   showText.setText(colors.b8);
                   break;
               case "Pink":
                   relativeLayout.setBackgroundColor(Color.rgb(255,128,255));
                   showText.setText(colors.b10);
                   break;

               default:
                   relativeLayout.setBackgroundColor(Color.WHITE);
                   showText.setText(colors.b9);
                   Toast.makeText(this, "Entered colour is not avaiable!", Toast.LENGTH_SHORT).show();
                   break;
           }

       }






    }








