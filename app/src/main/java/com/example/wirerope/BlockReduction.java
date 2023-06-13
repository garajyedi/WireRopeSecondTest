package com.example.wirerope;

import static java.lang.Math.sqrt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.example.wirerope.databinding.ActivityBlockReductionBinding;

import java.util.ArrayList;

public class BlockReduction extends AppCompatActivity {
    ActivityBlockReductionBinding binding;


    Double block1D;
    Double block2D;
    Double block3D;
    Double block4D;
    Double block5D;
    Double block6D;
    Double block7D;
    Double block8D;
    Double block9D;
    Double block10D;
    Double block11D;
    Double block12D;
    Double block13D;
    Double block14D;
    Double block15D;

    Double block1R;
    Double block2R;
    Double block3R;
    Double block4R;
    Double block5R;
    Double block6R;
    Double block7R;
    Double block8R;
    Double block9R;
    Double block10R;
    Double block11R;
    Double block12R;
    Double block13R;
    Double block14R;
    Double block15R;
    Double reduction;

    Double inletDiameter;
    Double diameter;
    int blockInletDiameter1C;
    int block1DiameterC;
    int block2DiameterC;
    int block3DiameterC;
    int block4DiameterC;
    int block5DiameterC;
    int block6DiameterC;
    int block7DiameterC;
    int block8DiameterC;
    int block9DiameterC;
    int block10DiameterC;
    int block11DiameterC;
    int block12DiameterC;
    int block13DiameterC;
    int block14DiameterC;
    int block15DiameterC;
    int blockInletDiameter2C;
    int block1ReductionC;
    int block2ReductionC;
    int block3ReductionC;
    int block4ReductionC;
    int block5ReductionC;
    int block6ReductionC;
    int block7ReductionC;
    int block8ReductionC;
    int block9ReductionC;
    int block10ReductionC;
    int block11ReductionC;
    int block12ReductionC;
    int block13ReductionC;
    int block14ReductionC;
    int block15ReductionC;
    int idNumber;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBlockReductionBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.clear1Button.setEnabled(false);
        binding.clear2Button.setEnabled(false);
        binding.blockInletDiameter1.addTextChangedListener(textWatcher);
        binding.block1Diameter.addTextChangedListener(textWatcher);
        binding.block2Diameter.addTextChangedListener(textWatcher);
        binding.block3Diameter.addTextChangedListener(textWatcher);
        binding.block4Diameter.addTextChangedListener(textWatcher);
        binding.block5Diameter.addTextChangedListener(textWatcher);
        binding.block6Diameter.addTextChangedListener(textWatcher);
        binding.block7Diameter.addTextChangedListener(textWatcher);
        binding.block8Diameter.addTextChangedListener(textWatcher);
        binding.block9Diameter.addTextChangedListener(textWatcher);
        binding.block10Diameter.addTextChangedListener(textWatcher);
        binding.block11Diameter.addTextChangedListener(textWatcher);
        binding.block12Diameter.addTextChangedListener(textWatcher);
        binding.block13Diameter.addTextChangedListener(textWatcher);
        binding.block14Diameter.addTextChangedListener(textWatcher);
        binding.block15Diameter.addTextChangedListener(textWatcher);

        binding.blockInletDiameter2.addTextChangedListener(textWatcher);
        binding.blockReduction1.addTextChangedListener(textWatcher);
        binding.blockReduction2.addTextChangedListener(textWatcher);
        binding.blockReduction3.addTextChangedListener(textWatcher);
        binding.blockReduction4.addTextChangedListener(textWatcher);
        binding.blockReduction5.addTextChangedListener(textWatcher);
        binding.blockReduction6.addTextChangedListener(textWatcher);
        binding.blockReduction7.addTextChangedListener(textWatcher);
        binding.blockReduction8.addTextChangedListener(textWatcher);
        binding.blockReduction9.addTextChangedListener(textWatcher);
        binding.blockReduction10.addTextChangedListener(textWatcher);
        binding.blockReduction11.addTextChangedListener(textWatcher);
        binding.blockReduction12.addTextChangedListener(textWatcher);
        binding.blockReduction13.addTextChangedListener(textWatcher);
        binding.blockReduction14.addTextChangedListener(textWatcher);
        binding.blockReduction15.addTextChangedListener(textWatcher);



    }

    public void clear1(View view){
        binding.blockInletDiameter1.setText("");
        binding.block1Diameter.setText("");
        binding.block2Diameter.setText("");
        binding.block3Diameter.setText("");
        binding.block4Diameter.setText("");
        binding.block5Diameter.setText("");
        binding.block6Diameter.setText("");
        binding.block7Diameter.setText("");
        binding.block8Diameter.setText("");
        binding.block9Diameter.setText("");
        binding.block10Diameter.setText("");
        binding.block11Diameter.setText("");
        binding.block12Diameter.setText("");
        binding.block13Diameter.setText("");
        binding.block14Diameter.setText("");
        binding.block15Diameter.setText("");
        binding.clear1Button.setEnabled(false);

    }
    public void clear2(View view){
        binding.blockInletDiameter2.setText("");
        binding.blockReduction1.setText("");
        binding.blockReduction2.setText("");
        binding.blockReduction3.setText("");
        binding.blockReduction4.setText("");
        binding.blockReduction5.setText("");
        binding.blockReduction6.setText("");
        binding.blockReduction7.setText("");
        binding.blockReduction8.setText("");
        binding.blockReduction9.setText("");
        binding.blockReduction10.setText("");
        binding.blockReduction11.setText("");
        binding.blockReduction12.setText("");
        binding.blockReduction13.setText("");
        binding.blockReduction14.setText("");
        binding.blockReduction15.setText("");
        binding.clear2Button.setEnabled(false);

    }



    TextWatcher textWatcher=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            binding.clear1Button.setEnabled(true);
            binding.clear2Button.setEnabled(true);
        }

        @SuppressLint("DefaultLocale")
        @Override
        public void afterTextChanged(Editable s) {
            if(!binding.blockInletDiameter1.getText().toString().equals("")){
                blockInletDiameter1C=0;
                inletDiameter=Double.parseDouble(binding.blockInletDiameter1.getText().toString());
                blockInletDiameter1C=1;
            }else{
                blockInletDiameter1C=2;
            }

            if(!binding.block1Diameter.getText().toString().equals("")){
                block1DiameterC=0;
                block1D=Double.parseDouble(binding.block1Diameter.getText().toString());
                block1DiameterC=1;
            }
            else{
                block1DiameterC=2;
            }
            if(blockInletDiameter1C==1&&block1DiameterC==1){
                reduction= ((1-(block1D/inletDiameter)*(block1D/inletDiameter))*100);
                binding.block1Reduction.setText(String.format("%.2f", reduction));

            }
            else{
                binding.block1Reduction.setText("");
            }

            if(!binding.block2Diameter.getText().toString().equals("")){
                block2DiameterC=0;
                block2D=Double.parseDouble(binding.block2Diameter.getText().toString());
                block2DiameterC=1;
            }else{
                block2DiameterC=2;
            }

            if(block2DiameterC==1&&block1DiameterC==1){

                reduction= ((1-(block2D/block1D)*(block2D/block1D))*100);
                binding.block2Reduction.setText(String.format("%.2f", reduction));
            }
            else{
                binding.block2Reduction.setText("");
            }


            if(!binding.block3Diameter.getText().toString().equals("")){
                block3DiameterC=0;
                block3D=Double.parseDouble(binding.block3Diameter.getText().toString());
                block3DiameterC=1;
            }else{
                block3DiameterC=2;
            }

            if(block3DiameterC==1&&block2DiameterC==1){

                reduction= ((1-(block3D/block2D)*(block3D/block2D))*100);
                binding.block3Reduction.setText(String.format("%.2f", reduction));
            }
            else{
                binding.block3Reduction.setText("");
            }

            if(!binding.block4Diameter.getText().toString().equals("")){
                block4DiameterC=0;
                block4D=Double.parseDouble(binding.block4Diameter.getText().toString());
                block4DiameterC=1;
            }else{
                block4DiameterC=2;
            }

            if(block4DiameterC==1&&block3DiameterC==1){

                reduction= ((1-(block4D/block3D)*(block4D/block3D))*100);
                binding.block4Reduction.setText(String.format("%.2f", reduction));
            }
            else{
                binding.block4Reduction.setText("");
            }


            if(!binding.block5Diameter.getText().toString().equals("")){
                block5DiameterC=0;
                block5D=Double.parseDouble(binding.block5Diameter.getText().toString());
                block5DiameterC=1;
            }else{
                block5DiameterC=2;
            }

            if(block5DiameterC==1&&block4DiameterC==1){

                reduction= ((1-(block5D/block4D)*(block5D/block4D))*100);
                binding.block5Reduction.setText(String.format("%.2f", reduction));
            }
            else{
                binding.block5Reduction.setText("");
            }

            if(!binding.block6Diameter.getText().toString().equals("")){
                block6DiameterC=0;
                block6D=Double.parseDouble(binding.block6Diameter.getText().toString());
                block6DiameterC=1;
            }else{
                block6DiameterC=2;
            }

            if(block6DiameterC==1&&block5DiameterC==1){

                reduction= ((1-(block6D/block5D)*(block6D/block5D))*100);
                binding.block6Reduction.setText(String.format("%.2f", reduction));
            }
            else{
                binding.block6Reduction.setText("");
            }


            if(!binding.block7Diameter.getText().toString().equals("")){
                block7DiameterC=0;
                block7D=Double.parseDouble(binding.block7Diameter.getText().toString());
                block7DiameterC=1;
            }else{
                block7DiameterC=2;
            }

            if(block7DiameterC==1&&block6DiameterC==1){

                reduction= ((1-(block7D/block6D)*(block7D/block6D))*100);
                binding.block7Reduction.setText(String.format("%.2f", reduction));
            }
            else{
                binding.block7Reduction.setText("");
            }


            if(!binding.block8Diameter.getText().toString().equals("")){
                block8DiameterC=0;
                block8D=Double.parseDouble(binding.block8Diameter.getText().toString());
                block8DiameterC=1;
            }else{
                block8DiameterC=2;
            }

            if(block8DiameterC==1&&block7DiameterC==1){

                reduction= ((1-(block8D/block7D)*(block8D/block7D))*100);
                binding.block8Reduction.setText(String.format("%.2f", reduction));
            }
            else{
                binding.block8Reduction.setText("");
            }


            if(!binding.block9Diameter.getText().toString().equals("")){
                block9DiameterC=0;
                block9D=Double.parseDouble(binding.block9Diameter.getText().toString());
                block9DiameterC=1;
            }else{
                block9DiameterC=2;
            }

            if(block9DiameterC==1&&block8DiameterC==1){

                reduction= ((1-(block9D/block8D)*(block9D/block8D))*100);
                binding.block9Reduction.setText(String.format("%.2f", reduction));
            }
            else{
                binding.block9Reduction.setText("");
            }


            if(!binding.block10Diameter.getText().toString().equals("")){
                block10DiameterC=0;
                block10D=Double.parseDouble(binding.block10Diameter.getText().toString());
                block10DiameterC=1;
            }else{
                block10DiameterC=2;
            }

            if(block10DiameterC==1&&block9DiameterC==1){

                reduction= ((1-(block10D/block9D)*(block10D/block9D))*100);
                binding.block10Reduction.setText(String.format("%.2f", reduction));
            }
            else{
                binding.block10Reduction.setText("");
            }


            if(!binding.block11Diameter.getText().toString().equals("")){
                block11DiameterC=0;
                block11D=Double.parseDouble(binding.block11Diameter.getText().toString());
                block11DiameterC=1;
            }else{
                block11DiameterC=2;
            }

            if(block11DiameterC==1&&block10DiameterC==1){

                reduction= ((1-(block11D/block10D)*(block11D/block10D))*100);
                binding.block11Reduction.setText(String.format("%.2f", reduction));
            }
            else{
                binding.block11Reduction.setText("");
            }


            if(!binding.block12Diameter.getText().toString().equals("")){
                block12DiameterC=0;
                block12D=Double.parseDouble(binding.block12Diameter.getText().toString());
                block12DiameterC=1;
            }else{
                block12DiameterC=2;
            }

            if(block12DiameterC==1&&block11DiameterC==1){

                reduction= ((1-(block12D/block11D)*(block12D/block11D))*100);
                binding.block12Reduction.setText(String.format("%.2f", reduction));
            }
            else{
                binding.block12Reduction.setText("");
            }


            if(!binding.block13Diameter.getText().toString().equals("")){
                block13DiameterC=0;
                block13D=Double.parseDouble(binding.block13Diameter.getText().toString());
                block13DiameterC=1;
            }else{
                block13DiameterC=2;
            }

            if(block13DiameterC==1&&block12DiameterC==1){

                reduction= ((1-(block13D/block12D)*(block13D/block12D))*100);
                binding.block13Reduction.setText(String.format("%.2f", reduction));
            }
            else{
                binding.block13Reduction.setText("");
            }


            if(!binding.block14Diameter.getText().toString().equals("")){
                block14DiameterC=0;
                block14D=Double.parseDouble(binding.block14Diameter.getText().toString());
                block14DiameterC=1;
            }else{
                block14DiameterC=2;
            }

            if(block14DiameterC==1&&block13DiameterC==1){

                reduction= ((1-(block14D/block13D)*(block14D/block13D))*100);
                binding.block14Reduction.setText(String.format("%.2f", reduction));
            }
            else{
                binding.block14Reduction.setText("");
            }


            if(!binding.block15Diameter.getText().toString().equals("")){
                block15DiameterC=0;
                block15D=Double.parseDouble(binding.block15Diameter.getText().toString());
                block15DiameterC=1;
            }else{
                block15DiameterC=2;
            }

            if(block15DiameterC==1&&block14DiameterC==1){

                reduction= ((1-(block15D/block14D)*(block15D/block14D))*100);
                binding.block15Reduction.setText(String.format("%.2f", reduction));
            }
            else{
                binding.block15Reduction.setText("");
            }






            if(!binding.blockInletDiameter2.getText().toString().equals("")){
                blockInletDiameter2C=0;
                inletDiameter=Double.parseDouble(binding.blockInletDiameter2.getText().toString());
                blockInletDiameter2C=1;
            }else{
                blockInletDiameter2C=2;


            }
            if(!binding.blockReduction1.getText().toString().equals("")){
                block1ReductionC=0;
                block1R=Double.parseDouble(binding.blockReduction1.getText().toString());
                block1ReductionC=1;
            }
            else{
                block1ReductionC=2;
                binding.blockDiameter1.setText("");
            }

             if(blockInletDiameter2C==1&&block1ReductionC==1){
                 diameter= (inletDiameter*(sqrt(1-block1R/100)));
                 binding.blockDiameter1.setText(String.format("%.3f", diameter));
             }
             else{
                 binding.blockDiameter1.setText("");
             }


            if(!binding.blockReduction2.getText().toString().equals("")){
                block2ReductionC=0;
                block2R=Double.parseDouble(binding.blockReduction2.getText().toString());
                block2ReductionC=1;
            }else{
                block2ReductionC=2;
                binding.blockDiameter2.setText("");
            }

            if(block2ReductionC==1&&block1ReductionC==1){
                diameter= ((Double.parseDouble(binding.blockDiameter1.getText().toString()))*(sqrt(1-block2R/100)));
                binding.blockDiameter2.setText(String.format("%.3f", diameter));
            }
            else{
                binding.blockDiameter2.setText("");
            }


            if(!binding.blockReduction3.getText().toString().equals("")){
                block3ReductionC=0;
                block3R=Double.parseDouble(binding.blockReduction3.getText().toString());
                block3ReductionC=1;
            }else{
                block3ReductionC=2;
                binding.blockDiameter3.setText("");
            }
            if(block3ReductionC==1&&block2ReductionC==1){
                diameter= ((Double.parseDouble(binding.blockDiameter2.getText().toString()))*(sqrt(1-block3R/100)));
                binding.blockDiameter3.setText(String.format("%.3f", diameter));
            }
            else{
                binding.blockDiameter3.setText("");
            }


            if(!binding.blockReduction4.getText().toString().equals("")){
                block4ReductionC=0;
                block4R=Double.parseDouble(binding.blockReduction4.getText().toString());
                block4ReductionC=1;
            }else{
                block4ReductionC=2;
                binding.blockDiameter4.setText("");
            }
            if(block4ReductionC==1&&block3ReductionC==1){
                diameter= ((Double.parseDouble(binding.blockDiameter3.getText().toString()))*(sqrt(1-block4R/100)));
                binding.blockDiameter4.setText(String.format("%.3f", diameter));
            }
            else{
                binding.blockDiameter4.setText("");
            }


            if(!binding.blockReduction5.getText().toString().equals("")){
                block5ReductionC=0;
                block5R=Double.parseDouble(binding.blockReduction5.getText().toString());
                block5ReductionC=1;
            }else{
                block5ReductionC=2;
                binding.blockDiameter5.setText("");
            }
            if(block5ReductionC==1&&block4ReductionC==1){
                diameter= ((Double.parseDouble(binding.blockDiameter4.getText().toString()))*(sqrt(1-block5R/100)));
                binding.blockDiameter5.setText(String.format("%.3f", diameter));
            }
            else{
                binding.blockDiameter5.setText("");
            }


            if(!binding.blockReduction6.getText().toString().equals("")){
                block6ReductionC=0;
                block6R=Double.parseDouble(binding.blockReduction6.getText().toString());
                block6ReductionC=1;
            }else{
                block6ReductionC=2;
                binding.blockDiameter6.setText("");
            }
            if(block6ReductionC==1&&block5ReductionC==1){
                diameter= ((Double.parseDouble(binding.blockDiameter5.getText().toString()))*(sqrt(1-block6R/100)));
                binding.blockDiameter6.setText(String.format("%.3f", diameter));
            }
            else{
                binding.blockDiameter6.setText("");
            }


            if(!binding.blockReduction7.getText().toString().equals("")){
                block7ReductionC=0;
                block7R=Double.parseDouble(binding.blockReduction7.getText().toString());
                block7ReductionC=1;
            }else{
                block7ReductionC=2;
                binding.blockDiameter7.setText("");
            }
            if(block7ReductionC==1&&block6ReductionC==1){
                diameter= ((Double.parseDouble(binding.blockDiameter6.getText().toString()))*(sqrt(1-block7R/100)));
                binding.blockDiameter7.setText(String.format("%.3f", diameter));
            }
            else{
                binding.blockDiameter7.setText("");
            }


            if(!binding.blockReduction8.getText().toString().equals("")){
                block8ReductionC=0;
                block8R=Double.parseDouble(binding.blockReduction8.getText().toString());
                block8ReductionC=1;
            }else{
                block8ReductionC=2;
                binding.blockDiameter8.setText("");
            }
            if(block8ReductionC==1&&block7ReductionC==1){
                diameter= ((Double.parseDouble(binding.blockDiameter7.getText().toString()))*(sqrt(1-block8R/100)));
                binding.blockDiameter8.setText(String.format("%.3f", diameter));
            }
            else{
                binding.blockDiameter8.setText("");
            }


            if(!binding.blockReduction9.getText().toString().equals("")){
                block9ReductionC=0;
                block9R=Double.parseDouble(binding.blockReduction9.getText().toString());
                block9ReductionC=1;
            }else{
                block9ReductionC=2;
                binding.blockDiameter9.setText("");
            }
            if(block9ReductionC==1&&block8ReductionC==1){
                diameter= ((Double.parseDouble(binding.blockDiameter8.getText().toString()))*(sqrt(1-block9R/100)));
                binding.blockDiameter9.setText(String.format("%.3f", diameter));
            }
            else{
                binding.blockDiameter9.setText("");
            }


            if(!binding.blockReduction10.getText().toString().equals("")){
                block10ReductionC=0;
                block10R=Double.parseDouble(binding.blockReduction10.getText().toString());
                block10ReductionC=1;
            }else{
                block10ReductionC=2;
                binding.blockDiameter10.setText("");
            }
            if(block10ReductionC==1&&block9ReductionC==1){
                diameter= ((Double.parseDouble(binding.blockDiameter9.getText().toString()))*(sqrt(1-block10R/100)));
                binding.blockDiameter10.setText(String.format("%.3f", diameter));
            }
            else{
                binding.blockDiameter10.setText("");
            }


            if(!binding.blockReduction11.getText().toString().equals("")){
                block11ReductionC=0;
                block11R=Double.parseDouble(binding.blockReduction11.getText().toString());
                block11ReductionC=1;
            }else{
                block11ReductionC=2;
                binding.blockDiameter11.setText("");
            }
            if(block11ReductionC==1&&block10ReductionC==1){
                diameter= ((Double.parseDouble(binding.blockDiameter10.getText().toString()))*(sqrt(1-block11R/100)));
                binding.blockDiameter11.setText(String.format("%.3f", diameter));
            }
            else{
                binding.blockDiameter11.setText("");
            }


            if(!binding.blockReduction12.getText().toString().equals("")){
                block12ReductionC=0;
                block12R=Double.parseDouble(binding.blockReduction12.getText().toString());
                block12ReductionC=1;
            }else{
                block12ReductionC=2;
                binding.blockDiameter12.setText("");
            }
            if(block12ReductionC==1&&block11ReductionC==1){
                diameter= ((Double.parseDouble(binding.blockDiameter11.getText().toString()))*(sqrt(1-block12R/100)));
                binding.blockDiameter12.setText(String.format("%.3f", diameter));
            }
            else{
                binding.blockDiameter12.setText("");
            }


            if(!binding.blockReduction13.getText().toString().equals("")){
                block13ReductionC=0;
                block13R=Double.parseDouble(binding.blockReduction13.getText().toString());
                block13ReductionC=1;
            }else{
                block13ReductionC=2;
                binding.blockDiameter13.setText("");
            }
            if(block13ReductionC==1&&block12ReductionC==1){
                diameter= ((Double.parseDouble(binding.blockDiameter12.getText().toString()))*(sqrt(1-block13R/100)));
                binding.blockDiameter13.setText(String.format("%.3f", diameter));
            }
            else{
                binding.blockDiameter13.setText("");
            }


            if(!binding.blockReduction14.getText().toString().equals("")){
                block14ReductionC=0;
                block14R=Double.parseDouble(binding.blockReduction14.getText().toString());
                block14ReductionC=1;
            }else{
                block14ReductionC=2;
                binding.blockDiameter14.setText("");
            }
            if(block14ReductionC==1&&block13ReductionC==1){
                diameter= ((Double.parseDouble(binding.blockDiameter13.getText().toString()))*(sqrt(1-block14R/100)));
                binding.blockDiameter14.setText(String.format("%.3f", diameter));
            }
            else{
                binding.blockDiameter14.setText("");
            }


            if(!binding.blockReduction15.getText().toString().equals("")){
                block15ReductionC=0;
                block15R=Double.parseDouble(binding.blockReduction15.getText().toString());
                block15ReductionC=1;
            }else{
                block15ReductionC=2;
                binding.blockDiameter15.setText("");
            }
            if(block15ReductionC==1&&block14ReductionC==1){
                diameter= ((Double.parseDouble(binding.blockDiameter14.getText().toString()))*(sqrt(1-block15R/100)));
                binding.blockDiameter15.setText(String.format("%.3f", diameter));
            }
            else{
                binding.blockDiameter15.setText("");
            }


    };



};



}







