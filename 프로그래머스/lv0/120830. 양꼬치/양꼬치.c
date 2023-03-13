#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int k) {
    int drink = 0;
    int sale = 0;
    
    if (n>=10){
        sale = (n/10);
        drink = 2000*(k-sale);
    } else {
        drink = 2000*k;
    }
    int sheep = 12000*n;
    
    
    return sheep+drink;
}