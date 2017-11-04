package com.example.user.colorcomplimentor;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText showText;
    private Button showButton;
    String color;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showText=(EditText)findViewById(R.id.showText);
        showButton=(Button)findViewById(R.id.showButton);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                color=showText.getText().toString();
                Colorview();
            }
        });

    }
    private void Colorview()
    {
        Intent intent=new Intent(MainActivity.this,Colorview.class);
        Resources resources=getResources();
        String key=resources.getString(R.string.Key_color);
         intent.putExtra(key,color);
        startActivity(intent);
    }

}
