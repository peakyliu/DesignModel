package FactoryModel;

public class SimpleFactory {
    public Product createProduct(int type){
        if (type == 1) {
            return new CreateProduct();
        } else if (type == 2) {
            return new CreateProduct1();
        }
        return new CreateProduct2();
    }
}
