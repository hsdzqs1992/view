package com.zhuye.hougong.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.cjj.MaterialRefreshLayout;
import com.zhuye.hougong.R;
import com.zhuye.hougong.adapter.BlackNumberAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BlackNumberActivity extends AppCompatActivity {


    @BindView(R.id.commot_recycle)
    RecyclerView commotRecycle;
    @BindView(R.id.common_material)
    MaterialRefreshLayout commonMaterial;
    @BindView(R.id.person_detail_back)
    ImageView mPersonDetailBack;
    @BindView(R.id.mywalot_zhuanqian)
    TextView mMywalotZhuanqian;
    @BindView(R.id.mywalot_qianbao)
    TextView mMywalotQianbao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_recycle2);
        ButterKnife.bind(this);


        List list = new ArrayList();
        for (int i = 0; i < 3; i++) {
            list.add("sdfasdf" + i);
        }

        mMywalotQianbao.setText("黑名单");
        BlackNumberAdapter blackNumberAdapter = new BlackNumberAdapter(this, list);

        commotRecycle.setAdapter(blackNumberAdapter);
        commotRecycle.setLayoutManager(new LinearLayoutManager(this));
    }

    @OnClick(R.id.person_detail_back)
    public void onViewClicked() {
        finish();
    }
}
