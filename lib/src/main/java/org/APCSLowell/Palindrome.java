package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String s) {
         String Z = "";
           for (int i = 0; i < s.length(); i++)
                if (!s.substring(i, i + 1).equals(" "))
                    if(Character.isLetter(s.charAt(i)))
                    Z = Z + (s.substring(i, i + 1));
        Z = Z.toLowerCase();
        if (Z.equals(reverse(Z)))
            return true;
                return false;
    }
    public String reverse(String s) {
        String N = "";
           for (int i = s.length()-1; i >= 0; i--)
                if (!s.substring(i, i + 1).equals(" "))
                    N = N + (s.substring(i, i + 1));
        return N.toLowerCase();
    }
}
