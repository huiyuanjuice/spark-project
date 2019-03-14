package vip.anjun.session.analysis.dao;

import java.util.List;

import vip.anjun.session.analysis.domain.AdStat;

/**
 * 广告实时统计DAO接口
 * @author Administrator
 *
 */
public interface IAdStatDAO {

	void updateBatch(List<AdStat> adStats);
	
}
