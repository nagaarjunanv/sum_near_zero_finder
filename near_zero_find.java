

import java.util.Scanner;

public class near_zero_find {

	public static void main(String[] args) {

		Scanner x=new Scanner(System.in);
    	System.out.println("enter the total elements array");
    	int n=x.nextInt();
    	int i=0,j=0,cnt=0,sum=0,pos_cnt=-1,pos_min = 0,neg_min=0,neg_cnt=-1;
      int a[]=new int [n];
      int n1=n-1;
      System.out.println("enter the elements");
      for(i=0;i<n;i++)
      {
    	  a[i]=x.nextInt();
      }
      
      while(n1!=0)
      {
    	  sum+=n1;
    	  n1--;
      }
      int sum_values[]=new int[sum];
      for(i=0;i<n;i++)
      {
    	  for(j=i+1;j<n;j++)
    	  {
    		  sum_values[cnt]=a[i]+a[j];
    		  if(sum_values[cnt]>0)
    		  {
    			  pos_cnt++;
    			  //System.out.println(" "+pos_cnt);
    			  if(pos_cnt>0)
    			  {
    				  if(pos_min>sum_values[cnt])
    				  {
    					  pos_min=sum_values[cnt];
    					  //System.out.print(" "+pos_min);
    				  }
    			  }
    			  else
    				  pos_min=sum_values[cnt];
    			 
    		  }
    		  if(sum_values[cnt]<0)
    		  {
    			  neg_cnt++;
    			  if(neg_cnt>0)
    			  {
    				  if(neg_min<sum_values[cnt])
    					  
    				  {
    					  neg_min=sum_values[cnt];
    					  //System.out.println(" "+neg_min);
    				  }
    			  }
    			  else
    				  neg_min=sum_values[cnt];
    		  }
    		  cnt++;
    	  }
      }
      int d=-(neg_min);
      if(pos_min==d)
    	  System.out.println(neg_min+" "+pos_min+" both are as near zero level ");
      else if(pos_min>d)
    	  System.out.println(neg_min+" - value near to zero");
     
      else
    	  System.out.println(pos_min+" + value near to zero");
   
	}

}
