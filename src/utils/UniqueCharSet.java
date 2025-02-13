package utils;
import java.util.ArrayList;

public class UniqueCharSet {
    ArrayList<Character> charList;
    int indexShift;

    public UniqueCharSet() {
        this.charList = new ArrayList<>();
    }

    public boolean isUnique(char ch) {
        for (int i = 0; i < charList.size(); i++) {
            if (charList.get(i) == ch) {
                indexShift = i;
                return false;
            }
        }
        return true;
    }

    public void addChar(char ch) {
        this.charList.add(ch);
    }

    public void newUniqueList(int number_step) {
        this.charList = new ArrayList<>(charList.subList(number_step + 1, charList.size()));
    }

    public String getString(){
        StringBuilder sb = new StringBuilder();
        for (char ch : charList) {
            sb.append(ch);
        }
        return sb.toString();

    }

    public int getSize() {
        return this.charList.size();
    }

    public int getIndexShift() {
        return indexShift;
    }
}