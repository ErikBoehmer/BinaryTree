package com.example.binarytree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BinaryTree2 bt = new BinaryTree2(5);
        bt.add(3);
        bt.add(3);
        bt.add(8);
        bt.add(6);
    }
}
