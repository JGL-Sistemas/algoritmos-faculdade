#include <stdio.h>
#include <time.h>
#include <stdlib.h>
 
int main()
{
   time_t timer = time(NULL);
   
    int i;
    
	for(i=1; i>0; i++){
    
    printf(" %s\n", ctime(&timer));
    }
    return 0;
}