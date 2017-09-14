package com.example.simon.mycustomrecycleview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Simon on 9/14/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.AndroidViewholder>{
    ArrayList<AndroidVersion> androidVersionArrayList;

    public CustomAdapter(ArrayList<AndroidVersion> androidVersionArrayList) {
        this.androidVersionArrayList = androidVersionArrayList;
    }

    @Override
    public AndroidViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.row_layout, parent, false);
        AndroidViewholder androidViewholder = new AndroidViewholder(v);

        return androidViewholder;

    }

    @Override
    public void onBindViewHolder(AndroidViewholder holder, int i) {
        AndroidVersion version = androidVersionArrayList.get(i);
        holder.logo.setImageResource(version.getLogo());
        holder.api.setText(version.getApi());
        holder.codename.setText(version.getCodename());
        holder.date.setText(version.getDate());
        holder.version.setText(version.getVersion());


    }

    @Override
    public int getItemCount() {
        return androidVersionArrayList.size();
    }

    public static class AndroidViewholder extends RecyclerView.ViewHolder{
        ImageView logo;
        TextView codename, version, api, date;

        public AndroidViewholder(View v) {
            super(v);
            logo = (ImageView) v.findViewById(R.id.id_Logo);
            codename = (TextView) v.findViewById(R.id.tv_Codename);
            version = (TextView) v.findViewById(R.id.tv_Version);
            api = (TextView) v.findViewById(R.id.tv_Api);
            date = (TextView) v.findViewById(R.id.tv_Date);

        }
    }
}
