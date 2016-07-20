package com.getbase.nestedscrollingchilddemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wsl on 16-7-20.
 */
public class TestAdapter extends RecyclerView.Adapter{

    private List<String> data;

    public TestAdapter() {

    }
    public TestAdapter(List<String> list) {
        data = new ArrayList<>();
        if(list != null && !list.isEmpty()) {
            data.addAll(list);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_test, parent, false);
        return new VHItem(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof VHItem) {
            String text = getItem(position);
            VHItem vhItem = (VHItem) holder;
            vhItem.text.setText(text);
        }
    }

    private String getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class VHItem extends RecyclerView.ViewHolder {

        TextView text;

        public VHItem(View view) {
            super(view);
            text = (TextView) view.findViewById(R.id.text);
        }
    }
}