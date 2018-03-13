
public interface IObservable {

	void notifier();
	void add(Observer obs);
	void remove(Observer obs);
}
