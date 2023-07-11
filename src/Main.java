public class Main {
    public static void main(String[] args) {
    Fish fish=new Fish();
    fish.setName("akula");
    fish.setAge(4);
    fish.setColor("blue-whille");
        System.out.println(fish.getName());
        System.out.println(fish.getAge());
        System.out.println(fish.getColor());
        Parrot parrot=new Parrot();
        parrot.setName("jako");
        parrot.setAge(3);
        parrot.setColor("red");
        System.out.println(parrot.getName());
        System.out.println(parrot.getAge());
        System.out.println(parrot.getColor());
        Cat cat=new Cat();
        cat.setName("misha");
        cat.setAge(3);
        cat.setColor("black");
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getColor());
        Dog dog=new Dog();
        dog.setName("kiki");
        dog.setAge(5);
        dog.setColor("yellow");
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getColor());



    }
}