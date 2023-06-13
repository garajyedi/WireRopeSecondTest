package com.example.wirerope.reduction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.example.wirerope.databinding.ActivityReductionCalculationBinding;

public class ReductionCalculation extends AppCompatActivity {
    ActivityReductionCalculationBinding binding;
    Double inletDiameter;
    Double outletDiameter;
    Double reduction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityReductionCalculationBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.reductionCalculationButton.setEnabled(false);


        binding.inletDiameterText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                binding.inletDiameterText.getText().toString().trim();
                if (binding.outletDiameterText.getText().toString().equals("") || binding.outletDiameterText.getText().charAt(0) == '.' || binding.inletDiameterText.getText().toString().equals("") || binding.inletDiameterText.getText().charAt(0) == '.') {
                    binding.reductionCalculationButton.setEnabled(false);
                } else {
                    inletDiameter = Double.parseDouble(binding.inletDiameterText.getText().toString());
                    binding.reductionCalculationButton.setEnabled(true);
                }
            }


        });

        binding.outletDiameterText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                binding.outletDiameterText.getText().toString().trim();
                if (binding.outletDiameterText.getText().toString().equals("") || binding.outletDiameterText.getText().charAt(0) == '.' || binding.inletDiameterText.getText().toString().equals("") || binding.inletDiameterText.getText().charAt(0) == '.') {
                    binding.reductionCalculationButton.setEnabled(false);
                } else {
                    outletDiameter = Double.parseDouble(binding.outletDiameterText.getText().toString());
                    binding.reductionCalculationButton.setEnabled(true);
                }
            }
        });
    }

    public void reductionCalculation(View view) {
        inletDiameter = Double.valueOf(binding.inletDiameterText.getText().toString());
        outletDiameter = Double.valueOf(binding.outletDiameterText.getText().toString());
        if (inletDiameter > outletDiameter) {
            if (binding.inletDiameterText.getText().toString().equals("") || binding.outletDiameterText.getText().toString().equals("")) {
                Toast.makeText(ReductionCalculation.this, "fill the blanks", Toast.LENGTH_SHORT).show();
            } else {
                reduction = ((1 - (outletDiameter / inletDiameter) * (outletDiameter / inletDiameter)) * 100);
                binding.calculationResultText.setText(String.format("%.2f", reduction));
            }
        } else {
            Toast.makeText(ReductionCalculation.this, "outlet can not be bigger or equal to inlet", Toast.LENGTH_SHORT).show();
        }
    }

    public void clearReduction(View view) {
        binding.inletDiameterText.setText("");
        binding.outletDiameterText.setText("");
        binding.calculationResultText.setText("");

    }

}
