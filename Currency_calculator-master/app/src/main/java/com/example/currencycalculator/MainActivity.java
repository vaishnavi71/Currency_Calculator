package com.example.currencycalculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public void Dollars(View view)
    {
        TextView k = findViewById(R.id.result);
        EditText n = findViewById(R.id.money);
        Double doll = Double.parseDouble(n.getText().toString());
        Double dollar = doll*0.013;
        k.setText("Converted "+doll.toString()+" rupees to $(dollars)"+String.format("%.2f",dollar));
        Toast.makeText(this, String.format("%.2f",dollar), Toast.LENGTH_LONG).show();
        Log.i("doll","$ "+dollar.toString());
    }
    public void pounds(View view)
    {
        TextView k = findViewById(R.id.result2);
        EditText n = findViewById(R.id.money);
        Double pound = Double.parseDouble(n.getText().toString());
        Double pounds = pound*0.010;
        k.setText("Converted "+pound.toString()+" rupees to 💷(pounds) "+String.format("%.2f",pounds));
        Toast.makeText(this, String.format("%.2f",pounds), Toast.LENGTH_LONG).show();
        Log.i("pound",pounds.toString());
    }
    public void euros(View view){
        TextView k = findViewById(R.id.result3);
        EditText n = findViewById(R.id.money);
        Double euro = Double.parseDouble(n.getText().toString());
        Double euros = euro*0.011;
        k.setText("Converted "+euro.toString()+" rupees to 💶 (euros)"+String.format("%.2f",euros));
        Toast.makeText(this, String.format("%.2f",euros), Toast.LENGTH_LONG).show();
        Log.i("euro",euros.toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
