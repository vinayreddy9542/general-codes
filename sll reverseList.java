Node reverseList(Node head)
    {
        Node prev=null;
        Node cur = head;
        Node next = null;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
