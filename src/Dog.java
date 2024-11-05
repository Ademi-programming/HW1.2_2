public class Dog extends Animal implements Printable{

    private int speed;


    protected Dog(String name, int age, int speed) {
        super(name, age);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void print() {
        System.out.println(
                "\nName: " + getName() +
                        "\nSpeed: " + getSpeed() +
                        "\nAge: " + getAge()
        );

    }
}
