package com.lhdz.mysimplerecleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.lhdz.universaladapter.RecycleViewBaseAdapter;
import com.lhdz.universaladapter.ViewHolder;

import java.util.List;
import java.util.Map;

/**
 * Created by 李南 on 2016/2/16  12:54
 * Email:fengyunzhinan@163.com
 */
public class GridRecAdapter extends RecycleViewBaseAdapter {
    private List<Map<String ,String>>lst;
    public GridRecAdapter(Context context, List lst) {
        super(context, lst);
        this.lst=lst;
    }

    @Override
    public int[] getFindViewByIds() {
        return new int[]{R.id.tv,R.id.tv2};
    }

    @Override
    public View getLayout() {
        View v= LayoutInflater.from(mContext).inflate(R.layout.recycleadapter,null);
        return v;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
//        String str_data= (String)this. getItemSingle(position);

       holder.getView(TextView.class,R.id.tv).setText(lst.get(position).get("k"));
        holder.getView(TextView.class, R.id.tv2).setText(lst.get(position).get("j").toString());
    }


}
