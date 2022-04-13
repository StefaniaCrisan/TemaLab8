package ro.fasttrack.lab8.tema;

public class Chicken implements Animal{
    public Chicken() {
    }
    @Override
    public String eat() {
        return "corn";
    }

    @Override
    public String talk() {
        return "cotcodaaac";
    }

    @Override
    public String walk() {
        return "chicken-walking";
    }
}
