package counter;

public interface Counter<T> {
	public T get();

	public T set(T value);

	public T inc();

	public T inc(T value);

	public T dec();

	public T dec(T value);

	public T lateInc();

	public T lateInc(T value);

	public T lateDec();

	public T lateDec(T value);
}
