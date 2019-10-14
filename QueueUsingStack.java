package cn;
import java.util.*;
public class QueueUsingStack<T> {
	
	StackUsingLL<T> s1;
	StackUsingLL<T> s2;
	 public QueueUsingStack() {
		 s1 = new StackUsingLL<>();
		 s2 = new StackUsingLL<>();
	 }
	 
	 public void enqueue(T element) {
		 s1.push(element);
	 }
	 
	 public T dequeue() {
		 while(s1.size()!=1) {
			 T ans = s1.pop();
			 s2.push(ans);
		 }
		 T data = s1.pop();
		 while(!s2.isEmpty()) {
			 T ans = s2.pop();
			 s1.push(ans);
		 }
		 return data;
	 }

}
