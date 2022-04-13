package ro.fasttrack.lab8.tema;

public class Email implements Advertisement {
    private String reclama;

    public Email(String reclama) {
        this.reclama = reclama;
    }

    @Override
    public String companie() {
        return "H&M";
    }

    @Override
    public String reclama() {
        return "Noua colectie premium a acestui sezon va fi lansata in la 1 mai!";
    }

    public String getReclama() {
        return reclama;
    }
}
