import org.junit.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;


public class Clases {
    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("1");
    }

    @BeforeMethod
    public void runBeforeTestMethod() {
        System.out.println("2");
    }

    @Test
    public void probandoTest() {

    }
    @Test
    public void yo() {
        System.out.println("6");
    }
    @Test
    public void panda() {
        System.out.println("7");
    }


    @AfterMethod
    public void runAfterTestMethod() { System.out.println("4"); }

    @AfterClass
    public static void holaAfterClass() {
        System.out.println("5");
    }







}
