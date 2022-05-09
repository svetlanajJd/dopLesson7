import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        System.out.println("Задание 5.строки");
        String fullName = "Ivanov Ivan Ivanovich";
        int index1 = fullName.indexOf(' ');
        int index2 = fullName.lastIndexOf(' ');

        String lastName = fullName.substring(0, index1);
        String firstName = fullName.substring(index1 + 1, index2);
        String middleName = fullName.substring(index2 + 1, fullName.length());

        System.out.println("Имя сотрудника-" + firstName);
        System.out.println("Фамилия сотрудника-" + lastName);
        System.out.println("Отчество сотрудника-" + middleName);

        System.out.println("Задание 6.строки");
        fullName = "ivanov ivan ivanovich";
        char[] separation = fullName.toCharArray();
        for (int i = 0; i < separation.length - 1; i++) {
            if (separation[i] == ' ') {
                separation[i + 1] = Character.toUpperCase(separation[i + 1]);
            }
        }
        separation[0] = Character.toUpperCase(separation[0]);
        String correctFullName = new String(separation);
        System.out.println("Верное написание ФИО сотрудника с заглавных букв-" + correctFullName);

        System.out.println("Задание 7.строки");
        String first = "135";
        String next = "246";
        char[] firstArray = first.toCharArray();
        StringBuilder concatString = new StringBuilder(first);
        concatString.insert(1, next.charAt(0));
        concatString.delete(2, 4);
        concatString.insert(2, first.charAt(1));
        concatString.insert(3, next.charAt(1));
        concatString.insert(4, first.charAt(2));
        concatString.insert(5, next.charAt(2));
        System.out.println(concatString);

        System.out.println("Задание 8.строки");
        String doubleLetters="aabccddefgghiijjkk";
        char[] stringToArray = doubleLetters.toCharArray();
        for (int i=0;i< stringToArray.length;i++){
            for (int j=i+1;j< stringToArray.length;j++){
                if (stringToArray[i]==stringToArray[j]) {
                    System.out.print(stringToArray[i]);
                }
            }
        }
    }
}