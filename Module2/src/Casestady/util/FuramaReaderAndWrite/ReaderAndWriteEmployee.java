package Casestady.util.FuramaReaderAndWrite;

import Casestady.model.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriteEmployee {
    public List<Employee> readFile (String fileName) {
        List<Employee> employees = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                employees.add(new Employee(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7],
                        arr[8], Long.parseLong(arr[9])));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return employees;
    }
    public void writeFile(String filename, List<Employee>lines) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filename));
            for (Employee line : lines) {
                bufferedWriter.write(line.getIntoCsv());
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
