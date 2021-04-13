package com.adaltas.examples;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.log4j.Level;
import org.apache.log4j.BasicConfigurator;

import com.adaltas.examples.Messages;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BasicConfigurator.configure();
        Logger.getRootLogger().setLevel(Level.INFO);

        System.out.println("My App !");  

    }
}
