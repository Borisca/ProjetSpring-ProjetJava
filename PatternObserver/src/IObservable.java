
public interface IObservable {

	void notify();
	void add(Observer obs);
	void remove(Observer obs);
}
