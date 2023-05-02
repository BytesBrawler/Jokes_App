package com.example.jokesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.jokesapp.model.JokesModel;
import com.example.jokesapp.model.Result;
import com.example.jokesapp.services.JokesInterface;
import com.example.jokesapp.services.RetrofitInstance;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

RecyclerView recyclerView;
RecAdapter adapter;
 List<JokesModel> list;
 ArrayList<JokesModel> arrList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SwipeRefreshLayout swipeRefreshLayout =(SwipeRefreshLayout) findViewById(R.id.swipe);
                //new SwipeRefreshLayout(this);
     //   swipeRefreshLayout = findViewById(R.id.swipe);
        getJokes();

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                getJokes();
                swipeRefreshLayout.setRefreshing(false);
            }
        });


    }

    private void viewData() {
        recyclerView = findViewById(R.id.recView);
        adapter = new RecAdapter(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }


public void getJokes(){
    JokesInterface jokesInterface = RetrofitInstance.getService();
    Call < Result> call =jokesInterface.getjokes();
    Log.i("TAG", "onCreate: ");
    call.enqueue(new Callback<Result>() {
        @Override
        public void onResponse(Call<Result> call, Response<Result> response) {
            Result result = response.body();
            if(result!=null && result.getJokes()!=null){

                list=  (List<JokesModel> )result.getJokes();

                viewData();

            }
        }

        @Override
        public void onFailure(Call<Result> call, Throwable t) {
            Log.i("TAG", "onFailure: " + t.getLocalizedMessage());

        }
    });
}
}