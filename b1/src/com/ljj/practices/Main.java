package com.ljj.practices;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

/**
 * @author bce1100
 * @date 2018/9/14.
 * 1. Find all transactions in the year 2011 and sort them by value (small to high).
 * 2. What are all the unique cities where the traders work?
 * 3. Find all traders from Cambridge and sort them by name.
 * 4. Return a string of all traders’ names sorted alphabetically.
 * 5. Are any traders based in Milan?
 * 6. Print all transactions’ values from the traders living in Cambridge.
 * 7. What’s the highest value of all the transactions?
 * 8. Find the transaction with the smallest value.
 */
public class Main {

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        question1(transactions);
        question1ByLambda(transactions);
        question2(transactions);
        question2ByLambda(transactions);
        question3(transactions);
        question3ByLambda(transactions);
        question4(transactions);
        question4ByLambda(transactions);
        question5(transactions);
        question6(transactions);
        question7(transactions);
        question8(transactions);
    }

    public static void question1(List<Transaction> transactions) {
        //    1. Find all transactions in the year 2011 and sort them by value (small to high).
        System.out.println("1====");
        Collections.sort(transactions, new Comparator<Transaction>() {
            @Override
            public int compare(Transaction o1, Transaction o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        for (Transaction t1 : transactions) {
            if (t1.getYear() == 2011) {
                System.out.println(t1.getTrader().getName());
            }
        }
    }

    public static void question1ByLambda(List<Transaction> transactions) {
        //    1. Find all transactions in the year 2011 and sort them by value (small to high).
        System.out.println("====question1ByLambda====");
        Collections.sort(transactions, Comparator.comparingInt(Transaction::getValue));
        transactions.forEach((p) -> {
            if (p.getYear() == 2011) {
                System.out.println(p.getTrader().getName());
            }
        });
    }

    public static void question2(List<Transaction> transactions) {
        //2. What are all the unique cities where the traders work?
        System.out.println("2====");
        Set<String> citySet = new HashSet<>();
        for (Transaction t1 : transactions) {
            citySet.add(t1.getTrader().getCity());
        }
        for (String city : citySet) {
            System.out.println(city);
        }
    }

    public static void question2ByLambda(List<Transaction> transactions) {
        //2. What are all the unique cities where the traders work?
        System.out.println("====question2ByLambda====");
        Set<String> citySet = new HashSet<>();
        transactions.forEach((p) -> citySet.add(p.getTrader().getCity()));
        citySet.forEach(System.out::println);
    }

    public static void question3(List<Transaction> transactions) {
        //3. Find all traders from Cambridge and sort them by name.
        System.out.println("3====");
        Collections.sort(transactions, new Comparator<Transaction>() {
            @Override
            public int compare(Transaction o1, Transaction o2) {
                return o1.getTrader().getName().compareTo(o2.getTrader().getName());
            }
        });
        for (Transaction t1 : transactions) {
            if (t1.getTrader().getCity().equals("Cambridge")) {
                System.out.print(t1.getTrader().toString());
            }
        }
    }

    public static void question3ByLambda(List<Transaction> transactions) {
        //3. Find all traders from Cambridge and sort them by name.
        System.out.println("====question3ByLambda====");
        transactions.sort(Comparator.comparing(t -> t.getTrader().getName()));
        transactions.forEach((p) -> {
            if (p.getTrader().getCity().equals("Cambridge")) {
                System.out.println(p.getTrader().toString());
            }
        });
    }

    public static void question4(List<Transaction> transactions) {
        //4. Return a string of all traders’ names sorted alphabetically.
        System.out.println("4====");
        Collections.sort(transactions, new Comparator<Transaction>() {
            @Override
            public int compare(Transaction o1, Transaction o2) {
                return o1.getTrader().getName().compareTo(o2.getTrader().getName());
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Transaction t1 : transactions) {
            sb.append(t1.getTrader().getName());
        }
        System.out.println(sb.toString());
    }

    public static void question4ByLambda(List<Transaction> transactions) {
        //4. Return a string of all traders’ names sorted alphabetically.
        System.out.println("====question4ByLambda====");
        transactions.sort(Comparator.comparing(t -> t.getTrader().getName()));
        transactions.forEach((p)-> System.out.println(p.getTrader().getName()));
    }

    public static void question5(List<Transaction> transactions) {
        //5. Are any traders based in Milan?
        System.out.println("5====");
        boolean flag = false;
        for (Transaction t1 : transactions) {
            if (t1.getTrader().getCity().equals("Milan")) {
                flag = true;
            }
        }
        System.out.println(flag);
    }

    public static void question6(List<Transaction> transactions) {
        //6. Print all transactions’ values from the traders living in Cambridge.
        System.out.println("6====");
        for (Transaction t1 : transactions) {
            if (t1.getTrader().getCity().equals("Cambridge")) {
                System.out.println(t1.getValue());
            }
        }
    }

    public static void question7(List<Transaction> transactions) {
        //7. What’s the highest value of all the transactions?
        System.out.println("7====");
        int max = Integer.MIN_VALUE;
        for (Transaction t1 : transactions) {
            if (t1.getValue() > max) {
                max = t1.getValue();
            }
        }
        System.out.println(max);
    }

    public static void question8(List<Transaction> transactions) {
        //8. Find the transaction with the smallest value.
        System.out.println("8====");
        int min = Integer.MAX_VALUE;
        for (Transaction t1 : transactions) {
            if (t1.getValue() < min) {
                min = t1.getValue();
            }
        }
        System.out.println(min);
    }
}
