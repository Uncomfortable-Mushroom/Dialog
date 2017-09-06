package com.example.lenovo.myapplication;

import android.content.DialogInterface;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AlertDialogLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class hello extends AppCompatActivity implements View.OnClickListener {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        Button button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2=(Button) findViewById(R.id.button1);
        button2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.button1:
              show1();
                break;
            case R.id.button2:
              show2();
                break;
            default:
                break;
        }
    }
    public void show1(){
        final AlertDialog.Builder dialog
                =new AlertDialog.Builder(hello.this);
        dialog.setTitle("提示信息");
        dialog.setMessage("请单击登录按钮");
        dialog.setCancelable(true);
        dialog.setPositiveButton("确定",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog,int which){
            }
        });
        dialog.show();
    }
    public void show2(){
        final AlertDialog.Builder builder
                =new AlertDialog.Builder(hello.this);
        LayoutInflater inflater=getLayoutInflater();
        View view=inflater.inflate(R.layout.activity_hello,null);
        builder.setTitle("登录界面");
        builder.setView(view);
        builder.setPositiveButton("登陆",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface builder,int which){

            }
        });
        builder.show();


    }
}
