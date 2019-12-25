package v2l.mainfunction;

import v2l.Ecommerce.PurchaseProduct;

import java.util.ArrayList;
import java.util.Scanner;

public class EDBMain {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int pid, pprice;
        String pname, sname, cname;

        PurchaseProduct purchaseProduct = new PurchaseProduct();
        System.out.println("Please provide product details");
        System.out.print("Please give purchase id");
        pid = scanner.nextInt();
        System.out.print("Employee Product Name: ");
        pname = scanner.next();
        System.out.print("Employee Product Price: ");
        pprice = scanner.nextInt();

        System.out.print("Please select Product category Name: ");
        ArrayList<String> categoryName = PurchaseProduct.getCategoryNameTochoose();
        for (int i = 0; i < categoryName.size(); i++)
            System.out.println(categoryName.get(i));
        cname = scanner.next();

        System.out.print("Please select Product Supplier Name: ");
        ArrayList<String> supplier = PurchaseProduct.getSupplierNameTochoose();
        for (int i = 0; i < supplier.size(); i++)
            System.out.println(supplier.get(i));
        sname = scanner.next();

        if (!purchaseProduct.createProduct(pid, pname, pprice, cname, sname)) {
            System.out.println("Error in data.. please check...");
        } else {
            System.out.println("Employee record created successfully...");
        }
    }
}
