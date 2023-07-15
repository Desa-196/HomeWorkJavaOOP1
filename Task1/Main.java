package Task1;
public class Main {
    public static void main(String[] args){
        task1();

    }
    public static void task1(){
        Cat cat = new Cat("Барсик", 5);
        Owner owner = new Owner("Николай");
        cat.setOwner(owner);
        cat.greet();
    }
}
