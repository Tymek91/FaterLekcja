import java.util.ArrayList;
import java.util.List;

public class FaterLekcja {
    public static void main(String[] args) {
        String[] czesciCiala = {"dupa", "glowa", "dlon", "stopa", "plec", "bark"};

        int indexNowegoElementu = czesciCiala.length;

        SprawdzaczCzesciCiala sprawdzaczCzesciCiala = new SprawdzaczCzesciCiala();

        for (int i = 0; i < indexNowegoElementu; i++) {  // pętla for
            sprawdzaczCzesciCiala.sprawdzCzescCiala(czesciCiala[i], i);
        }
    }
}
