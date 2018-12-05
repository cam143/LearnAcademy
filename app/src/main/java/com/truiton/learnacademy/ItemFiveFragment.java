package com.truiton.learnacademy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ItemFiveFragment extends Fragment implements View.OnClickListener {

    public static ItemFiveFragment newInstance() {
        ItemFiveFragment fragment = new ItemFiveFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_item_five, container, false);

        // Initialize
        Button option1 = (Button) rootView.findViewById(R.id.option_1);
        Button option2 = (Button) rootView.findViewById(R.id.option_2);
        Button option3 = (Button) rootView.findViewById(R.id.option_3);

        // onClick listener
        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.option_1: EventStatus.set_option1(); break;
            case R.id.option_2: EventStatus.set_option2(); break;
            case R.id.option_3:  EventStatus.set_option3(); break;
        }
        getActivity().setTitle(EventStatus.app_title); // Set Event Title
    }
}
