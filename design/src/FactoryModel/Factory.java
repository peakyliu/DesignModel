package FactoryModel;

//工厂方法
public abstract class Factory {
    public Product factoryMethod;
    public void dosomething(){
        Product product = factoryMethod;
    }

}


