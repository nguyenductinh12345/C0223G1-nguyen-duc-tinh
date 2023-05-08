package demoAnimal.util;

import demoAnimal.model.Animal;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteAnimal {

    public List<Animal> readAnimal(String fileName) {
        List<Animal> animalList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;
            while (true) {
                line = bufferedReader.readLine();
                if (line == null || line.equals("")) {
                    break;
                }
                String[]arr = line.split(",");
                Animal animal = new Animal(arr[0],arr[1],Integer.parseInt(arr[2]));
                animalList.add(animal);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return animalList;
    }
    public void writeAnimal(List<Animal> animalList,String filename){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));
            for (Animal a:animalList) {
                bufferedWriter.write(a.getToCsv());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
