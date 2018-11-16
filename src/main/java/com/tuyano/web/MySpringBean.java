package com.tuyano.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MySpringBean {
	private List<MyData> list = new ArrayList<MyData>();

	public MySpringBean() {
		list.add(new MyData("tuyano", "syoda@tuyano.com",123));
		list.add(new MyData("hanako", "hanako@flower",23));
		list.add(new MyData("sachiko", "sachiko:happy",123));
	}

	public void addData(MyData data) {
		list.add(data);
	}

	public MyData get(int num) {
		return list.get(num);
	}

	public int count() {
		return list.size();
	}
}
