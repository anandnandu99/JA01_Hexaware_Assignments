package com.hexaware.springapp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages= {"com.hexaware.springapp"})
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Presentation Layer" );
        ApplicationContext container=new AnnotationConfigConfiApplication(App.class);
   ProductService service=container.getBean(ProductServiceImp.class);
    System.out.println(product);
    }
}
