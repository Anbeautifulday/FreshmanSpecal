package com.mredrock.freshmanspecial.training.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.mredrock.freshmanspecial.R;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by Grantsome on 2017/8/10.
 */

public class TrainingPictureHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    @BindView(R.id.training_image_first)
    ImageView mFirstTrainImage;

    @BindView(R.id.training_image_second)
    ImageView mSecondTrainImage;

    @BindView(R.id.training_image_third)
    ImageView mThirdTrainImage;

    @BindView(R.id.training_image_fourth)
    ImageView mFourthTrainImage;

    @BindView(R.id.training_image_fifth)
    ImageView mFifthTrainImage;

    @BindView(R.id.training_image_sixth)
    ImageView mSixTrainImage;

    private TrainingPictureHolder.OnRecyclerViewItemClick mRvItemClick;

    public TrainingPictureHolder (View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
        itemView.setOnClickListener(this);
        mFirstTrainImage.setOnClickListener(this);
        mSecondTrainImage.setOnClickListener(this);
        mThirdTrainImage.setOnClickListener(this);
        mFourthTrainImage.setOnClickListener(this);
        mFifthTrainImage.setOnClickListener(this);
        mSixTrainImage.setOnClickListener(this);
    }

    public void setRvItemClick(OnRecyclerViewItemClick rvItemClick) {
        mRvItemClick = rvItemClick;
    }

    public ImageView getFirstTrainImage() {
        return mFirstTrainImage;
    }

    public ImageView getSecondTrainImage() {
        return mSecondTrainImage;
    }

    public ImageView getThirdTrainImage() {
        return mThirdTrainImage;
    }

    public ImageView getFourthTrainImage() {
        return mFourthTrainImage;
    }

    public ImageView getFifthTrainImage() {
        return mFifthTrainImage;
    }

    public ImageView getSixTrainImage() {
        return mSixTrainImage;
    }

    public void update() {
        //到时候这样写即可，其他同理
        //mBuildDecription.setText();
    }


    public interface OnRecyclerViewItemClick{
        void onItemClick(View view);
    }

    @Override
    public void onClick(View v) {
        if(mRvItemClick!=null){
            mRvItemClick.onItemClick(v);
        }
    }

}



