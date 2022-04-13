package ro.fasttrack.lab8.tema;

public class Mouse implements Animal{
    public Mouse(){ }
    @Override
    public String eat() {
        return "cheese";
    }

    @Override
    public String talk() {
        return "chit chit";
    }

    @Override
    public String walk() {
        return "mouse-walking";
    }
}
