package com.example.rem.sqlite.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.rem.sqlite.Model.Student;
import com.example.rem.sqlite.R;

import java.util.ArrayList;
import java.util.List;

public class StudentAdapter  extends ArrayAdapter{
    Context context;
    private int layout;
    ArrayList<Student> listStudent;

    public StudentAdapter(@NonNull Context context, int resource, @NonNull ArrayList objects) {
        super(context, resource, objects);
        this.layout = resource;
        this.context = context;
        this.listStudent = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if (view != null){
            view = LayoutInflater.from(context).inflate(layout, parent);

            ImageButton ivGender = (ImageButton) view.findViewById(R.id.ivGender);
            TextView tvName = view.findViewById(R.id.tvName);
            TextView tvDetail = view.findViewById(R.id.tvDetail);

            tvName.setText(listStudent.get(position).getName());
            tvDetail.setText(listStudent.get(position).getDetail());

            if (listStudent.get(position).getGender() == 1){
                ivGender.setImageResource(R.drawable.man);
            } else {
                ivGender.setImageResource(R.drawable.woman);
            }

            return convertView;
        }

        return super.getView(position, convertView, parent);
    }
}
