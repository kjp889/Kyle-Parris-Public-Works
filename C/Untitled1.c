void main(void)

{
int i,num1=1,num2=50;
  for(i=num1;i<=num2;i++)
   {
       if (((i%2!=0)&&(i%3!=0)&&(i%5!=0)&&(i%7!=0)&&(i%11!=0))||(i==2)||(i==3)||(i==5)||(i==7)||(i==11))
         {
             printf("%d, ",i);

          }

     }
}
