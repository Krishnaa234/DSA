#include <stdio.h>
#include <stdlib.h>
struct node
{
    int info;
    struct node * next;
};
struct node * start = NULL;
void insert();
void del();
void display();
void main()
{
    int ch=0;
    while(ch!=4)
    {
        printf("\nWelcome to linked list\n");
        printf("Enter 1 to insert.\n");
        printf("Enter 2 to delete.\n");
        printf("Enter 3 to display.\n");
        printf("Enter 4 to exit\n");
        scanf("%d",&ch);

        switch(ch)
        {
            case 1: insert(); break;
            case 2: del(); break;
            case 3: display(); break;
            case 4: printf("You just quit\n"); break;
            default: printf("Entered a wrong input.\n");
        }
    }
}
void insert()
{
    struct node * p=NULL;
    struct node * pt=NULL;
    p=(struct node *)malloc(sizeof(struct node));
    printf("Enter value to be inerted: ");
    scanf("%d",&p->info);
    p->next=NULL;
    if(start==NULL)
        start=p;
    else
    {
        int pos=0;
        printf("Enter the position where you want to insert: ");
        scanf("%d",&pos);
        if(pos==1)
        {
            p->next=start;
            start=p;
        }
        else
        {
            pt=start;
            for(int i=1; i<pos-1; i++)
            {
                pt=pt->next;
                if(pt==NULL)
                    break;
            }
            if(pt==NULL)
            {
                printf("Value of that position entered is not posible\n");
                free(p);
            }
            else
            {
                p->next=pt->next;
                pt->next=p; //insertion statements
            }
        }
    }
}
void del()
{
    struct node *p=NULL;
    struct node *pt=NULL;
    if(start==NULL)
        printf("Underflow condition.\n");
    else
    {
        int pos=0, i;
        printf("Enter position of deletion: ");
        scanf("%d",&pos);
        if(pos==1)
        {
            p=start;
            start=start->next;
            free(p);
        }
        else
        {
            p=NULL;
            pt=start;
            for(i=0; i<pos; i++)
            {
                p=pt;
                pt=pt->next;
                if(pt==NULL)
                    break;
            }
            if(pt==NULL)
                printf("Invalid value\n");
            else
            {
                p->next=pt->next; //deleting and assigning statements
                free(pt);
            }
        }
    }
}
void display()
{
    struct node *p=start;
    if(start==NULL)
        printf("Empty linked list.\n");
    else
    {
        while(p!=NULL)
        {
            printf("%d\t",p->info);
            p=p->next;
        }
    }
}

