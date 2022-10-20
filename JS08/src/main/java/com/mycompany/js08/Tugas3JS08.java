/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js08;

//created by 21343032_Muhammad Rizky Sandyra

public class Tugas3JS08 {
    public static void main(String[] args){
        String[][] buku = {{ "Florence", "735-1234", "Manila" },
                           { "Joyce", "983-3333", "Quezon City" },
                           { "Becca", "456-3322", "Manila" }
        };
        for (int i = 0; i < buku.length; i++) {
            System.out.println("\nName : " + buku[i][0]);
            System.out.println("Tel : " + buku[i][1]);
            System.out.println("Adress : " + buku[i][2]);
        }
    }
}