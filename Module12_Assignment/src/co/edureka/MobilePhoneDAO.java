package co.edureka;

import java.util.List;

public interface MobilePhoneDAO {
	
	void saveMob(MobilePhone mob);
	void updateMob(MobilePhone mob);
	void deleteMob(int mobid);
	List<MobilePhone> getMobilePhones();
	

}
