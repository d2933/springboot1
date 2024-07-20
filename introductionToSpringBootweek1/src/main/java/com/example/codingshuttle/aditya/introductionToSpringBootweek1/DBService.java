package com.example.codingshuttle.aditya.introductionToSpringBootweek1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService
{
    
    final private  DB db; //Benefit for Core dependecies making them immutable so that no one can change it
    public DBService(DB db)
    {
        this.db =db; //Spring intiates the being by calling the constructor
    }
    public String getData()
    {
        return db.getData();
    }
}
