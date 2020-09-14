package com.sergion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class UniqueFinderTest {

    @Test
    public void testReadingFile() throws IOException {
        File file1 = new File("files/file1");
        UniqueFinder uniqueFinder = new UniqueFinder();
        ArrayList<String> testList1 = uniqueFinder.fileToList(file1);
        Assertions.assertEquals(274835, testList1.size());
    }

    @Test
    public void testUniqueFindFromList() {
        ArrayList<String> testList1 = new ArrayList<>();
        ArrayList<String> testList2 = new ArrayList<>();

        testList1.add("qwe"); testList1.add("asd"); testList1.add("zxc");
        testList1.add("uniq1");
        testList1.add("rty"); testList1.add("fgh"); testList1.add("vbn");
        testList1.add("uniq2");

        testList2.add("qwe"); testList2.add("asd"); testList2.add("zxc");
        testList2.add("rty"); testList2.add("fgh"); testList2.add("vbn");

        UniqueFinder uniqueFinder = new UniqueFinder();
        ArrayList<String> result = uniqueFinder.uniqueFindFromList(testList1, testList2);
        Assertions.assertEquals(2, result.size());  // must be "2"
        Assertions.assertTrue(result.contains("uniq1") && result.contains("uniq2"));

        Assertions.assertEquals(0, uniqueFinder.uniqueFindFromList(testList2, testList1).size()); // must be "0"
    }

    @Test
    public void testUniqueFindFromFile() throws IOException {
        File file1 = new File("files/file1");
        File file2 = new File("files/file2");
        UniqueFinder uniqueFinder = new UniqueFinder();
        ArrayList<String> result = uniqueFinder.uniqueFindFromFile(file1, file2);
        Assertions.assertEquals(64, result.size());
    }
}
