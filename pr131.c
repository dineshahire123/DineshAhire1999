#include<stdio.h>
#include<stdbool.h>

typedef unsigned int UINT;
bool CheckBit(int iNo)
{
     int iMask = 0x0000000F;
	 int iResult = 0;
	 
	 iResult = iNo & iMask;
	 
	 if(iResult == iMask)
	 {
		 return true;
	 }
	 else
	 {
		 return false;
	 }
	 
}

int main()
{
	UINT iValue = 0;
	bool bRet = false;
	
	printf("Enter number\n");
	scanf("%d",&iValue);
	
	bRet = CheckBit(iValue);
	
	if(bRet == true)
	{
		printf("First  4  bit is ON\n");
	}
	else
	{
		printf("First 4 bit is OFF\n");
	}
	
	return 0;
}