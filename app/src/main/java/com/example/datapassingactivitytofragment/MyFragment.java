package com.example.datapassingactivitytofragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {

    TextView t1, t2;

    public MyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_my, container, false);
        t1 = (TextView)v.findViewById(R.id.opName);
        t2 = (TextView)v.findViewById(R.id.opAddress);

        Bundle bundle = getArguments();
        String name = bundle.getString("name");
        String address = bundle.getString("address");

        t1.setText(name);
        t2.setText(address);

        return v;
    }

}
