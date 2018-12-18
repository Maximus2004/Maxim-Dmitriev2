package ru.startandroid.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Listener implements View.OnClickListener {
    MainActivity main;
    public static final String pass  = "1234";
    public static final String log  = "maks";
    Listener (MainActivity m){
        main = m;
    }
    @Override
    public void onClick(View v) {
        TextView t = main.findViewById(R.id.textViewCheck);
        EditText l = main.findViewById(R.id.editTextLog);
        EditText p = main.findViewById(R.id.editTextPass);
        String result = p.getText().toString();
        String result2 = l.getText().toString();
        if (result != pass || result2 != log){
            Intent i = new Intent(main, Main2Activity.class);
            main.startActivity(i);
            String str = main.getIntent().getStringExtra("et");
            String str2 = main.getIntent().getStringExtra("et2");
            String str3 = "Логин"+str+"\n"+"Пароль"+str2;
            t.setText("");
            t.setText(str3);
        }
        if (result == pass && result2 == log){
            t.setText("");
            t.setText("Верно");
            t.setTextColor(Color.GREEN);
        }
    }
}