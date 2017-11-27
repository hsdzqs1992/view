package com.zhuye.hougong.fragment;

import android.graphics.Color;
import android.support.v4.view.ViewPager;

import com.zhuye.hougong.R;
import com.zhuye.hougong.adapter.MessagePagerAdapter2;
import com.zhuye.hougong.base.BaseFragment;
import com.zhuye.hougong.weidgt.PagerSlidingTabStrip;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzzy on 2017/11/20.
 */

public class MessageFragment extends BaseFragment {

    private ViewPager mviewpager;
    private List<String> titles = new ArrayList<>();

    private PagerSlidingTabStrip mTabStrip;
    //private TabLayout tabLayout;
    @Override
    protected void initView() {

        mviewpager = rootView.findViewById(R.id.message_viewpager);
        mTabStrip = rootView.findViewById(R.id.tab_strip_message);

        mTabStrip=rootView.findViewById(R.id.tab_strip_message);
        mTabStrip.setTextColorResource(R.color.white);
        mTabStrip.setIndicatorColorResource(R.color.white);
        mTabStrip.setDividerColor(Color.TRANSPARENT);
        mTabStrip.setTextSelectedColorResource(R.color.white);
        mTabStrip.setTextSize(getResources().getDimensionPixelSize(R.dimen.h8));
        mTabStrip.setTextSelectedSize(getResources().getDimensionPixelSize(R.dimen.h10));
        mTabStrip.setUnderlineHeight(1);
        titles.add("消息");
        titles.add("通话");
        MessagePagerAdapter2 messagePagerAdapter2 = new MessagePagerAdapter2(getActivity());
        mviewpager.setAdapter(messagePagerAdapter2);
        //messagePagerAdapter2.initView();
        mTabStrip.setViewPager(mviewpager);
       // mTabStrip.setViewPager(mviewpager);
    }

    @Override
    protected int getResId() {
        return R.layout.fragment_message;
    }

    @Override
    protected void initData() {
        super.initData();
//        mviewpager.setAdapter(new MessagePagerAdapter2(getActivity(),titles));
//        tabLayout.setupWithViewPager(mviewpager);
    }
}
