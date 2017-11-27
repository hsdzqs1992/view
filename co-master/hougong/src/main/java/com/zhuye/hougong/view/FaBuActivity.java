package com.zhuye.hougong.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.zhuye.hougong.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FaBuActivity extends AppCompatActivity {


    @BindView(R.id.fubu_content)
    EditText mFubuContent;
    @BindView(R.id.fabu_xuanze)
    TextView mFabuXuanze;
    @BindView(R.id.fabu_weizhi)
    TextView mFabuWeizhi;

    Boolean isshowlocation = true;
    @BindView(R.id.fabu_location_iv)
    ImageView mFabuLocationIv;

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
                startActivity(new Intent(FaBuActivity.this, SelectPictureActivity.class));
                break;
            case R.id.fabu_weizhi:
                if (isshowlocation) {
                    mFabuLocationIv.setBackgroundResource(R.drawable.check_off);

                }else{
                    mFabuLocationIv.setBackgroundResource(R.drawable.check_on);
                }
                isshowlocation = !isshowlocation;
                break;
        }
    }
}
