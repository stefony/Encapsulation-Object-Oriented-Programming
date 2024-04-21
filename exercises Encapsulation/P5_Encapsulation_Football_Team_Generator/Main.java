package P5_Encapsulation_Football_Team_Generator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Team> teams = new HashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("END")){

            String[] tokens = input.split(";");
            String command = tokens[0];
            String teamName = tokens[1];

            switch (command){
                case "Team":
                    try {
                        Team team = new Team(teamName);
                        teams.putIfAbsent(teamName, team);
                    }catch (IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;

                case "Add":
                    String playerName = tokens[2];
                    int endurance = Integer.parseInt(tokens[3]);
                    int sprint = Integer.parseInt(tokens[4]);
                    int dribble = Integer.parseInt(tokens[5]);
                    int passing = Integer.parseInt(tokens[6]);
                    int shooting = Integer.parseInt(tokens[7]);

                    try {
                        if (!teams.containsKey(teamName)){
                            System.out.println("Team " + teamName + " does not exist.");
                            break;
                        }
                        Player player = new Player(playerName, endurance, sprint, dribble , passing, shooting);
                        teams.get(teamName).addPlayer(player);
                    }catch (IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;

                case "Remove":
                    String playerToRemoveByName = tokens[2];
                    try {
                        if (!teams.containsKey(teamName)){
                            System.out.println("Team " + teamName + " does not exist.");
                            break;
                        }
                        teams.get(teamName).removePlayer(playerToRemoveByName);
                    }catch (IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;

                case "Rating":
                    if (!teams.containsKey(teamName)){
                        System.out.println("Team " + teamName + " does not exist.");
                        break;
                    }
                    double rating = teams.get(teamName).getRating();
                    System.out.println(teamName + " - " + Math.round(rating));
                    break;
                default:
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
