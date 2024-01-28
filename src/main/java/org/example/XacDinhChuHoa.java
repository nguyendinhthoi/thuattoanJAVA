package org.example;

public class XacDinhChuHoa {
    public static String check(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(str.charAt(i));
        }
        str = stringBuilder.toString().toLowerCase().trim();
        return str;
    }

    public static void main(String[] args) {
        System.out.println(check("CodegymDaNang"));
    }
}
