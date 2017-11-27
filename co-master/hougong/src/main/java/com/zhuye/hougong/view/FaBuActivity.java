package com.zhuye.hougong.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.zhuye.hougong.R;
import com.zhuye.hougong.weidgt.MyToolBar2;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FaBuActivity extends AppCompatActivity {

    @BindView(R.id.fabu_toolbar)
    MyToolBar2 mFabuToolbar;
    @BindView(R.id.fubu_content)
    EditText mFubuContent;
    @BindView(R.id.fabu_xuanze)
    TextView mFabuXuanze;
    @BindView(R.id.fabu_weizhi)
    TextView mFabuWeizhi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fa_bu);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.fabu_xuanze, R.id.fabu_weizhi})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.fabu_xuanze:
                startActivity(new Intent(FaBuActivity.this,SelectPictureActivity.class));
                break;
            case R.id.fabu_weizhi:
                break;
        }
    }
}
