//Approach
/*1. Intialize 2 pointers s and f both pointing at head 
2. Move f 2 times next and s 1 time next
3. When f moves 2 steps node s moves 1 so when f reaches last of list s is in the middle
4. When even no of middle nodes it automatically points to 2nd middle node*/


class middlelistnode{
    public ListNode middleNode(ListNode head) {

        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next != null){
            f=f.next.next;
            s=s.next;
        }
        return s;
        
    }
} 
    
