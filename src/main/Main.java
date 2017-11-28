package main;



//import randomengine.rand;
import otpmake.Mess;

public class Main
{
    public static void main(String[] args)
    {
    	String test = "This is a little test";
    	String otpmask = Mess.in(test);
        System.out.println(Mess.garble(test, otpmask));
        System.out.println(Mess.garble(Mess.garble(test, otpmask), otpmask));
    }
}