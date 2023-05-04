package Casestady.util.FuramaReaderAndWrite;

import Casestady.model.person.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriteCustomer {
    public List<Customer> readCustomer(String fileName) {
        List<Customer> customers = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] arr = line.split(",");
                Customer customer = new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
                customers.add(customer);
                bufferedReader.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        return customers;
    }

    public void writeCoustomer(String fileName, List<Customer>customers) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (Customer c:customers) {
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
