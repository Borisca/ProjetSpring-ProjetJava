import java.util.Iterator;
import java.util.List;

public interface AjoutObjet<T> {

	default void addObject(T obj, List<T> list) {

		list.add(obj);

	}

	default void removeObject(T obj, List<T> list) {
		Iterator<T> it = list.iterator();
		while (it.hasNext()) {
			if (it.next().equals(obj))
				it.remove();
		}
	}

	List<T> getList();
}
