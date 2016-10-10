package com.lavr.second.factory;

import com.lavr.second.entity.Vegetable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 123 on 02.10.2016.
 */
public class FactoryMethodRunner {
    private static final Logger LOG = LogManager.getLogger();
    private static final String SPACE="( )+";

    public static List<Vegetable> createSalad(String fileName) throws RuntimeException {
        List<Vegetable> listForSalad = new ArrayList<>();
        List<String> listOfDescriptions = ReaderFromFile.readVegetables(fileName);
        for (String description : listOfDescriptions) {
            String properties[] = description.split(SPACE);
            try {
                listForSalad.add(VegetableFactory.createVegetableFromFactory(properties[0], properties));
            } catch (IllegalVegetableException ex) {
                LOG.error(ex);
            }
        }
        return listForSalad;
    }
}
