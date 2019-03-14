package vip.anjun.session.analysis.dao.factory;

import vip.anjun.session.analysis.dao.IAdBlacklistDAO;
import vip.anjun.session.analysis.dao.IAdClickTrendDAO;
import vip.anjun.session.analysis.dao.IAdProvinceTop3DAO;
import vip.anjun.session.analysis.dao.IAdStatDAO;
import vip.anjun.session.analysis.dao.IAdUserClickCountDAO;
import vip.anjun.session.analysis.dao.IAreaTop3ProductDAO;
import vip.anjun.session.analysis.dao.IPageSplitConvertRateDAO;
import vip.anjun.session.analysis.dao.ISessionAggrStatDAO;
import vip.anjun.session.analysis.dao.ISessionDetailDAO;
import vip.anjun.session.analysis.dao.ISessionRandomExtractDAO;
import vip.anjun.session.analysis.dao.ITaskDAO;
import vip.anjun.session.analysis.dao.ITop10CategoryDAO;
import vip.anjun.session.analysis.dao.ITop10SessionDAO;
import vip.anjun.session.analysis.dao.impl.AdBlacklistDAOImpl;
import vip.anjun.session.analysis.dao.impl.AdClickTrendDAOImpl;
import vip.anjun.session.analysis.dao.impl.AdProvinceTop3DAOImpl;
import vip.anjun.session.analysis.dao.impl.AdStatDAOImpl;
import vip.anjun.session.analysis.dao.impl.AdUserClickCountDAOImpl;
import vip.anjun.session.analysis.dao.impl.AreaTop3ProductDAOImpl;
import vip.anjun.session.analysis.dao.impl.PageSplitConvertRateDAOImpl;
import vip.anjun.session.analysis.dao.impl.SessionAggrStatDAOImpl;
import vip.anjun.session.analysis.dao.impl.SessionDetailDAOImpl;
import vip.anjun.session.analysis.dao.impl.SessionRandomExtractDAOImpl;
import vip.anjun.session.analysis.dao.impl.TaskDAOImpl;
import vip.anjun.session.analysis.dao.impl.Top10CategoryDAOImpl;
import vip.anjun.session.analysis.dao.impl.Top10SessionDAOImpl;

/**
 * DAO工厂类
 * @author Administrator
 *
 */
public class DAOFactory {


	public static ITaskDAO getTaskDAO() {
		return new TaskDAOImpl();
	}

	public static ISessionAggrStatDAO getSessionAggrStatDAO() {
		return new SessionAggrStatDAOImpl();
	}
	
	public static ISessionRandomExtractDAO getSessionRandomExtractDAO() {
		return new SessionRandomExtractDAOImpl();
	}
	
	public static ISessionDetailDAO getSessionDetailDAO() {
		return new SessionDetailDAOImpl();
	}
	
	public static ITop10CategoryDAO getTop10CategoryDAO() {
		return new Top10CategoryDAOImpl();
	}
	
	public static ITop10SessionDAO getTop10SessionDAO() {
		return new Top10SessionDAOImpl();
	}
	
	public static IPageSplitConvertRateDAO getPageSplitConvertRateDAO() {
		return new PageSplitConvertRateDAOImpl();
	}
	
	public static IAreaTop3ProductDAO getAreaTop3ProductDAO() {
		return new AreaTop3ProductDAOImpl();
	}
	
	public static IAdUserClickCountDAO getAdUserClickCountDAO() {
		return new AdUserClickCountDAOImpl();
	}
	
	public static IAdBlacklistDAO getAdBlacklistDAO() {
		return new AdBlacklistDAOImpl();
	}
	
	public static IAdStatDAO getAdStatDAO() {
		return new AdStatDAOImpl();
	}
	
	public static IAdProvinceTop3DAO getAdProvinceTop3DAO() {
		return new AdProvinceTop3DAOImpl();
	}
	
	public static IAdClickTrendDAO getAdClickTrendDAO() {
		return new AdClickTrendDAOImpl();
	}
	
}
