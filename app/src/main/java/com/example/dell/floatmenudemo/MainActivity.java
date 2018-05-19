package com.example.dell.floatmenudemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.dell.floatmenudemo.weight.FloatingActionsMenu;
import com.example.dell.floatmenudemo.weight.FloatingMenu;
public class MainActivity extends AppCompatActivity {
    private FloatingMenu floating;
    private FloatingActionsMenu floatingActionsMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floating =  findViewById(R.id.floating);
        initFloatingMenu();
        floatingActionsMenu = findViewById(R.id.floatingActionsMenu);
        initFloatingActionsMenu();
    }
    /**
     * 初始化浮动菜单控件
     */
    private void initFloatingMenu() {
        floating.setOnItemMenuClickListener(new FloatingMenu.OnItemMenuClickListener() {
            @Override
            public void onItemMenuClick(View view, int position) {
                Toast.makeText(MainActivity.this, "子菜单 - " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initFloatingActionsMenu(){
        floatingActionsMenu.setOnItemMenuClickListener(new FloatingActionsMenu.OnItemMenuClickListener() {
            @Override
            public void onItemMenuClick(View view, int position) {
                Toast.makeText(MainActivity.this,"子菜单："+position,Toast.LENGTH_LONG).show();
            }
        });
    }
}
