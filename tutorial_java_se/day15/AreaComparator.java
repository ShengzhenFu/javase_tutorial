package day15;

import sun.net.www.content.audio.aiff;

public class AreaComparator {
	public int compare(Areable a1, Areable a2) {
		if (a1.getArea() > a2.getArea()) {
			return 1;
		}else if (a1.getArea() < a2.getArea()) {
			return -1;
		}else {
			return 0;
		}
	}
}
