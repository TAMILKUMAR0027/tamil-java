package collection;

import java.util.*;

class Task implements Comparable<Task> {
	String name;
	int priority;

	public Task(String name, int priority) {
		super();
		this.name = name;
		this.priority = priority;
	}

	public String getName() {
		return name;
	}

	public int getPriority() {
		return priority;
	}

	@Override
	public int compareTo(Task other) {
		// TODO Auto-generated method stub
		return Integer.compare(other.priority, this.priority);
	}

	public static void main(String[] args) {

		PriorityQueue<Task> pq = new PriorityQueue<>();

		pq.add(new Task("Task 1", 3));
		pq.add(new Task("Task 2", 1));
		pq.add(new Task("Task 3", 2));
		while (!pq.isEmpty()) {
			Task task = pq.poll();
			System.out.println("Executing: " + task.getName() + " (Priority: " + task.getPriority() + ")");
		}
	}
}
