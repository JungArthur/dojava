package com.utils;


public class Guest{
    private String id;
    private String name;
    private String auth;

    public Guest(String id, String name, String auth){
        this.id = id;
        this.name = name;
        this.auth = auth;
    }
    public Guest(){}
    public String getName(){
        return this.name;
    }

    public String getId(){
        return this.id;
    }

    public String getAuth(){
        return this.auth;
    }
}
