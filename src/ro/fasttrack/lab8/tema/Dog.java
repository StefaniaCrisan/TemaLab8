package ro.fasttrack.lab8.tema;

public class Dog implements Animal {
    public Dog() {
    }

    @Override
    public String eat() {
        return "pedigree";
    }

    @Override
    public String talk() {
        return "ham ham";
    }

    @Override
    public String walk() {
        return "dog-walking";
    }
}
