import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by admin on 10.02.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        try (Scanner s = new Scanner(new File("src\\main\\java\\stylesheet.css"), "UTF-8")) {
            String word="";
            while (s.hasNext()) {
               word = word+s.next().toLowerCase()+" ";
            }
            //System.out.print(word);
            Pattern p = Pattern.compile("(-?\\d?\\d?\\d?\\d?)px");
            Matcher m = p.matcher(word);
            while (m.find()) {
                //System.out.print(m.group(1) + " ");
                //System.out.print(Double.toString(Integer.parseInt(m.group(1))/(2.0)) + "\n");
                word=word.replace(m.group(1)+"px",Double.toString(Integer.parseInt(m.group(1))/(2.0))+"px");
            }
            System.out.print(word);
        }
    }
}
