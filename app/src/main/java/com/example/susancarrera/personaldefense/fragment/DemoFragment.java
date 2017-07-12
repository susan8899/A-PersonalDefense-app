package com.example.susancarrera.personaldefense.fragment;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.susancarrera.personaldefense.ArmedDefenseActivity;
import com.example.susancarrera.personaldefense.HelpActivity;
import com.example.susancarrera.personaldefense.KenpoActivity;
import com.example.susancarrera.personaldefense.R;
import com.example.susancarrera.personaldefense.SituationalAwarnessActivity;
import com.example.susancarrera.personaldefense.adapter.ListNormalAdapter;

import java.util.ArrayList;

public class DemoFragment extends Fragment {

    private final ArrayList<String> contentList;
    private final Context context;
    private ListView listView;

    public DemoFragment() {

        context = getContext();
        contentList = new ArrayList<String>();
        contentList.add("Situational Awareness");
        contentList.add("Armed Defense");
        contentList.add("Self-Defense");
        contentList.add("Help in different languages");
        contentList.add("Quiz");
        contentList.add("5");
        contentList.add("6");
        contentList.add("7");
        contentList.add("8");
        contentList.add("9");
        contentList.add("10");


    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_demo, container, false);
        listView =  (ListView)view.findViewById(R.id.fragment_demo_lv);
        ListNormalAdapter adapter = new ListNormalAdapter(this.getContext(), contentList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        Intent intent = new Intent(getActivity(), SituationalAwarnessActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), ArmedDefenseActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(),KenpoActivity.class);
                        Bundle bundle = new Bundle();
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(),HelpActivity.class);
                        startActivity(intent3);
                        break;

//                    case 5:
//                        Intent intent5 = new Intent(getActivity(), AdvanceViewPagerActivity.class);
//                        startActivity(intent5);
//                        break;
//                    case 6:
//                        Intent intent6 = new Intent(getActivity(), ActivityA.class);
//                        intent6.putExtra("StringInfo","fromDemoFragment");
//                        intent6.putExtra("IntegerInfo", 10);
//                        Bundle bundle = new Bundle();
//                        BaseBean bean = new BaseBean();
//                        bean.setName("bean");
//                        bundle.putString("StringBundle","FromBundleDemo");
//                        bundle.putInt("IntegerBundle",101);
//                        bundle.putSerializable("Object",bean);
//                        intent6.putExtra("Bundle",bundle);
//                        startActivity(intent6);
//                        break;
//                    case 7:
//                        Intent intent7 = new Intent(getActivity(), ResultActivity.class);
//                        startActivity(intent7);
//                        break;
//                    case 8:
//                        Intent intent8 = new Intent(getActivity(), RadioGroupActivity.class);
//                        startActivity(intent8);
//                        break;
//                    case 9:
//                        Intent intent9 = new Intent(getActivity(), CheckBoxActivity.class);
//                        startActivity(intent9);
//                        break;


                    default:
                }
            }
        });

        return view;
    }


}
