#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int n,rem,sum=0;
    scanf("%d", &n);
    //Complete the code to calculate the sum of the five digits on n.
    while (n!=0){
        rem=n%10;
        sum=sum+rem;
        n=n/10;
        //rem=n;  
    } 
    printf("%d\n",sum);
    return 0;
}
