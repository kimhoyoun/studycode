package day220103.org.training.ex09;

import java.util.Vector;

import day220103.org.training.Ex;

interface IStack<T> {
	T pop();

	boolean push(T ob);
}

class MyStack<T> implements IStack<T> {
	Vector<T> v = new Vector<>();

	@Override
	public T pop() {
		if (v.size() == 0) {
			return null;
		}
		T num = v.get(v.size() - 1);
		v.remove(v.size() - 1);
		return num;
	}

	public boolean push(T ob) {
		v.add(ob);
		return false;
	}
}

class Ex09 extends Ex {
	public Ex09() {
		start();
	}

	@Override
	public void run() {
		IStack<Integer> stack = new MyStack<>();
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		while (true) {
			Integer n = stack.pop();
			if (n == null)
				break;
			System.out.print(n + " ");
		}

	}
}

public class Ex09Main {

	public static void main(String[] args) {
		new Ex09();
	}

}

