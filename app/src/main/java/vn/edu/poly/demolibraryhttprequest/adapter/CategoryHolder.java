package vn.edu.poly.demolibraryhttprequest.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import vn.edu.poly.demolibraryhttprequest.R;

class CategoryHolder extends RecyclerView.ViewHolder {


    final public ImageView imgAvatar;
    final public TextView tvTitle;

    public CategoryHolder(@NonNull View itemView) {
        super(itemView);

        imgAvatar = itemView.findViewById(R.id.imgAvatar);
        tvTitle = itemView.findViewById(R.id.tvTitle);

    }

}
