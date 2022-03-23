      package com.example.magicidapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

      public class MainActivity extends AppCompatActivity {

EditText etID;
Button btnSubmit;
TextView tvResult;

      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main_activity);

      etID = findViewById(R.id.etID);
      btnSubmit = findViewById(R.id.btnSubmit);
      tvResult = findViewById(R.id.tvResults);
      }
}