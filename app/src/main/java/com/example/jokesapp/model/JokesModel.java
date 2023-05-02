package com.example.jokesapp.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;



@Generated("jsonschema2pojo")
public class JokesModel {
//
//    @SerializedName("question")
//    @Expose
//    private String question;
//    @SerializedName("punchline")
//    @Expose
//    private String punchline;
//
//    public String getQuestion() {
//        return question;
//    }
//
//    public void setQuestion(String question) {
//        this.question = question;
//    }
//
//    public String getPunchline() {
//        return punchline;
//    }
//
//    public void setPunchline(String punchline) {
//        this.punchline = punchline;
//    }



        @SerializedName("error")
        @Expose
        private Boolean error;
        @SerializedName("category")
        @Expose
        private String category;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("joke")
        @Expose
        private String joke;
//        @SerializedName("flags")
//        @Expose
//        @Valid
//        private Flags flags;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("safe")
        @Expose
        private Boolean safe;
        @SerializedName("lang")
        @Expose
        private String lang;

        public Boolean getError() {
            return error;
        }

        public void setError(Boolean error) {
            this.error = error;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getJoke() {
            return joke;
        }

        public void setJoke(String joke) {
            this.joke = joke;
        }

    //    public Flags getFlags() {
    //        return flags;
//        }
//
//        public void setFlags(Flags flags) {
//            this.flags = flags;
//        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Boolean getSafe() {
            return safe;
        }

        public void setSafe(Boolean safe) {
            this.safe = safe;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }

    }


