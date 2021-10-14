import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class JavaStreamsExamples2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list .add("Element 1");
        list .add("Element 2");
        list .add("Element 3");
        list .add("Element 4");

        /*Stream<String> stream = list.stream();

        *//*stream.forEach((String element) -> {
            System.out.println(element);
        });*//*

        Stream<String> lowerCaseStream = stream.map((String e) -> {
            return e.toLowerCase(Locale.ROOT);
        });

        *//*lowerCaseStream.forEach((String e) -> {
            System.out.println(e);
        });*//*

        Stream<String> upperCaseStream = lowerCaseStream.map((String e) -> {
            return e.toUpperCase(Locale.ROOT);
        }) ;

        upperCaseStream.forEach((String e) -> {
            System.out.println(e);
        });*/

        list.stream()
                .map((String s) -> {
                    return s.toLowerCase(Locale.ROOT);
                })
                .map((String s) -> {
                    return s.toUpperCase(Locale.ROOT);
                })
                .forEach((String s) -> {
                    System.out.println(s);
                });
    }
}
