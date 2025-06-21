package LocalRepo.EXTRAS_built_in_Strings;

public class RemoveCharacter {
    public static void main(String[] args) {
        String input = "Hello World";
        char toRemove = 'l';
        String result = input.replace(String.valueOf(toRemove), "");
        System.out.println("Modified String: " + result);
    }
}

