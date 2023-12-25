package com.telran.org.twentytwo.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Startup {

    final String PATH_TO_DIRECTORY = "C:\\Users\\ssamu\\OneDrive\\Desktop\\Tel-Ran Study\\samuliouTelranPro\\src\\main\\java\\com\\telran\\org\\twentytwo\\homework\\";

    public void start() {
        /*Storage<Character> characterStorage = new Storage<>();
        Storage<Integer> integerStorage = new Storage<>();

        getNumberOfOccurrences(PATH_TO_DIRECTORY, characterStorage, integerStorage);
        writeCharactersToFile(characterStorage);
        writeIntegersToFile(integerStorage);*/
        encodeTextAndWriteToFile();
        decodeTextAndSaveToFile();
    }

    public void getNumberOfOccurrences (String path, Storage<Character> characterStorage, Storage<Integer> integerStorage) {
        try (FileReader fileReader = new FileReader(path + "text.txt")) {
            int integerSymbol;

            while ((integerSymbol = fileReader.read()) != -1) {
                char charSymbol = (char)integerSymbol;
                if (Character.isDigit(charSymbol)) {
                    integerStorage.addElement(Character.getNumericValue(charSymbol));
                } else {
                    characterStorage.addElement(charSymbol);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading  file " + e.getMessage());;
        }
    }

    public void writeCharactersToFile(Storage<Character> characterStorage) {
        try (FileWriter fileWriter = new FileWriter(PATH_TO_DIRECTORY + "customHash.txt");) {
            Map<Character, Integer> elements = characterStorage.getElements();
            StringBuilder strb = new StringBuilder();

            for (Map.Entry<Character, Integer> element : elements.entrySet()) {
                strb.append(element.getKey()).append(element.getValue());
            }

            fileWriter.write(strb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeIntegersToFile(Storage<Integer> integerStorage) {
        try (FileWriter fileWriter = new FileWriter(PATH_TO_DIRECTORY + "customNumbers.txt");) {
            Map<Integer, Integer> elements = integerStorage.getElements();

            for (Map.Entry<Integer, Integer> element : elements.entrySet()) {
                fileWriter.write(element.getKey() + "_" + element.getValue());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Task 2 with *
    public void encodeTextAndWriteToFile() {
        try (FileReader fileReader = new FileReader(PATH_TO_DIRECTORY + "text.txt")) {
            FileWriter fileWriter = new FileWriter(PATH_TO_DIRECTORY + "encoded.txt");

            IndexedStorage<Character> indexedStorage = new IndexedStorage<>();

            int index = 0;
            int data;

            while ((data = fileReader.read()) != -1) {
                char symbol = (char) data;
                indexedStorage.addElement(symbol, index);
                index++;
            }

            for (Character key : indexedStorage.getElements().keySet()) {
                fileWriter.write(key + "- " + indexedStorage.getElements().get(key) + "\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void decodeTextAndSaveToFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH_TO_DIRECTORY + "encoded.txt"));
             FileWriter fileWriter = new FileWriter(PATH_TO_DIRECTORY + "decoded.txt")) {

            Map<Character, List<Integer>> indexMap = new HashMap<>();
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("- ");
                char symbol = parts[0].charAt(0);
                List<Integer> indexes = new ArrayList<>();
                String[] indexesArray = parts[1].substring(1, parts[1].length() - 1).split(", ");
                for (String indexStr : indexesArray) {
                    indexes.add(Integer.parseInt(indexStr));
                }
                indexMap.put(symbol, indexes);
            }

            int maxIndex = indexMap.values().stream()
                    .flatMapToInt(list -> list.stream().mapToInt(Integer::intValue))
                    .max().orElse(0);

            char[] decodedText = new char[maxIndex + 1];

            indexMap.forEach((symbol, indexes) -> {
                for (int index : indexes) {
                    decodedText[index] = symbol;
                }
            });

            fileWriter.write(decodedText);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
