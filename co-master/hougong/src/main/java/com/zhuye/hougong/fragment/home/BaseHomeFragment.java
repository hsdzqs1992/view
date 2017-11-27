package com.zhuye.hougong.fragment.home;

import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.cjj.MaterialRefreshLayout;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;
import com.zhuye.hougong.R;
import com.zhuye.hougong.adapter.BaseHolder;
import com.zhuye.hougong.adapter.home.HomeTuiJianAdapter;
import com.zhuye.hougong.base.BaseFragment;
import com.zhuye.hougong.bean.HomeBanner;
import com.zhuye.hougong.contants.Contants;
import com.zhuye.hougong.utils.SpUtils;
import com.zhuye.hougong.view.PersonHomePageActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzzy on 2017/11/23.
 */

public class BaseHomeFragment extends BaseFragment {


    protected SliderLayout sliderShow;
    protected MaterialRefreshLayout materialRefreshLayout;

    protected RecyclerView recyclerView;
    protected HomeTuiJianAdapter homeTuiJianAdapter;

    protected HomeBanner homeBanner;
    public LinearLayout linearLayout;
    @Override
    protected void initView() {

        sliderShow= (SliderLayout) rootView.findViewById(R.id.slider);
        materialRefreshLayout = rootView.findViewById(R.id.fragment_home_materrial);
        recyclerView = rootView.findViewById(R.id.fragment_home_recycle);
       // linearLayout = rootView.findViewById(R.id.rootview_ll);



        List list= new ArrayList();
        for(int i=0;i <9;i++){
            list.add("sdfasdf"+i);
        }
        homeTuiJianAdapter = new HomeTuiJianAdapter(getActivity(),list);
        recyclerView.setAdapter(homeTuiJianAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));

        //recyclerView.add

        homeTuiJianAdapter.setOnItemClickListener(new BaseHolder.OnItemClickListener() {
            @Override
            public void OnItemClick(View view, int position) {
                startActivity(new Intent(getActivity(), PersonHomePageActivity.class));
            }
        });

    }

    @Override
    protected int getResId() {
        return R.layout.fragment_home_vp;
    }


    public void setData(HomeBanner homeBanner){
        this.homeBanner = homeBanner;
        if(homeBanner!=null){
            List<String> url = new ArrayList();
            url.add(Contants.BASE_URL+homeBanner.getData().get(0).getImg());
            url.add(Contants.BASE_URL+homeBanner.getData().get(1).getImg());
            url.add(Contants.BASE_URL+homeBanner.getData().get(2).getImg());



//        DefaultSliderView defaultSliderView = new DefaultSliderView(getActivity());
//        defaultSliderView.image("");
//        sliderShow.addSlider(defaultSliderView);
            for (int i = 0 ; i<url.size();i++){
                DefaultSliderView defaultSliderView = new DefaultSliderView(getActivity());
                defaultSliderView.image(url.get(i));
                if(sliderShow!=null)
                    sliderShow.addSlider(defaultSliderView);
            }
        }
    }


    @Override
    protected void initData() {
        super.initData();

        OkGo.<String>post(Contants.hall)
                .tag(getActivity())
                .params("type",1)
                .params("token", SpUtils.getString(getActivity(),"token",""))
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {

                        // TODO: 2017/11/22  数据有问题
                        Gson gson = new Gson();
                        // HomeRecycleBean homeRecycleBean = gson.fromJson(response.body(), HomeRecycleBean.class);
                        //Log.d("------",homeRecycleBean.toString());
                        //homePagerAdapter.setData(homeBanner);

                        Toast.makeText(getActivity(),response.body(),Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onError(Response<String> response) {
                        super.onError(response);
                        //Log.d("------",response.body());
                    }
                });

    }
}
