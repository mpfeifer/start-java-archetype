#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

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
