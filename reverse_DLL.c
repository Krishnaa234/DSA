DoublyLinkedListNode* reverse(DoublyLinkedListNode* llist) {
    DoublyLinkedListNode* temp1=llist;
    DoublyLinkedListNode* temp2=NULL;
    
    temp2=temp1->next;
    temp1->prev=temp2;
    temp1->next=NULL;
    
    while(temp2!=NULL){
        temp2->prev=temp2->next;
        temp2->next=temp1;
        temp1=temp2;
        temp2=temp2->prev;
    }
    llist=temp1;
    return llist;
}
