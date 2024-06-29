import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>(hashSet());
        String duplicateName = "Biagio";

        names.remove(duplicateName);

        names.forEach(System.out::println);

        names.clear();

        if(names.isEmpty()){
            System.out.println(names);
        }
    }

    public static HashSet<String> hashSet(){
        HashSet<String> names = new HashSet<>();
        names.add("Veronica");
        names.add("Pierluigi");
        names.add("Biagio");
        names.add("Cavolo");

        return names;
    }
}