/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com._2dmedicalImageprocessingusingmapreduce.pojo;

/**
 *
 * @author akshay
 */
public class Images {
    private String vector;
    private String path;
    private String type;
    private String treatment;
    
    public Images(){
        
    }

    public String getVector() {
        return vector;
    }

    public void setVector(String vector) {
        this.vector = vector;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Images{" + "vector=" + vector + ", path=" + path + ", type=" + type + ", treatment=" + treatment + '}';
    } 
}
