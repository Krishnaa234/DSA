def mergeLists(head1, head2):
    if head1 == None:
        return head2
    if head2 == None:
        return head1
    if head1.data < head2.data:
        start = head1
        (this, other) = (head1, head2)
    else:
        start = head2
        (this, other) = (head2, head1)
    while other != None:
        if this.next != None and this.next.data < other.data:
            this = this.next
        else:
            (this.next, this) = (other, this.next)
            (this, other) = (other, this)
    return start
