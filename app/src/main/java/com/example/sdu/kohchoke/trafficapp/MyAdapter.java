package com.example.sdu.kohchoke.trafficapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 37-SDU on 3/28/2018.
 */

//Class นี้ ทำหน้าที่สร้าง Layout เสมือน เพื่อนำไปแสดงบนหน้า MainActivity

public class MyAdapter extends BaseAdapter{
    //Explicit
    private Context context;
    private int[] ints; //เก็บข้อมูล Logo ป้ายจราจร
    private String[] titleStrings , detailStrings; //เก็บข้อมูลชื่อ Title กับ Detail ของข้อมูลป้ายจราจร

    public MyAdapter(Context context, int[] ints, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() { //ใช้สำหรับการนับจำนวนข้อมูลใร Array แล้วส่งข้อมูลไปยัง Method getView()
        return ints.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) { // รับข้อมูลจาก getCount() มาแสดงผลบนแอป

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //ผูกตัวแปรบน Java กับ Element ยน XML ที่หน้า My_listview
        ImageView imageView = view1.findViewById(R.id.imageView);
        TextView titleTextView = view1.findViewById(R.id.txv1);
        TextView detailTextView = view1.findViewById(R.id.txv2);

        //นำข้อมูลไปแสดงผลบน app
        imageView.setImageResource(ints[i]);
        titleTextView.setText(titleStrings[i]);
        detailTextView.setText(detailStrings[i]);

        return view1;
    }
}//end class