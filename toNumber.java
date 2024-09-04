import java.util.Arrays;
import java.util.Scanner;

public class toNumber {
    public static void main(String[] args) {
        // StringBuilder str=new StringBuilder("+91 4567");
        // for(int i=0;i<str.length();i++)
        // if(str.charAt(i)==' ')
        // {
        //     str=str.delete(0, i+1);
        // }
        // System.out.println(str);
        String num="+91 4567";
        int dec=0;
        String arr[]=num.split(" ");
        for(int i=0;i<arr[1].length();i++)
        {
            int n=arr[1].charAt(i)-48;
            dec=dec*10+n;
        }
        System.out.println(dec);
    }
}
