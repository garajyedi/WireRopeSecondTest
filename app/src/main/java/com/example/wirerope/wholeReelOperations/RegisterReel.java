package com.example.wirerope.wholeReelOperations;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.example.wirerope.database.ReelDao;
import com.example.wirerope.database.ReelDatabase;
import com.example.wirerope.database.ReelEntity;
import com.example.wirerope.databinding.ActivityRegisterReelBinding;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class RegisterReel extends AppCompatActivity {
    ActivityRegisterReelBinding binding;
    String barrelDiameter;
    String flangeDiameter;
    String traverseDistance;
    String spoolName;
    String note;
    ReelDatabase db;
    ReelDao reelDao;
    private CompositeDisposable compositeDisposable=new CompositeDisposable();
    ReelEntity reelEntity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRegisterReelBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        db= Room.databaseBuilder(getApplicationContext(),ReelDatabase.class,"Reels").build();
        reelDao=db.reelDao();
    }

    public void registerSpool(View view){
        barrelDiameter=binding.barrelDiameterRegisterText.getText().toString();
        flangeDiameter=binding.flangeDiameterRegisterText.getText().toString();
        traverseDistance=binding.traverseDistanceRegisterText.getText().toString();
        spoolName=binding.spoolNameRegisterText.getText().toString();
        note=binding.noteRegisterText.getText().toString();
        reelEntity=new ReelEntity(barrelDiameter,flangeDiameter,traverseDistance,spoolName,note);


        compositeDisposable.add(reelDao.insert(reelEntity).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(RegisterReel.this::handleResponse));





    }
    private void handleResponse(){
        Intent intent=new Intent(RegisterReel.this, ReelGallery.class);
        startActivity(intent);

    }

}