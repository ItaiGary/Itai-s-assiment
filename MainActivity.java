package com.example.foodlist;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Food> foodArrayList = new ArrayList<>();
        foodArrayList.add(new Food("mango",66,R.drawable.images));
        foodArrayList.add(new Food("pinapple",12,R.drawable.pinapple));
        foodArrayList.add(new Food("vegan pizza!",300,R.drawable.vegan_pizza));
        foodArrayList.add(new Food("cocunat ice cream",160,R.drawable.coconut_ice_cream));
        foodArrayList.add(new Food("COCKIES",438,R.drawable.cookie));
        foodArrayList.add(new Food("NaChoS",289,R.drawable.nachos));
        foodArrayList.add(new Food("ZIM - NOT RECOMMENDED",666,R.drawable.invader_zim));

        MyArrayAdapter myArrayAdapter = new MyArrayAdapter(this,R.layout.food_layout, foodArrayList);

        ListView listView = findViewById(R.id.LVfoodList);
        listView.setAdapter(myArrayAdapter);

        listView.setClickable(true);
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                AlertDialog.Builder b = new AlertDialog.Builder();
                b.setMessage("R U sure you want to delete?");
                b.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })

                return false;
            }
        });


    }



}