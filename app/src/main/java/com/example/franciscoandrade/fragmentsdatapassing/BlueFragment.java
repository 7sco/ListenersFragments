package com.example.franciscoandrade.fragmentsdatapassing;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlueFragment extends Fragment {

    View v;
    TextView textView;

    public BlueFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.fragment_blue, container, false);
        textView=(TextView)v.findViewById(R.id.textView);
        return  v;
    }

    public void  receive(String dataMsg){
        textView.setText(dataMsg);
    }

}
