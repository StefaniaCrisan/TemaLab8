package ro.fasttrack.lab8.tema;

public class Cat implements Animal{
    public Cat(){ }
    @Override
    public String eat() {
        return "whiskas";
    }

    @Override
    public String talk() {
        return "miaaauuu";
    }

    @Override
    public String walk() {
        return "cat-walking";
    }
}
