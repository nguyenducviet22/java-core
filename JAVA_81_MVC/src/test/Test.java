package test;

import model.CounterModel;
import view.CounterView;

public class Test {
	public static void main(String[] args) {
		CounterModel cm = new CounterModel();
		System.out.println(cm.getValue());
		CounterView cv = new CounterView();
	}
}
