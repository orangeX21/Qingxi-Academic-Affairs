package com.Orange_Love_Freedom.qingxi_academic_affairs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        Button loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (isValidUser(username, password)) {
                    // 登录成功
                    Toast.makeText(MainActivity2.this, "登录成功", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                    startActivity(intent);
                    // 进行进一步的操作，例如导航到其他界面
                } else {
                    // 登录失败
                    Toast.makeText(MainActivity2.this, "登录失败，请检查用户名和密码", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

    private boolean isValidUser(String username, String password) {
        // 请求教务处 网址  验证用户名和密码是否匹配
        // 在这里实现用户验证逻辑，例如检查用户名和密码是否匹配
        // 返回 true 表示验证成功，返回 false 表示验证失败
        // 这里只是一个示例，实际中需要替换为真实的验证逻辑
        return !username.isEmpty() && !password.isEmpty();
    }
}
