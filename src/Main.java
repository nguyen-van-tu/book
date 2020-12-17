import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Method mt = new Method();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Thêm");
            System.out.println("2. Tổng tiền");
            System.out.println("3. Số sách ngôn ngữ java");
            System.out.println("4. Tìm kiếm");
            System.out.println("Chọn : ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    mt.add();
                    break;
                case 2:
                    mt.tinhtien();
                    break;
                case 3:
                    System.out.println("Số sách ngôn ngữ java là: " + mt.countBookJava());
                    break;
                case 4:
                    System.out.println("Bạn muốn tìm giá sách nào ");
                    System.out.println("1. ProgrammingBook");
                    System.out.println("2. FictionBook");
                    int choose = Integer.parseInt(sc.nextLine());
                    switch (choose) {
                        case 1:
                            System.out.println("Nhập tên cuốn sách: ");
                            String name = sc.nextLine();
                            mt.searchPGB(name);
                            break;
                        case 2:
                            System.out.println("Nhập tên cuốn sách: ");
                            String name1 = sc.nextLine();
                            mt.searchFTB(name1);
                            break;
                    }
                    break;
            }

        } while (true);
    }
}
