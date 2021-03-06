package com.example.android.ite20;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

class RecyclerViewHolder extends RecyclerView.ViewHolder {
    public ImageView pic;


    public RecyclerViewHolder(View itemView) {
        super(itemView);
        pic = (ImageView) itemView.findViewById(R.id.imageBlueBits);

    }


    static class Recycle_Adapter_Blue_Bits extends RecyclerView.Adapter<RecyclerViewHolder> {
        public Recycle_Adapter_Blue_Bits(ArrayList<Integer> ListBlue, Context context) {
            this.ListBlue = ListBlue;
            this.context = context;
        }

        private ArrayList<Integer> ListBlue ;
        private Context context;

        @Override
        public RecyclerViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View itemView = inflater.inflate(R.layout.blue_bits_resourse, parent, false);
            return new RecyclerViewHolder(itemView);
        }


        @Override
        public void onBindViewHolder( RecyclerViewHolder holder, int position) {

            holder.pic.setImageResource((ListBlue.get(position)));


        }

        @Override
        public int getItemCount() {
            return ListBlue.size();
        }
    }
}