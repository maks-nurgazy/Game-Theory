package com.luv2code.gametheory;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class TopicViewHolder extends ChildViewHolder {
    private TextView mTextView;
    private TextView topic_video;
    private TextView topic_link;

    public TopicViewHolder(View itemView) {
        super(itemView);
        mTextView = itemView.findViewById(R.id.textView);
        topic_video = itemView.findViewById(R.id.topic_video);
        topic_link = itemView.findViewById(R.id.topic_link);
    }

    public void bind(Topic topic){
        mTextView.setText(topic.name);
        topic_video.setText(topic.video);
        topic_link.setText(topic.link);
    }
}
