package demoAnimal.repository;

import demoAnimal.model.Animal;

import java.util.List;

public interface IAnimalRepository {
    List<Animal> showAnimal();
    void addAnimal(Animal animal);
    void editAnimal();
    void  deletAnimal();
}
