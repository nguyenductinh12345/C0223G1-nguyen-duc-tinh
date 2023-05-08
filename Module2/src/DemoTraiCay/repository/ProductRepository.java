package DemoTraiCay.repository;


import DemoTraiCay.model.Product;
import DemoTraiCay.util.ReadAndWriteProduct;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    List<Product>productList = new ArrayList<>();
    Product product = new Product();
    ReadAndWriteProduct readAndWriteProduct = new ReadAndWriteProduct();
    @Override
    public List<Product> showList() {
        productList = readAndWriteProduct.readProduct
                ("/Users/user/Documents/C0223G1-nguyen-duc-tinh/Module2/src/DemoTraiCay/data/Product.csv");
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        productList = readAndWriteProduct.readProduct
                ("/Users/user/Documents/C0223G1-nguyen-duc-tinh/Module2/src/DemoTraiCay/data/Product.csv");
        productList.add(product);
        readAndWriteProduct.writeProduct
                ( productList,"/Users/user/Documents/C0223G1-nguyen-duc-tinh/Module2/src/DemoTraiCay/data/Product.csv");
    }

    @Override
    public void editProduct() {
        readAndWriteProduct.writeProduct
                (productList,"/Users/user/Documents/C0223G1-nguyen-duc-tinh/Module2/src/DemoTraiCay/data/Product.csv");
    }
    public Product checkId(String id){
        productList = readAndWriteProduct.readProduct
                ("/Users/user/Documents/C0223G1-nguyen-duc-tinh/Module2/src/DemoTraiCay/data/Product.csv");
        for (int i = 0; i < productList.size(); i++) {
            if (id.equals(productList.get(i).getId())){
                System.out.println("Đã tìm thấy sản phẩm muốn sửa");
                System.out.println(productList.get(i));
                return productList.get(i);
            }
        }
        return null;
    }
}
