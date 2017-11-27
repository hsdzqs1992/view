package com.zhuye.hougong.view;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.zhuye.hougong.R;
import com.zhuye.hougong.adapter.jiaoyi.JiaoYiJiLvAdapter;
import com.zhuye.hougong.weidgt.MyToolBar2;

import butterknife.BindView;
import butterknife.ButterKnife;

public class JiaoYiJiLvActivity extends AppCompatActivity {

    @BindView(R.id.jiiiaoyijilv_toolbar)
    MyToolBar2 jiiiaoyijilvToolbar;
    @BindView(R.id.jiiiaoyijilv_tablayout)
    TabLayout jiiiaoyijilvTablayout;
    @BindView(R.id.jiiiaoyijilv_viewpager)
    ViewPager jiiiaoyijilvViewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jiao_yi_ji_lv);
        ButterKnife.bind(this);

        jiiiaoyijilvToolbar.titles.setText("交易记录");

        JiaoYiJiLvAdapter jiaoYiJiLvAdapter = new JiaoYiJiLvAdapter(getSupportFragmentManager());
        jiiiaoyijilvViewpager.setAdapter(jiaoYiJiLvAdapter);
        jiiiaoyijilvTablayout.setupWithViewPager(jiiiaoyijilvViewpager);

    }
}
