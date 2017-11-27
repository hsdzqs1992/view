package com.zhuye.hougong.view;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.zhuye.hougong.R;
import com.zhuye.hougong.adapter.jiaoyi.ShouZhiJiLvAdapter;
import com.zhuye.hougong.weidgt.MyToolBar2;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShouZhiJiLvActivity extends AppCompatActivity {

    @BindView(R.id.shouzhiyijilv_toolbar)
    MyToolBar2 shouzhiyijilvToolbar;
    @BindView(R.id.shouzhiyijilv_tablayout)
    TabLayout shouzhiyijilvTablayout;
    @BindView(R.id.shouzhiyijilv_viewpager)
    ViewPager shouzhiyijilvViewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shou_zhi_ji_lv);
        ButterKnife.bind(this);

        shouzhiyijilvToolbar.titles.setText("收支记录");
        ShouZhiJiLvAdapter jiaoYiJiLvAdapter = new ShouZhiJiLvAdapter(getSupportFragmentManager());
        shouzhiyijilvViewpager.setAdapter(jiaoYiJiLvAdapter);
        shouzhiyijilvTablayout.setupWithViewPager(shouzhiyijilvViewpager);
    }
}
