package co.edureka;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class MobilePhoneDAOImpl implements MobilePhoneDAO {
	
	private JdbcTemplate jt;

	 public JdbcTemplate getJt() {
	  return jt;
	 }

	 public void setJt(JdbcTemplate jt) {
	  this.jt = jt;
	 }

	@Override
	public void saveMob(MobilePhone mob) {
		String sql = "insert into Mobile values("+mob.getMobid()+",'"+mob.getManufacturer()+"','"+mob.getMname()+"',"+mob.getPrice()+",'"+mob.getColor()+"')";
		int n = jt.update(sql);
		if(n>0)
			System.out.println(">>>MobilePhone Saved!");

	}

	@Override
	public void updateMob(MobilePhone mob) {
		String sql = "update Mobile set manufacturer='"+mob.getManufacturer()+"', mname='"+mob.getMname()+"', price="+mob.getPrice()+", color='"+mob.getColor()+"' where mobid="+mob.getMobid();
		int n = jt.update(sql);
		if(n>0)
			System.out.println(">>>MobilePhone Updated!");

	}

	@Override
	public void deleteMob(int mobid) {
		String sql = "delete from Mobile where mobid="+mobid;
		int n = jt.update(sql);
		if(n>0)
			System.out.println(">>>MobilePhone Deleted!");
		else
			System.out.println(">>>No matching Phone record for deletion");

	}

	@Override
	public List<MobilePhone> getMobilePhones() {
		String sql="select * from Mobile";
		
		List<co.edureka.MobilePhone> l = jt.query(sql, new ResultSetExtractor<java.util.List<MobilePhone>>(){
			public List<MobilePhone> extractData(ResultSet rs) throws SQLException,DataAccessException{
				List<MobilePhone> list = new ArrayList<MobilePhone>();
				while(rs.next()) {
					MobilePhone mb = new MobilePhone();
					mb.setMobid(rs.getInt(1));
					mb.setManufacturer(rs.getString(2));
					mb.setMname(rs.getString(3));
					mb.setPrice(rs.getFloat(4));
					mb.setColor(rs.getString(5));
					list.add(mb);
				}
				return list;
			}
		});
		return l;
	}

}
