package com.example.student.tvk_cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTentk, editPass;
    CheckBox checkLuu;
    Button btndangnhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTentk = (EditText)findViewById(R.id.User);
        editPass = (EditText)findViewById(R.id.Password);
        btndangnhap = (Button)findViewById(R.id.Commit);
        checkLuu = (CheckBox)findViewById(R.id.Checked);
        btndangnhap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(checkLuu != null)
                    Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu",Toast.LENGTH_LONG);
                else
                    Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu", Toast.LENGTH_LONG);
            }
        });
    }
}
