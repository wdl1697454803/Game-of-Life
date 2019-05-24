package gamePackage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class CellMatrixTest {

    private CellMatrix CellMatrixTest38 = new CellMatrix(20, 20, 100, 0, new int[20][20]);
    private CellMatrix CellMatrixTest39 = new CellMatrix(20, 20, 100, new Random().nextInt(Integer.MAX_VALUE),
            new int[20][20]);
    private CellMatrix CellMatrixTest40 = new CellMatrix(20, 20, 100, Integer.MAX_VALUE, new int[20][20]);

    @Before
    public void setUp() throws Exception {
        assertNotNull("CellMatrixTest38 false", CellMatrixTest39);
        assertNotNull("CellMatrixTest39 false", CellMatrixTest38);
        assertNotNull("CellMatrixTest40 false", CellMatrixTest40);
    }



    @Test
    public void testCellMatrix() {
        CellMatrix CellMatrixTest2 = new CellMatrix(20, 20, 100, 0, new int[20][20]);
        CellMatrix CellMatrixTest3 = new CellMatrix(20, 20, 100, new Random().nextInt(Integer.MAX_VALUE),
                new int[20][20]);
        CellMatrix CellMatrixTest4 = new CellMatrix(20, 20, 100, Integer.MAX_VALUE, new int[20][20]);
        CellMatrix CellMatrixTest5 = new CellMatrix(20, 20, 200, 0, new int[20][20]);
        CellMatrix CellMatrixTest6 = new CellMatrix(20, 20, 200, new Random().nextInt(Integer.MAX_VALUE),
                new int[20][20]);
        CellMatrix CellMatrixTest7 = new CellMatrix(20, 20, 200, Integer.MAX_VALUE, new int[20][20]);
        CellMatrix CellMatrixTest8 = new CellMatrix(20, 20, 500, 0, new int[20][20]);
        CellMatrix CellMatrixTest9 = new CellMatrix(20, 20, 500, new Random().nextInt(Integer.MAX_VALUE),
                new int[20][20]);
        CellMatrix CellMatrixTest10 = new CellMatrix(20, 20, 500, Integer.MAX_VALUE, new int[20][20]);
        CellMatrix CellMatrixTest11 = new CellMatrix(30, 30, 100, 0, new int[30][30]);
        CellMatrix CellMatrixTest12 = new CellMatrix(30, 30, 100, new Random().nextInt(Integer.MAX_VALUE),
                new int[30][30]);
        CellMatrix CellMatrixTest13 = new CellMatrix(30, 30, 100, Integer.MAX_VALUE, new int[30][30]);
        CellMatrix CellMatrixTest14 = new CellMatrix(30, 30, 200, 0, new int[30][30]);
        CellMatrix CellMatrixTest15 = new CellMatrix(30, 30, 200, new Random().nextInt(Integer.MAX_VALUE),
                new int[30][30]);
        CellMatrix CellMatrixTest16 = new CellMatrix(30, 30, 200, Integer.MAX_VALUE, new int[30][30]);
        CellMatrix CellMatrixTest17 = new CellMatrix(30, 30, 500, 0, new int[30][30]);
        CellMatrix CellMatrixTest18 = new CellMatrix(30, 30, 500, new Random().nextInt(Integer.MAX_VALUE),
                new int[30][30]);
        CellMatrix CellMatrixTest19 = new CellMatrix(30, 30, 500, Integer.MAX_VALUE, new int[30][30]);
        CellMatrix CellMatrixTest20 = new CellMatrix(40, 40, 100, 0, new int[40][40]);
        CellMatrix CellMatrixTest21 = new CellMatrix(40, 40, 100, new Random().nextInt(Integer.MAX_VALUE),
                new int[40][40]);
        CellMatrix CellMatrixTest22 = new CellMatrix(40, 40, 100, Integer.MAX_VALUE, new int[40][40]);
        CellMatrix CellMatrixTest23 = new CellMatrix(40, 40, 200, 0, new int[40][40]);
        CellMatrix CellMatrixTest24 = new CellMatrix(40, 40, 200, new Random().nextInt(Integer.MAX_VALUE),
                new int[40][40]);
        CellMatrix CellMatrixTest25 = new CellMatrix(40, 40, 200, Integer.MAX_VALUE, new int[40][40]);
        CellMatrix CellMatrixTest26 = new CellMatrix(40, 40, 500, 0, new int[40][40]);
        CellMatrix CellMatrixTest27 = new CellMatrix(40, 40, 500, new Random().nextInt(Integer.MAX_VALUE),
                new int[40][40]);
        CellMatrix CellMatrixTest28 = new CellMatrix(40, 40, 500, Integer.MAX_VALUE, new int[40][40]);
        CellMatrix CellMatrixTest29 = new CellMatrix(50, 50, 100, 0, new int[50][50]);
        CellMatrix CellMatrixTest30 = new CellMatrix(50, 50, 100, new Random().nextInt(Integer.MAX_VALUE),
                new int[50][50]);
        CellMatrix CellMatrixTest31 = new CellMatrix(50, 50, 100, Integer.MAX_VALUE, new int[50][50]);
        CellMatrix CellMatrixTest32 = new CellMatrix(50, 50, 200, 0, new int[50][50]);
        CellMatrix CellMatrixTest33 = new CellMatrix(50, 50, 200, new Random().nextInt(Integer.MAX_VALUE),
                new int[50][50]);
        CellMatrix CellMatrixTest34 = new CellMatrix(50, 50, 200, Integer.MAX_VALUE, new int[50][50]);
        CellMatrix CellMatrixTest35 = new CellMatrix(50, 50, 500, 0, new int[50][50]);
        CellMatrix CellMatrixTest36 = new CellMatrix(50, 50, 500, new Random().nextInt(Integer.MAX_VALUE),
                new int[50][50]);
        CellMatrix CellMatrixTest37 = new CellMatrix(50, 50, 500, Integer.MAX_VALUE, new int[50][50]);

        assertNotNull("CellMatrixTest2 false", CellMatrixTest2);
        assertNotNull("CellMatrixTest3 false", CellMatrixTest3);
        assertNotNull("CellMatrixTest4 false", CellMatrixTest4);
        assertNotNull("CellMatrixTest5 false", CellMatrixTest5);
        assertNotNull("CellMatrixTest6 false", CellMatrixTest6);
        assertNotNull("CellMatrixTest7 false", CellMatrixTest7);
        assertNotNull("CellMatrixTest8 false", CellMatrixTest8);
        assertNotNull("CellMatrixTest9 false", CellMatrixTest9);
        assertNotNull("CellMatrixTest10 false", CellMatrixTest10);
        assertNotNull("CellMatrixTest11 false", CellMatrixTest11);
        assertNotNull("CellMatrixTest12 false", CellMatrixTest12);
        assertNotNull("CellMatrixTest13 false", CellMatrixTest13);
        assertNotNull("CellMatrixTest14 false", CellMatrixTest14);
        assertNotNull("CellMatrixTest15 false", CellMatrixTest15);
        assertNotNull("CellMatrixTest16 false", CellMatrixTest16);
        assertNotNull("CellMatrixTest17 false", CellMatrixTest17);
        assertNotNull("CellMatrixTest18 false", CellMatrixTest18);
        assertNotNull("CellMatrixTest19 false", CellMatrixTest19);
        assertNotNull("CellMatrixTest20 false", CellMatrixTest20);
        assertNotNull("CellMatrixTest21 false", CellMatrixTest21);
        assertNotNull("CellMatrixTest22 false", CellMatrixTest22);
        assertNotNull("CellMatrixTest23 false", CellMatrixTest23);
        assertNotNull("CellMatrixTest24 false", CellMatrixTest24);
        assertNotNull("CellMatrixTest25 false", CellMatrixTest25);
        assertNotNull("CellMatrixTest26 false", CellMatrixTest26);
        assertNotNull("CellMatrixTest27 false", CellMatrixTest27);
        assertNotNull("CellMatrixTest28 false", CellMatrixTest28);
        assertNotNull("CellMatrixTest29 false", CellMatrixTest29);
        assertNotNull("CellMatrixTest30 false", CellMatrixTest30);
        assertNotNull("CellMatrixTest31 false", CellMatrixTest31);
        assertNotNull("CellMatrixTest32 false", CellMatrixTest32);
        assertNotNull("CellMatrixTest33 false", CellMatrixTest33);
        assertNotNull("CellMatrixTest34 false", CellMatrixTest34);
        assertNotNull("CellMatrixTest35 false", CellMatrixTest35);
        assertNotNull("CellMatrixTest36 false", CellMatrixTest36);
        assertNotNull("CellMatrixTest37 false", CellMatrixTest37);

    }

    @Test
    public void testtransform() {
        CellMatrixTest38.getMatrix()[0][0] = 0;
        CellMatrixTest38.getMatrix()[0][1] = 1;
        CellMatrixTest38.getMatrix()[0][2] = 0;
        CellMatrixTest38.getMatrix()[1][0] = 0;
        CellMatrixTest38.getMatrix()[1][1] = 0;
        CellMatrixTest38.getMatrix()[1][2] = 1;
        CellMatrixTest38.getMatrix()[2][0] = 1;
        CellMatrixTest38.getMatrix()[2][1] = 1;
        CellMatrixTest38.getMatrix()[2][2] = 1;
        CellMatrixTest38.transform();
        assertEquals(1, CellMatrixTest38.getMatrix()[1][0]);
        assertEquals(1, CellMatrixTest38.getMatrix()[1][2]);
        assertEquals(1, CellMatrixTest38.getMatrix()[2][1]);
        assertEquals(1, CellMatrixTest38.getMatrix()[2][2]);
        assertEquals(1, CellMatrixTest38.getMatrix()[3][1]);
    }

    @Test
    public void testfindLifedNum() {
        CellMatrixTest38.getMatrix()[0][0] = 0;
        CellMatrixTest38.getMatrix()[0][1] = 0;
        CellMatrixTest38.getMatrix()[0][2] = 0;
        CellMatrixTest38.getMatrix()[1][0] = 0;
        CellMatrixTest38.getMatrix()[1][2] = 0;
        CellMatrixTest38.getMatrix()[2][0] = 0;
        CellMatrixTest38.getMatrix()[2][1] = 0;
        CellMatrixTest38.getMatrix()[2][2] = 0;
        assertEquals("findLifedNum false", 0, CellMatrixTest38.findLifedNum(1, 1));
        CellMatrixTest38.getMatrix()[0][0] = 1;
        CellMatrixTest38.getMatrix()[0][1] = 0;
        CellMatrixTest38.getMatrix()[0][2] = 0;
        CellMatrixTest38.getMatrix()[1][0] = 0;
        CellMatrixTest38.getMatrix()[1][2] = 0;
        CellMatrixTest38.getMatrix()[2][0] = 0;
        CellMatrixTest38.getMatrix()[2][1] = 0;
        CellMatrixTest38.getMatrix()[2][2] = 0;
        assertEquals("findLifedNum false", 1, CellMatrixTest38.findLifedNum(1, 1));
        CellMatrixTest38.getMatrix()[0][0] = 1;
        CellMatrixTest38.getMatrix()[0][1] = 1;
        CellMatrixTest38.getMatrix()[0][2] = 0;
        CellMatrixTest38.getMatrix()[1][0] = 0;
        CellMatrixTest38.getMatrix()[1][2] = 0;
        CellMatrixTest38.getMatrix()[2][0] = 0;
        CellMatrixTest38.getMatrix()[2][1] = 0;
        CellMatrixTest38.getMatrix()[2][2] = 0;
        assertEquals("findLifedNum false", 2, CellMatrixTest38.findLifedNum(1, 1));
        CellMatrixTest38.getMatrix()[0][0] = 1;
        CellMatrixTest38.getMatrix()[0][1] = 1;
        CellMatrixTest38.getMatrix()[0][2] = 1;
        CellMatrixTest38.getMatrix()[1][0] = 0;
        CellMatrixTest38.getMatrix()[1][2] = 0;
        CellMatrixTest38.getMatrix()[2][0] = 0;
        CellMatrixTest38.getMatrix()[2][1] = 0;
        CellMatrixTest38.getMatrix()[2][2] = 0;
        assertEquals("findLifedNum false", 3, CellMatrixTest38.findLifedNum(1, 1));
        CellMatrixTest38.getMatrix()[0][0] = 1;
        CellMatrixTest38.getMatrix()[0][1] = 1;
        CellMatrixTest38.getMatrix()[0][2] = 1;
        CellMatrixTest38.getMatrix()[1][0] = 1;
        CellMatrixTest38.getMatrix()[1][2] = 0;
        CellMatrixTest38.getMatrix()[2][0] = 0;
        CellMatrixTest38.getMatrix()[2][1] = 0;
        CellMatrixTest38.getMatrix()[2][2] = 0;
        assertEquals("findLifedNum false", 4, CellMatrixTest38.findLifedNum(1, 1));
        CellMatrixTest38.getMatrix()[0][0] = 1;
        CellMatrixTest38.getMatrix()[0][1] = 1;
        CellMatrixTest38.getMatrix()[0][2] = 1;
        CellMatrixTest38.getMatrix()[1][0] = 1;
        CellMatrixTest38.getMatrix()[1][2] = 1;
        CellMatrixTest38.getMatrix()[2][0] = 0;
        CellMatrixTest38.getMatrix()[2][1] = 0;
        CellMatrixTest38.getMatrix()[2][2] = 0;
        assertEquals("findLifedNum false", 5, CellMatrixTest38.findLifedNum(1, 1));
        CellMatrixTest38.getMatrix()[0][0] = 1;
        CellMatrixTest38.getMatrix()[0][1] = 1;
        CellMatrixTest38.getMatrix()[0][2] = 1;
        CellMatrixTest38.getMatrix()[1][0] = 1;
        CellMatrixTest38.getMatrix()[1][2] = 1;
        CellMatrixTest38.getMatrix()[2][0] = 1;
        CellMatrixTest38.getMatrix()[2][1] = 0;
        CellMatrixTest38.getMatrix()[2][2] = 0;
        assertEquals("findLifedNum false", 6, CellMatrixTest38.findLifedNum(1, 1));
        CellMatrixTest38.getMatrix()[0][0] = 1;
        CellMatrixTest38.getMatrix()[0][1] = 1;
        CellMatrixTest38.getMatrix()[0][2] = 1;
        CellMatrixTest38.getMatrix()[1][0] = 1;
        CellMatrixTest38.getMatrix()[1][2] = 1;
        CellMatrixTest38.getMatrix()[2][0] = 1;
        CellMatrixTest38.getMatrix()[2][1] = 1;
        CellMatrixTest38.getMatrix()[2][2] = 0;
        assertEquals("findLifedNum false", 7, CellMatrixTest38.findLifedNum(1, 1));
        CellMatrixTest38.getMatrix()[0][0] = 1;
        CellMatrixTest38.getMatrix()[0][1] = 1;
        CellMatrixTest38.getMatrix()[0][2] = 1;
        CellMatrixTest38.getMatrix()[1][0] = 1;
        CellMatrixTest38.getMatrix()[1][2] = 1;
        CellMatrixTest38.getMatrix()[2][0] = 1;
        CellMatrixTest38.getMatrix()[2][1] = 1;
        CellMatrixTest38.getMatrix()[2][2] = 1;
        assertEquals("findLifedNum false", 8, CellMatrixTest38.findLifedNum(1, 1));
    }

    @Test
    public void testchangeDuration() {
        CellMatrixTest38.changeDuration(200);
        assertEquals(200, CellMatrixTest38.getDuration());
        CellMatrixTest38.changeDuration(500);
        assertEquals(500, CellMatrixTest38.getDuration());
        CellMatrixTest38.changeDuration(100);
        assertEquals(100, CellMatrixTest38.getDuration());
    }

    @Test
    public void testinit() {
        CellMatrixTest38.init();
        for (int x = 0; x < CellMatrixTest38.getWidth(); x++) {
            for (int y = 0; y < CellMatrixTest38.getHeight(); y++) {
                assertEquals(0, CellMatrixTest38.getMatrix()[x][y]);
            }
        }
        assertEquals(0, CellMatrixTest38.getTransfromNum());
    }

}
