package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.time.temporal.Temporal;

public class DescriptionTitleFragment extends Fragment {

           TextView txtTitle, txtDescription;

    private static final String ARG_PARAM1 = "title";
    private static final String ARG_PARAM2 = "description";

    private String mParam1;
    private String mParam2;

    public DescriptionTitleFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static DescriptionTitleFragment newInstance(String title, String description) {
        DescriptionTitleFragment fragment = new DescriptionTitleFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, title);
        args.putString(ARG_PARAM2, description);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_description_title, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtTitle = view.findViewById(R.id.title_des);
        txtDescription = view.findViewById(R.id.des_title);
        txtTitle.setText(mParam1);
        txtDescription.setText(mParam2);
    }
}