/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.satyam.oca.chap3;

/**
 *
 * @author satyam
 */
public class IfClauseTest {

    class Animal {

        int i;

        public Animal(int i) {
            i = i;
        }

    }

    public void test() {
        System.out.println(new Animal(22).i);
    }

    public static void main(String[] args) {
        new IfClauseTest().test();
    }

}
