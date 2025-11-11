// Fork() System Call: 
// AIM: To write the program to implement fork () system call. 

/*
DESCRIPTION: 
Used to create new processes. The new process consists of a copy of the address space of the 
original process. The value of process id for the child process is zero, whereas the value of process 
id for the parent is an integer value greater than zero. 
*/

/*
ALGORITHM:

1. Start the program.
2. Declare `pid` and assign it the return value of `fork()`.
3. If `pid > 0` (parent process):
   * Print "I am in the parent process".
   * Print process ID using `getpid()`.
   * Print parent process ID using `getppid()`.

4. Else if `pid == 0` (child process):
   * Print "I am in the child process".
   * Print process ID using `getpid()`.
   * Print parent process ID using `getppid()`.

5. Else (fork failed):
   * Print error message.

6. End the program.
*/






// PROGRAM : 
// SOURCE CODE: 
/* fork system call */  
#include<stdio.h> 
#include<stdlib.h>
#include<sys/types.h> 
#include<unistd.h> 
#include<sys/wait.h>
int main() 
{ 
pid_t p; 
printf(“before fork\n”); 
P=fork(); 
If(p==0) 
{ 
printf("I am child having id %d\n",getpid()); 
printf("My parent’s id is %d\n",getppid()); 
} 
else{ 
printf("I am parent having id %d\n",getpid()); 
printf("My child id’s is %d\n",p); 
} 
} 
printf("Completed Succesfully");
return 0;
}


/*
OUTPUT: 
before fork 
My child's id is 2863 
I am parent having id 2862 
I am child having id 2863 
My parent's id is 1 


RESULT: 
Thus the program was executed and verified successfully.
*/