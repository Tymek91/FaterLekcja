import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class HomeWorkArrayTest {

    @Test
    void shouldGetArrayWith3SpecificBrands(){
        HomeWorkArray homeWorkArray = new HomeWorkArray();
        assertThat(homeWorkArray.getBeerBrands()).isNotNull();
        assertThat(homeWorkArray.getBeerBrands()).hasSize(6);
        assertThat(homeWorkArray.getBeerBrands()).contains("Tyskie", "Zywiec", "Lech");
    }

}