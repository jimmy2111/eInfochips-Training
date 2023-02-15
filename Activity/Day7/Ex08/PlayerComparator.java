import java.util.Comparator;

public class PlayerComparator implements Comparator <Player> {

	@Override
	public int compare(Player o1, Player o2) {
		int skillcompare = o1.getSkill().compareTo(o2.getSkill());
		if(skillcompare!=0) {
			return skillcompare;
		}
		return o1.getName().compareTo(o2.getName());
	}

}
