//package com.company;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn=new Scanner(System.in);
        int n=Integer.parseInt(scn.nextLine());
        String tmp;
        for (int i=0;i<n;i++){
            tmp=scn.nextLine();
            String[] SS=tmp.split(" ");
            int subN=Integer.parseInt(SS[0]);
            int seqN=Integer.parseInt(SS[1]);
            String temp=scn.nextLine();
            String[] sub=temp.split("");
            temp=scn.nextLine();
            String[] seq=temp.split("");
            int k=0;
            int counter=0;
            boolean flag=false;
            for (int s=0;s<subN;s++){
                for (int j=k;j<seqN;j++){
                    if (seq[j].equals(sub[s])){
                        k=j+1;
                        counter++;
//                        j=seqN;
//                        System.out.println("1");

                        if (counter==subN){
                            flag= true;
                        }
                        break;
                    }

                }
//                System.out.println("breaked in seco");
            }
            if (flag){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
    }
}
