package com.example.lib;

public class MyClass {
    public static void main(String[] avg) {
        int i,j,m;
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);
        int n = scanner.nextInt();
        for(i=1;i<=n;i++) {
            m=0;
            for(j=1;j<=i;j++){
                if(i%j==0)
                    m++;
                if(m>2)
                    break;
            }
            if(m<=2)
                System.out.println(i);
        }
    }
}
