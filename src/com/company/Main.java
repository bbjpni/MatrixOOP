package com.company;

public class Main {

    public static void main(String[] args) {
	Matrix m = new Matrix(1,1);
        System.out.println(m);
        System.out.println(m.osszeg());
        System.out.println(m.positivdarab());
        System.out.println(m.legnagyobbelem());
        System.out.println();
        System.out.println(m.negyzetesMatrix() ? "Négyzetes mátrix" : "Nem négyzetes mátrix");
        System.out.println(m.nullassMatrix() ? "Nullmátrix" : "Nem nullmátrix");
        System.out.println(m.egységmatrix() ? "Egységmátrix" : "nem egységmátrix");
        System.out.println(m.szimetrikus() ? "Szimetrikusmátrix" : "nem szimetrikusmátrix");
        System.out.println("A felső háromszög átlaga: "+m.felsoharomszogAtlaga());
        System.out.println("A keresztátló összege: "+m.keresztatloOsszege());
        System.out.println("A főátló összege: "+m.foatloOsszege());
        System.out.println(m.alsoharomszogMax());
    }
}
