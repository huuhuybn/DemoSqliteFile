package com.dotplays.bookmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    private BookSqliteOpenHelper bookSqliteOpenHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bookSqliteOpenHelper =
                new BookSqliteOpenHelper(this);
        bookSqliteOpenHelper.createDataBase();


        List<User> users = bookSqliteOpenHelper.getListUser();

        Toast.makeText(this,
                users.size() + "", Toast.LENGTH_SHORT).show();

    }

}
