package org.example.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    // 정수형

    @Test
    public void 정수형_두_개로_덧셈을_한다_1(){
        int result = new Calculator().add(3, 4);

        assertEquals(7, result);
    }

    @Test
    public void 정수형_두_개로_덧셈을_한다_2(){
        int result = new Calculator().add(8, 4);

        assertEquals(12, result);
    }

    @Test
    public void 정수형_두_개로_뺄셈을_한다_1(){
        int result = new Calculator().subtract(10, 4);

        assertEquals(6, result);
    }

    @Test
    public void 정수형_두_개로_뺄셈을_한다_2(){
        int result = new Calculator().subtract(10, 14);

        assertEquals(-4, result);
    }

    @Test
    public void 정수형_두_개로_곱셈을_한다_1(){
        int result = new Calculator().multiply(0, 10);

        assertEquals(0, result);
    }

    @Test
    public void 정수형_두_개로_곱셈을_한다_2(){
        int result = new Calculator().multiply(10, 12);

        assertEquals(120, result);
    }

    @Test
    public void 정수형_두_개로_나눗셈을_한다_1(){
        int result = new Calculator().divide(10, 2);

        assertEquals(5, result);
    }

    @Test
    public void 정수형_두_개로_나눗셈을_한다_2(){
        int result = new Calculator().divide(3, 3);

        assertEquals(1, result);
    }

    @Test
    public void 제수가_0인_나눗셈을_한다(){
        assertThrows(
            ArithmeticException.class,
            () -> new Calculator().divide(10, 0)
        );
    }

    // 실수형

    @Test
    public void 실수형_두_개로_덧셈을_한다_1(){
        double result = new Calculator().add(1.5d, 2.6d);

        assertEquals(4.1d, result);
    }

    @Test
    public void 실수형_두_개로_덧셈을_한다_2(){
        double result = new Calculator().add(3.3d, 4.44d);

        assertEquals(7.74d, result);
    }

    @Test
    public void 실수형_두_개로_덧셈을_한다_3(){
        double result = new Calculator().add(3.30000000000123d, 4.40000000000123d);

        assertEquals(7.70000000000246d, result);
    }

    @Test
    public void 실수형_두_개로_뺄셈을_한다_1(){
        double result = new Calculator().subtract(1.5d, 2.6d);

        assertEquals(-1.1d, result);
    }

    @Test
    public void 실수형_두_개로_뺄셈을_한다_2(){
        double result = new Calculator().subtract(2.5d, 2.6d);

        assertEquals(-0.1d, result);
    }

    @Test
    public void 실수형_두_개로_곱셈을_한다_1(){
        double result = new Calculator().multiply(1.0d, 7.0d);

        assertEquals(7.0d, result);
    }

    @Test
    public void 실수형_두_개로_곱셈을_한다_2(){
        double result = new Calculator().multiply(1.01d, 7.0d);

        assertEquals(7.07d, result);
    }

    @Test
    public void 실수형_두_개로_나눗셈을_한다_1(){
        double result = new Calculator().divide(77.0d, 7.0d);

        assertEquals(11.0d, result);
    }

    @Test
    public void 실수형_두_개로_나눗셈을_한다_2(){
        double result = new Calculator().divide(77.777d, 7.0d);

        assertEquals(11.111d, result);
    }

    @Test
    public void 실수형_두_개로_나눗셈을_한다_3(){
        assertThrows(
            ArithmeticException.class,
            () -> new Calculator().divide(77.777d, 0d)
        );
    }

}