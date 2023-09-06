//function which deletes a node at position 3

SinglyLinkedListNode* deleteNode(SinglyLinkedListNode* llist, int position) {
    if(position==0)
        return llist->next;
        
    SinglyLinkedListNode* p = llist;
    
    SinglyLinkedListNode* q = p->next;
    
    for (int i = 0; i < position -1 ; i++) {
        p = p->next;
        q = q->next;
    }
    
    p->next = q->next;
    free(q);
    return llist;
}
