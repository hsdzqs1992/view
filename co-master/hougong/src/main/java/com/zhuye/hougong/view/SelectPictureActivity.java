package com.zhuye.hougong.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.zhuye.hougong.R;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_picture);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.select_photo)
    public void onViewClicked() {


        //打开系统图库   选择图片上传
//        Intent innerIntent = new Intent(Intent.ACTION_GET_CONTENT) ; //"android.intent.action.GET_CONTENT"
//        innerIntent.setType( "image/*"); //查看类型 String IMAGE_UNSPECIFIED = "image/*";
//        innerIntent.addCategory(Intent.CATEGORY_OPENABLE );
//        startActivityForResult(Intent.createChooser(innerIntent, null) , 2) ;
    }

}
