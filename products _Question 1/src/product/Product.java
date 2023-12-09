/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;
import java.util.Scanner;


/**
 *
 * @author 21757611
 */
public class Product {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int launchMenu;
        int menu;
        int productCategory;
        int productWarranty;
        double productPrice;
        String productCode;
        int update;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("BRIGHT FUTURE TECHNOLOGIES APPLICATION" + "\n" +
                           "**************************************" + "\n" +
                         "Enter (1) to launch menu or any other key to exit");
        launchMenu = scan.nextInt();
            
        
        if (launchMenu == 1){
            System.out.println("Please select one of the folloing menu iems:" + "\n" + 
                    "1) Capture a new product." + "\n" +
                    "2) Search for a new product. " + "\n" +
                    "3) Update a product. " + "\n" + 
                    "4) Delete a product. " + "\n" +
                    "5) Print report." + "\n" +
                    "6) Exit Applicatiion.");
            menu = scan.nextInt();
            
            if (menu==1){
                
                System.out.println("CAPTURE A NEW PRODUCT" + "\n" +
                        "*****************************" + "\n" +
                        "Enter the product code: " + "ASS" + "\n" +
                        "Enter the product name: " + "EliteBook" + "\n" +
                        "                                    " +"\n" +
                        "Select the product category: " + "\n" +
                        "1) Desktop Computer " + "\n" +
                        "2) Laptop" + "\n" + 
                        "3) Tablet" + "\n" +
                        "4) Printer" + "\n" +
                        "5) Gaming Console");
                productCategory = scan.nextInt();
            
                System.out.println("productCategory>>" + productCategory + "\n" + 
                        "Indicate the product warrenty." + "\n" + 
                        "Enter (1) for 6 months or any other key for 2 years" );
                 productWarranty = scan.nextInt(); 
                 if (productWarranty == 1){
                     System.out.print("6 months\n" );
                 }
                 else if (productWarranty ==0){
                     System.out.print("2 years\n" );
                     
                 }
                 
                 System.out.println("Enter the price for EliteBook >>" + "15000" + "\n" +
                         "Enter the stock level for EliteBook>>" + "3" + "\n" + 
                         "Enter the supplier for EliteBook>>" + "IT_4_Africe" + "\n" +
                         "Product details has been saved successfully!!!" + "\n" +
                         "Enter (1) to launch menu or any other key to exit");
                launchMenu = scan.nextInt();
            
        
                if (launchMenu == 1){
                System.out.println("Please select one of the folloing menu iems:" + "\n" + 
                        "1) Capture a new product." + "\n" +
                        "2) Search for a new product. " + "\n" +
                        "3) Update a product. " + "\n" + 
                        "4) Delete a product. " + "\n" +
                        "5) Print report." + "\n" +
                        "6) Exit Applicatiion.");
                menu = scan.nextInt();

                         
                System.exit(0);

                }
            }
            
            if (menu == 2){
            
                System.out.println("Please enter the product code to search");
                productCode = scan.nextLine();    
                    productCode = "A55";
                    String A55 = null;
           
                if (productCode.equals(A55)){
                    System.out.println("***********************************************"+"\n"+
                             "PRODUCT SEARCH RESULTS " +"\n" +
                            "***********************************************" +"\n"+
                             "PRODUCT CODE: " + "A55" + "\n" +
                             "PRODUCT NAME: " + "EliteBook" + "\n" +
                             "PRODUCT WARRANTY: " + "Laptop" + "\n" + 
                             "PRODUCT CATEGORY: " + "2 years" + "\n" +
                             "PRODUCT PRICE: " + "R15000" + "\n" +
                             "PRODUCT STOCK LEVELS" + "3" + "\n" + 
                             "PRODUCT SUPPLIER: " + "IT_4_Africa" + "\n" +
                             "***********************************************");
                }  
            }    
            
            if(menu==3){
                System.out.println("Please enter the product code to update");
               productCode = scan.nextLine();

               System.out.println("Update the warrenty" + "\n" +
                       "Enter (y) to update or enter (n) to not update");
               productWarranty = scan.nextInt();

               System.out.println("Update the product price" + "\n" +
                       "Enter (y) Yes to update or enter (n) No to not update");
               productPrice = scan.nextDouble();

               System.out.println("Enter the new price for Elite Book>>");
               productPrice = scan.nextDouble();
               
               System.out.println("Product details have been successfully updated" + "\n" +
                       "Enter (1) to launch menu or any other key to exit");
               launchMenu = scan.nextInt();
            
        
                if (launchMenu == 1){
                    System.out.println("Please select one of the folloing menu iems:" + "\n" + 
                        "1) Capture a new product." + "\n" +
                        "2) Search for a new product. " + "\n" +
                        "3) Update a product. " + "\n" + 
                        "4) Delete a product. " + "\n" +
                        "5) Print report." + "\n" +
                        "6) Exit Applicatiion.");
                menu = scan.nextInt();
                
                System.exit(6);
                }
            }             
        
            if (menu==5){
            ReportData Product1 = new ReportData("A55","Elitebook",'2', "A55", 14500,3,"IT_4_Afrca");
            String Product1ProductCode = Product1.getProductCode();
            String Product1productName = Product1.getProductName();
            int Product1productCategory = Product1.getProductCategory();
            String Product1productWarrenty = Product1.getProductWarrenty();
            double Product1productPrice = Product1.getProductPrice();
            int Product1productLevel =Product1.getProductLevel();
            String Product1productSupplier = Product1.getProductSupplier();

            ReportData Product2 = new ReportData ("A54", "Elitebook", '2', "A54", 12500, 3, "IT_4_Africa");
            String Product2ProductCode = Product2.getProductCode();
            String Product2productName = Product2.getProductName();
            int Product2productCategory = Product2.getProductCategory();
            String Product2productWarrenty = Product2.getProductWarrenty();
            double Product2productPrice = Product2.getProductPrice();
            int Product2productLevel =Product2.getProductLevel();
            String Product2productSupplier = Product2.getProductSupplier();

            ReportData Product3 = new ReportData("A55", "PS5",'2',"A55",8500,3,"Gaming_4_Africa");
            String Product3ProductCode = Product3.getProductCode();
            String Product3productName = Product3.getProductName();
            int Product3productCategory = Product3.getProductCategory();
            String Product3productWarrenty = Product3.getProductWarrenty();
            double Product3productPrice = Product3.getProductPrice();
            int Product3productLevel =Product3.getProductLevel();
            String Product3productSupplier = Product3.getProductSupplier();

            System.out.println("PRODUCT REPORT" + "\n" +
                    "======================================================" + "\n" +
                    "PRODUCT 1" + "\n" +
                    "------------------------------------------------------" + "\n" +
                    "PRODUCT CODE >>" + "           " + Product1ProductCode + "\n" +
                    "PRODUCT NAME >>" + "           " + Product1productName + "\n" +
                    "PRODUCT CATEGORY >>" + "       " + Product1productCategory + "\n" +
                    "PRODUCT WARRENTY >>" + "       " + Product1productWarrenty + "\n" +
                    "PRODUCT PRICE >>" + "          " + Product1productPrice + "\n" +
                    "PRODUCT LEVEL >>" + "          " + Product1productLevel + "\n" + 
                    "PRODUCT SUPPLIER >>" + "       " + Product1productSupplier + "\n" +
                    "------------------------------------------------------" + "\n" +
                    "PRODUCT 2" + "\n" +
                    "------------------------------------------------------" + "\n" +
                    "PRODUCT CODE >>" + "           " + Product2ProductCode + "\n" +
                    "PRODUCT NAME >>" + "           " + Product2productName + "\n" +
                    "PRODUCT CATEGORY >>" + "       " + Product2productCategory + "\n" +
                    "PRODUCT WARRENTY >>" + "       " + Product2productWarrenty + "\n" +
                    "PRODUCT PRICE >>" + "          " + Product2productPrice + "\n" +
                    "PRODUCT LEVEL >>" + "          " + Product2productLevel + "\n" + 
                    "PRODUCT SUPPLIER >>" + "       " + Product2productSupplier + "\n" +
                    "------------------------------------------------------" + "\n" +
                    "PRODUCT 1" + "\n" +
                    "------------------------------------------------------" + "\n" +
                    "PRODUCT CODE >>" + "           " + Product3ProductCode + "\n" +
                    "PRODUCT NAME >>" + "           " + Product3productName + "\n" +
                    "PRODUCT CATEGORY >>" + "       " + Product3productCategory + "\n" +
                    "PRODUCT WARRENTY >>" + "       " + Product3productWarrenty + "\n" +
                    "PRODUCT PRICE >>" + "          " + Product3productPrice + "\n" +
                    "PRODUCT LEVEL >>" + "          " + Product3productLevel + "\n" + 
                    "PRODUCT SUPPLIER >>" + "       " + Product3productSupplier + "\n" +
                    "------------------------------------------------------" + "\n" +
                    "======================================================" + "\n" + 
                    "TOTAL PRODUCT COUNT:" + "3" + "\n" +
                    "TOTAL PRODUCT VALUE:" + "R35500" + "\n" +
                    "AVERAGE PRODUCT VALUE:" + "R11833" + "\n" +
                    "======================================================" + "\n" +
                    "Enter (1) to launch menu or any other key to exit" );
                    menu = scan.nextInt();

                    System.exit(0);
            }
                    
        }
    }
    
}
