package chai.androidthai.in.th.paecalculate.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import chai.androidthai.in.th.paecalculate.MainActivity;
import chai.androidthai.in.th.paecalculate.R;

/**
 * Created by THONGWILAI on 9/1/2561.
 */

public class Main_fragment extends Fragment {
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


//        Create Toolbar
        CreateToolbar();

//        ShowName Controller
        showNameController();

//        Calculate Controller
        calculateController();

    } //    Main Method

    private void calculateController() {
        Button button = getView().findViewById(R.id.btnCalculate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contenmainfragment, new Calculatefragment())
                        .addToBackStack(null)
                        .commit();

            }
        });
    }

    private void showNameController() {
        Button button = getView().findViewById(R.id.btnShowName);
        button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             TextView textView= getView().findViewById(R.id.txtShowName);
             textView.setText("Pae Oconner");

                                      }
                                  });
    }


    private void CreateToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.ToolbarMain);
        ((MainActivity) getActivity()).setSupportActionBar(toolbar);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frangment_main, container, false);
        return view;
    }
}//MainClass
