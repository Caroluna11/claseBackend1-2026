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
    //Costumer attributes
    static int idCostumer;
    static String name;
    static String lastName;
    static String address;
    static int phone;
    static String email;


    public static void main(String[] args) {

        menu();




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
            System.out.println("Producto" + id + " encontrado");
        }
    }

    //Costumer methods
    public static void createCostumer(){
        System.out.println("Por favor ingresa tu numero de cedula: ");
        idCostumer = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre del cliente:  ");
        name= sc.nextLine();
        System.out.println("ingrese el apellido del cliente: ");
        lastName = sc.nextLine();
        System.out.println("Ingrese la dirección del cliente: ");
        address = sc.nextLine();
        System.out.println("Ingrese el telefono del cliente: ");
        phone = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el correo del cliente: ");
        email= sc.nextLine();
    }

    //get costumer
    public static void getCostumer(){
        System.out.println("id: " + idCostumer + "\n" +
                "Nombre: " + name + "\n" +
                "Apellido: " + lastName + "\n" +
                "Dirección: " + address + "\n" +
                "Telefono: " + phone + "\n"+
                "Correo: " + email + "\n");
    }

    //Update costumers
    public static void updateCostumer(int findId) {
        if (findId == idCostumer) {
            System.out.println("Ingrese el id del cliente ");
            idCostumer= sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre del cliente: ");
            name = sc.nextLine();
            System.out.println("ingrese el apellido del cliente: ");
            lastName= sc.nextLine();
            System.out.println("Ingrese la dirección del cliente: ");
            address = sc.nextLine();
            System.out.println("Ingrese el telefono del cliente: ");
            phone = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el email del cliente: ");
            email= sc.nextLine();
        } else {
            System.out.println("Cliente no encontrado");
        }
    }

    //delete costumers
    public static void deleteCostumer(int idDeleteCostu){
        if (idDeleteCostu == idCostumer) {
            idCostumer = 0;
            name = "";
            lastName = "";
            address= "";
            phone= 0;
            email= "";

        }else {
            System.out.println("Cliente" + id + "no encontrado");
        }
    }
    public static void menu(){
        int respuesta=0;
        int respuestaSubmenu =0;
        while (true) {
            System.out.println(""" 
                    Por favor ingresa la opcion que deseas: 
                    1. Productos
                    2. Clientes
                    3. Ventas
                    4. Salir """);
           respuesta= sc.nextInt();
           sc.nextLine();
           switch (respuesta){
               case 1 ->{
                   bucleExternal:
                   while (true){
                       System.out.println("""
                               Selecciona lo que deseas hacer:
                               1. Crea un nuevo producto.
                               2. Ver los productos
                               3. Actualizar un producto
                               4. Eliminar un producto
                               5. Salir""");
                       respuestaSubmenu= sc.nextInt();
                       switch (respuestaSubmenu){
                           case 1 ->{
                               createProducts();
                           }
                           case 2 ->{
                               getProducts();
                           }
                           case 3 ->{
                               System.out.println("Ingrese el id del producto para actualizar: ");
                               int id = sc.nextInt();
                               sc.nextLine();
                               updateProducts(id);
                           }
                           case 4 ->{
                               System.out.println("Ingrese el id del producto a eliminar");
                               int id = sc.nextInt();
                               sc.nextLine();
                               deleteProducts(id);
                           }
                           case 5 ->{
                               break bucleExternal;
                           }
                       }

                   }

               }
               case 2->{
                   bucleExternal:
                   while (true){
                       System.out.println("""
                               Selecciona lo que deseas hacer:
                               1. Crear un nuevo cliente.
                               2. Ver los clientes.
                               3. Actualizar un cliente.
                               4. Eliminar un cliente.
                               5. Salir""");
                       respuestaSubmenu= sc.nextInt();
                       switch (respuestaSubmenu){
                           case 1 ->{
                               createCostumer();
                           }
                           case 2 ->{
                               getCostumer();
                           }
                           case 3 -> {
                               System.out.println("Por favor ingrese el id del cliente a actualizar");
                               int id = sc.nextInt();
                               sc.nextLine();
                               updateCostumer(id);
                           }
                           case 4 ->{
                               System.out.println("Por favor ingrese el id del cliente a eliminar");
                               int id= sc.nextInt();
                               sc.nextLine();
                               deleteCostumer(id);
                           }
                           case 5 ->{
                               break bucleExternal;
                           }
                       }

                   }

               }
               case 3 -> {}
               case 4 -> {
                   System.exit(0);

               }

           }


        }
    }
}
