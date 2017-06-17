package com.pinaksoftwares.fragmenttransaction;

import android.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    android.app.FragmentManager manager;
    FragmentTransaction transaction;
    FragmentOne fragmentOne;
    FragmentSecond fragmentSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getFragmentManager();
        fragmentOne = new FragmentOne();
        fragmentSecond = new FragmentSecond();
    }


    public void addA(View view) {
        if (!fragmentOne.isAdded()) {
            transaction = manager.beginTransaction();
            transaction.add(R.id.group, fragmentOne, "Fragment_One");
            transaction.commit();
        }
    }

    public void addB(View view) {
        if (!fragmentSecond.isAdded()) {
            transaction = manager.beginTransaction();
            transaction.add(R.id.group, fragmentSecond, "Fragment_Second");
            transaction.commit();
        }
    }

    public void removeA(View view) {
        fragmentOne = (FragmentOne) manager.findFragmentByTag("Fragment_One");
        transaction = manager.beginTransaction();
        if (fragmentOne != null) {
            transaction.remove(fragmentOne);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment Already removed", Toast.LENGTH_SHORT).show();
        }
    }

    public void removeB(View view) {
        fragmentSecond = (FragmentSecond) manager.findFragmentByTag("Fragment_Second");
        transaction = manager.beginTransaction();
        if (fragmentSecond != null) {
            transaction.remove(fragmentSecond);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment Already removed", Toast.LENGTH_SHORT).show();
        }
    }

    public void replaceAwithB(View view) {
        //fragmentSecond = (FragmentSecond) manager.findFragmentByTag("Fragment_Second");
        if (fragmentOne != null){
            transaction = manager.beginTransaction();
            transaction.replace(R.id.group, fragmentSecond, "Fragment_Second");
            transaction.commit();
        }
        else{
            Toast.makeText(this, "Fragment A not Found", Toast.LENGTH_SHORT).show();
        }
    }

    public void replaceBwithA(View view) {
        //fragmentOne = (FragmentOne) manager.findFragmentByTag("Fragment_One");
        if(fragmentSecond != null){
            transaction = manager.beginTransaction();
            transaction.replace(R.id.group, fragmentOne, "Fragment_One");
            transaction.commit();
        }
        else{
            Toast.makeText(this, "Fragment B not Found", Toast.LENGTH_SHORT).show();
        }

    }

    public void attachA(View view) {
        transaction = manager.beginTransaction();
        if (fragmentOne != null) {
            transaction.attach(fragmentOne);
            transaction.commit();
        }
    }

    public void detachA(View view) {
        transaction = manager.beginTransaction();
        if (fragmentOne != null) {
            transaction.detach(fragmentOne);
            transaction.commit();
        }
    }
}
