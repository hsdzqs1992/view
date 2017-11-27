package com.zhuye.hougong.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.cjj.MaterialRefreshLayout;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;
import com.zhuye.hougong.R;
import com.zhuye.hougong.adapter.home.HomeBaseAdapter;
import com.zhuye.hougong.adapter.home.HomeHuoYueAdapter;
import com.zhuye.hougong.adapter.home.HomeMianFeiAdapter;
import com.zhuye.hougong.adapter.home.HomeTuiJianAdapter;
import com.zhuye.hougong.adapter.home.HomeXinRenAdapter;
import com.zhuye.hougong.bean.HomeBanner;
import com.zhuye.hougong.contants.Contants;
import com.zhuye.hougong.view.PersonHomePageActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzzy on 2017/11/21.
 */

public class HomePagerAdapter2 extends PagerAdapter {


    private  Context conn;
    private List<String> titles = new ArrayList<>();
    private List<HomeBaseAdapter> mAdapters = new ArrayList<>();

    HomeBanner homeBanner;

    private View rotview;


    public HomePagerAdapter2(Context con) {
        conn = con;
        titles.add("推荐");
        titles.add("活跃");
        titles.add("新人");
        titles.add("免费");
        mAdapters.add(new HomeTuiJianAdapter(conn,titles));
        mAdapters.add(new HomeHuoYueAdapter(conn,titles));
        mAdapters.add(new HomeXinRenAdapter(conn,titles));
        mAdapters.add(new HomeMianFeiAdapter(conn,titles));

    }

    List<String> url  = new ArrayList();;
    public void setData(HomeBanner homeBanner){
        this.homeBanner = homeBanner;
//        if(((TuiJianFragment)fargments.get(0))!=null){
//            ((TuiJianFragment)fargments.get(0)).setData(homeBanner);
//        }
        if(this.homeBanner!=null) {
            url.add(Contants.BASE_URL + homeBanner.getData().get(0).getImg());
            url.add(Contants.BASE_URL + homeBanner.getData().get(1).getImg());
            url.add(Contants.BASE_URL + homeBanner.getData().get(2).getImg());



//        DefaultSliderView defaultSliderView = new DefaultSliderView(getActivity());
//        defaultSliderView.image("");
//        sliderShow.addSlider(defaultSliderView);

        }

    }


//    public HomePagerAdapter2(FragmentManager fm) {
//        super(fm);
//        titles.add("推荐");
//        titles.add("活跃");
//        titles.add("新人");
//        titles.add("免费");
//        fargments.add(new TuiJianFragment());
//        fargments.add(new HuoYueFragment());
//        fargments.add(new XinRenFragment());
//        fargments.add(new MianFeiFragment());
//    }

//    public void setData(HomeBanner homeBanner){
//        this.homeBanner = homeBanner;
//        if(((TuiJianFragment)fargments.get(0))!=null){
//            ((TuiJianFragment)fargments.get(0)).setData(homeBanner);
//        }
//
//    }


    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }


    protected SliderLayout sliderShow;
    protected MaterialRefreshLayout materialRefreshLayout;

    protected RecyclerView recyclerView;
    protected HomeTuiJianAdapter homeTuiJianAdapter;
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = View.inflate(conn, R.layout.fragment_home_vp, null);
        materialRefreshLayout = view.findViewById(R.id.fragment_home_materrial);
        recyclerView = view.findViewById(R.id.fragment_home_recycle);
        sliderShow= (SliderLayout) view.findViewById(R.id.slider);
        //homeTuiJianAdapter = new HomeTuiJianAdapter(conn,titles);
        HomeBaseAdapter homeBaseAdapter = mAdapters.get(position);
        recyclerView.setAdapter(homeBaseAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(conn,2));
        // initView();
        //paihangThree = view.findViewById(R.id.paihang_three);
        initData();
        container.addView(view);
        initListener();
        return view;
    }

    public void initData() {
        if(url != null && url.size() > 0){
            for (int i = 0 ; i<url.size();i++){
                DefaultSliderView defaultSliderView = new DefaultSliderView(conn);
                defaultSliderView.image(url.get(i));
                if(sliderShow!=null)
                    sliderShow.addSlider(defaultSliderView);
            }
        }

    }

    private void initListener() {



        mAdapters.get(0).setOnItemClickListener(new BaseHolder.OnItemClickListener() {
            @Override
            public void OnItemClick(View view, int position) {
                conn.startActivity(new Intent(conn, PersonHomePageActivity.class));
            }
        });
        mAdapters.get(1).setOnItemClickListener(new BaseHolder.OnItemClickListener() {
            @Override
            public void OnItemClick(View view, int position) {
                conn.startActivity(new Intent(conn, PersonHomePageActivity.class));
            }
        });
        mAdapters.get(2).setOnItemClickListener(new BaseHolder.OnItemClickListener() {
            @Override
            public void OnItemClick(View view, int position) {
                conn.startActivity(new Intent(conn, PersonHomePageActivity.class));
            }
        });
        mAdapters.get(3).setOnItemClickListener(new BaseHolder.OnItemClickListener() {
            @Override
            public void OnItemClick(View view, int position) {
                conn.startActivity(new Intent(conn, PersonHomePageActivity.class));
            }
        });
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
