package v2l.mainfunction;

import v2l.Ecommerce.*;

import java.util.ArrayList;
import java.util.Scanner;

public class EDBMain {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String cname;
        float billamount;
        int choice,pid,quantity,pprice,month;
        do {
            System.out.println("Please select the list below");
            System.out.println("1.Purchase Product");
            System.out.println("2.View Order Details");
            System.out.println("3.Exit");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Category List are below");
                    Category category=new Category();
                    ArrayList<String> categoryName=Category.getCategoryNameTochoose();
                    for(int i=0;i<categoryName.size();i++)
                        System.out.println(categoryName.get(i));
                    cname=scanner.next();
                    System.out.println("Product list under selected category");
                    Product product=new Product();
                    product.getAllproduct(cname);
                    System.out.println("Enter Product id and Quantity");
                    pid=scanner.nextInt();
                    quantity=scanner.nextInt();
                    pprice=product.getProductPrice(pid,quantity);
                    System.out.println("Product Price:"+pprice);
                    ProductDiscount productDiscount=new ProductDiscount();
                    System.out.println("Enter Purchase Month");
                    month=scanner.nextInt();
                    productDiscount.applyDiscount(month);
                    billamount=productDiscount.displayBillamount();




            }
        }while (choice!=3);

    }
}
