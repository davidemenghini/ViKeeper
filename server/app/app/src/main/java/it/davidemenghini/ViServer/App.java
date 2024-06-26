/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package it.davidemenghini.ViServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App{
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }


    private final String defaultRoot = "D:\\anime";

    private String actualRoot = defaultRoot;


    private final Logger logger = LoggerFactory.getLogger(App.class);


}
