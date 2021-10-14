import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class JavaStreamsExamples4 {
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

        /*list.stream()
                .map((String s) -> {
                    return s.toLowerCase(Locale.ROOT);
                })
                .map((String s) -> {
                    return s.toUpperCase(Locale.ROOT);
                })
                .forEach((String s) -> {
                    System.out.println(s);
                });*/
        /*list.stream()
                .map((String element) -> element.toLowerCase(Locale.ROOT))
                .map((String elment) -> elment.toUpperCase(Locale.ROOT))
                .forEach((String element) -> System.out.println(element));*/
        list.stream()
                .map(element -> element.toLowerCase(Locale.ROOT))
                .map(element -> element.toUpperCase(Locale.ROOT))
                .forEach(element -> System.out.println(element));
    }
}
