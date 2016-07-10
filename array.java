#include<stdio.h>
#include<conio.h>
int main()
{
int i,j,n,temp;
int arr[30];
printf("enter the size of array");
scanf("%d"&n);
printf("enter the values");
for(i=0;i<n;i++)
{
scanf("%d"&arr[i]);
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(arr[i]<arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
printf("values in descending order is:");
for(i=0;i<n;i++);
{
printf("%d",arr[i];
}
return 0;
}
