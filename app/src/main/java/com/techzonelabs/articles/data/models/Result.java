package com.techzonelabs.articles.data.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class Result implements Serializable {
    public String status;
    public String copyright;
    public String section;
    public String last_updated;
    public int num_results;
    @SerializedName("results")
    public ArrayList<Article> articles;

    public Result(String status, String copyright, String section, String last_updated, int num_results, ArrayList<Article> articles) {
        this.status = status;
        this.copyright = copyright;
        this.section = section;
        this.last_updated = last_updated;
        this.num_results = num_results;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public int getNum_results() {
        return num_results;
    }

    public void setNum_results(int num_results) {
        this.num_results = num_results;
    }

    public ArrayList<Article> getResults() {
        return articles;
    }

    public void setResults(ArrayList<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status='" + status + '\'' +
                ", copyright='" + copyright + '\'' +
                ", section='" + section + '\'' +
                ", last_updated='" + last_updated + '\'' +
                ", num_results=" + num_results +
                ", articles=" + articles +
                '}';
    }
}
