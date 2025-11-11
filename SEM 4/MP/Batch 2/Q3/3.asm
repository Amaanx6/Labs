Exp 3: 8 BIT DATA SUBTRACTION 

AIM: 
To Subtract two 8 bit numbers stored at consecutive memory locations. 

ALGORITHM: 
1. Initialize memory pointer to data location. 
2. Get the first number from memory in accumulator. 
3. Get the second number and subtract from the accumulator. 
4. If the result yields a borrow, the content of the acc. is complemented and 01H is added to 
it (2’s complement). A register is cleared and the content of that reg. is incremented in 
case there is a borrow. If there is no borrow the content of the acc. isdirectly taken as the 
result. 
5. Store the answer at next memory location. 


RESULT: 
Thus the 8 bit numbers stored at 4500 &4501 are subtracted and the result stored at 4502& 4503. 