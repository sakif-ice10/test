package com.example.pathshala.myapplication;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText;
    TextView nameTextView;
    Button nameShowButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = (EditText) findViewById(R.id.name_edit_text);
        nameTextView = (TextView) findViewById(R.id.name_text_view);
        nameShowButton = (Button) findViewById(R.id.show_button);

        nameShowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameEditText.getText().toString();
                nameTextView.setText(name);
            }
        });

    }


}
