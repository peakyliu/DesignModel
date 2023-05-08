package FactoryModel;

public class concreteFactory1 extends Factory{
    public Product factoryMethod(){
        return new CreateProduct1();
    }
}
