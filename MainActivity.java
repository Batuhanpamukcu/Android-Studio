package com.batuhanpamukcu.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.batuhanpamukcu.landmarkbook.databinding.ActivityDetailsBinding;
import com.batuhanpamukcu.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Landmark> landmarkArrayList;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>();

        Landmark pisa = new Landmark("pisa", "Italy", R.drawable.pisa);
        Landmark eifel = new Landmark("eifel", "France", R.drawable.eifel);
        Landmark collesseum = new Landmark("collesseum", "Italy", R.drawable.pisa);
        Landmark londonbridge = new Landmark("landonbridge", "UK", R.drawable.pisa);

        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eifel);
        landmarkArrayList.add(collesseum);
        landmarkArrayList.add(londonbridge);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);

    }
}