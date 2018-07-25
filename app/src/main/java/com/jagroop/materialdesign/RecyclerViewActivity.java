package com.jagroop.materialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class RecyclerViewActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private int[] userImg = new int[] {
            R.drawable.recycleimg1,
            R.drawable.recycleimg2,
            R.drawable.recycleimg3,
            R.drawable.recycleimg4,
            R.drawable.recycleimg5,
            R.drawable.recycleimg6,
            R.drawable.recycleimg7,
            R.drawable.recycleimg8,
            R.drawable.recycleimg9,
            R.drawable.recycleimg10,
            R.drawable.recycleimg11,
            R.drawable.recycleimg12,
            R.drawable.recycleimg13,
            R.drawable.recycleimg14,
            R.drawable.recycleimg15
    };

    private String [] userNames = new String [] {
            "User1",
            "User2",
            "User3",
            "User4",
            "User5",
            "User6",
            "User7",
            "User8",
            "User9",
            "User10",
            "User11",
            "User12",
            "User13",
            "User14",
            "User15"
    };

    private String [] userDes = new String [] {
            "Description1",
            "Description2",
            "Description3",
            "Description4",
            "Description5",
            "Description6",
            "Description7",
            "Description8",
            "Description9",
            "Description10",
            "Description11",
            "Description12",
            "Description13",
            "Description14",
            "Description15"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        toolbar = findViewById(R.id.toolbar_recyclerView);
        setActionBar(toolbar);


    }
}
