package vip.anjun.session.analysis.test;

import vip.anjun.session.analysis.dao.ITaskDAO;
import vip.anjun.session.analysis.dao.factory.DAOFactory;
import vip.anjun.session.analysis.domain.Task;

/**
 * 任务管理DAO测试类
 * @author Administrator
 *
 */
public class TaskDAOTest {
	
	public static void main(String[] args) {
		ITaskDAO taskDAO = DAOFactory.getTaskDAO();
		Task task = taskDAO.findById(2);
		System.out.println(task.getTaskName());  
	}
	
}
