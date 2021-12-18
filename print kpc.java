/*
PEPCODING LEVEL-1 RECURSING ON THE WAY UP 

PRINT KPC
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        printKPC(str,"");

    }
    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        
        char ch=str.charAt(0);
        String ros=str.substring(1);
        
        String codeforch=codes[ch-'0'];
        for(int i=0;i<codeforch.length();i++){
            char cho=codeforch.charAt(i);
            printKPC(ros,asf+cho);
        }
        
        
        
    }

}




