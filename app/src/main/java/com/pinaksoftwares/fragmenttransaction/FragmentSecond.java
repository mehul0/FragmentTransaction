package com.pinaksoftwares.fragmenttransaction;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentSecond extends Fragment {

    public static final String TAG = "fragment";
    TextView tvSecond;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG, "onAttach: is called");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate: is Called");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second,container,false);
        Log.i(TAG, "onCreateView: is called");

        tvSecond = (TextView) view.findViewById(R.id.tv_fragment_two);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG, "onActivityCreated: is called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: is called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: is called");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "onDestroyView: is Called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: is called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: is Called");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "onDetach: is called");
    }

}