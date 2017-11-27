package com.zhuye.hougong.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;
import com.zhuye.hougong.R;
import com.zhuye.hougong.adapter.me.MeBottomAdapter;
import com.zhuye.hougong.bean.MessageEvent;
import com.zhuye.hougong.bean.PersonInfoBean;
import com.zhuye.hougong.contants.Contants;
import com.zhuye.hougong.utils.CommentUtils;
import com.zhuye.hougong.utils.SpUtils;
import com.zhuye.hougong.view.FansActivity;
import com.zhuye.hougong.view.GuanZhuActivity;
import com.zhuye.hougong.view.LoginActivity;
import com.zhuye.hougong.view.LookMeActivity;
import com.zhuye.hougong.view.MyFriendsActivity;
import com.zhuye.hougong.view.MyWaletActivity;
import com.zhuye.hougong.view.PersonDetailActivity;
import com.zhuye.hougong.view.SettingsActivity;
import com.zhuye.hougong.view.ShengVIP1Activity;
import com.zhuye.hougong.view.WhoSendLiWuActivity;
import com.zhuye.hougong.view.YanQingJiangLiActivity;
import com.zhuye.hougong.weidgt.RoundedCornerImageView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

import static android.R.attr.type;

/**
 * Created by zzzy on 2017/11/20.
 */

public class MeFragment extends Fragment {


    //private MyToolbar myToolbar;

    RoundedCornerImageView cornerImageView;
    ImageView setiv;
    @BindView(R.id.tv_follow)
    TextView tvFollow;
    @BindView(R.id.tv_fans)
    TextView tvFans;
    @BindView(R.id.tv_friends)
    TextView tvFriends;
    Unbinder unbinder;
    //    @BindView(R.id.me_recycleview)
//    RecyclerView meRecycleview;
    MeBottomAdapter meBottomAdapter;
    @BindView(R.id.avatar)
    RoundedCornerImageView avatar;
    @BindView(R.id.me_name)
    TextView meName;
    @BindView(R.id.me_id)
    TextView meId;
    @BindView(R.id.iv_set)
    ImageView ivSet;
    @BindView(R.id.zuopinji)
    RelativeLayout zuopinji;
    @BindView(R.id.nickname)
    TextView nickname;
    @BindView(R.id.btn_sign)
    TextView btnSign;
    @BindView(R.id.tag_vip)
    ImageView tagVip;
    @BindView(R.id.me_yinpin_iv)
    ImageView meYinpinIv;
    @BindView(R.id.me_yinpin_tv)
    TextView meYinpinTv;
    @BindView(R.id.me_yinpin_iv2)
    ImageView meYinpinIv2;
    @BindView(R.id.me_yinpin_go)
    ImageView meYinpinGo;
    @BindView(R.id.me_yinpin_tv2)
    TextView meYinpinTv2;
    @BindView(R.id.me_shipin_iv)
    ImageView meShipinIv;
    @BindView(R.id.me_shipin_tv)
    TextView meShipinTv;
    @BindView(R.id.me_shipin_iv2)
    ImageView meShipinIv2;
    @BindView(R.id.me_shipin_go)
    ImageView meShipinGo;
    @BindView(R.id.me_shipin_tv2)
    TextView meShipinTv2;
    @BindView(R.id.me_qianbao)
    LinearLayout meQianbao;
    @BindView(R.id.me_photos)
    LinearLayout mePhotos;
    @BindView(R.id.me_yaoqing)
    LinearLayout meYaoqing;
    @BindView(R.id.me_lookme)
    LinearLayout meLookme;
    @BindView(R.id.me_sengliwu)
    LinearLayout meSengliwu;
    @BindView(R.id.me_shengvip)
    LinearLayout meShengvip;

    private Boolean isShouYuYin ;
    private Boolean isShouShiPin ;
    private static final String SHOWYINPIN = "shouyinpin";
    private static final String SHOWSHIPIN = "shoushipin";


    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }


    //即时处理个人中心的界面
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageEvent event) {/* Do something */
        if(TextUtils.isEmpty(SpUtils.getString(getActivity(),"token",""))){
            //退出登录了  用户名至为空
            meName.setText("请登录");
        }else{
            //重新加载数据
            initData();
        }
        //CommentUtils.toast(getActivity(),"hhhhhhhhhhh");
    };

    @Override
    public void onStart() {
        super.onStart();
        //// TODO: 2017/11/27

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragment_mee, null);
        //myToolbar = view.findViewById(R.id.mee_toolbar);
        // myToolbar.hideView(myToolbar.homeLeftIcon);
        cornerImageView = view.findViewById(R.id.avatar);
        setiv = view.findViewById(R.id.iv_set);
        unbinder = ButterKnife.bind(this, view);
        EventBus.getDefault().register(this);


        List<String> data = new ArrayList<>();

        data.add("我的钱包");
        data.add("自拍认证");
        data.add("邀请奖励");
        data.add("谁看过我");
        data.add("谁送过礼物");
        data.add("升级VIP");

//        meBottomAdapter= new MeBottomAdapter(getActivity(),data);
//        meRecycleview.setAdapter(meBottomAdapter);
//        meRecycleview.setLayoutManager(new GridLayoutManager(getActivity(),3));
        isShouShiPin  = SpUtils.getBoolean(getActivity(),SHOWSHIPIN,false);
        isShouYuYin  = SpUtils.getBoolean(getActivity(),SHOWYINPIN,false);
        meShipinIv2.setImageResource(isShouShiPin ? R.drawable.open:R.drawable.close);
        meYinpinIv2.setImageResource(isShouYuYin ? R.drawable.open:R.drawable.close);
        //使用eventbus 即时完成数据更新
        initData();
        initListener();

        //shiPinToggle();
        //yuYinToggle();
        return view;
    }



    private void initData() {

        String token = SpUtils.getString(getActivity(), "token", "");
        if(TextUtils.isEmpty(token)){
            return;
        }
        //获取个人信息
        OkGo.<String>post(Contants.information)
                .params("token", token)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        CommentUtils.toast(getActivity(), response.body());
                        Log.i("---------", response.body());
                        Gson gson = new Gson();
                        PersonInfoBean personInfoBean = gson.fromJson(response.body(), PersonInfoBean.class);
                        if (response.body().contains("200")) {
                            //头部
                            meName.setText(personInfoBean.getData().getNickname());

                            //tvFollow.setText(personInfoBean.getData().getLove());
                            //// TODO: 2017/11/27
                           // tvFans.setText(personInfoBean.getData().getInterest()+"00");
                           // tvFriends.setText(personInfoBean.getData().getTrends()+"00");


//                            personName.setText(personInfoBean.getData().getNickname());
//                            personAge.setText(personInfoBean.getData().getCity() + "sdfa");
//                            personXingzuo.setText(personInfoBean.getData().getCon()+"老虎");
//                            personZone.setText(personInfoBean.getData().getCity()+"老虎");
//                            personJibie.setText(personInfoBean.getData().getLevel()+"平");
//                            if(personInfoBean.getData().getSex().contains("0")){
//                                personBtnNan.setChecked(true);
//                                personBtnNv.setChecked(false);
//                            }else{
//                                personBtnNan.setChecked(false);
//                                personBtnNv.setChecked(true);
//                            }
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

    private void initListener() {

        cornerImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String token = SpUtils.getString(getActivity(),"token","");

                //startActivity(new Intent(getActivity(), LoginActivity.class));

               // startActivity(new Intent(getActivity(), PersonDetailActivity.class));
                if (TextUtils.isEmpty(token)) {

                    //没登录
                    startActivity(new Intent(getActivity(), LoginActivity.class));

                } else {
                    //登录
                    startActivity(new Intent(getActivity(), PersonDetailActivity.class));
                }
            }
        });
        setiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), SettingsActivity.class));
            }
        });

//        meBottomAdapter.setOnItemClickListener(new BaseHolder.OnItemClickListener() {
//            @Override
//            public void OnItemClick(View view, int position) {
//                switch (position){
//                    case 0:
//                        startActivity(new Intent(getActivity(), MyWaletActivity.class));
//                        break;
//                    case p1:
//                        startActivity(new Intent(getActivity(), ZiPaiActivity.class));
//                        break;
//                    case p2:
//                        startActivity(new Intent(getActivity(), YanQingJiangLiActivity.class));
//                        break;
//                    case 3:
//                        startActivity(new Intent(getActivity(), LookMeActivity.class));
//                        break;
//                    case 4:
//                        startActivity(new Intent(getActivity(), WhoSendLiWuActivity.class));
//                        break;
//                    case 5:
//                        startActivity(new Intent(getActivity(), ShengVIP1Activity.class));
//                        break;
//                }
//            }
//        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }


    @OnClick({R.id.tv_follow, R.id.tv_fans, R.id.tv_friends, R.id.me_yinpin_iv2, R.id.me_yinpin_go, R.id.me_shipin_iv2, R.id.me_shipin_go, R.id.me_qianbao, R.id.me_photos, R.id.me_yaoqing, R.id.me_lookme, R.id.me_sengliwu, R.id.me_shengvip})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_follow:
                startActivity(new Intent(getActivity(), GuanZhuActivity.class));
                break;
            case R.id.tv_fans:
                startActivity(new Intent(getActivity(), FansActivity.class));
                break;
            case R.id.tv_friends:
                startActivity(new Intent(getActivity(), MyFriendsActivity.class));
                break;
            case R.id.me_yinpin_iv2:
                yuYinToggle();
                //meYinpinIv2.setImageResource(R.drawable.close);
                break;
            case R.id.me_yinpin_go:
                break;
            case R.id.me_shipin_iv2:
                shiPinToggle();
                break;
            case R.id.me_shipin_go:
                break;
            case R.id.me_qianbao:
                startActivity(new Intent(getActivity(), MyWaletActivity.class));
                break;
            case R.id.me_photos:
                startActivity(new Intent(getActivity(), MyFriendsActivity.class));
                break;
            case R.id.me_yaoqing:
                startActivity(new Intent(getActivity(), YanQingJiangLiActivity.class));
                break;
            case R.id.me_lookme:
                startActivity(new Intent(getActivity(), LookMeActivity.class));
                break;
            case R.id.me_sengliwu:
                startActivity(new Intent(getActivity(), WhoSendLiWuActivity.class));
                break;
            case R.id.me_shengvip:
                startActivity(new Intent(getActivity(), ShengVIP1Activity.class));
                break;
        }
    }

    private void shiPinToggle() {
        if(isShouShiPin){
            meShipinIv2.setImageResource(R.drawable.close);
        }else {
            meShipinIv2.setImageResource(R.drawable.open);
        }
        isShouShiPin=!isShouShiPin;
        SpUtils.setBoolean(getActivity(),SHOWSHIPIN,isShouShiPin);
    }

    private void yuYinToggle() {
        if(isShouYuYin  ){
            meYinpinIv2.setImageResource(R.drawable.close);
            CommentUtils.toast(getActivity(),SpUtils.getString(getActivity(),"token",""));
            //// TODO: 2017/11/27 无法执行
            closeFuWu(1);
        }else {
            meYinpinIv2.setImageResource(R.drawable.open);
            CommentUtils.toast(getActivity(),SpUtils.getString(getActivity(),"token",""));
            openFuWu(1);
        }
        isShouYuYin=!isShouYuYin;
        SpUtils.setBoolean(getActivity(),SHOWYINPIN,isShouYuYin);
    }

    private void closeFuWu(int i) {
        OkGo.<String>post(Contants.YUSHI_CLODED)
                .params("token",SpUtils.getString(getActivity(),"token",""))
                .params("type",type+"")
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        if(response.body().contains("200")){
                            CommentUtils.toast(getActivity(),"关闭成功");
                        }
                    }

                    @Override
                    public void onError(Response<String> response) {
                        super.onError(response);
                        CommentUtils.toast(getActivity(),"关闭失败");
                    }


                });
    }


    private void openFuWu(int type){
        OkGo.<String>post(Contants.YUSHI_OPEN)
                .params("token",SpUtils.getString(getActivity(),"token",""))
                .params("type",type+"")
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        if(response.body().contains("200")){
                            CommentUtils.toast(getActivity(),"开启成功");
                        }
                    }

                    @Override
                    public void onError(Response<String> response) {
                        super.onError(response);
                        CommentUtils.toast(getActivity(),"开启失败");
                    }
                });
    }







}
