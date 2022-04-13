package ro.fasttrack.lab8.tema;

public class TemaMain {
    public static void main(String[] args) {
        // 1.
        Facebook publ = new Facebook("Noua colectie este aici!");
        System.out.println(publ.companie());
        System.out.println(publ.reclama());
        System.out.println(publ.getPublicitate());

        Email publicit = new Email("Noile trenduri!");
        System.out.println(publicit.companie());
        System.out.println(publicit.reclama());
        System.out.println(publicit.getReclama());

        // 2.
        System.out.println("BT");
        Bt banca1 = new Bt(200);
        System.out.println(banca1.depositMoney(20));
        System.out.println(banca1.withdraw(20));
        System.out.println(banca1.getSuma());
        System.out.println("BRD");
        Brd banca2 = new Brd(200);
        System.out.println(banca1.depositMoney(20));
        System.out.println(banca1.withdraw(20));
        System.out.println(banca1.getSuma());
        System.out.println("ING");
        Ing banca3 = new Ing(200);
        System.out.println(banca1.depositMoney(20));
        System.out.println(banca1.withdraw(20));
        System.out.println(banca1.getSuma());

        //3.
        System.out.println("Cat");
        Cat pisica = new Cat();
        System.out.println(pisica.eat());
        System.out.println(pisica.talk());
        System.out.println(pisica.walk());
        System.out.println("Chicken");
        Chicken pui = new Chicken();
        System.out.println(pui.eat());
        System.out.println(pui.talk());
        System.out.println(pui.walk());
        System.out.println("Dog");
        Dog caine = new Dog();
        System.out.println(caine.eat());
        System.out.println(caine.talk());
        System.out.println(caine.walk());
        System.out.println("Duck");
        Duck rata = new Duck();
        System.out.println(rata.eat());
        System.out.println(rata.talk());
        System.out.println(rata.walk());
        System.out.println("Mouse");
        Mouse soarece = new Mouse();
        System.out.println(soarece.eat());
        System.out.println(soarece.talk());
        System.out.println(soarece.walk());

        // 4.

    }
}
