package com.batuhanpamukcu.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.batuhanpamukcu.landmarkbook.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {
    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        // view binding yontemi kullanmak findViewById yontemine gore daha efficient bir yontem.
        // bunu yaparak activitydeki layoutlara erisim saglanır.

        Intent intent = getIntent();
        Landmark selectedLandmark = (Landmark) intent.getSerializableExtra("landmark");

        binding.nameText.setText(selectedLandmark.name);
        binding.countryText.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.image);


    }
}