package com.telran.org.lessonfive.homeworkfive;

import java.util.Arrays;
import java.util.Scanner;

public class SeaBattle {

    //Массив кораблей для инициализации, элементы по такому типу {количество_палуб, количество_кораблей}
    private static final int[][] SHIP_DECK_AMOUNT = {{4, 1}, {3, 2}, {2, 3}, {1, 4}};
    //Переменная отвечающая за размер поля
    private static final int FIELD_LENGTH = 10;
    //Сканер для ввода
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.println("First player, please, input your name");
        String playerOne = scanner.nextLine();
        System.out.println("Hi, " + playerOne + "!");

        System.out.println("Second player, please, input your name");
        String playerTwo = scanner.nextLine();
        System.out.println("Hi, " + playerTwo + "!");
        //Объявляем поле для первого и второго игрока
        char[][] playerOneField = new char[FIELD_LENGTH][FIELD_LENGTH];
        char[][] playerTwoField = new char[FIELD_LENGTH][FIELD_LENGTH];

        fieldByDefault(playerOneField);
        fieldByDefault(playerTwoField);

        //В данном методе, нужно расставить корабли для первого и второго участника
        fillFiled(playerOneField);
        fillFiled(playerTwoField);


        startGame(playerOneField, playerTwoField, playerOne, playerTwo);
    }

    private static void startGame(char[][] playerFieldOne, char[][] playerFieldTwo, String playerOne, String playerTwo) {
        // Добавим еще два поля, на которых будем отмечать выстрелы
        char[][] playerBattleFieldOne = new char[FIELD_LENGTH][FIELD_LENGTH];
        char[][] playerBattleFieldTwo = new char[FIELD_LENGTH][FIELD_LENGTH];

        //Определяем текущего игрока, они будут ходить по очереди
        String currentPlayer = playerOne;
        char[][] currentPlayerField = playerFieldTwo;
        char[][] currentPlayerEnemyField = playerBattleFieldOne;

        //Игра будет идти, пока один из игроков не потеряет все корабли
        while (isPlayerAlive(playerFieldOne) && isPlayerAlive(playerFieldTwo)) {
            // Печатает поле текущего игрока, куда он уже стрелял
            printField(currentPlayerEnemyField);
            // Запрашиваем координаты нового выстрела
            System.out.println(currentPlayer + ", please, input x coordinate of shot");
            int xShot = scanner.nextInt();
            System.out.println(currentPlayer + ", please, input y coordinate of shot");
            int yShot = scanner.nextInt();

            // Обрабатываем выстрел
            int shotResult = verificationShot(currentPlayerEnemyField, currentPlayerField, xShot, yShot);

            //Если выстрел был не удачный, то присваиваем в переменные текущего игрока, другого игрока
            //и его поле выстрелов и поле противника
            if (shotResult == 0) {
                currentPlayer = playerTwo;
                currentPlayerField = playerFieldOne;
                currentPlayerEnemyField = playerBattleFieldTwo;
                System.out.println("You're a loser, the move goes to " + currentPlayer);
            }
        }

        System.out.println(currentPlayer + " is winner!");
    }

    /**
     * Метод проверяющий, что по переданным координатам есть корабль и выстрел успешный
     * возвращает 1, если успешный, 0 если промах
     * отмечает выстрелы на поле противника field и на своем поле выстрелов battleField
     */
    private static int verificationShot(char[][] battleField, char[][] field, int x, int y) {
        if (battleField[y][x] == 'X' || battleField[y][x] == '*') {
            System.out.println("You are already shot at this coordinate.");
            return -1;
        }

        if (field[y][x] == '=') {
            System.out.println("Hit!");
            field[y][x] = 'X';
            battleField[y][x] = 'X';
            return 1;
        } else {
            System.out.println("Miss!");
            field[y][x] = '*';
            battleField[y][x] = '*';
            return 0;
        }
    }

    /**
     * Метод проверяющий, что у игрока есть хоть одна целая палуба на поле
     */
    private static boolean isPlayerAlive(char[][] field) {
        for (char[] chars : field) {
            for (char aChar : chars) {
                if (aChar == '=') {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Заполняет поле символом '.'
     */
    private static void fieldByDefault(char[][] field) {
        for (char[] chars : field) {
            Arrays.fill(chars, '.');
        }
    }

    /**
     * Рисует поле в консоли в виде матрицы
     */
    private static void printField(char[][] field) {
        for (char[] ints : field) {
            for (char anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    /**
     * Метод запрашивает и расставляет корабли на поле
     */
    private static void fillFiled(char[][] field) {
        //Идем по массиву кораблей
        for (int i = 0; i < SHIP_DECK_AMOUNT.length; i++) {
            //Определяем количество кораблей с определенной палубой
            int shipCount = SHIP_DECK_AMOUNT[i][1];
            //Начинаем расставлять корабли с определенной палубой
            for (int j = 0; j < shipCount; j++) {
                System.out.println("Put " + SHIP_DECK_AMOUNT[i][0] + " deck ship. Left: " + (shipCount - j));

                int result = 1;
                int x = 0;
                int y = 0;
                int direction = 0;
                //Запрашиваем x, y координату на поле с которой будет начинаться наш
                //корабль и направление, куда он будет продолжен по горизонтали или вертикали
                //после этого в этом цикле будет проверено, что расставленный корабль не пересекся
                //с другими и не коснулся никого соседними клетками и если все ок,
                //то можно заполнить поле игрока этим кораблем и вывести в консоль то,
                //как выглядит поле после расстановки корабля. Так будет повторяться для всех кораблей.
                while (result != 0) {
                    System.out.println("Input start x coordinate: ");
                    x = scanner.nextInt();

                    System.out.println("Input start y coordinate: ");
                    y = scanner.nextInt();

                    System.out.println("Input direction of ship: ");
                    System.out.println("1 - horizontal; 2 - vertical;");
                    direction = scanner.nextInt();
                    //Проверяет что корабль располагается корректно и если это так,
                    //то возвращает 0 и выходим из этого цикла, что бы отрисовать корабль на поле
                    result = validateCoordinateForShip(field, x, y, direction, i);
                }

                int shipDeck = SHIP_DECK_AMOUNT[i][0];
                //Рисуем корабль по горизонтали
                if (direction == 1) {
                    for (int k = 0; k < shipDeck; k++) {
                        field[y][x + k] = '=';
                    }
                }
                //Рисуем корабль по вертикали
                if (direction == 2) {
                    for (int k = 0; k < shipDeck; k++) {
                        field[y + k][x] = '=';
                    }
                }
                //выводит поле после размещения корабля
                printField(field);
            }
        }
    }

    /**
     * Метод проверяет, что корабль корректно поместится по указанным координатам и не будет
     * соседствовать, в нарушении правил, с другими кораблями
     * если корректно - вернет 0, иначе -1
     */
    private static int validateCoordinateForShip(char[][] field, int x, int y, int direction, int shipDeck) {
        // horizontally
        if (direction == 1) {
            for (int i = 0; i < shipDeck - 1; i++) {
                if (x > 0) {
                    if ('=' == field[y][x + i - 1]) {
                        return -1;
                    }
                }
                if (y > 0) {
                    if ('=' == field[y - 1][x + i]) {
                        return -1;
                    }
                }
                if ('=' == field[y][x + i] || '=' == field[y][x + i + 1] || '=' == field[y + 1][x + i] || (x + i) > 9) {
                    return -1;
                }
            }
        } else if (direction == 2) { // vertically
            for (int i = 0; i < shipDeck - 1; i++) {
                if (y > 0) {
                    if ('=' == field[y + i - 1][x]) {
                        return -1;
                    }
                }
                if (x > 0) {
                    if ('=' == field[y + i][x - 1]) {
                        return -1;
                    }
                }
                if ('=' == field[y + i][x] || '=' == field[y + i + 1][x] || '=' == field[y + i][x + 1] || (y + i) > 9) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
