package com.example.jokesapp.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Result {

    @SerializedName("error")
    @Expose
    private Boolean error;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("jokes")
    @Expose
    private List<JokesModel> jokes;

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public List<JokesModel> getJokes() {
        return jokes;
    }

    public void setJokes(List<JokesModel> jokes) {
        this.jokes = jokes;
    }

}