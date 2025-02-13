package Task1;

import utils.UniqueCharSet;

public class SearchUniqueSubstring {
    private String string;
    private String subString = "";
    private final UniqueCharSet charArr = new UniqueCharSet();

    public void setString(String str) {
        setString(str, false);
    }

    public void setString(String str, boolean checkSpace) {
        this.string = str;
        searchUniqueSubstring(checkSpace);
    }

    public void searchUniqueSubstring(boolean checkSpace) {
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);

            if (checkSpace || currentChar != ' ') {
                if (charArr.isUnique(currentChar)) {
                    charArr.addChar(currentChar);
                } else {
                    handleDuplicateCharacter();
                    i -= charArr.getIndexShift() + 1;
                }
            }
        }
        updateLongestSubstring();
    }

    private void handleDuplicateCharacter(){
        updateLongestSubstring();
        charArr.newUniqueList(charArr.getIndexShift());
    }

    private void updateLongestSubstring() {
        if (subString.length() < charArr.getSize()) {
            subString = charArr.getString();
        }
    }

    public String subString() {
        return subString;
    }

    public static void main(String[] args) {
        SearchUniqueSubstring s = new SearchUniqueSubstring();
        s.setString("abcadsfasfdbgbwfxcvzdqwertyuiopgqqrwgvwtfvaesc");
        System.out.println(s.subString());

        SearchUniqueSubstring ss = new SearchUniqueSubstring();
        ss.setString("The five boxing wizards jump quickly", true);
        System.out.println(ss.subString());
    }
}