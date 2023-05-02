package com.example.jokesapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jokesapp.model.JokesModel;

import java.util.List;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.MyViewHolder> {
    List<JokesModel> jokesList;

    public RecAdapter(List<JokesModel> jokesList) {
        this.jokesList = jokesList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflator =LayoutInflater.from(parent.getContext());
        View view = inflator.inflate(R.layout.single_item_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        JokesModel jokesModel = jokesList.get(position);
        holder.txtView.setText(jokesList.get(position).getJoke());

    }

    @Override
    public int getItemCount() {
        return jokesList.size();
    }


    public class MyViewHolder extends  RecyclerView.ViewHolder{
        TextView txtView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtView = itemView.findViewById(R.id.txtView);
        }
    }
}
