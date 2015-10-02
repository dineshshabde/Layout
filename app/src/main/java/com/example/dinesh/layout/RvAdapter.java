package com.example.dinesh.layout;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by dinesh on 02/10/15.
 * An Adapter which is used to bind data and custom view which is going to get populated in recycler view.
 */
public class RvAdapter extends RecyclerView.Adapter<RvAdapter.ViewHolder> {
    private String[] stringData;

    public RvAdapter(String[] stringData) {
        this.stringData = stringData;
    }

    @Override
    public void onBindViewHolder(RvAdapter.ViewHolder viewHolder, int i) {
        viewHolder.textView.setText(this.stringData[i]);
    }

    @Override
    public RvAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv_custom_row, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public int getItemCount() {
        return this.stringData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.txtHolder);
        }
    }
}
