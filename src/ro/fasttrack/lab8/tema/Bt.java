package ro.fasttrack.lab8.tema;

public class Bt implements Bank{
    private int suma;

    public Bt(int suma) {
        this.suma = suma;
    }

    @Override
    public int withdraw(int sum) {
        System.out.println("Suma ramasa: " + (suma - sum));
        return sum;
    }

    @Override
    public int depositMoney(int money) {
        System.out.println("Suma totala din cont: " + (suma + money));
        return money;
    }

    public int getSuma() {
        return suma;
    }
}
