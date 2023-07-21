public class Cat extends Pet implements Caudate{
    
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public void greet(){
        System.out.printf("Мяу! Меня зовут %s. Мне %d года(лет). Мой владелец - %s \n", name, age, owner.getName());
    }
    @Override
    public void wagTheTail(){
        System.out.println("Виляет хвостом");
    }

}