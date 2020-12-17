import org.jcp.xml.dsig.internal.dom.DOMUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Method {
    ProgrammingBook p= new ProgrammingBook();
    FictionBook[] fictionBooks = new FictionBook[5];
    ProgrammingBook[] programmingBooks = new ProgrammingBook[5];
    Scanner sc = new Scanner(System.in);

    public void add() {
        ProgrammingBook java1 = new ProgrammingBook(1, "hoclaptrinh1", 10000, "tu1", "java", "SonMC1");
        programmingBooks[0] = java1;
        ProgrammingBook java2 = new ProgrammingBook(2, "hoclaptrinh2", 20000, "tu2", "java", "SonMC2");
        programmingBooks[1] = java2;
        ProgrammingBook java3 = new ProgrammingBook(3, "hoclaptrinh3", 30000, "tu3", "js", "SonMC3");
        programmingBooks[2] = java3;
        ProgrammingBook java4 = new ProgrammingBook(4, "hoclaptrinh4", 40000, "tu4", "C++", "SonMC4");
        programmingBooks[3] = java4;
        ProgrammingBook java5 = new ProgrammingBook(5, "hoclaptrinh5", 50000, "tu5", "java", "SonMC5");
        programmingBooks[4] = java5;


        FictionBook b1 = new FictionBook(6, "sachvientuong1", 15000, "KieuAnh1", "A");
        fictionBooks[0] = b1;
        FictionBook b2 = new FictionBook(7, "sachvientuong2", 25000, "KieuAnh2", "B");
        fictionBooks[1] = b2;
        FictionBook b3 = new FictionBook(8, "sachvientuong3", 35000, "KieuAnh3", "C");
        fictionBooks[2] = b3;
        FictionBook b4 = new FictionBook(9, "sachvientuong4", 45000, "KieuAnh4", "D");
        fictionBooks[3] = b4;
        FictionBook b5 = new FictionBook(10, "sachvientuong5", 55000, "KieuAnh5", "E");
        fictionBooks[4] = b5;

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
        System.out.println("Tổng tiền là: " + tongtien + "VND");

    }
    public void check(){
        for (int i = 0; i < programmingBooks.length; i++) {
            if (p.getLanguage().equals(i));
        }

    }

    public void searchPGB(String name) {
        for (ProgrammingBook prB : programmingBooks) {
            if (name.equals(prB.name)) {
                System.out.println("giá của" + prB.name + " là: " + prB.price + "VND");
                break;
            }
        }
    }

    public void searchFTB(String name1) {
        for (FictionBook ftB : fictionBooks) {
            if (name1.equals(ftB.name)) {
                System.out.println("giá của" + ftB.name + " là: " + ftB.price + "VND");
            }
        }
    }
}