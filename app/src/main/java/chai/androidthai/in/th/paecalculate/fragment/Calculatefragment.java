package chai.androidthai.in.th.paecalculate.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import chai.androidthai.in.th.paecalculate.MainActivity;
import chai.androidthai.in.th.paecalculate.R;

/**
 * Created by THONGWILAI on 9/1/2561.
 */

public class Calculatefragment extends Fragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//         Create Toolbar
        createToolbar();

    }   // Main Method

    private void createToolbar() {

        Toolbar toolbar = getView().findViewById(R.id.toolbarCalculate);
        ((MainActivity) getActivity()).setSupportActionBar(toolbar);

        ((MainActivity) getActivity()).getSupportActionBar()
        .setTitle("Calculate");
        ((MainActivity) getActivity()).getSupportActionBar()
        .setHomeButtonEnabled(true);
        ((MainActivity) getActivity()).getSupportActionBar()
        .setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate, container, false);

        return view;
    }
}   //Main Class
