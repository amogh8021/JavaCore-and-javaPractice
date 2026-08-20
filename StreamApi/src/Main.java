import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        List<Integer> numbers =
//                List.of(10, 15, 20, 25, 30, 35, 40);
//
//      List<Integer> evenNumbers =   numbers.stream()
//                .filter((num)->num%2==0)
//                .collect(Collectors.toList());
//
//        System.out.println(evenNumbers);

//        List<String> names =
//                List.of("Amogh", "Rahul", "Aman", "Rohit", "Abhishek");
//
//       List<String> finalNames =  names.stream()
//                .filter((name)->name.length()>5)
//                .map((name)->name.toUpperCase())
//                .collect(Collectors.toList());
//
//        System.out.println(finalNames);

        //find the sum of all number greater than  15
//
//        List<Integer> numbers =
//                List.of(10, 20, 5, 30, 15, 40);
//
//       int total  =  numbers.stream()
//                .filter((sum)->sum>15)
//                .mapToInt(Integer::intValue)
//                .sum();
//
//        System.out.println(total);

        List<Integer> numbers =
                List.of(10, 20, 30, 40, 50);

        //find the first number that is greater than 25

//       OptionalInt number =  numbers.stream()
//                .filter((num)->num>25)
//               .mapToInt(Integer::intValue)
//                .findFirst();
//
//        System.out.println(number);


//        List<Integer> num =
//                List.of(5, 10, 15, 20, 25, 30, 35);
//
//        //find the second largest no
//
//        int ans =  num.stream()
//                .sorted(Comparator.reverseOrder())
//                .skip(1)
//                .findFirst()
//                        .orElse(null);
//
//
//        System.out.println(ans);


//        List<String> names =
//                List.of("Amogh", "Aman", "Rahul", "Rohit", "Abhishek");
//
//        //find the name with maximum letter
//        String maxLengthName =   names.stream()
//                      .max(Comparator.comparingInt((str)->str.length()))
//                              .orElse(null);
//
//        System.out.println(maxLengthName);


        List<String> names =
                List.of("Amogh", "Aman", "Rahul", "Rohit", "Amit");

//        Write a Stream solution that groups the names by their first character.

       Map<Character,List<String>> ans = names.stream()
                .collect(Collectors.groupingBy((str)->str.charAt(0)));
        System.out.println(ans);
    }
}