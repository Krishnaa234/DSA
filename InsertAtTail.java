//HackerRank question
SinglyLinkedListNode* insertNodeAtTail(SinglyLinkedListNode* head, int data) {
    
    SinglyLinkedListNode *temp=head, *newnode;
    newnode=(SinglyLinkedListNode *)malloc(sizeof(SinglyLinkedListNode ));  
    newnode->data=data;
    newnode->next=0;
    if(head==0){
        head=newnode;
        return head;
    }else{
        while(temp->next!=0){
            temp=temp->next;
        }temp->next = newnode;
  
        return head;
    }
}
