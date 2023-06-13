package com.example.wirerope.wholeReelOperations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.example.wirerope.R;
import com.example.wirerope.database.ReelEntity;
import com.example.wirerope.databinding.ActivitySelectedReelCapacityBinding;

public class SelectedReelCapacity extends AppCompatActivity {
    ActivitySelectedReelCapacityBinding binding;
    ReelEntity reelEntity;
    Double gap;
    Double flangeDiameter;
    Double barrelDiameter;
    Double productDiameter;
    Double flangeInnerDistance;
    Double reelCapacity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySelectedReelCapacityBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        Intent intent=getIntent();
        reelEntity= (ReelEntity) intent.getSerializableExtra("info");
        binding.selectedBarrelText.setText(reelEntity.barrelDiameter);
        binding.selectedFlangeText.setText(reelEntity.flangeDiameter);
        binding.selectedTraverseText.setText(reelEntity.traverseDistance);
        binding.selectedSpoolButton.setEnabled(false);
        binding.selectedGap.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                binding.selectedGap.getText().toString().trim();
                if(binding.selectedGap.getText().toString().equals("")||binding.selectedProductDiameter.getText().toString().equals("")||binding.selectedProductDiameter.getText().toString().charAt(0)=='.'||binding.selectedGap.getText().toString().charAt(0)=='.'){
                    binding.selectedSpoolButton.setEnabled(false);
                }else{
                    binding.selectedSpoolButton.setEnabled(true);
                }


            }
        });
        binding.selectedProductDiameter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                binding.selectedProductDiameter.getText().toString().trim();
                if(binding.selectedGap.getText().toString().equals("")||binding.selectedProductDiameter.getText().toString().equals("")||binding.selectedProductDiameter.getText().toString().charAt(0)=='.'||binding.selectedGap.getText().toString().charAt(0)=='.'){
                    binding.selectedSpoolButton.setEnabled(false);
                }else{
                    binding.selectedSpoolButton.setEnabled(true);
                }
            }
        });




    }

    public void calculateSelected (View view){
        if(!binding.selectedGap.getText().toString().equals("")&&!binding.selectedProductDiameter.getText().toString().equals("")){
            gap=Double.parseDouble(binding.selectedGap.getText().toString());
            flangeDiameter=Double.parseDouble(binding.selectedFlangeText.getText().toString());
            barrelDiameter=Double.parseDouble(binding.selectedBarrelText.getText().toString());
            productDiameter=Double.parseDouble(binding.selectedProductDiameter.getText().toString());
            flangeInnerDistance=Double.parseDouble(binding.selectedTraverseText.getText().toString());
            reelCapacity=(flangeInnerDistance*((flangeDiameter-2*gap)*(flangeDiameter-2*gap)-(barrelDiameter*barrelDiameter))*(0.7854)/(((productDiameter*productDiameter))))/1000;
            binding.selectedResult.setText(String.format("%.0f", reelCapacity));
        }else{
            Toast.makeText(SelectedReelCapacity.this,"enter values",Toast.LENGTH_SHORT).show();
        }
    }

    public void clear(View view){
        binding.selectedGap.setText("");
        binding.selectedProductDiameter.setText("");
        binding.selectedResult.setText("");
    }

}