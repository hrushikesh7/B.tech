#include <stdio.h>
int main()
{
   int data[5], i;            //data[i]=a[i]
   printf("Enter elements: ");
   for(i = 0; i < 5; ++i)
     scanf("%d",data + i);     //data+i = &a[i]
   printf("You entered: \n");
   for(i = 0; i < 5; ++i)
      printf("%d\n", *(data + i));       //*(data+i) = a[i]
   return 0;
}
