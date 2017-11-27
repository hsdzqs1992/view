package com.zhuye.hougong.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import com.zhuye.hougong.R;

import java.util.List;

/**
 * Created by zzzy on 2017/11/22.
 */

public class BlackNumberAdapter extends BaseRecycleAdapter {

    public BlackNumberAdapter(Context conn) {
        super(conn);
    }

    public BlackNumberAdapter(Context conn, List data) {
        super(conn, data);
    }

    @Override
    protected int getResId() {
        return R.layout.blacknumber_item;
    }

    @Override
    protected void conver(BaseHolder holder, int position) {

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }
}
