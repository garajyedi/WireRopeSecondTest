package com.example.wirerope.wholeReelOperations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;

import com.example.wirerope.database.ReelDao;
import com.example.wirerope.database.ReelDatabase;
import com.example.wirerope.database.ReelEntity;
import com.example.wirerope.databinding.ActivityReelGalleryBinding;

import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class ReelGallery extends AppCompatActivity {
    ActivityReelGalleryBinding binding;
    ReelDatabase db;
    ReelDao reelDao;
    private CompositeDisposable compositeDisposable=new CompositeDisposable();
    ReelAdapter reelAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityReelGalleryBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        db= Room.databaseBuilder(getApplicationContext(),ReelDatabase.class,"Reels").build();
        reelDao=db.reelDao();
        compositeDisposable.add(reelDao.getAll().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(ReelGallery.this::handleResponse));

    }

    private void handleResponse(List<ReelEntity> reelEntityList){
reelAdapter=new ReelAdapter(reelEntityList);
binding.recyclerView.setAdapter(reelAdapter);
binding.recyclerView.setLayoutManager(new LinearLayoutManager(ReelGallery.this));


    }
}