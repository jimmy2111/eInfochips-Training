package ex2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class PlayerBO{


	public List<Player1> findPlayer(List<Player1> playerList,String nationality){
		List<Player1> listbynationality = new ArrayList<Player1>();
		for(int i=0;i<playerList.size();i++) {
			Player1 p = playerList.get(i);
			if(p.getNationality().equals(nationality)) {
				listbynationality.add(p);
			}
		}
		return listbynationality;
	}
	
	public List<Player1> findPlayer(List<Player1> playerList,LocalDate dateOfBirth){
		List<Player1> listbydob = new ArrayList<Player1>();
		for(int i=0;i<playerList.size();i++) {
			Player1 p = playerList.get(i);
			if(p.getDateOfBirth().equals(dateOfBirth)) {
				listbydob.add(p);
			}
		}
		
		return listbydob;
	}
	
	public List<Player1> findPlayer(List<Player1> playerList,Double powerRating){
		List<Player1> listbyrating = new ArrayList<Player1>();
		for(int i=0;i<playerList.size();i++) {
			Player1 p = playerList.get(i);
			if(p.getPowerRating().equals(powerRating)) {
				listbyrating.add(p);
			}
		}
		return listbyrating;
	}
	
	

}
