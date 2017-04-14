package com.example.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityFirst extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button1 = (Button) findViewById(R.id.button_1);
        //获取按钮的实例,然后用Button向下转型 将获取的View对象专程Button对象。
        button1.setOnClickListener(new View.OnClickListener() {
            //获取按钮实例后，调用方法注册一个监听器
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityFirst.this, "You clicked Button 1", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ActivityFirst.this,ActivitySecond.class);
                //显示intent 构造新intent的  第一个参数 提供启动活动的上下文，第二个参数 指定想要启动的目标活动
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        //得到inflater对象，再调用inflate方法创建菜单。inflate方法两个参数，第一个用于指定通过哪一个资源文件创建菜单，第二个用于指定菜单项将添加到哪一个Munu对象中。
        return true; //true代表菜单将显示
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this,"you clicked Add",Toast.LENGTH_LONG).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"you clicked Remove",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
}