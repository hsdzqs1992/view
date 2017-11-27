package com.zhuye.tablayout;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by admin on 2017/11/26.
 */

public class Myrecycle extends LinearLayout {
    Context conn;
    public Myrecycle(Context context) {
        this(context,null);
    }

    public Myrecycle(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public Myrecycle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        conn = context;
        addView1();
    }

    RecyclerView mRecyclerView;
    private void addView1() {
        View view = View.inflate(conn,R.layout.rrr,null);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv);

    //    MyAdapter myAdapter = new MyAdapter();
//        mRecyclerView.setAdapter(myAdapter);
     //   mRecyclerView.setLayoutManager(new GridLayoutManager(conn,2));
        addView(view);
    }

    public void setdata(){
            MyAdapter myAdapter = new MyAdapter();
                mRecyclerView.setAdapter(myAdapter);
           mRecyclerView.setLayoutManager(new GridLayoutManager(conn,2));
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        Float startX =0f ;
        Float startY =0f;
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                startX = event.getX();
                startY = event.getY();
                break;
            case MotionEvent.ACTION_MOVE:
                Float moveX = event.getX();
                Float moveY = event.getX();

                if (Math.abs(moveX-startX)<Math.abs(moveY-startY)){
                    return false;
                }

                break;
            case MotionEvent.ACTION_UP:
                break;
        }

        return super.onTouchEvent(event);
    }

    class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

                View view = View.inflate(conn,R.layout.it,null);
                MyHolder myHolder = new MyHolder(view);
                return myHolder;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        }




        @Override
        public int getItemCount() {
            return 9;
        }


        class MyHolder extends RecyclerView.ViewHolder{

            public MyHolder(View itemView) {
                super(itemView);
            }
        }

        class MyHolder1 extends RecyclerView.ViewHolder{

            public MyHolder1(View itemView) {
                super(itemView);
            }
        }
    }
}
