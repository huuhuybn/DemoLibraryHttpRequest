package vn.edu.poly.demolibraryhttprequest.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.List;

import vn.edu.poly.demolibraryhttprequest.R;
import vn.edu.poly.demolibraryhttprequest.model.HDWALLPAPER;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryHolder> {

    private Context context;
    private List<HDWALLPAPER> hdwallpapers;

    public CategoryAdapter(Context context, List<HDWALLPAPER> hdwallpapers) {
        this.context = context;
        this.hdwallpapers = hdwallpapers;
    }

    @NonNull
    @Override
    public CategoryHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.from(context).inflate(R.layout.item_category,
                viewGroup, false);
        return new CategoryHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull CategoryHolder categoryHolder, int i) {

        HDWALLPAPER hdwallpaper = hdwallpapers.get(i);

        categoryHolder.tvTitle.setText(hdwallpaper.getCategoryName());

        Glide.with(context).load(hdwallpaper.getCategoryImage()).into(categoryHolder.imgAvatar);

        categoryHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    @Override
    public int getItemCount() {
        return hdwallpapers.size();
    }
}
