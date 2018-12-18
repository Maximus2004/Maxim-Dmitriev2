package ru.startandroid.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;

import static android.app.Activity.RESULT_OK;

public class Listener2 implements View.OnClickListener {
    Main2Activity main2;
    Listener2 (Main2Activity m2){
        main2 = m2;
    }

    @Override
    public void onClick(View v) {
        Intent i2 = new Intent(main2, MainActivity.class);
        EditText l = main2.findViewById(R.id.editTextLog2);
        EditText p = main2.findViewById(R.id.editTextPass2);
        String result = p.getText().toString();
        String result2 = l.getText().toString();
        main2.startActivity(i2);
        i2.putExtra("et", result);
        i2.putExtra("et2", result2);
        main2.setResult(RESULT_OK, i2);
        main2.finish();
    }
}

