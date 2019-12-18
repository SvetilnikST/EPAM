package by.svetilnik.epam.e_BasicsOfOOP.task2;

import java.io.IOException;
import java.util.Scanner;

public class Payment {

    private String name;
    private Product[] products;
    private int sumPayment;

    private class Product {
        private String nameProduct;
        private int productCost;

        public Product() {
            this.nameProduct = "";
            productCost = 0;
        }

        public Product(String nameProduct, int productCost) {
            this.nameProduct = nameProduct;
            this.productCost = productCost;
        }

        public String getNameProduct() {
            return nameProduct;
        }

        public void setNameProduct(String nameProduct) {
            this.nameProduct = nameProduct;
        }

        public int getProductCost() {
            return productCost;
        }

        public void setProductCost(int productCost) {
            this.productCost = productCost;
        }
    }

    public Payment(String name) {
        this.name = name;
        this.products = products;
        this.sumPayment = sumPayment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getSumPayment() {
        return sumPayment;
    }

    public void setSumPayment(int sumPayment) {
        this.sumPayment = sumPayment;
    }

    public void setPayment() throws IOException {
        this.sumPayment = 0;
        System.out.println("Enter quantity of products");
        Scanner scanner = new Scanner(System.in);
        try {

            int count = scanner.nextInt();
            products = new Product[count];

            for (int i = 0; i < count; i++) {
                System.out.println("Product " + (i + 1) + ": ");
                System.out.print("Name: ");
                String strName = scanner.next();
                System.out.print("Cost: ");
                int prodCost = scanner.nextInt();

                products[i] = new Product(strName, prodCost);
                this.sumPayment = this.sumPayment + products[i].productCost;
            }
        } catch (NumberFormatException e) {
            System.out.println("Wrong format");
        } catch (NegativeArraySizeException e) {
            System.out.println("Quantity of products must be > 0");
        } catch (NullPointerException e) {
            System.out.println();
            System.out.println("Array not created");
        }
    }

    public void printTab() throws IOException {
        try {
            if (this.products.length != 0) {
                System.out.println("=======Tab=======");
                System.out.println("" + this.name);
                System.out.println("==================");

                for (int i = 0; i < this.products.length; i++) {
                    System.out.printf("%3d", i + 1);
                    System.out.printf("%10s", this.products[i].nameProduct);
                    System.out.printf("%10d", this.products[i].productCost);
                    System.out.println();
                }
                System.out.println("==================");
                System.out.print("Total cost: ");
                System.out.printf("%11d", this.sumPayment);
                System.out.println();
            } else {
                System.out.println();
                System.out.println("Array not created");
            }

        } catch (NullPointerException e) {
            System.out.println();
            System.out.println("Array not created");
        }
    }

}
