
package com.info;
import java.util.Scanner;

public class data {
 public static void main(String[] args){

============================Convert to String==============================================================

    System.out.println("Jahir"+"\n"+"1279798"+"\n"+"57"+"\n"+"jahir123@gmail.com");
    int p1=5;
    int p2=6;
    int c=p1+p2;
    int p3=15;
     System.out.println(c);
      System.out.println(String.valueOf(p3)+p1);

    ============================Sum two numbers==============================================================

 
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a number");
    int x1= sc.nextInt();
    System.out.println("enter a number");
    int x2= sc.nextInt();
    int c=x1+x2;
    System.out.println(c);

============================Q 01==============================================================


Scanner sc= new Scanner(System.in);
    System.out.println("enter a number of Bangla");
    int x1= sc.nextInt();
    System.out.println("enter a number of Math");
    int x2= sc.nextInt();
    System.out.println("enter a number of English");
    int x3= sc.nextInt();
    System.out.println("enter a number of BGS");
    int x4= sc.nextInt();
    int c=x1+x2+x3+x4;
    System.out.println("Total number is = "+c); 


============================Q 02==============================================================

  

  Scanner sc= new Scanner(System.in);
    System.out.println("enter a number");
   double x1= sc.nextDouble();
    System.out.println("enter a number");
    double x2= sc.nextDouble();
    System.out.println("enter a number");
    double x3= sc.nextDouble();
    double c=x1+x2+x3;
    double d=3;
    double s1=c/d;
    System.out.println("Total number is = "+c+"\n"+"The average is = "+s1); 
  
  
*************************** Q__03 *******************************************************************

  Scanner sc= new Scanner(System.in);
    System.out.println("enter the name");
   String x1= sc.nextLine();
    System.out.println("enter your ID");
    String x2= sc.nextLine();
    System.out.println("enter your round");
    String x3= sc.nextLine();
     System.out.println("enter your MCQ mark");
    Double x4= sc.nextDouble();
     System.out.println("enter your Evidence mark");
    Double x5= sc.nextDouble();
    double total=x4+x5;
    double d=2;
    double avg=total/d;
    System.out.println("My Name is: "+x1+"\n"+"The ID is : "+x2+"\n"+
            "Round is : "+x3+"\n"+"Mcq mark is : "+x4+"\n"+"Evidence mark is : "+x5+
            "\n"+"The total mark is = "+total+"\n"+"Average mark is = "+avg);

=========================== Q__04 ======================================================== 

  Scanner sc= new Scanner(System.in);
    System.out.println("enter the value");
   Double x1= sc.nextDouble();
   Double x2=0.621371;
   Double res=x1*x2;
   System.out.printf("the result is = "+"%.3f",res);
  
=========================== Q__05 ======================================================== 

 Scanner sc= new Scanner(System.in);
    System.out.println("enter the value");
   Double x1= sc.nextDouble();
   if(x1<0){
     System.out.println(x1+" is a Negative number");
   } else if(x1>0){
      System.out.println(x1+" is a Positive number"); 
   } else{
      System.out.println("Not Positive,Not Negative number"); 
   }

=============================== Q__06 =======================================

 Scanner sc= new Scanner(System.in);
    System.out.println("enter a value");
   Double x= sc.nextDouble();
     System.out.println("enter a value");
   Double y= sc.nextDouble();
     System.out.println("enter a value");
   Double z= sc.nextDouble();
   if(x<y && x<z){
     System.out.println(x+" is the Lowest number");
   } else if(y<x && y<z){
       System.out.println(y+" is the Lowest number");
   } else{
     System.out.println(z+" is the Lowest number");
   }
}   
}

===========================================Q 07===========================================

package jahir;
import java.util.Scanner;
public class Q_sum_sub_MUL_Div {
     public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
    System.out.println("enter a value");
   double x= sc.nextDouble();
     System.out.println("enter a value");
   double y= sc.nextDouble();
   double sum=x+y;
   double sub=x-y;
   double mul=x*y;
   double div=x/y;
   
  System.out.println("The summation is = "+sum+"\n"
  +"The subtraction is = "+sub+"\n"
  +"The multiplication is = "+mul+"\n"
  +"The division is = "+div);


   } 
}

============================================= Q 08 =============================================================

package jahir;
import java.util.Scanner;
public class Q_8_square {
      public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
    System.out.println("enter a value");
   double x= sc.nextDouble();
   double y=x*x;
    System.out.printf("the result is = "+"%.2f",y);
      }
}
====================================== Q 09 =============================================================================

package jahir;
import java.util.Scanner;
public class pass_fail {
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a value");
     double x= sc.nextDouble();
     if(x>=60){
        System.out.println("Pass");
                
     } else{
        System.out.println("Fail"); 
     }
   } 
}
================================================= Q 10 =============================================================

package jahir;
import java.util.Scanner;
public class grade {
 public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  System.out.println("enter a number");
  double x=sc.nextDouble();
  if(x>=80){
   System.out.println("A+");
  } else if(x>=60){
       System.out.println("A");
  } else if(x>=40){
       System.out.println("B");
  } else {
     System.out.println("Fail");
  }
 }   
}
=================================================== Q 11 =================================================================

package jahir;
import java.util.Scanner;
public class Q9 {
   public static void main(String[] args){
       Scanner p= new Scanner(System.in);
       System.out.println("Enter a numnber");
       int x=p.nextInt();
       if(x>=80){
        System.out.println("Excilent");
       } else if(x>=60){
          System.out.println("Better"); 
       } else if(x>=40){
          System.out.println("Good"); 
       } else{
          System.out.println("Bad"); 
       }
   } 
}
=================================================== Q 12 =========================================================================

package jahir;

import java.util.Scanner;
public class total_dis_net {
    public static void main(String[] args){
       Scanner p= new Scanner(System.in);
       System.out.println("Enter Product 1");
       double x1=p.nextDouble();
       System.out.println("Enter Product 2");
       double x2=p.nextDouble();
       System.out.println("Enter Product 3");
       double x3=p.nextDouble();
       System.out.println("Enter Product 4");
       double x4=p.nextDouble();
       double total=x1+x2+x3+x4;
       double dis=0;
       double disamount=0;
       double netp=0;
       if(total<1000){
           dis=0;
           disamount=total*dis/100;
           netp=total-disamount;
       } else if(total<2000){
           dis=5;
           disamount=total*dis/100;
           netp=total-disamount;
       }  else if(total<5000){
           dis=10;
           disamount=total*dis/100;
           netp=total-disamount;
       } else{
           dis=15;
           disamount=total*dis/100;
           netp=total-disamount;
       }
       System.out.printf("The Total price is = "+"%.2f\n",total);
       System.out.printf("Discount Price is = "+"%.2f\n",disamount);
       System.out.printf("NetPrice is = "+"%.2f\n",netp);
      
   } 
}


====================================== Q 13   =========================================

============================Email set kora deya ta=======================================

package Calculation;
//import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class NewClass {
  public static void main(String[] args){
   String x="^[a-z0-9]+\\@[a-z]+\\.[a-z]{2,3}$";
    String y="jahir@gmail.com";
    Pattern p=Pattern.compile(x);
    Matcher h=p.matcher(y);
    //............1st way............................
    /*if(h.matches()){
       System.out.println("Valid email");
    } else{
       System.out.println("InValid"); 
    }
*/
    //--------- 2nd way---------------------
    //boolean b=h.matches();
   //System.out.println(b);
   
   //------------3rd way-----------------
   
   boolean b=h.matches();
   if(b==true){
    System.out.println("Valid email");   
   } else{
      System.out.println("Invalid"); 
   }
   
  }  
}

======================================= User er thake Email input neya ta==============================


package Calculation;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("enter an Email");
        String x = d.nextLine();
        String h = "^[a-z0-9]+\\@[a-z]+\\.[a-z]{2,3}$";
        Pattern p = Pattern.compile(h);
        Matcher m = p.matcher(x);
        //............1st way............................
        /*if(m.matches()){
       System.out.println("Valid email");
    } else{
       System.out.println("InValid"); 
    }
         */
        //--------- 2nd way---------------------
        //boolean b=m.matches();
        //System.out.println(b);

        //------------3rd way-----------------
        boolean b = m.matches();
        if (b == true) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid");
        }

    }
}
=============================================== Q 14 ======================================================================

package Calculation;
import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("enter a number");
        int x=d.nextInt();
        if(x%2==0){
           System.out.println("Even number");
        } else{
           System.out.println("Odd number"); 
        }
    }
}
=============================================== Q 15 ======================================================================
package Calculation;

public class NewClass {

    public static void main(String[] args) {
       for(int i=0; i<=10; i++){
         //System.out.print(i+",");
         System.out.println(i);
       }
    }
}
=============================================== Q 16 ======================================================================
package Calculation;

public class NewClass {

    public static void main(String[] args) {
       for(int i=1; i<=50; i++){
        if(i%2!=0){
            //System.out.print(i+",");
         System.out.println(i); 
        }
       }
    }
}

=============================================== Q 17 ======================================================================

package Calculation;

public class NewClass {

    public static void main(String[] args) {
        int sum=0;
       for(int i=1; i<=10; i++){
        sum=sum+i;
       }
         System.out.println("The summation is = "+sum); 
    }
}

=============================================== Q 18 ======================================================================

  
package Calculation;

public class NewClass {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("The summation is = " + sum);
    }
}
================================================ Q 19 ===================================================
package data;
import java.util.Scanner;
public class Q_19_prime_number {
  public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("enter a number");
     int x=sc.nextInt();
     int count=0;
     for(int i=1; i<=x; i++){
       if(x%i==0){
          count++; 
       }  
     }
     if(count==2){
        System.out.println("This is Prime number");
     } else{
        System.out.println("NOT Prime number"); 
     }
    }
}
================================================ Q 20 ===================================================
package data;

public class Q_25_sum_single_array_element {

    public static void main(String[] args) {
        int p[] = {1, 3, 7, 2, 3};
        int sum = 0;
        for (int i = 0; i < p.length; i++) {
            sum = sum + p[i];
        }
        System.out.println("The result is = " + sum);

    }
}

================================================ Q 21 ===================================================
package data;

import java.util.Scanner;

public class Q_21_factorial_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        int n = sc.nextInt();
        int p=1;
        if(n<=1){
         System.out.println("The result is = " +p);   
        } else{
            for(int i=2; i<=n; i++){
               p=p*i; 
            }
        }
        System.out.println("The result is = " +p);
    }
}

================================================ Q 22 ===================================================
package data;

import java.util.Arrays;

public class Q_22_sort_single_array {

    public static void main(String[] args) {
        int x[] = {7, 12, 3, 0, 16, 20, 5, 2};
        int temp = 0;
        for (int j = 0; j < x.length; j++) {
            for (int i = 0; i < x.length-1; i++) {
                if (x[i] > x[i + 1]) {
                    temp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = temp;
                }
            }
        }
        //System.out.println(Arrays.toString(x));
        for(int i=0; i<x.length; i++){
           System.out.println(x[i]); 
        }
    }
}

================================================ Q 23 ===================================================

package data;
import java.util.Arrays;
public class Q_23_multiple_array {
    public static void main(String[] args) {
        int p[][] = {{7, 12, 3, 0, 16, 20},{10,3,50,2,8},{5,7,12,16,20,3}};
        
        for(int k=0; k<p.length; k++){
        int x[]=p[k];  
        int temp = 0;
        for (int j = 0; j < x.length; j++) {
            for (int i = 0; i < x.length-1; i++) {
                if (x[i] > x[i + 1]) {
                    temp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = temp;
                }
            }
        }
        
       System.out.println(Arrays.toString(x));
        
        }   
        }
        
    } 

================================================ Q 24 ===================================================

package data;

public class Q_24_sum_single_array_odd {
     public static void main(String[] args) {
        int p[] ={1,3,7,2,3,8,6};
        int sum=0;
        for(int i=0; i<p.length; i++){
           if(p[i]%2!=0){
               sum= sum+p[i];
           } 
        }
        System.out.println("The result is = "+sum);
        
        }
}

================================================ Q 25 ===================================================
package data;

public class Q_25_sum_single_array_element {

    public static void main(String[] args) {
        int p[] = {1, 3, 7, 2, 3};
        int sum = 0;
        for (int i = 0; i < p.length; i++) {
            sum = sum + p[i];
        }
        System.out.println("The result is = " + sum);

    }
}

================================================ Q 26 ===================================================
package data;

public class Q_26_sum_2D_array {

    public static void main(String[] args) {
        int p[][] = {{1, 3, 7, 1, 3}, {5, 0, 4, 1}, {0, 1, 2, 3, 4}};
        int sum = 0;
        for (int k = 0; k < p.length; k++) {
            int[] dd = p[k];
            for (int i = 0; i < dd.length; i++) {
                sum = sum + dd[i];
            }
        }
        System.out.println("The result is = " + sum);
    }
}

================================================ Q 27 ===================================================
                                         (easy ta)
package data;
import java.util.Scanner;
import java.util.ArrayList;

public class Q_27_febinacci_series_easy_ta {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        int p=sc.nextInt();
        int a1=0;
        int a2=1;
        int sum=0;
        if(p==1){
            System.out.print(a1);           
        }
        if(p==2){
            System.out.print(a1+" ,");  
             System.out.print(a2);  
        }
        if(p>2){
           System.out.print(a1+", ");  
             System.out.print(a2+", ");    
          for(int i=3;i<=p;i++){
             sum=a1+a2;
             a1=a2;
             a2=sum;
             System.out.print(sum+", ");
          }
        }
        
    }
}

----------------------------------------------------(Array index diya)-----------------------------
package data;

import java.util.Arrays;
import java.util.Scanner;

public class Q_27_febonacci_Jatil_ta_array_diya {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        int x = sc.nextInt();
        int[] pp = new int[x];
        int index = -1;
        int a1 = 0;
        int a2 = 1;
        int sum = 0;
        if (x == 1) {
            index++;
            pp[index] = a1;
        }
        if (x == 2) {
            index++;
            pp[index] = a1;
            index++;
            pp[index] = a2;
        }
        if (x > 2) {
            index++;
            pp[index] = a1;
            index++;
            pp[index] = a2;
            for (int i = 3; i <= x; i++) {
                sum = a1 + a2;
                a1 = a2;
                a2 = sum;
                index++;
                pp[index] = sum;
            }
        }
        System.out.println(Arrays.toString(pp));
    }
}
------------------------------------------------(Array List diya)--------------------------------------------
package data;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_27_febonacci_series_array_list_diya_Final_Ata {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        int x = sc.nextInt();
        ArrayList pp = new ArrayList();
        int a1 = 0;
        int a2 = 1;
        int sum = 0;
        if (x == 1) {
            pp.add(a1);
        }
        if (x == 2) {
            pp.add(a1);
            pp.add(a2);
        }
        if (x > 2) {
            pp.add(a1);
            pp.add(a2);
            for (int i = 3; i <= x; i++) {
                sum = a1 + a2;
                a1 = a2;
                a2 = sum;
                pp.add(sum);
            }
        }
        System.out.println(pp);
    }
}
================================================ Q 28 ===================================================
package Calculation;

import java.util.Scanner;

public class User_input_array_match {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int x = sc.nextInt();
        int[] array = {2, 6, 4, 5, 12,0,6,6};
        int count = 0;
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                count++;
                //position=i;
            }
        }
        if (count >= 1) {
            System.out.println("Found");
            //System.out.println(position);
        } else {
            System.out.println("Not Found");
           // System.out.println(position);
        }
    }
}

--------------------------------------------------------------------------------------------------------------------------------


































































