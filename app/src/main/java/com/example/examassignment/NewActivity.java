package com.example.examassignment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class NewActivity extends AppCompatActivity {

    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        layout = findViewById(R.id.colorLayout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == LibraryMenuIds.MENU_RED) {
            changeLayoutColor(Color.RED);
            return true;
        } else if (id == LibraryMenuIds.MENU_GREEN) {
            changeLayoutColor(Color.GREEN);
            return true;
        } else if (id == LibraryMenuIds.MENU_YELLOW) {
            changeLayoutColor(Color.YELLOW);
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    private void changeLayoutColor(int color) {
        layout.setBackgroundColor(color);
    }
}
