package Casestady.service;

import Casestady.model.Facility.Facility;
import Casestady.repository.FacilityRepository;
import Casestady.service.interfaceService.IFacilityService;
import Casestady.util.regex.Validete;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityService  {
    Scanner scanner = new Scanner(System.in);
    FacilityRepository facilityRepository = new FacilityRepository();
    VillaService villaService = new VillaService();
    Validete validete = new Validete();
    LinkedHashMap<Facility, Integer> facilityIntegerLinkedHashMap = new LinkedHashMap<>();

    public void displayFacility() {
        facilityIntegerLinkedHashMap = facilityRepository.getFacilityMap();
        for (Map.Entry<Facility, Integer> facility : facilityIntegerLinkedHashMap.entrySet()) {
            System.out.println(facility);
        }
    }
    public void addNewFacility (){
        System.out.println("Vui lòng lựa chọn dịch vụ muốn thêm\n" +
                "1.Add new villa\n" +
                "2.Add new house\n" +
                "3.Add new room\n" +
                "4.Back to menu");
        int choiceFacility = 0;
        do {
            try {
                choiceFacility=Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng không nhập chữ cái");
            }
            switch (choiceFacility){
                case 1:
                    villaService.addNewVilla();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.err.println("Vui lòng nhập trong khoảng từ 1 đến 4");
                    break;
            }

        }while (choiceFacility!=4);
    }
}
