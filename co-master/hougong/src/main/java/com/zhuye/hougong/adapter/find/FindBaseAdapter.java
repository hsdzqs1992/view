package com.zhuye.hougong.adapter.find;

import android.content.Context;

import com.zhuye.hougong.R;
import com.zhuye.hougong.adapter.BaseRecycleAdapter;

import java.util.List;

/**
 * Created by zzzy on 2017/11/22.
 */

public abstract class FindBaseAdapter extends BaseRecycleAdapter {


    public FindBaseAdapter(Context conn) {
        super(conn);
    }

    public FindBaseAdapter(Context conn, List data) {
        super(conn, data);
    }

    @Override
    protected int getResId() {
        return R.layout.find_zuixin_item;
    }

}
