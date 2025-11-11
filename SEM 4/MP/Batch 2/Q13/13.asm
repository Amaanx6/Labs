Exp 13: BCD SUBTRACTION 


AIM: 
To subtract two 8 bit BCD numbers stored at consecutive memory locations. 

ALGORITHM: 
1. Load the minuend and subtrahend in two registers. 
2. Initialize Borrow register to 0. 
3. Take the 100’s complement of the subtrahend. 
4. Add the result with the minuend which yields the result. 
5. Adjust the accumulator value to the proper BCD value using DAA instruction. Ifthere 
is a carry ignore it. 
6. If there is no carry, increment the carry register by 1 
7. Store the content of the accumulator (result)and borrow register in the specified 
memory location 

RESULT: 
Thus the 8 bit BCD numbers stored at 4500 &4501 are subtracted and the result stored at4502 
& 4503. 