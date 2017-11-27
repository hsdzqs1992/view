package com.zhuye.hougong.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by zzzy on 2017/11/21.
 */

public abstract class BaseRecycleAdapter<T> extends RecyclerView.Adapter<BaseHolder> {

    Context conn;
    protected List<T> data;

    public BaseHolder.OnItemClickListener mOnItemClickListener;
    public BaseRecycleAdapter(Context conn) {
        this.conn= conn;

    }

    public BaseRecycleAdapter(Context conn,List<T> data) {
        this.conn= conn;
        this.data= data;

    }

    @Override
    public BaseHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(conn,getResId(),null);

        BaseHolder baseholder = new BaseHolder(view);
        return baseholder;
    }

    protected abstract int getResId();
    public  void setData(List<T> data){
        this.data= data;
    }


    @Override
    public void onBindViewHolder(BaseHolder holder, int position) {
        conver(holder,position);
        if(mOnItemClickListener!=null)
            holder.setOnItemClickListener(mOnItemClickListener);
    }

    protected abstract void conver(BaseHolder holder, int position);



    @Override
    public int getItemCount() {
        return data.size();
    }


    public void setOnItemClickListener(BaseHolder.OnItemClickListener onItemClickListener){
        mOnItemClickListener = onItemClickListener;
    }

//    public <V extends View> V getView(int ResId){
//        return (V)rootView.findViewById(ResId);
//    }




}
