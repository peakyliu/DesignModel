package single;

public enum SingletonEnum {
    INSTANCE;

    private String objName;

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public static void main(String[] args) {
        //单例测试
        SingletonEnum firstSingleton = SingletonEnum.INSTANCE;
        firstSingleton.setObjName("firstName");
        System.out.println(firstSingleton.getObjName());
        SingletonEnum secondSingleton = SingletonEnum.INSTANCE;
        secondSingleton.setObjName("secondName");
        System.out.println(firstSingleton.getObjName());
        System.out.println(secondSingleton.getObjName());

        //反射获取实例模式
        try {
            SingletonEnum[] enums = SingletonEnum.class.getEnumConstants();
            for (SingletonEnum anEnum : enums) {
                System.out.println(anEnum.getObjName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
