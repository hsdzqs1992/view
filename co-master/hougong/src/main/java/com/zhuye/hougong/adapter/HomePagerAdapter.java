package com.zhuye.hougong.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.zhuye.hougong.base.BaseFragment;
import com.zhuye.hougong.bean.HomeBanner;
import com.zhuye.hougong.fragment.home.HuoYueFragment;
import com.zhuye.hougong.fragment.home.MianFeiFragment;
import com.zhuye.hougong.fragment.home.TuiJianFragment;
import com.zhuye.hougong.fragment.home.XinRenFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzzy on 2017/11/21.
 */

public class HomePagerAdapter extends FragmentPagerAdapter {


    private List<String> titles = new ArrayList<>();
    private List<BaseFragment> fargments = new ArrayList<>();

    HomeBanner homeBanner;

    private View rotview;

    public HomePagerAdapter(FragmentManager fm) {
        super(fm);
        titles.add("推荐");
        titles.add("活跃");
        titles.add("新人");
        titles.add("免费");

        fargments.add(new TuiJianFragment());
        fargments.add(new HuoYueFragment());
        fargments.add(new XinRenFragment());
        fargments.add(new MianFeiFragment());


    }

    public void setData(HomeBanner homeBanner){
        this.homeBanner = homeBanner;
        if(((TuiJianFragment)fargments.get(0))!=null){
            ((TuiJianFragment)fargments.get(0)).setData(homeBanner);
        }

    }



    @Override
    public Fragment getItem(int position) {
        BaseFragment baseFragment =fargments.get(position);
        rotview = baseFragment.rootView;
        return baseFragment;
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        if (rotview != null){
            return rotview;
        }else{
            return super.instantiateItem(container, position);
        }
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        if (rotview!=null){
            container.removeView((View) object);
        }
        super.destroyItem(container, position, object);
    }
}
