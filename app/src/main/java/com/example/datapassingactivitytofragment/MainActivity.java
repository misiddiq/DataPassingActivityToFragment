package com.example.datapassingactivitytofragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ipName, ipAddress;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();
        final MyFragment fragment = new MyFragment();

        this.ipName = (EditText) findViewById(R.id.ipName);
        this.ipAddress = (EditText)findViewById(R.id.ipAddress);
        this.b = (Button) findViewById(R.id.b1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle putBundle = new Bundle();
                putBundle.putString("name", ipName.getText().toString());
                putBundle.putString("address", ipAddress.getText().toString());
                fragment.setArguments(putBundle);
                transaction.add(R.id.frame1, fragment);
                transaction.commit();
                ipName.setText("");
                ipAddress.setText("");
            }
        });
    }
}
