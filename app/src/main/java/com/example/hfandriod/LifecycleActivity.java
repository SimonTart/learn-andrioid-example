package com.example.hfandriod;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class LifecycleActivity extends AppCompatActivity {

    private String lifecycle = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        addLifecycle("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        addLifecycle("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        addLifecycle("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        addLifecycle("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        addLifecycle("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        addLifecycle("onDestroy");
    }

    public void addLifecycle(String life) {
        if (lifecycle.equals("")) {
            lifecycle = lifecycle + life;
        } else {
            lifecycle = lifecycle + " -> " +  life;
        }

        updateLifecycle();
    }

    public void updateLifecycle() {
        TextView textView = findViewById(R.id.lifecycle);
        textView.setText(lifecycle);
    }

    public void clear(View view) {
        lifecycle = "";
        updateLifecycle();
    }

    public void showNormalDialog(View view){
        //创建dialog构造器
        AlertDialog.Builder normalDialog = new AlertDialog.Builder(this);
        //设置title
        normalDialog.setTitle("弹窗");
        //设置icon

        //设置按钮
//        normalDialog.setPositiveButton(getString("确定")
//                , new DialogInterface().OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(DialogActivity.this,getString(R.string.dialog_btn_confirm_hint_text)
//                                ,Toast.LENGTH_SHORT).show();
//                        dialog.dismiss();
//                    }
//                });
        //创建并显示
        normalDialog.create().show();
    }

    public void enterScrollActivity(View view) {
        Intent intent = new Intent(this, ScrollActivity.class);
        startActivity(intent);
    }

}
