package com.example.franciscoandrade.fragmentsdatapassing;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class RedFragment extends Fragment {

    View v;
    EditText textET;
    Button btn;
    SendMessage em;

    public RedFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.fragment_red, container, false);
        textET=(EditText)v.findViewById(R.id.textET);
        btn=(Button)v.findViewById(R.id.btn);

        textET.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String data= textET.getText().toString();
                em.sendData(data);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return v;
    }

    //Talks with the activity
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        em=(SendMessage)context;
    }
}
