public class SprawdzaczCzesciCiala {

    public void sprawdzCzescCiala(String czescCiala, int indexElementuTablicy) {
        switch (czescCiala) {
            case "noga":
                System.out.println("Dolna czesc ciala" + "[" + indexElementuTablicy + "]");
                break;
            case "dupa":
                System.out.println("Tylna czesc ciala" + "[" + indexElementuTablicy + "]");
                break;
            case "bark":
                System.out.println("Gorna czesc ciala" + "[" + indexElementuTablicy + "]");
                break;
            case "lokiec":
                System.out.println("Gorna czesc ciala" + "[" + indexElementuTablicy + "]");
                break;
            default:
                System.out.println("Brak czesci ciala" + "[" + indexElementuTablicy + "]");
        }
    }
}
