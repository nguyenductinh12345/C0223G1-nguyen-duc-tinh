package Casestady.util.FuramaReaderAndWrite;

import Casestady.model.Facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ReadAndWriteVilla {
    public Map<Villa,Integer> readVillaFile(String fileName){
        Map<Villa,Integer> villaIntegerMap = new LinkedHashMap<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line = "";
            while (true){
              line = bufferedReader.readLine();
              if (line==null ||line.equals("")){
                  break;
              }
            }
            bufferedReader.close();
            String [] arr = line.split(",");
            Villa villa = new Villa(arr[0],arr[1],Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),Integer.parseInt(arr[4]),
                    arr[5],arr[6],Double.parseDouble(arr[7]),Integer.parseInt(arr[8]));
            int value = Integer.parseInt(arr[9]);
            villaIntegerMap.put(villa,value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return villaIntegerMap;
    }
    public void writeVilla (String fileName,Map<Villa,Integer>villaIntegerMap){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            Set<Villa> villaSet = villaIntegerMap.keySet();
            for (Villa v:villaSet) {
                bufferedWriter.write(v.getIntoCsv());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
