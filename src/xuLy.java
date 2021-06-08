import java.util.Scanner;

public class xuLy {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 12; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("Draw the square triangle");
                    int choiceAngles = -1;
                    while (choiceAngles != 0) {
                        System.out.println("1. top-left");
                        System.out.println("2. top-right");
                        System.out.println("3. bottom-left");
                        System.out.println("4. bottom-right");
                        System.out.println("0. Exit");
                        choiceAngles = input.nextInt();
                        switch (choiceAngles) {
                            case 1:
                                for (int i = 6; i >= 1; i--) {
                                    for (int j = 1; j <= i; j++) {
                                        System.out.print("*");
                                    }
                                    System.out.print("\n");
                                }
                                break;
                            case 2:
                                for (int i = 1; i <= 5; i++) {
                                    for (int j = 1; j <= 5; j++) {
                                        if (((i == 1 && j >= 1)
                                                || (i == 2 && j >= 2)
                                                || (i == 3 && j >= 3)
                                                || (i == 4 && j >= 4)
                                                || (i == 5 && j == 5))) {
                                            System.out.print("*");
                                        } else {
                                            System.out.print(" ");
                                        }
                                    }
                                    System.out.print("\n");
                                }
                                break;
                            case 3:
                                for (int i = 1; i <= 6; i++) {
                                    for (int j = 1; j < i; j++) {
                                        System.out.print("*");
                                    }
                                    System.out.print("\n");
                                }
                                break;
                            case 4:
                                for (int i = 1; i <= 5; i++) {
                                    for (int j = 1; j <= 5; j++) {
                                        if (((i == 1 && j == 5)
                                                || (i == 2 && j >= 4)
                                                || (i == 3 && j >= 3)
                                                || (i == 4 && j >= 2)
                                                || (i == 5 && j >= 1))) {
                                            System.out.print("*");
                                        } else {
                                            System.out.print(" ");
                                        }
                                    }
                                    System.out.print("\n");
                                }
                                break;

                            default:
                                System.out.println("No choice!");
                        }
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 4; i++) {
                        for (int j = 1; j <= 7; j++) {
                            if (((i == 1 && j == 4)
                                    || (i == 2 && j >= 3 && j <= 5)
                                    || (i == 3 && j >= 2 && j <= 6)
                                    || (i == 4 && j >= 1 && j <= 7))) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.print("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
