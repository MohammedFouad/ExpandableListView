package com.advancedtime.expandablelistview3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView listView;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ExpandableListView)findViewById(R.id.lvExp);
        initData();
        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);
    }

    private void initData(){

        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Android");
        listDataHeader.add("Java");
        listDataHeader.add("Windows");
        listDataHeader.add("Python");

        List<String> android = new ArrayList<>();
        android.add("num 1");
        android.add("num 2");
        android.add("num 3");
        android.add("num 4");

        List<String> java = new ArrayList<>();
        java.add("Day 1");
        java.add("Day 1");
        java.add("Day 5");


        List<String> windows = new ArrayList<>();
        windows.add("num 1");
      windows.add("num 2");
       windows.add("num 3");
       windows.add("num 4");

        List<String> python = new ArrayList<>();
       python.add("num 1");
       python.add("num 2");
        python.add("num 3");
        python.add("num 4");

        listHash.put(listDataHeader.get(0),android);
        listHash.put(listDataHeader.get(1),java);
        listHash.put(listDataHeader.get(2),windows);
        listHash.put(listDataHeader.get(3),python);

    }
}
