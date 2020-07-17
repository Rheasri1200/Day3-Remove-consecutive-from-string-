import java.util.*;
import java.io.*;
import java.util.Scanner.*;
import java.util.HashMap;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))==false){
                map.put(str.charAt(i),i);
                sb.append(str.charAt(i));
            }
        }
        String tr=sb.toString();
        System.out.println(tr);
    }
}
