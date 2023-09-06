DoublyLinkedListNode* sortedInsert(DoublyLinkedListNode* llist, int data) {
    DoublyLinkedListNode* temp;
    temp = (DoublyLinkedListNode *)malloc(sizeof(DoublyLinkedListNode));
    temp = llist;
    DoublyLinkedListNode* prev, *new_node;
    new_node = (DoublyLinkedListNode *)malloc(sizeof(DoublyLinkedListNode));
    while(temp!= NULL) {
        if((temp->data)>=data) {
            prev = temp->prev;
            temp->prev->next = new_node;
            new_node->prev = prev;
            temp->prev = new_node;
            new_node->next = temp;
            new_node->data=data;
            return llist;
        }
        if(temp->next==NULL) {
            temp->next = new_node;
            new_node->prev = temp;
            return llist;
        }
        temp = temp->next;
    }
    return llist;
}


//4 test cases passed and 4 failed
