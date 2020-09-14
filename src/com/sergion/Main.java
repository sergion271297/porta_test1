package com.sergion;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file1 = new File("files/file1");
        File file2 = new File("files/file2");
        UniqueFinder uniqueFinder = new UniqueFinder();

        for (String name : uniqueFinder.uniqueFindFromFile(file1, file2)) {
            System.out.println(name);
        }
    }
}
















/*
Hyacinth
Dareen
Antoinette
Glyn
Rosita
Garnet
Kean
Toby
Francyne
Verney
Brigham
Bonnee
Mychal
Ivette
Abie
Rici
Prudy
Ollie
Faun
Shay
Cathie
Carma
Katharyn
Faina
Rainer
Kerry
Alisha
Ogdon
Eda
Esdras
Maurise
Forester
Annadiana
Roberto
Jemima
Herb
Austina
Ryann
Sharlene
Danette
Gleda
Bellina
Britta
Rachel
Douglas
Hank
Hubie
Donnamarie
Lindsy
Evita
Graehme
Natividad
Avery
Rodolphe
Norrie
Rosemaria
Taryn
Carolina
Siffre
Kit
Dionne
Langston
Rudyard
Horace

 */

