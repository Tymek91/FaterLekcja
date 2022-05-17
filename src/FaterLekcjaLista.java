import java.util.ArrayList;
import java.util.List;

public class FaterLekcjaLista {

    public static void main(String[] args) {
        List<String> listaCzesciCiala = new ArrayList<>();
        listaCzesciCiala.add("dupa");
        listaCzesciCiala.add("glowa");
        listaCzesciCiala.add("stopa");
        listaCzesciCiala.add("plec");
        listaCzesciCiala.add("bark");


        SprawdzaczCzesciCiala sprawdzaczCzesciCiala = new SprawdzaczCzesciCiala();


        for (int indexElementu = 0; indexElementu < listaCzesciCiala.size(); indexElementu++) {  // pętla for
            sprawdzaczCzesciCiala.sprawdzCzescCiala(listaCzesciCiala.get(indexElementu), indexElementu);
        }
    }


}
