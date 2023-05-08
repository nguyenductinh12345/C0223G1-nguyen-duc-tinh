package DemoTraiCay.util;

import DemoTraiCay.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteProduct {
    public List<Product> readProduct(String filename) {
        List<Product> productList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            String line = null;
            while (true) {
                line = bufferedReader.readLine();
                if (line == null || line.equals("")) {
                    break;
                }
                String[] arr = line.split(",");
                Product product = new Product(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3], arr[4]);
                productList.add(product);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }

    public void writeProduct(List<Product> productList, String fileName) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (Product p : productList) {
                bufferedWriter.write(p.getToCsv());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
