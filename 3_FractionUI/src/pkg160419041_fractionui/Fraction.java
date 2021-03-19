/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg160419041_fractionui;

/**
 *
 * @author kenne
 */
public final class Fraction {

    private int numerator;
    private int denominator;

    public Fraction() throws Exception {
        setNumerator(0);
        setDenominator(1);
    }

    public Fraction(int num, int denom) throws Exception {
        setNumerator(num);
        setDenominator(denom);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) throws Exception {
        if (denominator == 0) {
            throw (new Exception("Denominator can not be 0"));
        } else {
            this.denominator = denominator;
        }
    }

    public static Fraction multiply(Fraction x, Fraction y) throws Exception {
        Fraction result = new Fraction();
        result.setNumerator(x.getNumerator() * y.getNumerator());
        result.setDenominator(x.getDenominator() * y.getDenominator());
        return result;
    }

    public static Fraction multiply(Fraction x, int y) throws Exception {
        Fraction result = new Fraction();
        result.setNumerator(x.getNumerator() * y);
        result.setDenominator(x.getDenominator());
        return result;
    }
    
    public static Fraction divide(Fraction x, Fraction y) throws Exception {
        Fraction result = new Fraction();
        result.setNumerator(x.getNumerator() * y.getDenominator());
        result.setDenominator(x.getDenominator() * y.getNumerator());
        return result;
    }
    
    public static Fraction divide(Fraction x, int y) throws Exception {
        Fraction result = new Fraction();
        result.setNumerator(x.getNumerator() * 1);
        result.setDenominator(x.getDenominator() * y);
        return result;
    }
    
    public static Fraction add(Fraction x, Fraction y) throws Exception {
        Fraction result = new Fraction();
        result.setNumerator(x.getNumerator() * y.getDenominator() + y.getNumerator() * x.getDenominator());
        result.setDenominator(x.getDenominator() + y.getDenominator());
        return result;
    }
    
    public static Fraction add(Fraction x, int y) throws Exception {
        Fraction result = new Fraction();
        result.setNumerator(x.getNumerator() + y * x.getDenominator());
        result.setDenominator(x.getDenominator());
        return result;
    }
    
    public static Fraction substract(Fraction x, Fraction y) throws Exception {
        Fraction result = new Fraction();
        result.setNumerator(x.getNumerator() * y.getDenominator() - y.getNumerator() * x.getDenominator());
        result.setDenominator(x.getDenominator() * y.getDenominator());
        return result;
    }
    
    public static Fraction substract(Fraction x, int y) throws Exception {
        Fraction result = new Fraction();
        result.setNumerator(x.getNumerator() - y * x.getDenominator());
        result.setDenominator(x.getDenominator());
        return result;
    }

    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        // TEST MULTIPLY
        try {
            // Create two objects of fraction
            Fraction frac1 = new Fraction(1,2);
            Fraction frac2 = new Fraction(3,4);
        
            // Call multiply method to multiply two objects of fraction
            Fraction results = Fraction.multiply(frac1, frac2);
            
            // Print
            System.out.println("1st fraction is: " + frac1.getNumerator() + "/" + frac1.getDenominator());
            System.out.println("2nd fraction is: " + frac2.getNumerator() + "/" + frac2.getDenominator());
            System.out.println("1st frac * 2nd frac is: " + results.getNumerator()+ "/" + results.getDenominator());
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
        // TEST FRACTION WITH 0 AS DENOM
        try {
            // Create two objects of fraction
            Fraction frac1 = new Fraction(1,0);
            Fraction frac2 = new Fraction(3,4);
        
            // Call multiply method to multiply two objects of fraction
            Fraction results = Fraction.multiply(frac1, frac2);
            
            // Print
            System.out.println("1st fraction is: " + frac1.getNumerator() + "/" + frac1.getDenominator());
            System.out.println("2nd fraction is: " + frac2.getNumerator() + "/" + frac2.getDenominator());
            System.out.println("1st frac * 2nd frac is: " + results.getNumerator()+ "/" + results.getDenominator());
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
        // TEST METHOD OVERLOARDING
        try {
            // Create two objects of fraction
            Fraction frac1 = new Fraction(1, 2);
            int n = 3;

            // Call multiply method to multiply two objects of fraction
            Fraction results = Fraction.multiply(frac1, n);

            // Print
            System.out.println("1st fraction is: " + frac1.getNumerator() + "/" + frac1.getDenominator());
            System.out.println("n is: " + n);
            System.out.println("1st frac * n is: " + results.getNumerator() + "/" + results.getDenominator());
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
