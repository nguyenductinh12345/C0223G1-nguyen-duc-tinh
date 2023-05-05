package Casestady.util.FuramaReaderAndWrite;

import Casestady.model.person.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriteCustomer {
    public List<Customer> readCustomer(String fileName) {
        List<Customer> customerList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line = "";
            while (true) {
                line = bufferedReader.readLine();
                if (line == null || line.equals("")) {
                    break;
                }
                String[] arr = line.split(",");
                Customer customer = new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
                customerList.add(customer);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return customerList;
    }

    public void writeCustomer(String fileName, List<Customer> customerList) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (Customer c : customerList) {
                bufferedWriter.write(c.getintoCsv());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
