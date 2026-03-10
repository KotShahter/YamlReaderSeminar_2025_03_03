package org.example;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class YamlReader {

    public void Initialise()
    {
        Yaml yaml = new Yaml();

        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("People.yaml");

        List<Person> myList = yaml.load(inputStream);
        System.out.print(myList.toString().replace(", {", "\n"));
    }
}