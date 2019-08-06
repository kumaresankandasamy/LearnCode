import java.util.*;

public class Stack_using_Array{
	private int arr[];
	private int size;
	private int index = 0;

public Stack_using_Array(int size){
	this.size = size;
	arr = new int[size];

}
public void push(int element){
	if (isFull()) {
		throw new StackOverflowError("stack is full");
	}
	arr[index] = element;
	index++;

}
public int pop(){
try{	if (isEmpty()) {
		throw new EmptyStackException();
	}}catch(Exception e){
	System.out.println("pop");
}
	return arr[--index];

}
public boolean isEmpty(){
	if (index == 0) {
		return true;
	}
	return false;
}
public boolean isFull(){
	if(index == size){
		return true;

	}
	return false;
}
public int size(){
	return index;
}
	public static void main(String[] args) {
		Stack_using_Array stack = new Stack_using_Array(0);
		stack.push(10);
		stack.pop();
		
		
	}
}