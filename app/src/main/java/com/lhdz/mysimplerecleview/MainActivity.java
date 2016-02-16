package com.lhdz.mysimplerecleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecycle;
    private RecyclerView.LayoutManager mLayoutManager;
    private static Map<String, String> list;
    private List<Map<String, String>> coll = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        mRecycle.setAdapter(new GridRecAdapter(this, coll));

    }


    private void initView() {
        mRecycle = (RecyclerView) findViewById(R.id.recycleview);
//        mLayoutManager = new GridLayoutManager(this,4);//构造中使用的是线性垂直布局
        mLayoutManager = new StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL);//瀑布流
        mRecycle.setLayoutManager(mLayoutManager);

        //如果可以确定每个item的高度是固定的，设置这个选项可以提高性能
        mRecycle.setHasFixedSize(true);
        //为recycleview添加分隔线
        mRecycle.addItemDecoration(new DividerGridItemDecoration(this));
    }

    private void initData() {

        for (int i = 'A'; i < 'Z'; i++) {
            list = new HashMap<>();
            list.put("k", "" + (char) i);
            list.put("j", "2" + (char) i);
            coll.add(list);
        }


    }


}
