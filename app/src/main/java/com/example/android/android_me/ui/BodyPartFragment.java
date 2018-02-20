package com.example.android.android_me.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * A simple {@link Fragment} subclass.
 */
public class BodyPartFragment extends Fragment {


    public BodyPartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_body_part, container, false);

        ImageView bodyPartIv = v.findViewById(R.id.body_partIV);
        bodyPartIv.setImageResource(AndroidImageAssets.getHeads().get(0));

        return v;
    }

}
