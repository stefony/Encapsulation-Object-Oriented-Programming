package P01_Encapsulation_Sort_by_name_age;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

         Scanner scanner = new Scanner(System.in);


        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 1; i <=numberOfPeople; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String firstName = input [0];
            String lastName= input [1];
            int age = Integer.parseInt(input[2]);

            people.add(new Person(firstName, lastName, age));
        }

        Collections.sort(people, (firstPerson, secondPerson) -> {

            int comparisonResult = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());

            if (comparisonResult != 0) {
                return comparisonResult;
            } else {
                return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
            }
        });

        for (Person person : people) {
            System.out.println(person.toString());
        }

    }
}