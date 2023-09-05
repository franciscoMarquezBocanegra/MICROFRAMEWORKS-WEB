package edu.eci.arep;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Controller {

    public Controller() {
    }

    public String body(String sample, String type) {
        byte[] file;
        try {
            file = Files.readAllBytes(Paths.get("src/main/resources/static/files/" + sample + "." + type));
            return new String(file);
        } catch (IOException e) {
            e.printStackTrace();
            return "Error";
        }
    }
}
