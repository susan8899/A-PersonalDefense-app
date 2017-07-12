package com.example.susancarrera.personaldefense.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.example.susancarrera.personaldefense.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CustomDialog2 extends Dialog {


    private final CustomDialog2.ICustomDialogListener2 listener;

    public interface ICustomDialogListener2{
        public void onCancelClicked(String msg);
        public void onOkClicked(String msg);
    }



    @OnClick(R.id.dialog_quiz3_Cancel2)
    public void cancel(View v){
        cancel();
    }


    private int checkedID = 0;


    @BindView(R.id.Quiz3_dialog_rdg2)
    RadioGroup radioGroup;

    @OnClick(R.id.dialog_quiz3_ok2)
    public void ok(View v){


        switch (checkedID) {

            case R.id.quiz3_yes2:
                listener.onOkClicked("Answer 1");
                cancel();
                break;
            case R.id.quiz3_No2:
                listener.onOkClicked("Answer 1");
                cancel();
                break;
            case R.id.quiz3_exit2:
                listener.onOkClicked("Answer 3");
                cancel();

                break;
            default:
        }
    }



    public CustomDialog2(@NonNull Context context, CustomDialog2.ICustomDialogListener2 listener) {
        super(context, R.style.dialog);
        setContentView(R.layout.activity_custom_dialog2);
        ButterKnife.bind(this);
        this.listener = listener;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog2);
        ButterKnife.bind(this);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                checkedID = checkedId;



            }
        });
    }

}
