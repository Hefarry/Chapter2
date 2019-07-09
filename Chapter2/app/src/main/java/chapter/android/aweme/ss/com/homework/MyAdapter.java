package chapter.android.aweme.ss.com.homework;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import chapter.android.aweme.ss.com.homework.model.Message;
import chapter.android.aweme.ss.com.homework.widget.CircleImageView;

public class MyAdapter extends ArrayAdapter<Message> {

    private List<Message> list;
    private final int ImageId;

    public MyAdapter(Context context, int resource, List<Message> list) {
        super(context, resource, list);
        this.list = list;
        ImageId = resource;
    }


    @Override
    public View getView(int position, View convertView,ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.im_list_item, null);

        TextView title = view.findViewById(R.id.tv_title);
        TextView description = view.findViewById(R.id.tv_description);
        TextView time = view.findViewById(R.id.tv_time);
        CircleImageView head = view.findViewById(R.id.iv_avatar);
        ImageView notice = view.findViewById(R.id.robot_notice);

        title.setText(list.get(position).getTitle());
        description.setText(list.get(position).getDescription());
        time.setText(list.get(position).getTime());
        head.setImageResource(R.drawable.icon_girl);
        notice.setVisibility(View.VISIBLE);
        return view;
    }
}
