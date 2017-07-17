package com.example.susancarrera.personaldefense;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.susancarrera.personaldefense.adapter.BaseViewPagerAdapter;
import com.example.susancarrera.personaldefense.fragment.GAGunLawsFragment;
import com.example.susancarrera.personaldefense.fragment.GunInfoFragment;
import com.example.susancarrera.personaldefense.fragment.GunPicFragment;

import java.util.ArrayList;

public class ArmedDefenseActivity extends BaseActivity {

    private ViewPager viewPager;
    private ArrayList<Fragment> list = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armed_defense);

        viewPager = (ViewPager) findViewById(R.id.activity_view_pager);
        list.add(new GunInfoFragment());
        list.add(new GAGunLawsFragment());
        list.add(new GunPicFragment());


        BaseViewPagerAdapter pagerAdapter =
                new BaseViewPagerAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(0);
    }
}
