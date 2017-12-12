package esunen.learning.myFirstMavenProject;

import com.google.gson.*;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Gson gson = new Gson();
    	
    	String serialized_date = gson.toJson(new Date());
    	
        System.out.println("Hello World! " + serialized_date);
    }
}
