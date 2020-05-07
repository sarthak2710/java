import java.io.*;
import java.util.*;
public class emi
 {
  public static void main() throws IOException
     {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

       Calendar calendar = Calendar.getInstance();//creating calender object
       System.out.print("Enter your Principle amount-");
       double P = Double.parseDouble(br.readLine());//principle amount input
       System.out.print("Enter the tenure(in months)-");
       double T = Double.parseDouble(br.readLine());//tenure of loan input
       
       
       String[] M={"January","february","March","April","May","June","July","August","September","Octobar","November","December"};
       String mon=M[calendar.get(Calendar.MONTH)];//getting the month
       
       System.out.print("Date-"+calendar.get(Calendar.DATE)+" "+mon+" "+calendar.get(Calendar.YEAR));//to get the date
       int da=calendar.get(Calendar.DATE),y=calendar.get(Calendar.YEAR);//da containg date and y contaning year
       String[] co=M;//keeping a copy of month
       int ye=y;//copying a year
       
       double b=T,s=0;//copying tenure(T) in b for use and for looping here were using s
       
       String x=" ";//for below lopping
       double I=((P*12)/100),ts,j=0;//takeing 12% as constatnt interest and ts is totatl sum
       ts=P+I;//total sum of amount has to be paid
       j=ts;//copying total amount for using loop
       double IPM=I/T;//interest per month
       double PPM=P/T;//for princile per month
       double e=IPM+PPM,z=e;//EMI per month
       System.out.println("Total sum-"+ts+",Interest per month-"+IPM+",Pinciple per month-"+PPM+"EMI per month-"+e);
       int p=0;//used for looping
       int count=11-(calendar.get(Calendar.MONTH));
       for(int i=1;i<=b;i++)
       {
           if(x==M[11])
             ye++;
          //this portion below is for month calculation   
          if(i>count)
          {
              if(p>11)
              { p=0;
              x=co[p++];
            }
              else
              x=co[p++];
            }
          else 
          {x=co[calendar.get(Calendar.MONTH)+i];}
             
           s=j-e;
           System.out.println("EMI No:"+i+", Principal EMI:"+PPM+", Interest EMI="+IPM+", Total EMI="+e+"EMI Date:"+da+""+x+""+ye+", Principal remaining:"+s);
           j=j-e;
        }
       

           
        
    }
}