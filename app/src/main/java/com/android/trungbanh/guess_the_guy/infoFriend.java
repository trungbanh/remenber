package com.android.trungbanh.guess_the_guy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class infoFriend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_friend);

        ArrayList<Friend> friendList = new ArrayList<>() ;
        friendList.add(new Friend("Bành Phước Trung","0127-xxx-yyyy","code culi","vui tính cute"));
        friendList.add(new Friend("Đổ Minh Tâm","0126-xyx-yxyy","code chỉ đạo","cool ngầu"));
        friendList.add(new Friend("Đỗ Thành Hậu","0127-zxz-hhss","code Leader","Chuyên nghiệp nhe"));

        Intent intent = getIntent();

        int p = intent.getIntExtra("stt",0);
        TextView name = findViewById(R.id.tv_name);
        TextView sdt = findViewById(R.id.tv_sdt);
        TextView congviec = findViewById(R.id.tv_congviec);
        TextView them = findViewById(R.id.tv_them);

        name.setText(friendList.get(p).name);
        sdt.setText(friendList.get(p).sdt);
        congviec.setText(friendList.get(p).conviec);
        them.setText(friendList.get(p).ghi_chu);


    }
}
