package ro.fasttrack.lab8.tema;

public class Facebook implements Advertisement{
    private String publicitate;

    public Facebook(String publicitate) {
        this.publicitate = publicitate;
    }

    @Override
    public String companie() {
        return "Zara";
    }

    @Override
    public String reclama() {
        return "Noua colectie premium a acestui sezon va fi lansata in la 1 mai!";
    }

    public String getPublicitate() {
        return publicitate;
    }
}
