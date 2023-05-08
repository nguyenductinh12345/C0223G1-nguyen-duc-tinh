package Casestady.repository;

import Casestady.model.Facility.Facility;
import Casestady.model.Facility.House;
import Casestady.model.Facility.Room;
import Casestady.model.Facility.Villa;

import java.util.LinkedHashMap;

public class FacilityRepository {
   static LinkedHashMap<Facility,Integer> facilityMap= new LinkedHashMap<>();
   static {
       House house1 = new House("SVHO-1111","Thue house",50,15,3,"nam","sang",3);
       House house2 = new House("SVHO-2222","Thue house",150,25,3,"nam","sang",3);
       House house3 = new House("SVHO-3333","Thue house",80,25,3,"nam","sang",3);
       Room room1 = new Room("SVRO-1111","Thue room",50,5,3,"nam","co");
       Room room2 = new Room("SVRO-2222","Thue room",80,8,3,"nam","co");
       Room room3 = new Room("SVRO-3333","Thue room",100,10,3,"nam","co");
       Villa villa1  = new Villa("SVVL-1111","Thue villa",50,5,3,"nam","sang",15,3);
       Villa villa2  = new Villa("SVVL-2222","Thue villa",50,5,3,"nam","sang",15,3);
       Villa villa3  = new Villa("SVVL-3333","Thue villa",70,7,3,"nam","sang",15,3);
       facilityMap.put(house1,0);
       facilityMap.put(house2,0);
       facilityMap.put(house3,0);
       facilityMap.put(room1,0);
       facilityMap.put(room2,0);
       facilityMap.put(room3,0);
       facilityMap.put(villa1,0);
       facilityMap.put(villa2,0);
       facilityMap.put(villa3,0);
   }
   public LinkedHashMap<Facility,Integer> getFacilityMap(){
       return facilityMap;
   }

}
