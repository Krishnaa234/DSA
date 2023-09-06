//check whether the list has a cycle or not

bool has_cycle(SinglyLinkedListNode* head) {
    SinglyLinkedListNode* fast=head;
    SinglyLinkedListNode* slow=head;
    
    while(fast->next!=NULL && fast->next->next!=NULL){
        fast=fast->next->next;
        slow=slow->next;
            if(fast==slow)
                return 1;
    }
        return 0;
}

//returns 0 if cycle is not present
//returns 1 if cycle is present
