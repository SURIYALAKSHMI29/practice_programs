/* QUESTION
Given a string, , consisting of alphabets and digits, find the frequency of each digit in the given string.

Input Format
The first line contains a string,  which is the given number.

Constraints
1<len(num)<1000
All the elements of num are made of english alphabets and digits.
*/

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <ctype.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    char str[1000];
    int d[10],i=0,j,n;
    scanf("%s",str);
    for(j=0;j<10;j++)
        d[j]=0;
    while(str[i]!='\0'){
        if(isdigit(str[i])){
            n= str[i]-'0';
            for(j=0;j<10;j++){
                if(n==j){
                    d[j]++;
                    break;
                }
            }
        }
        i++;
    }
    
    for(j=0;j<10;j++)
        printf("%d ",d[j]);
    return 0;
}
