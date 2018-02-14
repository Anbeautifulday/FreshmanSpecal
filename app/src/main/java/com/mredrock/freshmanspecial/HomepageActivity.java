package com.mredrock.freshmanspecial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

import com.mredrock.freshmanspecial.cquptdata.DrawViewActivity;
import com.mredrock.freshmanspecial.elegant.ElegantActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomepageActivity extends AppCompatActivity {

    @BindView(R.id.strategy) ImageButton mCQUPTStrategy; //邮子攻略
    @BindView(R.id.elegant) ImageButton mCQUPTElegant; //重邮风采
    @BindView(R.id.cqupt_data) ImageButton mCQUPTData; //重邮数据
    @BindView(R.id.military_training) ImageButton mCQUPTMilitaryTra; //军训特辑

    private static final String TAG = "HomepageActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.special_2017_activity_homepage);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.strategy)
    public void launchStrategy() {
        Intent intent = new Intent(this, DrawViewActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.elegant)
    public void launchElegant() {
        Intent intent = new Intent(this, ElegantActivity.class);
        startActivity(intent);
    }

}
