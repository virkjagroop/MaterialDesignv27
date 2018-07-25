package com.jagroop.materialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private ArrayList<String> contents;
    private Intent intent;

    private ListView listView;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        contents = new ArrayList<>();
        contents.add("Toolbar");
        contents.add("Navigation Drawer");
        contents.add("Nav Drawer Below Action Bar");
        contents.add("Edit Text");
        contents.add("Button");
        contents.add("Selection Controls");
        contents.add("Progress Bar");
        contents.add("Alert Dialogs");
        contents.add("Snackbar");
        contents.add("Bottom Navigation");
        contents.add("View Pag er");
        contents.add("Tab Layout");
        contents.add("Collapsing Toolbar");
        contents.add("Card View");
        contents.add("Recycler View");

        listView = findViewById(R.id.listView);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, contents);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d(TAG, "onItemClick: item number " + position + ". Name: " + contents.get(position));

                switch (position) {
                    case 0:
                        intent = new Intent(listView.getContext(), ToolbarActivity.class);
                        listView.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(listView.getContext(), NavDrawerActivity.class);
                        listView.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(listView.getContext(), NavDrawerBelowActivity.class);
                        listView.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(listView.getContext(), EditTextActivity.class);
                        listView.getContext().startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(listView.getContext(), ButtonActivity.class);
                        listView.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(listView.getContext(), SelectionControlsActivity.class);
                        listView.getContext().startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(listView.getContext(), ProgressBarActivity.class);
                        listView.getContext().startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(listView.getContext(), AlertDialogActivity.class);
                        listView.getContext().startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(listView.getContext(), SnakbarActivity .class);
                        listView.getContext().startActivity(intent);
                        break;
                    case 9:
                        intent = new Intent(listView.getContext(), BottomNavActivity .class);
                        listView.getContext().startActivity(intent);
                        break;
                    case 10:
                        intent = new Intent(listView.getContext(), ViewPagerActivity.class);
                        listView.getContext().startActivity(intent);
                        break;
                    case 11:
                        intent = new Intent(listView.getContext(), TabLayoutActivity.class);
                        listView.getContext().startActivity(intent);
                        break;
                    case 12:
                        intent = new Intent(listView.getContext(), CollapsingToolbarActivity.class);
                        listView.getContext().startActivity(intent);
                        break;
                    case 13:
                        intent = new Intent(listView.getContext(), CardViewActivity.class);
                        listView.getContext().startActivity(intent);
                        break;
                    case 14:
                        intent = new Intent(listView.getContext(), RecyclerViewActivity.class);
                        listView.getContext().startActivity(intent);
                        break;
                }
            }
        });


    }
}
