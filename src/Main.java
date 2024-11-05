public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];

        animals[0] = createObject("2-й");
        animals[1] = createObject("3-й");
        animals[2] = createObject("4-й");

        for (Animal animal: animals) {
            if (animal instanceof Printable) {
                Printable printableAnimal = (Printable) animal;
                printableAnimal.print();
            }
        }
    }

    public static Animal createObject (String className) {
        switch (className) {
            case "2-й":
                return new Cat("Муся", 10, "Вислоухая");
            case "3-й":
                return new Dog("Рекс", 5, 200);
            case "4-й":
                return new Parrot ("Корелла", 2, "Красный");
            default:
                return null;
        }
    }
}