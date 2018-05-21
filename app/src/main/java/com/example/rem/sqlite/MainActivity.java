package com.example.rem.sqlite;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.rem.sqlite.Adapter.StudentAdapter;
import com.example.rem.sqlite.Model.Student;
import com.example.rem.sqlite.SQLite.SQLite;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ListView listView;
    StudentAdapter adapter;
    ArrayList<Student> arrStudent;
    SQLite sqLite;
    ImageButton ibAdd;
    Dialog dialog;

    public static final String TABLE_NAME = "table_student";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_DETAIL = "detail";
    public static final String COLUMN_GENDER = "gender";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lvItem);
        ibAdd = findViewById(R.id.ibAdd);

        dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog);

        sqlite();

        ibAdd.setOnClickListener(this);
    }

    private void sqlite() {
        sqLite = new SQLite(this, "com.Student", null, 1);
        sqLite.query("CREATE TABLE IF NOT EXISTS "
                + TABLE_NAME + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_NAME + " VARCHAR, "
                + COLUMN_DETAIL + " VARCHAR, "
                + COLUMN_GENDER + " INTEGER)");
    }


    @Override
    public void onClick(View v) {
        dialog.show();
    }
}
