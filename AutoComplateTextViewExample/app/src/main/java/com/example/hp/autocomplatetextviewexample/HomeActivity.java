package com.example.hp.autocomplatetextviewexample;

import android.os.ParcelFileDescriptor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class HomeActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView ;
    String [] fruits ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.fruits) ;
        fruits = getResources().getStringArray(R.array.fruits) ;
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , fruits) ;
        autoCompleteTextView.setAdapter(adapter);

    }
}
