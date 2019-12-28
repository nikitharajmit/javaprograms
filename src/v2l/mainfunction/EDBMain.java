package v2l.mainfunction;

import v2l.Ecommerce.Category;
import v2l.Ecommerce.Product;
import v2l.Ecommerce.ProductDbo;
import v2l.Ecommerce.PurchaseProduct;

import java.util.ArrayList;
import java.util.Scanner;

public class EDBMain {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String cname;
        int choice;
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
                    ProductDbo productDbo=new ProductDbo();
                    productDbo.getProductByCategory(cname);


            }
        }while (choice!=3);

    }
}
