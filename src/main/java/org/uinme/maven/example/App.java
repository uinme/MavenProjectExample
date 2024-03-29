package org.uinme.maven.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
    
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(App.class);
        
        logger.info(ClassLoader.getSystemResource("conf/settings.properties").toString());
        logger.info(ClassLoader.getSystemResource("example.sh").toString());
    }

}
