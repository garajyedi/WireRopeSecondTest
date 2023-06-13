package com.example.wirerope.wholeReelOperations;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wirerope.MainActivity;
import com.example.wirerope.database.ReelEntity;
import com.example.wirerope.databinding.RecyclerRowBinding;

import java.util.List;

public class ReelAdapter extends RecyclerView.Adapter<ReelAdapter.ReelHolder> {
    List<ReelEntity> reelEntityList;

    public ReelAdapter(List<ReelEntity> reelEntityList) {
        this.reelEntityList = reelEntityList;
    }

    @NonNull
    @Override
    public ReelHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding binding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ReelHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ReelHolder holder, int position) {
        holder.binding.recyclerViewSpoolNameText.setText(reelEntityList.get(position).spoolName);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(holder.itemView.getContext(), ReelDetails.class);
                intent.putExtra("info",reelEntityList.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent=new Intent(holder.itemView.getContext(), SelectedReelCapacity.class);
                intent.putExtra("info",reelEntityList.get(position));
                holder.itemView.getContext().startActivity(intent);
                return false;
            }
        });

    }

    @Override
    public int getItemCount() {
        return reelEntityList.size();
    }

    public class ReelHolder extends RecyclerView.ViewHolder{
        RecyclerRowBinding binding;
        public ReelHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
