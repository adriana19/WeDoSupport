package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Eid;
import utils.DbUtility;


public class EidServiceImpl implements EidService{

	private Connection connection;
	
	public EidServiceImpl(){
		 connection = DbUtility.getConnection();
		 System.out.println("connection?? " + connection);
	}
	

	@Override
	public List<Eid> getAllEids() {

		PreparedStatement ps;
		List<Eid> eids = new ArrayList<Eid>();
		try {
			String sqlQuery = "select key, name, eid, package, TO_CHAR(start_date, 'DD-MM-YYYY') start_date, "
					+ "TO_CHAR(end_date, 'DD-MM-YYYY') end_date, status from EIDTEST";
			ps = connection.prepareStatement(sqlQuery);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Eid eid = new Eid();
				eid.setKey(rs.getString("key"));
				eid.setName(rs.getString("name"));
				eid.setEid(rs.getString("eid"));
				eid.setProductPackage(rs.getString("package"));
				eid.setStartDate(rs.getString("start_date"));
				eid.setEndDate(rs.getString("end_date"));
				eid.setStatus(rs.getString("status"));	
				
				eids.add(eid);
			}
			rs.close();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return eids;
	}

}
