//201802104058潘英祖
package com.example.demo.Service;
import com.example.demo.dao.SchoolDao;
import com.example.demo.domain.Department;
import com.example.demo.domain.School;

import java.sql.SQLException;
import java.util.Collection;

public final class SchoolService {
	private static SchoolDao schoolDao= SchoolDao.getInstance();
	private static SchoolService schoolService=new SchoolService();
	
	
	public static SchoolService getInstance(){
		return schoolService;
	}

	public Collection<School> findAll() throws SQLException {
		return schoolDao.findAll();
	}
	
	public School find(Integer id) throws SQLException {
		return schoolDao.find(id);
	}

	public boolean update(School school) throws SQLException, ClassNotFoundException {
		return schoolDao.update(school);
	}
	
	public boolean add(School school) throws SQLException {
		return schoolDao.add(school);
	}

	public Boolean delete(Integer id) throws SQLException {
		School school = this.find(id);
		return this.delete(school);
	}

	public Boolean delete(School school) throws SQLException {
		return schoolDao.delete(school);
	}
}
