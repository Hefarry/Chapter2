package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e2);

        TextView textView = findViewById(R.id.textView);

        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.activity_e2,null);

        textView.setText("一共有"+getViewCount(view)+"个view");
    }

    public static int getViewCount(View view) {
        //todo 补全你的代码
        int count = 0;
        if(view != null){
            if(view instanceof ViewGroup){
                count++;
                for(int i = 0;i < ((ViewGroup)view).getChildCount();i++){
                    View childView = ((ViewGroup)view).getChildAt(i);
                    if(childView instanceof ViewGroup){
                        count += getViewCount(childView);
                    }
                    else{
                        count++;
                    }
                }
            }
            else{
                count++;
            }
            return count;
        }
        else{
            return 0;
        }
    }
}
