package P3_Encapsulation_Shopping_Spree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

//        Map<String, Person> people = new LinkedHashMap<>();
//        Map<String,Product> products = new LinkedHashMap<>();
//
//        String [] peopleInput = scanner.nextLine().split(";");
//        for (String peopleParts: peopleInput) {
//            String [] peopleData = peopleParts.split("=");
//            String name = peopleData[0];
//            double money = Double.parseDouble(peopleData[1]);
//
//            try {
//                Person person = new Person(name,money);
//                people.put(name,person);
//
//            }catch (IllegalArgumentException e){
//                System.out.println(e.getMessage());
//            }
//
//
//
//        }
//
//        String [] productInput = scanner.nextLine().split(";");
//        for (String productsParts:productInput) {
//            String [] productsData = productsParts.split("=");
//            String name = productsData[0];
//            double cost = Double.parseDouble(productsData[1]);
//
//            try {
//                Product product = new Product(name,cost);
//                products.put(name,product);
//            }catch (IllegalArgumentException e){
//                System.out.println(e.getMessage());
//                return;
//            }
//
//        }
//      String command = scanner.nextLine();
//        while (!command.equals("END")){
//
//            String [] commandParts = scanner.nextLine().split("\\s+");
//            String peopleName = commandParts[0];
//            String productName = commandParts[1];
//
//            Person buyer = people.get(peopleName);
//            Product toBuy = products.get(productName);
//
//            try {
//                buyer.buyProduct(toBuy);
//                System.out.printf("%s bought %s%n",peopleName,productName);
//            }catch (IllegalArgumentException e){
//                System.out.println(e.getMessage());
//            }
//
//
//            command= scanner.nextLine();
//        }
    }
}
