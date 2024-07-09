package com.example.examassignment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button buttonSend, buttonNavigate;
    private FirstFragment firstFragment;
    private SecondFragment secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        buttonSend = findViewById(R.id.buttonSend);
        buttonNavigate = findViewById(R.id.buttonNavigate);

        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragmentContainer1, firstFragment)
                .add(R.id.fragmentContainer2, secondFragment)
                .commit();

        buttonSend.setOnClickListener(v -> {
            String data = editText.getText().toString();
            firstFragment.updateTextView(data);
            secondFragment.updateTextView(data);
        });

        buttonNavigate.setOnClickListener(v -> {
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Alert")
                    .setMessage("Press OK to navigate to another activity")
                    .setPositiveButton("OK", (dialog, which) -> {
                        Intent intent = new Intent(MainActivity.this, NewActivity.class);
                        startActivity(intent);
                    })
                    .setNegativeButton("Cancel", null)
                    .show();
        });
    }

}
