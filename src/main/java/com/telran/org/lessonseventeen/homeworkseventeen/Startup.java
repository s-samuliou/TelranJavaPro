package com.telran.org.lessonseventeen.homeworkseventeen;

import com.telran.org.lessonseventeen.homeworkseventeen.taskfour.Auto;
import com.telran.org.lessonseventeen.homeworkseventeen.taskfour.Brand;
import com.telran.org.lessonseventeen.homeworkseventeen.taskfour.Colour;
import com.telran.org.lessonseventeen.homeworkseventeen.taskthree.Client;
import com.telran.org.lessonseventeen.homeworkseventeen.taskthree.Phone;
import com.telran.org.lessonseventeen.homeworkseventeen.taskthree.PhoneType;

import java.util.*;
import java.util.stream.Stream;

public class Startup {

    public void start()
    {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
    }

    public void taskOne() {
        List<String> surnames = Arrays.asList("Kovalenko", "Ivanov", "Kozlov", "Kuznetsov", "Smith", "Kim");

        System.out.println("Last names starting with a letter 'K': ");
        surnames.stream()
                .filter(string -> string.toLowerCase().startsWith("k"))
                .forEach(System.out::println);
    }

    public void taskTwo() {
        String[] fruits = {"apple", "banana", "orange", "grape", "pear"};

        System.out.println("\nSorted fruits in lexicographic order: ");
        Stream.of(fruits)
                .sorted()
                .forEach(System.out::println);
    }

    public void taskThree() {
        List<Client> clients = new ArrayList<>();

        Client client1 = new Client(1, 25, "John");
        client1.addPhone(new Phone("123456789", PhoneType.LANDLINE));
        clients.add(client1);

        Client client2 = new Client(2, 35, "Alice");
        client2.addPhone(new Phone("987654321", PhoneType.MOBILE));
        clients.add(client2);

        Client client3 = new Client(3, 40, "Bob");
        client3.addPhone(new Phone("567890123", PhoneType.LANDLINE));
        clients.add(client3);

        Optional<Client> oldestClient = clients.stream()
                .filter(client -> client.getPhones().stream()
                        .anyMatch(phone -> phone.getPhoneType() == PhoneType.LANDLINE))
                .max(Comparator.comparingInt(Client::getAge));

        System.out.print("\nThe most oldest Client with Landline phone: ");
        oldestClient.ifPresent(System.out::println);
    }

    public void taskFour() {
        List<Auto> cars = Arrays.asList(
                new Auto("ABC123", Colour.BLUE, Brand.AUDI, 0, 30000),
                new Auto("DEF456", Colour.WHITE, Brand.BMW, 0, 35000),
                new Auto("GHI789", Colour.GREEN, Brand.PORSCHE, 50, 45000),
                new Auto("JKL012", Colour.BLACK, Brand.LADA, 0, 20000),
                new Auto("MNO345", Colour.BLUE, Brand.AUDI, 200, 50000),
                new Auto("PQR678", Colour.WHITE, Brand.BMW, 0, 40000),
                new Auto("STU901", Colour.GREEN, Brand.PORSCHE, 0, 48000),
                new Auto("VWX234", Colour.BLACK, Brand.LADA, 150, 30000),
                new Auto("YZA567", Colour.BLUE, Brand.AUDI, 0, 42000),
                new Auto("BCD890", Colour.BLACK, Brand.BMW, 0, 45000)
        );

        List<Auto> blackCarsNoneMileage = cars.stream()
                .filter(colour -> Colour.BLACK.equals(colour.getColour()))
                .filter(mileage -> mileage.getMileage() == 0)
                .toList();
        System.out.println("Cars with black color and zero mileage: " + blackCarsNoneMileage);

        long uniqueBrandsCount = cars.stream()
                .filter(car -> car.getPrice() > 10000 && car.getPrice() < 50000)
                .map(Auto::getBrand)
                .distinct()
                .count();
        System.out.println("Number of unique brands in the price range from 10 to 50 thousand: " + uniqueBrandsCount);
    }
}

