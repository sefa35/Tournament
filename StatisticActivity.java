package com.bakan.turnuva;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by BAKAN on 14.05.2018.
 */

public class StatisticActivity extends Activity{

    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.list_item, mobileArray);

        ListView listView = (ListView) findViewById(R.id.statistic_listview);
        listView.setAdapter(adapter);
    }
}
