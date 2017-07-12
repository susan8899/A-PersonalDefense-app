package com.example.susancarrera.personaldefense;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MuayActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muay);
        ButterKnife.bind(this);

    }

    @Override
    protected void onNewIntent(Intent intent){
        super.onNewIntent(intent);
    }





    @OnClick(R.id.activity_d_to_b)
    public void activityBButton(View v){
        goToActivity(KenpoActivity.class);
    }


    @OnClick(R.id.activity_d_to_c)
    public void activityCButton(View v){

        goToActivity(KravActivity.class);
    }

    @OnClick(R.id.activity_d_to_d)
    public void activityDButton(View v){

        goToActivity(MuayActivity.class);
    }


}
