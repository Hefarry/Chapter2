package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 作业1：
 * 打印出Activity屏幕切换 Activity会执行什么生命周期？
 */
public class Exercises1 extends AppCompatActivity {


    private static String TAG = Exercises1.class.getSimpleName();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
    }

    @Override protected void onDestroy() {
        Log.d(TAG, "onDestroy");
        super.onDestroy();
    }

    @Override protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

}
