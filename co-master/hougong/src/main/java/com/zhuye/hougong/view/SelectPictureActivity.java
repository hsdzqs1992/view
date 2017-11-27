package com.zhuye.hougong.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.zhuye.hougong.R;
import com.zhuye.hougong.weidgt.MyToolBar2;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SelectPictureActivity extends AppCompatActivity {

    @BindView(R.id.select_photo)
    ImageView mSelectPhoto;
    @BindView(R.id.select_touxiang)
    ImageView mSelectTouxiang;
    @BindView(R.id.select_qite)
    ImageView mSelectQite;
    @BindView(R.id.select_toolbar)
    MyToolBar2 mSelectToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_picture);
        ButterKnife.bind(this);
        mSelectToolbar.titles.setText("我的相册");
    }

    @OnClick(R.id.select_photo)
    public void onViewClicked() {


    }
}
