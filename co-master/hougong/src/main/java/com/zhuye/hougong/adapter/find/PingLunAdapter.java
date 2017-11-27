package com.zhuye.hougong.adapter.find;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import com.zhuye.hougong.R;
import com.zhuye.hougong.adapter.BaseHolder;
import com.zhuye.hougong.adapter.BaseRecycleAdapter;

import java.util.List;

/**
 * Created by zzzy on 2017/11/22.
 */

public class PingLunAdapter extends BaseRecycleAdapter {

    public PingLunAdapter(Context conn) {
        super(conn);
    }

    public PingLunAdapter(Context conn, List data) {
        super(conn, data);
    }

    @Override
    protected int getResId() {
        return R.layout.find_pinglun_rv_item;
    }

    @Override
    protected void conver(BaseHolder holder, int position) {

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }
}
