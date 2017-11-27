package com.zhuye.hougong.adapter.jiaoyi;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.zhuye.hougong.base.BaseFragment;
import com.zhuye.hougong.fragment.jiaoyi.CommotFaragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzzy on 2017/11/22.
 */

public class ShouZhiJiLvAdapter extends FragmentStatePagerAdapter {


    private List<String> titles = new ArrayList<>();
    private List<BaseFragment> fargments = new ArrayList<>();
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    public ShouZhiJiLvAdapter(FragmentManager fm) {
        super(fm);
        titles.add("收入记录");
        titles.add("支出记录");

        fargments.add(new CommotFaragment());
        fargments.add(new CommotFaragment());
    }

    @Override
    public Fragment getItem(int position) {
        return fargments.get(position);
    }

    @Override
    public int getCount() {
        return titles.size();
    }
}
