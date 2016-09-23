package com.mydefine.actionbar.materialdialog;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected TextView textDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        initView();
    }

    private void showDialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("对话框");
        builder.setMessage("是否确认取消");
        builder.setNegativeButton("取消", null);
        builder.setPositiveButton("确定", null);
        builder.show();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.text_dialog) {
            showDialog();
        }
    }

    private void initView() {
        textDialog = (TextView) findViewById(R.id.text_dialog);
        textDialog.setOnClickListener(MainActivity.this);
    }

}
