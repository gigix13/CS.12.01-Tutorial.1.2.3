import java.util.List;
public class Scramble{
public static String scrambleWord(String s) {
    String sW = "";
    s.toUpperCase();

    for(int i = 0 ; i < s.length() -1; i++) {
        if(s.charAt(i)=='A'&& s.charAt(i+1)!='A') {
            sW+=s.charAt(i+1);
            sW+='A';
            i++;
        }
        else if (i == s.length() - 2) {
            sW += s.charAt(i);
            sW += s.charAt(i+1);
        }
        else {
            sW += s.charAt(i);
        }
    }
    return sW;
}
public static void scrambleOrRemove(List<String> wL)
{
    for(int i = 0 ; i < wL.size() ; i ++) {
        String s = scrambleWord(wL.get(i));
        if(s.equals(wL.get(i))) {
            wL.remove(i);
            i--;
        }
        else {
            wL.set(i,s);
        }
    }
}}
