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
		return nextN(num,1);
	}

	public int previous(int num) {
		return previousN(num, 1);
	}

	public int nextN(int num, int n) {
		return odoSeq.get(odoSeq.indexOf(num)+n);
	}

	public int previousN(int num, int n) {
		return odoSeq.get(odoSeq.indexOf(num) - n);
	}
	
	public int diff(int start, int end) {

		int idxStart = odoSeq.indexOf(start);
		int idxEnd = odoSeq.indexOf(end);

		if(idxStart > idxEnd)
			return odoSeq.size() - (idxStart - idxEnd);

		return idxEnd - idxStart;
	}
	
	public List<Integer> getOdoSeq() {
		return odoSeq;
	}
	
}
