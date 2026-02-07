package constumersystem;

import java.util.Scanner;

public class SaleSystem {

   static Scanner sc = new Scanner(System.in);
   // product atributes
    static int id;
    static String descripcion;
    static double price;
    static int quantity;
    static boolean state;

    public static void main(String[] args) {
        createProducts();
        getProducts();
        System.out.println("Ingrese el id del producto: ");
        int id = sc.nextInt();
        sc.nextLine();
        updateProducts(id);
        System.out.println("Ingrese el id del producto");
        id = sc.nextInt();
        deleteProducts(id);
    }

    //Class methods
    public static void createProducts(){

        System.out.println("Ingrese el id del producto ");
        id= sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la descripción del producto: ");
        descripcion= sc.nextLine();
        System.out.println("ingrese el precio del producto: ");
        price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese la cantidad");
        quantity = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el estado del producto");
        state = sc.nextBoolean();
    }

    public static void getProducts(){
        System.out.println("id: " + id + "\n" +
                "descripcion: " + descripcion + "\n" +
                "price: " + price + "\n" +
                "quantity: " + quantity + "\n" +
                "state: " + state + "\n");
    }

    public static void updateProducts(int findId) {
        if (findId == id) {
            System.out.println("Ingrese el id del producto ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese la descripción del producto: ");
            descripcion = sc.nextLine();
            System.out.println("ingrese el precio del producto: ");
            price = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese la cantidad");
            quantity = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el estado del producto");
            state = sc.nextBoolean();
        } else {
            System.out.println("Producto no encontrado");
        }
    }

    public static void deleteProducts(int deleteId){
        if (deleteId == id) {
            id = 0;
            descripcion = "";
            price = 0;
            quantity= 0;
            state = false;
        }else {
            System.out.println("Producto no encontrado");
        }
    }
}
