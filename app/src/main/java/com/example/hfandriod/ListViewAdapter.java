package com.example.hfandriod;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.data.ListItem;


import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    private ArrayList<ListItem> listData = new ArrayList<ListItem>();

    public ListViewAdapter() {
        for (int i = 0; i < 1; i++) {
            listData.add(new ListItem("10" + new Integer(i).toString(), new Integer(i).toString()));
        }

    }

    public int getCount() {
        return  listData.size();
    }

    public Object getItem(int index) {
        return getItemId(index);
    }

    public long getItemId(int index) {
        return  index;
    }

    @Override
    public View getView(int index, View view, ViewGroup parent) {
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            view = inflater.inflate(R.layout.list_item, parent, false);
        }
        ListItem item = listData.get(index);
        TextView timeView = (TextView) view.findViewById(R.id.time_view);
        TextView textView = (TextView) view.findViewById(R.id.text_view);

        timeView.setText(item.getTime());
        textView.setText(item.getText());

        return  view;
    }

}
