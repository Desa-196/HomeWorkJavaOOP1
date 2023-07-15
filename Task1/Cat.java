package Task1;
class Cat{
    private Owner owner;

    public Owner getOwner(){
        return owner;
    }
    public void setOwner(Owner owner){
        this.owner = owner;
    }

    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    private int age;
    public int getAge(){
        return age;
    }
    public void setName(int age){
        this.age = age;
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void greet(){
        System.out.printf("Мяу! Меня зовут %s. Мне %d года(лет). Мой владелец - %s \n", name, age, owner.getName());
    }
}