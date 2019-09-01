package com.example.gotapass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyArrayAdapter extends ArrayAdapter {


    Context _context;
    int _layout;
    List<Food> _objects;


    public MyArrayAdapter(Context context, int layout, List objects) {
        super(context, layout, objects);
        _context = context;
        _layout = layout;
        _objects = objects;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View result = convertView;
        if (result == null) {
            result = LayoutInflater.from(_context).inflate(
                    R.layout.food_layout, parent, false);
        }
        ImageView foodImage = result.findViewById(R.id.imageView2);
        foodImage.setImageResource(_objects.get(position).get_image());

        TextView foodName = result.findViewById(R.id.name);
        foodName.setText(_objects.get(position).get_name());

        TextView foodCalories = result.findViewById(R.id.calories);
        foodCalories.setText(_objects.get(position).get_calories() + " Calories");



        return result;
    }
}
