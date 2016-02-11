package com.example.luis.villaverde;
/**
 * Created by luis on 02/02/16.
 */


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class Adapter_main extends RecyclerView.Adapter<Adapter_main.ViewHolder>{

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView text_title;
        public TextView text_subtitle;
        public ImageView image;

        public ViewHolder(View v) {
            super(v);
            text_title = (TextView) v.findViewById(R.id.textv_title);
            text_subtitle = (TextView) v.findViewById(R.id.textv_sub);
            image = (ImageView) v.findViewById(R.id.icon_list);
            image.setImageResource(R.mipmap.ic_ford);
        }
    }


    List<Autos> autos;
    // Provide a suitable constructor (depends on the kind of dataset)
    public Adapter_main(List<Autos> autos)
    {
        this.autos=autos;
    }


    // Create new views (invoked by the layout manager)
    @Override
    public Adapter_main.ViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_main, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
      //  holder.image.setImageResource(autos.get(position).image);
        holder.text_title.setText(autos.get(position).chasis);
        holder.text_subtitle.setText(autos.get(position).modelo);

    }


    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount()
    {
        //return mDataset.length;
        return autos.size();
    }

   // @Override
    //public void onAttachedToRecyclerView(RecyclerView recyclerView) {
      //  super.onAttachedToRecyclerView(recyclerView);
    //}

}

