public class Parrot extends Animal implements  Printable{

    private String colour;


    protected Parrot(String name, int age, String colour) {
        super(name, age);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public void print() {
        System.out.println(
                "\nName: " + getName() +
                        "\nColour: " + getColour() +
                        "\nAge: " + getAge()
        );
    }
}
