package com.example.binarytree;

import android.content.Intent;
import android.view.View;

public class BinaryTree2
{
    private int payload;
    private BinaryTree2 left;
    private BinaryTree2 right;

    public BinaryTree2(int payload)
    {
        this.payload = payload;
        this.left = null;
        this.right = null;
    }

    public void visitInOrder()
    {
        if(this.left != null)
        {
            this.left.visitInOrder(); //blocking call
        }
        System.out.println("****" + this.payload);
        if(this.right != null)
        {
            this.right.visitInOrder();
        }
    }
    public void leftTreeButtonClicked(View v)
    {
        Intent i = new Intent(this, BinaryTree2.class);
        i.putExtra("tr", tr.LeftTree);
        this.startActivity(i);
    }
    public void rightTreeButtonClicked(View v)
    {
        Intent i = new Intent(this, BinaryTree2.class);
        i.putExtra("tr", tr.RightTree);
        this.startActivity(i);
    }

    public void add(int payloadToAdd)
    {
        if(payloadToAdd <= this.payload)
        {
            //add to left
            if(this.left == null)
            {
                this.left = new BinaryTree2(payloadToAdd);
            }
            else
            {
                this.left.add(payloadToAdd);
            }
        }
        else
        {
            //add to the right
            if(this.right == null)
            {
                this.right = new BinaryTree2(payloadToAdd);
            }
            else
            {
                this.right.add(payloadToAdd);
            }
        }
    }

}
