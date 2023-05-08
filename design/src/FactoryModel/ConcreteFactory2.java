package FactoryModel;

public class ConcreteFactory2 extends Factory{
    public Product factoryMethod(){
        return new CreateProduct2();
    }
}
