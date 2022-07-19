package com.techzonelabs.articles.data.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class Article implements Serializable {
    public String section;
    public String subsection;
    public String title;
    @SerializedName("abstract")
    public String myAbstract;
    public String url;
    public String uri;
    public String byline;
    public String item_type;
    public String updated_date;
    public String created_date;
    public String published_date;
    public String material_type_facet;
    public String kicker;
    public ArrayList<String> des_facet;
    public ArrayList<String> org_facet;
    public ArrayList<String> per_facet;
    public ArrayList<String> geo_facet;
    public ArrayList<Multimedium> multimedia;
    public String short_url;

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSubsection() {
        return subsection;
    }

    public void setSubsection(String subsection) {
        this.subsection = subsection;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMyAbstract() {
        return myAbstract;
    }

    public void setMyAbstract(String myAbstract) {
        this.myAbstract = myAbstract;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getMaterial_type_facet() {
        return material_type_facet;
    }

    public void setMaterial_type_facet(String material_type_facet) {
        this.material_type_facet = material_type_facet;
    }

    public String getKicker() {
        return kicker;
    }

    public void setKicker(String kicker) {
        this.kicker = kicker;
    }

    public ArrayList<String> getDes_facet() {
        return des_facet;
    }

    public void setDes_facet(ArrayList<String> des_facet) {
        this.des_facet = des_facet;
    }

    public ArrayList<String> getOrg_facet() {
        return org_facet;
    }

    public void setOrg_facet(ArrayList<String> org_facet) {
        this.org_facet = org_facet;
    }

    public ArrayList<String> getPer_facet() {
        return per_facet;
    }

    public void setPer_facet(ArrayList<String> per_facet) {
        this.per_facet = per_facet;
    }

    public ArrayList<String> getGeo_facet() {
        return geo_facet;
    }

    public void setGeo_facet(ArrayList<String> geo_facet) {
        this.geo_facet = geo_facet;
    }

    public ArrayList<Multimedium> getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(ArrayList<Multimedium> multimedia) {
        this.multimedia = multimedia;
    }

    public String getShort_url() {
        return short_url;
    }

    public void setShort_url(String short_url) {
        this.short_url = short_url;
    }

    @Override
    public String toString() {
        return "Article{" +
                "section='" + section + '\'' +
                ", subsection='" + subsection + '\'' +
                ", title='" + title + '\'' +
                ", myAbstract='" + myAbstract + '\'' +
                ", url='" + url + '\'' +
                ", uri='" + uri + '\'' +
                ", byline='" + byline + '\'' +
                ", item_type='" + item_type + '\'' +
                ", updated_date='" + updated_date + '\'' +
                ", created_date='" + created_date + '\'' +
                ", published_date='" + published_date + '\'' +
                ", material_type_facet='" + material_type_facet + '\'' +
                ", kicker='" + kicker + '\'' +
                ", des_facet=" + des_facet +
                ", org_facet=" + org_facet +
                ", per_facet=" + per_facet +
                ", geo_facet=" + geo_facet +
                ", multimedia=" + multimedia +
                ", short_url='" + short_url + '\'' +
                '}';
    }
}