public class Main{
    public static void main(String[] args) {
        Animal[] animals = {new Bird("Nok uan"),
                            new Bird("Nok pom"),
                            new Penguin("Jirakorn"),
                            new Penguin("Pingu"),
                            new Fish("Yashiro"),
                            new Fish("Hanako"),
                            new Cat("Tom"),
                            new Cat("Butch")
                            };
        
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}