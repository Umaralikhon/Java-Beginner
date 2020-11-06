package Platform;

import static Platform.Main.scan;

public class Letter {
    private char[] txt;
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public void arrCreator() {
        txt = new char[str.length()];
        txt = str.toCharArray();
    }

    public void print() {
        for (int i = 0; i < str.length(); i++) {

            switch (txt[i]) {
                case 'a' -> txt[i] = 'а';
                case 'c' -> txt[i] = 'с';
                case 'e' -> txt[i] = 'е';
                case 'o' -> txt[i] = 'о';
                case 'p' -> txt[i] = 'р';
                case 'x' -> txt[i] = 'х';
                case 'E' -> txt[i] = 'Е';
                case 'T' -> txt[i] = 'Т';
                case 'O' -> txt[i] = 'О';
                case 'P' -> txt[i] = 'Р';
                case 'A' -> txt[i] = 'А';
                case 'H' -> txt[i] = 'Н';
                case 'K' -> txt[i] = 'К';
                case 'X' -> txt[i] = 'Х';
                case 'C' -> txt[i] = 'С';
                case 'M' -> txt[i] = 'М';

            }

            System.out.print(txt[i]);
        }
    }
}
