package com.mredrock.freshmanspecial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

import com.mredrock.freshmanspecial.data.activity.DataActivity;
import com.mredrock.freshmanspecial.elegant.ElegantActivity;
import com.mredrock.freshmanspecial.strategy.activity.StrategyActivity;
import com.mredrock.freshmanspecial.strategy.utils.StatusUtils;
import com.mredrock.freshmanspecial.training.activity.TrainingActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomepageActivity extends AppCompatActivity {

    @BindView(R.id.strategy) ImageButton mCQUPTStrategy; //邮子攻略
    @BindView(R.id.elegant) ImageButton mCQUPTElegant; //重邮风采
    @BindView(R.id.cqupt_data) ImageButton mCQUPTData; //重邮数据
    @BindView(R.id.military_training) ImageButton mCQUPTMilitaryTra; //军训特辑

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.special_2017_activity_homepage);
        StatusUtils.changeStatus(this);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.strategy)
    public void launchStrategy() {
        Intent intent = new Intent(this, StrategyActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.elegant)
    public void launchElegant() {
        Intent intent = new Intent(this, ElegantActivity.class);
        startActivity(intent);
    }

    @OnClick (R.id.cqupt_data)
    public void ClickOnData(){
        Intent intent = new Intent(this, DataActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.military_training)
    public void ClickOnTraining(){
        Intent intent = new Intent(this, TrainingActivity.class);
        startActivity(intent);
    }

}
