package com.example.susancarrera.personaldefense;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.TextView;
import android.widget.Toast;

import com.example.susancarrera.personaldefense.fragment.DemoFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class KenpoActivity extends BaseActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kenpo);
        ButterKnife.bind(this);

    }




    @Override
    protected void onNewIntent(Intent intent){
        super.onNewIntent(intent);
    }



    @OnClick(R.id.activity_b_to_b)
    public void activityBButton(View v){

        goToActivity(KenpoActivity.class);
    }


    @OnClick(R.id.activity_b_to_c)
    public void activityCButton(View v){

        goToActivity(KravActivity.class);
    }

    @OnClick(R.id.activity_b_to_d)
    public void activityDButton(View v){

        goToActivity(MuayActivity.class);
    }

}
