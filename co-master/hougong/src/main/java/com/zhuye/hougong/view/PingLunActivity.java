package com.zhuye.hougong.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.cjj.MaterialRefreshLayout;
import com.zhuye.hougong.R;
import com.zhuye.hougong.adapter.find.PingLunAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PingLunActivity extends AppCompatActivity {


    @BindView(R.id.commot_recycle)
    RecyclerView commotRecycle;
    @BindView(R.id.common_material)
    MaterialRefreshLayout commonMaterial;
    @BindView(R.id.pinglun)
    TextView pinglun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_recycle3);
        ButterKnife.bind(this);


        List list = new ArrayList();
        for (int i = 0; i < 3; i++) {
            list.add("sdfasdf" + i);
        }
        PingLunAdapter pingLunAdapter = new PingLunAdapter(this, list);
        commotRecycle.setAdapter(pingLunAdapter);
        commotRecycle.setLayoutManager(new LinearLayoutManager(this));
    }

    @OnClick(R.id.pinglun)
    public void onViewClicked() {
        startActivity(new Intent(PingLunActivity.this,FaBuActivity.class));

    }
}
