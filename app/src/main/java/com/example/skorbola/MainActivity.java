package com.example.skorbola;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.chelsea,R.drawable.mancity,R.drawable.manutd,R.drawable.westham,R.drawable.leicester,
            R.drawable.liverpool,R.drawable.everton,R.drawable.fulham,R.drawable.newcastle,R.drawable.arsenal,
            R.drawable.tottenham,R.drawable.brighton};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.club_bola);
        s2 = getResources().getStringArray(R.array.desription);

        MyAdaptor myAdaptor = new MyAdaptor(this, s1, s2, images);
        recyclerView.setAdapter(myAdaptor);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}