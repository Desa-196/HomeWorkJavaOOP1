public class Main {
    public static void main(String[] args){
        Cat cat = new Cat("Барсик", 5);
        Owner owner = new Owner("Николай");
        cat.setOwner(owner);
        cat.greet();

    }
}
