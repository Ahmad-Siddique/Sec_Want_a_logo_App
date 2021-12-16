package com.example.project_sec;

import java.io.Serializable;

public class Logo implements Serializable {


    public static String name1;
    public static String tagline1;
    public static String logo_for1;
    public static String button1;



    private String key;
    private String name;
    private String tagline;
    private String logo_for;
    private String button;

    public Logo(){
        this.name = Logo.name1;
        this.tagline = Logo.tagline1;
        this.logo_for= Logo.logo_for1;
        this.button= Logo.button1;

    }
    public Logo(String n,String t,String l,String b){
        this.name = n;
        this.tagline = t;
        this.logo_for=l;
        this.button=b;

    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPosition()
    {
        return tagline;
    }

    public void setPosition(String position)
    {
        this.tagline = position;
    }

    public String getKey()
    {
        return key;
    }

    public void setKey(String position)
    {
        this.key = position;
    }


    public String getLogo_for()
    {
        return logo_for;
    }

    public void setLogo_for(String name)
    {
        this.logo_for = name;
    }

    public String getButton()
    {
        return button;
    }

    public void setButton(String position)
    {
        this.button = position;
    }
}
