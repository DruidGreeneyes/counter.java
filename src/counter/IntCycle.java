package counter;

public final class IntCycle {
	private int count;
	private final int end;
	private final int start;
	private final int span;

	public IntCycle(int start, int end) {
		this.start = start;
		this.end = end;
		span = end - start;
	}

	public IntCycle(int end) {
		this(0, end);
	}

	public int get() {
		return count;
	}

	public int set(int value) {
		int v = value;
		while (v < start) {
			v += span;
		}
		while (v >= end) {
			v -= span;
		}
		count = v;
		return count;
	}

	public int inc() {
		count++;
		if (count == end)
			count = start;
		return count;
	}

	public int inc(int value) {
		return set(count + value);
	}

	public int dec() {
		if (count < start)
			count = end;
		return count;
	}

	public int dec(int value) {
		return set(count - value);
	}

	public int lateInc() {
		int c = count;
		inc();
		return c;
	}

	public int lateInc(int value) {
		int c = count;
		inc(value);
		return c;
	}

	public int lateDec() {
		int c = count;
		dec();
		return c;
	}

	public int lateDec(int value) {
		int c = count;
		dec(value);
		return c;
	}
}
