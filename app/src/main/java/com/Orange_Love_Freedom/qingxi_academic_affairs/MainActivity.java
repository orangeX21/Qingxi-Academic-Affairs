package com.Orange_Love_Freedom.qingxi_academic_affairs;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageButton;
public class MainActivity extends AppCompatActivity {
    private ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton = findViewById(R.id.png);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = new String("http://www.i-free.link");
                Intent ImageButton_com = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                startActivity(ImageButton_com);

            }
        });
    }
}