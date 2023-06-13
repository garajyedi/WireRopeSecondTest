package com.example.wirerope.wholeReelOperations.reelCapacityCalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.wirerope.databinding.ActivityReelCapacityCalculatorBinding;

public class ReelCapacityCalculator extends AppCompatActivity {
    ActivityReelCapacityCalculatorBinding binding;
    Double gap;
    Double flangeDiameter;
    Double coreDiameter;
    Double productDiameter;
    Double flangeInnerDistance;
    Double reelCapacity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityReelCapacityCalculatorBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
    }

    public void calculate(View view){
        gap=Double.parseDouble(binding.gapText.getText().toString());
        flangeDiameter=Double.parseDouble(binding.flangeDiameterText.getText().toString());
        coreDiameter=Double.parseDouble(binding.coreDiameterText.getText().toString());
        productDiameter=Double.parseDouble(binding.productDiameterText.getText().toString());
        flangeInnerDistance=Double.parseDouble(binding.flangeInnerDistanceText.getText().toString());
        reelCapacity=(flangeInnerDistance*((flangeDiameter-2*gap)*(flangeDiameter-2*gap)-(coreDiameter*coreDiameter))*(0.7854)/(((productDiameter*productDiameter))))/1000;
        binding.capacityResultText.setText(String.format("%.0f", reelCapacity));



    }
}