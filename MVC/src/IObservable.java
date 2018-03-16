
public interface IObservable {

	void notifier();
	void add(IObserver obs);
	void remove(IObserver obs);
	
}
