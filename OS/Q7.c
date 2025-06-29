// AIM: Implementation Producer Consumer Problem Solution 

/*
Synchronization ensures processes share resources safely using mutual exclusion and coordination.
Semaphores and monitors are key tools used.
Classic examples include:
Producer-Consumer Problem
Readers-Writers Problem
*/

Source Code: 
#include<stdio.h> 
#include<stdlib.h> 
int mutex=1,full=0,empty=3,x=0;  
int main() 
{ 
int n; 
void producer(); 
void consumer(); 
int wait(int); 
int signal(int); 
printf("\n1.Producer\n2.Consumer\n3.Exit"); 
while(1) 
{ 
printf("\nEnter your choice:"); 
scanf("%d",&n); 
switch(n) 
{ 
case 1: if((mutex==1)&&(empty!=0)) 
producer(); 
else 
printf("Buffer is full!!"); 
break; 
case 2: if((mutex==1)&&(full!=0)) 
consumer(); 
Page 35 
LIET-IT 
OPERATING SYSTEMS LAB MANUAL 
else 
printf("Buffer is empty!!"); 
break; 
case 3: 
exit(0); 
break; 
} 
} 
return 0; 
} 
int wait(int s) 
{ 
return (--s); 
} 
int signal(int s) 
{ 
return(++s); 
} 
void producer() 
{ 
mutex=wait(mutex); 
full=signal(full); 
empty=wait(empty); 
x++; 
printf("\nProducer produces the item %d",x); 
mutex=signal(mutex); 
} 
void consumer() 
{ 
mutex=wait(mutex); 
full=wait(full); 
empty=signal(empty); 
Page 36 
LIET-IT 
OPERATING SYSTEMS LAB MANUAL 
printf("\nConsumer consumes item %d",x); 
x--; 
mutex=signal(mutex); 
} 


/*
OUTPUT:  
1.Producer 
2.Consumer  
3.Exit  
Enter your choice:1 
Producer produces the item 1  
Enter your choice:2 
Consumer consumes item 1 
Enter your choice:2  
Buffer is empty!!  
Enter your choice:3 

RESULT: Thus the program was executed and verified successfully
*/