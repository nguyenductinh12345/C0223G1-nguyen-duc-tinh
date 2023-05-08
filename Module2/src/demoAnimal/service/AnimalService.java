package demoAnimal.service;

import demoAnimal.model.Animal;
import demoAnimal.repository.AnimalRepository;
import demoAnimal.util.Valideat;

import java.util.Scanner;

public class AnimalService implements IAnimalService {
    AnimalRepository animalRepository = new AnimalRepository();
    Animal animal = new Animal();
    Valideat valideat = new Valideat();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void showAnimal() {
        for (Animal a : animalRepository.showAnimal()) {
            System.out.println(a);
        }
    }

    @Override
    public void addAnimal() {
        String addId = "";
        int check = 0;
        do {
            System.out.println("Vui lòng nhập id");
            addId = scanner.nextLine();
            check = animalRepository.checkId(addId);
            if (valideat.regexId(addId) && check == -1) {
                System.out.println("Thêm mới id thành công");
            }else {
                System.err.println("id sai định dạng hoặc đã tồn tại");
            }
        } while (!valideat.regexId(addId) || check != -1);
        String addTen = "";
        do {
            System.out.println("Vui lòng nhập tên ");
            addTen = scanner.nextLine();
            if (valideat.regexTen(addTen)) {
                System.out.println("Thêm tên thành công");
            }else {
                System.err.println("Vui lòng nhập tên đúng định dạng");
            }
        } while (!valideat.regexTen(addTen));
        int addTuoi = 0;
        System.out.println("Vui lòng nhập tuổi");
        do {
            try {
                addTuoi = Integer.parseInt(scanner.nextLine());
                System.out.println("THêm tuổi thành công");
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng không nhập chữ cái");
            }
            if (addTuoi<=0){
                System.err.println("Tuổi phải là số nguyên lớn hơn 0");
            }
        } while (addTuoi <= 0);
        Animal animal1 = new Animal(addId,addTen,addTuoi);
        animalRepository.addAnimal(animal1);
        System.out.println("Thêm mới thành công");
        this.showAnimal();
    }

    @Override
    public void editAnimal() {

    }

    @Override
    public void deletAnimal() {

    }
}
