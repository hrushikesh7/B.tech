#include <stdio.h>
int main()
{
   int a[5], i;
   printf("Enter elements: ");
   for(i = 0; i < 5; ++i)
     scanf("%d",&a[i]);
   printf("You entered: \n");
   for(i = 0; i < 5; ++i)
      printf("%d\n",a[i]);
   return 0;
}
