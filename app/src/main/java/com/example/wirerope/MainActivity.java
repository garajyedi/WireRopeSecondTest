package com.example.wirerope;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.wirerope.databinding.ActivityMainBinding;
import com.example.wirerope.reduction.ReductionCalculation;
import com.example.wirerope.wholeReelOperations.ReelGallery;
import com.example.wirerope.wholeReelOperations.RegisterReel;
import com.example.wirerope.wholeReelOperations.reelCapacityCalculator.ReelCapacityCalculator;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.rope_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.reduction_menu){
            Intent intentToReduction=new Intent(MainActivity.this, ReductionCalculation.class);
            startActivity(intentToReduction);
        }else if(item.getItemId()==R.id.register_reel){
            Intent intent=new Intent(MainActivity.this, ReelCapacityCalculator.class);
            startActivity(intent);
        }
        else if(item.getItemId()==R.id.register_spool){
            Intent intent=new Intent(MainActivity.this, RegisterReel.class);
            startActivity(intent);
        }
        else if(item.getItemId()==R.id.reel_gallery){
            Intent intent=new Intent(MainActivity.this, ReelGallery.class);
            startActivity(intent);
        }
        else if(item.getItemId()==R.id.block_reduction){
            Intent intent=new Intent(MainActivity.this, BlockReduction.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}