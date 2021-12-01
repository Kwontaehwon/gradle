import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bulletTest {

    bullet a;

    @BeforeEach
    void setUp() {
        a = new bullet(1,2);
    }

    @Test
    @DisplayName("Get X TEST")
    void getX(){
        assertEquals(1, a.getX());
    }

    @Test
    @DisplayName("Get Y TEST")
    void getY(){
        assertEquals(3, a.getY());
    }

    @AfterEach
    void tearDown() {
    }
}