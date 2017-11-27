package com.zhuye.hougong.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cjj.MaterialRefreshLayout;
import com.zhuye.hougong.R;
import com.zhuye.hougong.adapter.me.WhoSendAdapter;
import com.zhuye.hougong.weidgt.MyToolBar2;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WhoSendLiWuActivity extends AppCompatActivity {

    @BindView(R.id.common_toolbar)
    MyToolBar2 commonToolbar;
    @BindView(R.id.commot_recycle)
    RecyclerView commotRecycle;
    @BindView(R.id.common_material)
    MaterialRefreshLayout commonMaterial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_recycle2);
        ButterKnife.bind(this);
        commonToolbar.titles.setText("谁送过礼物");

        List list = new ArrayList();
        for (int i = 0; i < 3; i++) {
            list.add("sdfasdf" + i);
        }

        WhoSendAdapter whoSendAdapter = new WhoSendAdapter(this, list);

        commotRecycle.setAdapter(whoSendAdapter);
        commotRecycle.setLayoutManager(new LinearLayoutManager(this));
    }
}
