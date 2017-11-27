package com.zhuye.hougong.fragment.find;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.cjj.MaterialRefreshLayout;
import com.zhuye.hougong.R;
import com.zhuye.hougong.adapter.BaseHolder;
import com.zhuye.hougong.adapter.find.FindBaseAdapter;
import com.zhuye.hougong.adapter.find.FindZuiXinAdapter;
import com.zhuye.hougong.base.BaseFragment;
import com.zhuye.hougong.view.PingLunActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzzy on 2017/11/23.
 */

public class BaseFindFragment extends BaseFragment {


    MaterialRefreshLayout materialRefreshLayout;
    RecyclerView recyclerView;
    FindZuiXinAdapter findZuiXinAdapter;
    @Override
    protected void initView() {

        materialRefreshLayout = rootView.findViewById(R.id.common_material);
        recyclerView = rootView.findViewById(R.id.commot_recycle);

        List list= new ArrayList();
        for(int i=0;i <100;i++){
            list.add("sdfasdf"+i);
        }
        findZuiXinAdapter = new FindZuiXinAdapter(getActivity(),list);

        recyclerView.setAdapter(findZuiXinAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        findZuiXinAdapter.setOnItemClickListener(new BaseHolder.OnItemClickListener() {
            @Override
            public void OnItemClick(View view, int position) {
                View vie = view.findViewById(R.id.find_zuixin_pinglun);
                vie.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(getActivity(), PingLunActivity.class));
                    }
                });
            }
        });
    }

    @Override
    protected int getResId() {
        return R.layout.common_recycle;
    }
}
