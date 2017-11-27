package com.zhuye.hougong.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;
import com.zhuye.hougong.R;
import com.zhuye.hougong.bean.MessageEvent;
import com.zhuye.hougong.contants.Contants;
import com.zhuye.hougong.http.MyCallback;
import com.zhuye.hougong.utils.CommentUtils;
import com.zhuye.hougong.utils.SpUtils;
import com.zhuye.hougong.weidgt.MyToolBar2;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SettingsActivity extends AppCompatActivity {


    @BindView(R.id.setting_toobar)
    MyToolBar2 settingToobar;
    @BindView(R.id.stting_bangding)
    ImageView sttingBangding;
    @BindView(R.id.stting_heimingdan)
    ImageView sttingHeimingdan;
    @BindView(R.id.stting_yinsehn)
    ImageView sttingYinsehn;
    @BindView(R.id.stting_feedback)
    ImageView sttingFeedback;
    @BindView(R.id.setting_qingchu)
    TextView settingQingchu;
    @BindView(R.id.setting_qingchuhuancun)
    TextView settingQingchuhuancun;
    @BindView(R.id.stting_guanyu)
    ImageView sttingGuanyu;
    @BindView(R.id.setting_logout)
    RelativeLayout settingLogout;

    private int yinshen = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.stting_bangding, R.id.stting_heimingdan, R.id.stting_yinsehn, R.id.stting_feedback, R.id.setting_qingchu, R.id.setting_qingchuhuancun, R.id.stting_guanyu, R.id.setting_logout})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.stting_bangding:
                break;
            case R.id.stting_heimingdan:
                startActivity(new Intent(SettingsActivity.this,BlackNumberActivity.class));
                break;
            case R.id.stting_yinsehn:
                if (yinshen == 1) {
                    yinshen = 2;
                }else if (yinshen ==2){
                yinshen = 1;
            }
                onYinShen();
                break;
            case R.id.stting_feedback:
                startActivity(new Intent(SettingsActivity.this,FeedBackActivity.class));
                break;
            case R.id.setting_qingchu:
                break;
            case R.id.setting_qingchuhuancun:
                break;
            case R.id.stting_guanyu:
                break;
            case R.id.setting_logout:
                logout();
                break;
        }
   }

    private void logout(){

        OkGo.<String>post(Contants.logout)
                .params("token",SpUtils.getString(SettingsActivity.this,"token",""))
                .execute(new MyCallback() {
                    @Override
                    protected void doFailue() {
                        CommentUtils.toast(SettingsActivity.this,"退出失败");
                    }
                    @Override
                    protected void excuess(Response<String> response) {
                        SpUtils.setString(SettingsActivity.this,"token","");
                        CommentUtils.toast(SettingsActivity.this,"退出成功");
                        EventBus.getDefault().post(new MessageEvent());
                    }
                });


//        SpUtils.setString(SettingsActivity.this,"token","");
//        CommentUtils.toast(SettingsActivity.this,"退出成功");
    }

    //处理隐身的逻辑
    private void onYinShen() {
        OkGo.<String>post(Contants.stealth)
                .params("token", SpUtils.getString(SettingsActivity.this,"token",""))
                .params("type",yinshen + "")
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        if (response.body().contains("200")){
                            CommentUtils.toast(SettingsActivity.this,"chenggong");
                        }
                    }

                    @Override
                    public void onError(Response<String> response) {
                        super.onError(response);
                        CommentUtils.toast(SettingsActivity.this,"chenggong");
                    }
                });

    }
}
