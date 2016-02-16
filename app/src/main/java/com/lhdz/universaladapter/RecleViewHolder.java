package com.lhdz.universaladapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by 李南 on 2016/2/16  11:54
 * Email:fengyunzhinan@163.com
 */
public class RecleViewHolder extends RecyclerView.ViewHolder {
    private ViewHolder viewHolder;
    public RecleViewHolder(View itemView,int[] viewId) {
        super(itemView);
        viewHolder=ViewHolder.getViewHolder(itemView);
        for(int id:viewId){
            viewHolder.get(id);
        }


    }
    public ViewHolder getViewHolder() {
        return viewHolder;
    }
}
