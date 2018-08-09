import java.util.Arrays;
import java.util.List;

public class OdoMeter {
	
	private CircularList<Integer> odoSeq;
	
	public OdoMeter(int size) {
		CircularList<Integer> t = new CircularList<>();
		for (int i = 1; i < 10; i++) {
			t.add(i);
		}
		odoSeq = t;
	}

	public int next(int num) {
		return 0;
	}
	
	public int previous(int num) {
		return 0;
	}
	
	public int nextN(int num, int n) {
		return 0;
	}
	
	public int previousN(int num, int n) {
		return 0;
	}
	
	public int diff(int num1, int num2) {
		return 0;
	}
	
	public List<Integer> getOdoSeq() {
		return odoSeq;
	}
	
}
