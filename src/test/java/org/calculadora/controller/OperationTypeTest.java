package org.calculadora.controller;

import org.junit.*;
import org.mockito.*;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class OperationTypeTest {

    @InjectMocks
    private OperationType operationType;

    @Mock
    private Division division;

    @Mock
    private Multiplication multiplication;

    @Mock
    private Resta resta;

    @Mock
    private Sum sum;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testDivisionOperation() {
        when(division.division("10/5")).thenReturn(2);

        operationType.operarAritmetica("10/5");

        verify(division, times(1)).division("10/5");
        assertEquals(2, (int) operationType.result);
    }

    @Test
    public void testMultiplicationOperation() {
        when(multiplication.multiplication("2*3")).thenReturn(6);

        operationType.operarAritmetica("2*3");

        verify(multiplication, times(1)).multiplication("2*3");
        assertEquals(6, (int) operationType.result);
    }

    @Test
    public void testRestaOperation() {
        when(resta.resta("5-3")).thenReturn(2);

        operationType.operarAritmetica("5-3");

        verify(resta, times(1)).resta("5-3");
        assertEquals(2, (int) operationType.result);
    }

    @Test
    public void testSumOperation() {
        when(sum.suma("1+1")).thenReturn(2);

        operationType.operarAritmetica("1+1");

        verify(sum, times(1)).suma("1+1");
        assertEquals(2, (int) operationType.result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOperator() {
        operationType.operarAritmetica("2$2");
    }
}
