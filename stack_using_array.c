#include<stdio.h>
int top=-1;
void push();
void pop();
void display();
int A[10];
void main()
{
    int c=0;
    while(c!=4)
    {
        printf("Welcome to stack\n");
        printf("Enter 1 to push.\n");
        printf("Enter 2 to pop.\n");
        printf("Enter 3 to display.\n");
        printf("Enter 4 to exit.\n");
        scanf("%d",&c);
        switch(c)
        {
            case 1: push(); break;
            case 2: pop(); break;
            case 3: display(); break;
            case 4: printf("You just quit.\n"); break;
            default: printf("Entered a wrong input.\n"); break;
        }
    }
}
void push()
{
    int n=0;
    if(top==9)
        printf("Stack is already full.\n");
    else
    {
        top++;
        printf("Enter value to be added: ");
        scanf("%d",&n);
        A[top]=n;
    }
}
void pop()
{
    int n=0;
    if(top==-1)
        printf("Stack is empty.\n");
    else
    {
        n=A[top];
        top--;
        printf("%d removed.\n",n);
    }
}
void display()
{
    int i=0;
    for(i=0;i<=top;i++)
    {
        printf("%d\t",A[i]);
    }
    printf("\n");
}