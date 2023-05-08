package DemoTraiCay.repository;

import DemoTraiCay.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> showList();
    void addProduct(Product product);
    void editProduct();

}
