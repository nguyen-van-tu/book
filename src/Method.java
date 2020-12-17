import org.jcp.xml.dsig.internal.dom.DOMUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Method {
    FictionBook[] fictionBooks = new FictionBook[5];
    ProgrammingBook[] programmingBooks = new ProgrammingBook[5];
    Scanner sc = new Scanner(System.in);

    public void add() {
        ProgrammingBook java1 = new ProgrammingBook(1, "Java core1", 10000, "tu1", "java", "SonMC1");
        programmingBooks[0] = java1;
        ProgrammingBook java2 = new ProgrammingBook(2, "Java core2", 20000, "tu2", "java", "SonMC2");
        programmingBooks[1] = java2;
        ProgrammingBook java3 = new ProgrammingBook(3, "Java core3", 30000, "tu3", "js", "SonMC3");
        programmingBooks[2] = java3;
        ProgrammingBook java4 = new ProgrammingBook(4, "Java core4", 40000, "tu4", "java", "SonMC4");
        programmingBooks[3] = java4;
        ProgrammingBook java5 = new ProgrammingBook(5, "Java core5", 50000, "tu5", "java", "SonMC5");
        programmingBooks[4] = java5;


        FictionBook php1 = new FictionBook(6, "1", 15000, "KieuAnh1", "A");
        fictionBooks[0] = php1;
        FictionBook php2 = new FictionBook(7, "2", 25000, "KieuAnh2", "B");
        fictionBooks[1] = php2;
        FictionBook php3 = new FictionBook(8, "3", 35000, "KieuAnh3", "C");
        fictionBooks[2] = php3;
        FictionBook php4 = new FictionBook(9, "4", 45000, "KieuAnh4", "D");
        fictionBooks[3] = php4;
        FictionBook php5 = new FictionBook(10, "5", 55000, "KieuAnh5", "E");
        fictionBooks[4] = php5;

        System.out.println("Thêm thành công!!");
    }
    public void tinhtien() {
        float tongtienPRB = 0;
        float tongtienFTB = 0;
        float tongtien = 0;
        for (int i = 0; i < programmingBooks.length; i++) {
            tongtienPRB += programmingBooks[i].price;
        }
        for (int i = 0; i < fictionBooks.length; i++) {
            tongtienFTB += fictionBooks[i].price;
        }
        tongtien = tongtienFTB + tongtienPRB;
        System.out.println("Tong tien la: " + tongtien + "VND");

    }

//    public void searchPGB(String name) {
//        for (ProgrammingBook prB : programmingBooks) {
//            if (name.equals(prB.name)) {
//                System.out.println("Price of " + prB.name + " is: " + prB.price + "VND");
//                break;
//            }
//        }
//    }
//
//    public void searchFTB(String name1) {
//        for (FictionBook ftB : fictionBooks) {
//            if (name1.equals(ftB.name)) {
//                System.out.println("Price of" + ftB.name + " is: " + ftB.price + "VND");
//            }
//        }
//    }
}