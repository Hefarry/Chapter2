package chapter.android.aweme.ss.com.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class MsgActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_msg);

        Intent intent = this.getIntent();
        int position = intent.getIntExtra("position", -1);

        TextView textView = findViewById(R.id.tv_content_info);
        textView.setText("这是第"+position+"个item！");

    }
}
