package com.example.project_sec;
import com.google.firebase.database.Exclude;

import java.io.Serializable;

public class Design implements Serializable
{


    @Exclude
    private String key;
    private String name;
    private String tagline;
    public Design(){}
    public Design(String name, String position)
    {
        this.name = name;
        this.tagline = position;
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

    public void setKey(String key)
    {
        this.key = key;
    }
}