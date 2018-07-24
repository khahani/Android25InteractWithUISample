package com.khahani.app.ordercoffee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nameEditText = (EditText) findViewById(R.id.name);
        nameEditText.setText("Hello From Activity");

        CheckBox sugerCheckBox = findViewById(R.id.suger);
        sugerCheckBox.setChecked(true);

    }

    public void plusClick(View view) {
       /* TextView countTextView = findViewById(R.id.count);

        String countValue = countTextView.getText().toString();
        int count = Integer.parseInt(countValue);

        if (count < 20)
            count++;

        countValue = Integer.toString(count);
        countTextView.setText(countValue);*/

       increase();

       display();
    }

    public void minesClick(View view) {
        decrease();
        display();
    }

    private int count;

    public void increase() {
        if (count < 20)
            count++;
    }

    public void decrease() {
        if (count > 1)
            count--;
    }

    public void display(){
        TextView countTextView = findViewById(R.id.count);
        countTextView.setText(String.valueOf(count));
    }
}
