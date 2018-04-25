package com.example.administrator.fragmentbestdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2018/4/25 0025.
 */

public class NewsContentFragment extends Fragment{

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.news_content_frag,container,false);
        return view;
    }

    public  void  refresh(String newsTitle,String newsContent)
    {
        View view1 = view.findViewById(R.id.visible_layout);
        view1.setVisibility(View.VISIBLE);
        TextView newsTitleText = (TextView) view.findViewById(R.id.title);
        TextView newsContentText = (TextView) view.findViewById(R.id.content);
        newsTitleText.setText(newsTitle);
        newsContentText.setText(newsContent);
    }
}
