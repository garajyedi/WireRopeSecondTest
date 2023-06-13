package com.example.wirerope.wholeReelOperations;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.example.wirerope.database.ReelDao;
import com.example.wirerope.database.ReelDatabase;
import com.example.wirerope.database.ReelEntity;
import com.example.wirerope.databinding.ActivityReelDetailsBinding;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class ReelDetails extends AppCompatActivity {
    ActivityReelDetailsBinding binding;
    ReelEntity reelEntity;
    ReelDatabase db;
    ReelDao reelDao;
    private CompositeDisposable compositeDisposable=new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityReelDetailsBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        Intent intent=getIntent();
        reelEntity= (ReelEntity) intent.getSerializableExtra("info");
        db= Room.databaseBuilder(getApplicationContext(),ReelDatabase.class,"Reels").build();
        reelDao=db.reelDao();

        getData();


    }

    public void getData(){
        binding.barrelDetailText.setText(reelEntity.barrelDiameter);
        binding.flangeDetailText.setText(reelEntity.flangeDiameter);
        binding.traverseDetailText.setText(reelEntity.traverseDistance);
        binding.spoolNameDetailText.setText(reelEntity.spoolName);
        binding.noteDetailText.setText(reelEntity.note);

    }

    public void deleteRegisteredReel(View view){
        compositeDisposable.add(reelDao.delete(reelEntity).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe());
        Intent intent=new Intent(ReelDetails.this,ReelGallery.class);
        startActivity(intent);
    }

}