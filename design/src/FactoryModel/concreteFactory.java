package FactoryModel;

public class concreteFactory extends Factory{
    public Product factoryMethod(){
        return new CreateProduct();
    }
}
