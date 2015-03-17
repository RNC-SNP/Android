package com.example.rincliu.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by RincLiu on 3/17/15.
 */
public class MyAdapter extends RecyclerView.Adapter {

    private Context context;

    private ArrayList<Data> dataSet;

    public MyAdapter(Context context, ArrayList<Data> dataSet) {
        this.context = context;
        this.dataSet = dataSet;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        public MyViewHolder(View v)
        {
            super(v);
        }
        ImageView iv;
        TextView tvPlatform, tvLang;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = null;
        LayoutInflater inflater = LayoutInflater.from(context);
        switch(viewType){
            case 0:
                v = inflater.inflate(R.layout.view_holder_layout_0, null);
                break;
            case 1:
                v = inflater.inflate(R.layout.view_holder_layout_1, null);
                break;
        }
        MyViewHolder vh = new MyViewHolder(v);
        vh.iv = (ImageView) v.findViewById(R.id.iv);
        vh.tvPlatform = (TextView) v.findViewById(R.id.tv_platform);
        vh.tvLang = (TextView) v.findViewById(R.id.tv_lang);
        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        Data data = dataSet.get(position);
        MyViewHolder vh = (MyViewHolder) viewHolder;
        vh.iv.setImageDrawable(context.getResources().getDrawable(R.mipmap.ic_launcher));
        vh.tvPlatform.setText(data.getPlatform());
        vh.tvLang.setText(data.getLang());
    }

    @Override
    public int getItemViewType(int position) {
        return dataSet.get(position).getType();
    }

    @Override
    public int getItemCount() {
        return dataSet != null ? dataSet.size() : 0;
    }
}
