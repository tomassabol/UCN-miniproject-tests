package view;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

import test.TestBoundaryCalculationCurrencyDKK;
import test.TestBoundaryCalculationCurrencyEuro;
import test.TestCalculation;
import test.TestCalculationCurrencyDkk;
import test.TestCalculationCurrencyEuro;
import test.TestCalculationCurrencyMixed;
import test.TestDatabaseAccess;
import test.TestGetCurrentPrice;
import test.TestIllegalCoin;
import test.TestReset;

public class App {
    
    public static void main(String[] args) {
        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
        
        junit.run(TestBoundaryCalculationCurrencyDKK.class);
        junit.run(TestBoundaryCalculationCurrencyEuro.class);
        junit.run(TestCalculation.class);
        junit.run(TestCalculationCurrencyDkk.class);
        junit.run(TestCalculationCurrencyEuro.class);
        junit.run(TestCalculationCurrencyMixed.class);
        junit.run(TestDatabaseAccess.class);
        junit.run(TestGetCurrentPrice.class);
        junit.run(TestIllegalCoin.class);
        junit.run(TestDatabaseAccess.class);
        junit.run(TestReset.class);
    }
}
