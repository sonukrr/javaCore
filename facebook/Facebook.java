package com.facebook.service;
import com.facebook.model.*;
public class Facebook implements IFacebook{


public void registration(UserDetails ud)
{System.out.println("You are registered : "+ud.getUsername());}

public void logIn(UserDetails ud)
{System.out.println("successfull Log In : "+ud.getUsername());}

public void doLikes(UserDetails ud)
{System.out.println("You liked : "+ud.getUsername());}

public void doComments(UserDetails ud)
{System.out.println("You commented : "+ud.getUsername());}


public void doShare(UserDetails ud)
{System.out.println("You Shared : "+ud.getUsername());}

public void postTimelines(UserDetails ud)
{System.out.println("You posted : "+ud.getUsername());}

public static void print()
{System.out.println("print method from Facebook");}
}