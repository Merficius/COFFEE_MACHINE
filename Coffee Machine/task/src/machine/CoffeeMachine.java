package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Machine coffeeMachine = new Machine(400, 540, 120, 9, 550);
        String message;

        System.out.println("Write action (buy, fill, take, remaining, exit):");
        message = scanner.nextLine();
        coffeeMachine.perform(message);

        while (coffeeMachine.isRunning()) {
            coffeeMachine.state.printMessage();
            message = scanner.nextLine();
            coffeeMachine.perform(message);
        }
    }
}

class Machine {
    int water;
    int milk;
    int coffeeBeans;
    int disposableCups;
    int money;
    boolean running;

    State state;

    public Machine(int water, int milk, int coffeeBeans, int disposableCups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.disposableCups = disposableCups;
        this.money = money;
        running = true;
        state = State.ACTION;
    }

    public boolean isRunning() {
        return running;
    }

    public void setState(State state) {
        this.state = state;
    }

    void perform(String message) {
        switch (state) {
            case ACTION:
                switch (message) {
                    case "buy":
                        state = State.BUY;
                        break;
                    case "fill":
                        state = State.FILL_WATER;
                        break;
                    case "take":
                        System.out.println("\nI gave you $" + money);
                        money = 0;
                        break;
                    case "remaining":
                        printAmounts(water, milk, coffeeBeans, disposableCups, money);
                        break;
                    case "exit":
                        running = false;
                        break;
                }
                break;
            case BUY:
                switch (message) {
                    case "1":
                        buyCoffee(250, 0, 16, 1, 4);
                        state = State.ACTION;
                        break;
                    case "2":
                        buyCoffee(350, 75, 20, 1, 7);
                        state = State.ACTION;
                        break;
                    case "3":
                        buyCoffee(200, 100, 12, 1, 6);
                        state = State.ACTION;
                        break;
                    case "back":
                        state = State.ACTION;
                        break;
                }
                break;
            case FILL_WATER:
                try {
                    water += Integer.parseInt(message);
                    state = State.FILL_MILK;
                    break;
                } catch (Exception e) {
                    break;
                }
            case FILL_MILK:
                try {
                    milk += Integer.parseInt(message);
                    state = State.FILL_COFFEE_BEANS;
                    break;
                } catch (Exception e) {
                    break;
                }
            case FILL_COFFEE_BEANS:
                try {
                    coffeeBeans += Integer.parseInt(message);
                    state = State.FILL_DISPOSABLE_CUPS;
                    break;
                } catch (Exception e) {
                    break;
                }
            case FILL_DISPOSABLE_CUPS:
                try {
                    disposableCups += Integer.parseInt(message);
                    state = State.ACTION;
                    break;
                } catch (Exception e) {
                    break;
                }
        }

    }


    void buyCoffee(int water, int milk, int coffeeBeans, int disposableCups, int money) {
        boolean waterAvailable = this.water - water >= 0;
        boolean milkAvailable = this.milk - milk >= 0;
        boolean coffeeBeansAvailable = this.coffeeBeans - coffeeBeans >= 0;
        boolean disposableCupsAvailable = this.disposableCups - disposableCups >= 0;
        if (waterAvailable && milkAvailable && coffeeBeansAvailable && disposableCupsAvailable) {
            System.out.println("I have enough resources, making you a coffee!");
            this.water -= water;
            this.milk -= milk;
            this.coffeeBeans -= coffeeBeans;
            this.disposableCups -= disposableCups;
            this.money += money;
        } else {
            if (!waterAvailable) {
                System.out.println("Sorry, not enough water!");
            }
            if (!milkAvailable) {
                System.out.println("Sorry, not enough milk!");
            }
            if (!coffeeBeansAvailable) {
                System.out.println("Sorry, not enough coffee beans!");
            }
            if (!disposableCupsAvailable) {
                System.out.println("Sorry, not enough disposable cups!");
            }
        }
    }

    void printAmounts(int water, int milk, int coffeeBeans, int disposableCups, int money) {
        System.out.println("\nThe coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println(money + " of money");
    }
}

enum State {
    ACTION("\nWrite action (buy, fill, take, remaining, exit):"),
    BUY("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:"),
    FILL_WATER("\nWrite how many ml of water do you want to add: "),
    FILL_MILK("Write how many ml of milk do you want to add:"),
    FILL_COFFEE_BEANS("Write how many grams of coffee beans do you want to add:"),
    FILL_DISPOSABLE_CUPS("Write how many disposable cups of coffee do you want to add:");

    private String message;

    State(String message) {
        this.message = message;
    }

    void printMessage() {
        System.out.println(message);
    }
}