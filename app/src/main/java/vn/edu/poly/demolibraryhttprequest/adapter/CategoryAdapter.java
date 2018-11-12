package vn.edu.poly.demolibraryhttprequest.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

    }

    @Override
    public int getItemCount() {
        return hdwallpapers.size();
    }
}
