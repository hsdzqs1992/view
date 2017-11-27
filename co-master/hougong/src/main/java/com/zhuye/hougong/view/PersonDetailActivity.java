package com.zhuye.hougong.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;
import com.zhuye.hougong.R;
import com.zhuye.hougong.base.BaseActivity;
import com.zhuye.hougong.bean.PersonInfoBean;
import com.zhuye.hougong.contants.Contants;
import com.zhuye.hougong.utils.CommentUtils;
import com.zhuye.hougong.utils.SpUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by zzzy on 2017/11/21.
 */

public class PersonDetailActivity extends BaseActivity {
    @BindView(R.id.person_detail_back)
    ImageView personDetailBack;
    @BindView(R.id.mywalot_zhuanqian)
    TextView mywalotZhuanqian;
    @BindView(R.id.mywalot_qianbao)
    TextView mywalotQianbao;
    @BindView(R.id.person_go)
    ImageView personGo;
    //名字
    @BindView(R.id.person_name)
    TextView personName;
    @BindView(R.id.person_age)
    TextView personAge;
    @BindView(R.id.person_xingzuo)
    TextView personXingzuo;
    @BindView(R.id.person_zone)
    TextView personZone;
    @BindView(R.id.person_jibie)
    TextView personJibie;
    @BindView(R.id.person_detail_touxiang)
    ImageView personDetailTouxiang;
    @BindView(R.id.person_btn_nv)
    RadioButton personBtnNv;
    @BindView(R.id.person_btn_nan)
    RadioButton personBtnNan;

    @Override
    protected int getResId() {
        return R.layout.activity_person_detail;
    }

    @Override
    protected void initview() {
        super.initview();


        String token = SpUtils.getString(this, "token", "");
        //获取个人信息
        OkGo.<String>post(Contants.information)
                .params("token", token)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        CommentUtils.toast(PersonDetailActivity.this, response.body());
                        Log.i("---------", response.body());
                        Gson gson = new Gson();
                        PersonInfoBean personInfoBean = gson.fromJson(response.body(), PersonInfoBean.class);
                        if (response.body().contains("200")) {

                            personName.setText(personInfoBean.getData().getNickname());
                            personAge.setText(personInfoBean.getData().getCity() + "sdfa");
                            personXingzuo.setText(personInfoBean.getData().getCon()+"老虎");
                            personZone.setText(personInfoBean.getData().getCity()+"老虎");
                            personJibie.setText(personInfoBean.getData().getLevel()+"平");
                            if(personInfoBean.getData().getSex().contains("0")){
                                personBtnNan.setChecked(true);
                                personBtnNv.setChecked(false);
                            }else{
                                personBtnNan.setChecked(false);
                                personBtnNv.setChecked(true);
                            }
                        } else {

                        }
//                        if (personInfoBean.getCode().equals("200")) {
//                                int a = 0;
//                        } else {
//
//                        }

                    }

                    @Override
                    public void onError(Response<String> response) {
                        super.onError(response);
                    }
                });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick(R.id.person_detail_back)
    public void onViewClicked() {
        finish();
    }
}
