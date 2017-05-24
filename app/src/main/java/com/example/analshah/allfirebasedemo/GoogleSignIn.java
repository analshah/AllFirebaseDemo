package com.example.analshah.allfirebasedemo;

/**
 * Created by analshah on 24/5/17.
 */

public class GoogleSignIn {

private Googlesignin signin;

    public interface Googlesignin
    {
         public void OnLogin();
    }

    public GoogleSignIn()
    {
        this.signin=null;
    }


    public  void setgoogle(Googlesignin signin)
    {
        this.signin=signin;
    }



}
