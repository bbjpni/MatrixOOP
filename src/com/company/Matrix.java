package com.company;

import java.util.Random;

public class Matrix {
    int sor;
    int oszlop;
    int[][] m;

    public Matrix(int sor, int oszlop) {
        this.sor = sor;
        this.oszlop = oszlop;
        this.m = new int[sor][oszlop];
        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++) {
                Random r = new Random();
                m[i][j] = r.nextInt(100);
            }
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                s += String.format("%3d", m[i][j]);
            }
            s+= System.lineSeparator();
        }
        return s;
    }

    public int osszeg(){
        int szum = 0;
        for (int[] t : m)
        {
            for (int s : t)
            {
                szum+= s;
            }
        }
        return szum;
    }

    public int positivdarab(){
        int db = 0;
        for (int[] t : m)
        {
            for (int s : t)
            {
                db += s > 0 ? 1 : 0;
            }
        }
        return db;
    }

    public int legnagyobbelem(){
        int max = 0;
        for (int[] t : m)
        {
            for (int s : t)
            {
                max = max < s ? s : max;
            }
        }
        return max;
    }

    public boolean negyzetesMatrix()
    {
        return m.length == m[0].length;
    }

    public boolean nullassMatrix()
    {
        boolean zero = true;
        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++)
            {
                zero = m[i][j] == 0;
                if (!zero){return false;}
            }
        }
        return zero;
    }

    public boolean egységmatrix()
    {
        boolean n = negyzetesMatrix();
        boolean matrix = true;
        if (n) {
            for (int i = 0; i < sor; i++) {
                for (int j = 0; j < oszlop; j++)
                {
                    boolean atloelem = i == j;
                    if (atloelem)
                    {
                        if (m[i][j] != 1){return false;}
                    }
                    else
                    {
                        if (m[i][j] != 0){return false;}
                    }
                }
            }
            return matrix;
        }
        return n;
    }

    public boolean szimetrikus()
    {
        boolean n = negyzetesMatrix();
        boolean matrix = true;
        if (n) {
            for (int i = 0; i < sor; i++) {
                for (int j = 0; j < oszlop; j++)
                {
                    if (m[i][j] != m[j][i]) {return false;}
                }
            }
            return matrix;
        }
        return n;
    }

    public double felsoharomszogAtlaga()
    {
        boolean n = negyzetesMatrix();
        int szum = 0;
        int db = 0;
        if (n) {
            for (int i = 0; i < oszlop; i++) {
                for (int j = 0; j < sor; j++)
                {
                    if (i == j)
                    {
                        j = sor;
                    }
                    else
                    {
                        szum += m[j][i];
                        db++;
                    }
                }
            }
            return db == 0 ? 0 : szum/db;
        }
        return szum;
    }

    public int keresztatloOsszege()
    {
        boolean n = negyzetesMatrix();
        int szum = 0;
        if (n) {
            for (int i = 0; i < sor; i++) {
                szum += m[i][sor-i-1];
            }
        }
        return szum;
    }

    public int foatloOsszege()
    {
        boolean n = negyzetesMatrix();
        int szum = 0;
        if (n) {
            for (int i = 0; i < sor; i++) {
                szum += m[i][i];
            }
        }
        return szum;
    }

    public double alsoharomszogMax()
    {
        boolean n = negyzetesMatrix();
        int max = 0;
        if (n) {
            for (int i = oszlop-1; i <= 0 ; i--) {
                for (int j = sor-1; j <= 0; j--)
                {
                    if (sor-1-j == i)
                    {
                        max = m[j][i] > max ? m[j][i] : max;
                        j = sor;
                    }
                }
            }
            return max;
        }
        return max;
    }

    public int getSor() {
        return sor;
    }

    public int getOszlop() {
        return oszlop;
    }

    public int[][] getM() {
        return m;
    }

    public void setSor(int sor) {
        this.sor = sor;
    }

    public void setOszlop(int oszlop) {
        this.oszlop = oszlop;
    }
}
