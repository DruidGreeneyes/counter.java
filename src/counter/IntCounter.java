package counter;

public final class IntCounter {
	private int count;

	public IntCounter() {
		count = 0;
	}

	public int get() {
		return count;
	}

	public int set(int value) {
		count = value;
		return count;
	}

	public int inc() {
		count++;
		return count;
	}

	public int inc(int value) {
		count += value;
		return count;
	}

	public int dec() {
		count--;
		return count;
	}

	public int dec(int value) {
		count -= value;
		return count;
	}

	public int lateInc() {
		int c = count;
		count++;
		return c;
	}

	public int lateInc(int value) {
		int c = count;
		count += value;
		return c;
	}

	public int lateDec() {
		int c = count;
		count--;
		return c;
	}

	public int lateDec(int value) {
		int c = count;
		count -= value;
		return c;
	}

	public int zero() {
		return set(0);
	}
}
