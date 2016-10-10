package com.lavr.second.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by 123 on 02.10.2016.
 */
public class ReaderFromFile {
    private static final Logger LOG = LogManager.getLogger();

    public static List<String> readVegetables(String fileName) throws RuntimeException {
        List<String> listOfLines;
        try {
            Stream<String> lines = Files.lines(Paths.get(fileName));
            listOfLines = lines.collect(Collectors.toList());
            return listOfLines;
        }catch (IOException ex){
            LOG.fatal("Wrong file: "+fileName+". Can't read list of vegetables.",ex);
            throw  new RuntimeException();
        }
    }
}
