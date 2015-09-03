package edu.cjy.LinkedList;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1,ListNode l2){
		int carry=0;
		ListNode header=new ListNode(0);
		ListNode temp=header;
		while(l1!=null||l2!=null){
			int val1=0;
			if(l1!=null){
				System.out.println("l1:"+l1.val);
				val1=l1.val;
				l1=l1.next;
			}
			int val2=0;
			if (l2!=null) {
				System.out.println("l2:"+l2.val);
				val2=l2.val;
				l2=l2.next;
			}
			int sum=val1+val2+carry;
			System.out.println("sun:"+sum);
			ListNode nextNode = new ListNode(sum%10);
			temp.next=nextNode;
			carry=sum/10;
			temp=nextNode;
		}
		if (carry==1) {
			temp.next=new ListNode(1);
		}
		return header.next;	
	}
	
	public void print(ListNode n){
		System.out.println("--------------");
		while(n!=null){
			System.out.print(n.val+"->");
			n=n.next;
		}
		
	}
	public static void main(String[] args) {
		AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
		ListNode l1 = new ListNode(2);
		l1.next=new ListNode(4);
		l1.next.next=new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(7);
		addTwoNumbers.print(l1);
		addTwoNumbers.print(l2);
		addTwoNumbers.print(addTwoNumbers.addTwoNumbers(l1, l2));
	}
}
