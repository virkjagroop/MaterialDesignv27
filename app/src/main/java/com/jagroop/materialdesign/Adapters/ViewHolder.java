package com.jagroop.materialdesign.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jagroop.materialdesign.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHolder extends RecyclerView.ViewHolder {

    public CircleImageView image_recycler;
    public TextView name_recycler, description_recycler;
    public LinearLayout linearLayout_recycler;

    public ViewHolder(View itemView) {
        super(itemView);

        image_recycler = itemView.findViewById(R.id.image_recycler);
        name_recycler = itemView.findViewById(R.id.name_recycler);
        description_recycler = itemView.findViewById(R.id.description_recycler);
        linearLayout_recycler = itemView.findViewById(R.id.linearLayout_recycler);
    }
}
