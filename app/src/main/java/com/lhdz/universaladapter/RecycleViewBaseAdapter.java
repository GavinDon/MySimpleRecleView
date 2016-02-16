package com.lhdz.universaladapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by 李南 on 2016/2/16  11:55
 * Email:fengyunzhinan@163.com
 */
public abstract class RecycleViewBaseAdapter<TItem> extends RecyclerView.Adapter<RecleViewHolder> {
    protected Context mContext;
    private List<TItem> lst;
    View view;

    public RecycleViewBaseAdapter(Context context, List<TItem> lst) {
        this.mContext = context;
        this.lst = lst;
    }

    public abstract int[] getFindViewByIds();

    public abstract View getLayout();

    public abstract void onBindViewHolder(ViewHolder holder, int position);

    public TItem getItemSingle(int position) {
        return lst.get(position);
    }

    @Override
    public RecleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = getLayout();
        return new RecleViewHolder(view, getFindViewByIds());
    }

    @Override
    public void onBindViewHolder(RecleViewHolder holder, int position) {
        onBindViewHolder(holder.getViewHolder(), position);


    }

    @Override
    public int getItemCount() {
        return lst.size();
    }
}
