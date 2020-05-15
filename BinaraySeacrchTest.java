package app;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class BinaraySeacrchTest {

    @org.junit.jupiter.api.Test
    @DisplayName("khong Tim thay")
    void binaraySreach_notFound() {
        int list[] = {1,2,3,5,7,9,10,34,56,4,78};
        int key = 3000;
        int except = -1;
        BinaraySeacrch demo = new BinaraySeacrch();
        int result = demo.binaraySreach(list,key);
        assertEquals(except,result);

    }
    @org.junit.jupiter.api.Test
    @DisplayName(" Tim thay")
    void binaraySreach_Found() {
        int list[] = {1,2,3,5,7,9,10,34,56,4,78};
        int key = 3;
        int except = 2;
        BinaraySeacrch demo = new BinaraySeacrch();
        int result = demo.binaraySreach(list,key);
        assertEquals(except,result);

    }
}