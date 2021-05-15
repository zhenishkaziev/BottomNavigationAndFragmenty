package com.example.myapplication.fragmenty;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.DescriptionTitleFragment;
import com.example.myapplication.ListModel;
import com.example.myapplication.ListServer;
import com.example.myapplication.MoveInter;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;


public class ListFragment extends Fragment {

      RecyclerView rvList;
      ListAdapter adapter;
      List <ListModel> list = new ArrayList<>();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvList = view.findViewById(R.id.rec_list);
        list = ListServer.getAllList();
        rvList.setLayoutManager(new LinearLayoutManager(requireContext()));
        adapter = new ListAdapter(requireContext(), ListServer.getAllList());
        rvList.setAdapter(adapter);
        adapter.setMoveInter(new MoveInter() {
            @Override
            public void MoveInter(int position) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container_main,DescriptionTitleFragment.newInstance(list.get(position).getTitle(),list.get(position).getDescription()));
                transaction.commit();
            }
        });




    }

    //public static Fragment newInstance(String name) {
        //  Bundle bundle = new Bundle();
          //bundle.putString("key", "des");
          //Fragment fragment = new Fragment();
          //fragment.setArguments(bundle);
          //return  fragment;

    //}


        // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ListFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListFragment newInstance(String param1, String param2) {
        ListFragment fragment = new ListFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
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
        return inflater.inflate(R.layout.fragment_list, container, false);
    }


    }

