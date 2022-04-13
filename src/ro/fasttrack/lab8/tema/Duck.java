package ro.fasttrack.lab8.tema;

public class Duck implements Animal{
    public Duck(){ }
    @Override
    public String eat() {
        return "grass";
    }

    @Override
    public String talk() {
        return "mac mac";
    }

    @Override
    public String walk() {
        return "duck-walking";
    }
}
