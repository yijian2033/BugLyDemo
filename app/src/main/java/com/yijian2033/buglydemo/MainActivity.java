package com.yijian2033.buglydemo;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.tv);
        String versionName = BuildConfig.VERSION_NAME;
        tv.setText("当前版本：" + versionName);
        Toast.makeText(this, "这是更新后的++++++++++++++++++++++++++++++++", Toast.LENGTH_SHORT).show();
    }
}
