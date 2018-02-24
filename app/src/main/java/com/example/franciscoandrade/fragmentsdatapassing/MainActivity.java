package com.example.franciscoandrade.fragmentsdatapassing;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements SendMessage {

    BlueFragment blueFragment= new BlueFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RedFragment redFragment= new RedFragment();
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.redFrgt, redFragment);
        //receives message from RedFragment
        fragmentTransaction.commit();
        android.support.v4.app.FragmentManager fragmentManager1 = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
        fragmentTransaction1.replace(R.id.fragmentContainer, blueFragment);
        fragmentTransaction1.commit();

    }

    @Override
    public void sendData(String message) {
        blueFragment.receive(message);
        System.out.println(message);
        //receives message from RedFragment
    }
}
