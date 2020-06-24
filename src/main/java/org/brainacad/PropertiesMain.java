package org.brainacad;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class PropertiesMain {

    public static void main(String[] args) {
       Properties properties = new Properties();
       try(InputStream is = PropertiesMain.class.getClassLoader()
               .getResourceAsStream("conf.properties")){
           properties.load(is);
       } catch (IOException e) {
           e.printStackTrace();
       }

       String localHello = (String) properties.get("props.local.hello");
       String mvnHello = (String) properties.get("props.mvn.hello");
       String serverUrl = (String) properties.get("props.server");

       System.out.println(localHello);
       System.out.println(mvnHello);
       System.out.println(mvnHello);

        Properties propertiesMvn = new Properties();
        try(InputStream is = PropertiesMain.class.getClassLoader()
                .getResourceAsStream("maven.properties")){
            propertiesMvn.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String guavaVers = (String) propertiesMvn.get("guava.version");
        System.out.println(guavaVers);
    }
}
