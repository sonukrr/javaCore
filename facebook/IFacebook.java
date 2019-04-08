package com.facebook.model;

public interface IFacebook{


public void registration(UserDetails ud);
public void logIn(UserDetails ud);
public void doLikes(UserDetails ud);
public void doComments(UserDetails ud);
public void doShare(UserDetails ud);
public void postTimelines(UserDetails ud);



}