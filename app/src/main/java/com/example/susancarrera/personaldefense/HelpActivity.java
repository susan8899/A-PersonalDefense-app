package com.example.susancarrera.personaldefense;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.util.Pair;
import android.support.v4.view.ViewPager;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;




import com.example.susancarrera.personaldefense.adapter.ViewFragmentStateAdapter;
import com.example.susancarrera.personaldefense.fragment.HindiFragment;
import com.example.susancarrera.personaldefense.fragment.MandarinFragment;
import com.example.susancarrera.personaldefense.fragment.RussianFragment;
import com.example.susancarrera.personaldefense.fragment.SpanishFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by SusanCarrera on 7/12/17.
 */

public class HelpActivity extends AppCompatActivity {

    private ArrayList<Pair<String, Fragment>> list = new ArrayList<Pair<String, Fragment>>();



    @BindView(R.id.activity_advance_view_pager_tablayout)
    TabLayout tabLayout;


    @BindView(R.id.activity_advance_view_pager)
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        ButterKnife.bind(this);

        list.add(new Pair<String, Fragment>("Spanish", new SpanishFragment()));
        list.add(new Pair<String, Fragment>("Mandarin", new MandarinFragment()));
        list.add(new Pair<String, Fragment>("Hindi", new HindiFragment()));
        list.add(new Pair<String, Fragment>("Russian", new RussianFragment()));


        ViewFragmentStateAdapter adapter = new ViewFragmentStateAdapter(this.getSupportFragmentManager(), list);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }

}
