package com.sixin.customdialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sixin.dialog.ProgressDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProgressDialog dialog = new ProgressDialog(this, R.style.ProgressDialog_black);
        dialog.show();
    }
}
