package com.example.susancarrera.personaldefense;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by SusanCarrera on 7/12/17.
 */

public class BaseActivity extends AppCompatActivity{

    public void showToast(String s){
        Toast.makeText(this, s ,Toast.LENGTH_SHORT).show();
    }
    public void shortToast(String s){
        Toast.makeText(this, s ,Toast.LENGTH_SHORT).show();
    }
    public void longToast(String s){
        Toast.makeText(this, s ,Toast.LENGTH_LONG).show();
    }




    public void  goToActivity(Class c){
        Intent intent = new Intent(this, c);
        startActivity(intent);
    }




}



