package P04_Encapsulation_First_and_Reserve_Team;

import ValidationData.Person;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Team team;
        team = new Team("Black  Eagles");


        for (int i = 0; i < n ; i++) {
            String [] input = scanner.nextLine().split("\\s+");
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            double salary = Double.parseDouble(input[3]);

            Person person = new Person(firstName,lastName,age,salary);

            team.addPlayer(person);

            }
        System.out.println("First team have " + team.getFirstTeam().size() + " players ");
        System.out.println("Reverse team have " + team.getFirstTeam().size() + " players ");
        }

    }



