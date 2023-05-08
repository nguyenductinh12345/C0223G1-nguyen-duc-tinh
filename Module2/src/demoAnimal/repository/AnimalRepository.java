package demoAnimal.repository;

import demoAnimal.model.Animal;
import demoAnimal.util.ReadAndWriteAnimal;

import java.util.ArrayList;
import java.util.List;

public class AnimalRepository implements IAnimalRepository{
    List<Animal>animalList = new ArrayList<>();
    ReadAndWriteAnimal readAndWriteAnimal = new ReadAndWriteAnimal();
    @Override
    public List<Animal> showAnimal() {
        animalList = readAndWriteAnimal.readAnimal
                ("/Users/user/Documents/C0223G1-nguyen-duc-tinh/Module2/src/demoAnimal/data/Animal.csv");
        return animalList;
    }

    @Override
    public void addAnimal(Animal animal) {
        animalList = readAndWriteAnimal.readAnimal
                ("/Users/user/Documents/C0223G1-nguyen-duc-tinh/Module2/src/demoAnimal/data/Animal.csv");
        animalList.add(animal);
        readAndWriteAnimal.writeAnimal
                (animalList,"/Users/user/Documents/C0223G1-nguyen-duc-tinh/Module2/src/demoAnimal/data/Animal.csv");

    }

    @Override
    public void editAnimal() {

    }

    @Override
    public void deletAnimal() {

    }
    public int checkId(String id){
     animalList = readAndWriteAnimal.readAnimal
                ("/Users/user/Documents/C0223G1-nguyen-duc-tinh/Module2/src/demoAnimal/data/Animal.csv");
        for (int i = 0; i <animalList.size() ; i++) {
            if (id.equals(animalList.get(i).getId())){
                return i;
            }
        }
        return -1;
    }
}
