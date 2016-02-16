package com.lhdz.universaladapter;

import android.util.SparseArray;
import android.view.View;

/**
 * Created by 李南 on 2016/2/16  11:39
 * Email:fengyunzhinan@163.com
 */
public class ViewHolder {
    private SparseArray<View> viewArray;
    private View view;

    public static ViewHolder getViewHolder(View view) {
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder == null) {
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }
        return viewHolder;
    }

    private ViewHolder(View view) {
        this.view = view;
        viewArray = new SparseArray<>();
        view.setTag(viewArray);
    }

    public <T extends View> T get(int id) {
        View childView = viewArray.get(id);
        if (childView == null) {
            childView = view.findViewById(id);
            viewArray.put(id, childView);
        }
        return (T) childView;
    }


    public <T> T getView(Class<T> clazz, int key) {
        return (T) this.viewArray.get(key);

    }


}
