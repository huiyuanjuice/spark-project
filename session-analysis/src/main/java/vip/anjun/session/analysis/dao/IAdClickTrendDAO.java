package vip.anjun.session.analysis.dao;

import java.util.List;

import vip.anjun.session.analysis.domain.AdClickTrend;

/**
 * 广告点击趋势DAO接口
 * @author Administrator
 *
 */
public interface IAdClickTrendDAO {

	void updateBatch(List<AdClickTrend> adClickTrends);
	
}
