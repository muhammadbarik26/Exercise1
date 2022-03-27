package com.example.exercise_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.exercise_1.R;

public class ActivityResult extends AppCompatActivity {

    TextView txTask, txJenis, txTime;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        txTask = findViewById(R.id.tvTask);
        txJenis = findViewById(R.id.tvJenistask);
        txTime  = findViewById(R.id.tvTimetask);

        Bundle bundle = getIntent().getExtras();

        String task = bundle.getString("a");
        String jenis = bundle.getString("b");
        String time = bundle.getString("c");

        txTask.setText(task);
        txJenis.setText(jenis);
        txTime.setText(time);
    }
}