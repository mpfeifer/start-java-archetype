package it.pkg;

import java.util.*;

public class App 
{
    String helloWorld = "Hello, World!";

    public void greet() {
	System.out.println(helloWorld);
    }

    public static void main( String[] args )
    {
	App app = new App();
	app.greet();
    }

}
