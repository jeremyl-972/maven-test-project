package com.mycompany.app;
import com.google.common.base.Joiner;

public class App 
{
    public static void main( String[] args )
    {
	String message = "Hello World!";
        System.out.println(message);
        String[] words = {"Hello", "Maven", "Guava", "I'm rich, bitch!"};
        String joinedWords = Joiner.on(" ").join(words);
        System.out.println(joinedWords);	
    }
}
