package org.ehais.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.ehais.common.Constants;
import org.ehais.mapper.EHaiAdMapper;
import org.ehais.mapper.EHaiAdPositionMapper;
import org.ehais.model.BootStrapModel;
import org.ehais.model.EHaiAd;
import org.ehais.model.EHaiAdExample;
import org.ehais.model.EHaiAdPosition;
import org.ehais.model.EHaiAdPositionExample;
import org.ehais.service.EAdService;
import org.ehais.tools.ReturnObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//model里面对应的日期添加的 @DateTimeFormat( pattern = "yyyy-MM-dd" )


@Service("eAdService")
public class EAdServiceImpl  extends CommonServiceImpl implements EAdService{
	
	@Autowired
	private EHaiAdMapper eHaiAdMapper;
	@Autowired
	private EHaiAdPositionMapper eHaiAdPositionMapper;
	
	public ReturnObject<EHaiAd> ad_list(HttpServletRequest request) throws Exception{
		
		ReturnObject<EHaiAd> rm = new ReturnObject<EHaiAd>();
		Integer store_id = (Integer)request.getSession().getAttribute(Constants.SESSION_STORE_ID);
		
		rm.setCode(1);
		return rm;
	}

	public ReturnObject<EHaiAd> ad_list_json(HttpServletRequest request,Integer store_id,
			Integer page, Integer len) throws Exception {
		// TODO Auto-generated method stub
		ReturnObject<EHaiAd> rm = new ReturnObject<EHaiAd>();
		if(store_id == null) store_id = (Integer)request.getSession().getAttribute(Constants.SESSION_STORE_ID);
		Integer start = (page - 1 ) * len;
		
		EHaiAdExample example = new EHaiAdExample();
		EHaiAdExample.Criteria c = example.createCriteria();
		example.CriteriaStoreId(c, this.storeIdCriteriaObject(request));
		example.setStart(start);
		example.setLen(len);
		List<EHaiAd> list = eHaiAdMapper.hai_ad_list_by_example(example);
		Integer total = eHaiAdMapper.countByExample(example);
		rm.setCode(1);
		rm.setRows(list);
		rm.setTotal(total);
		
		
		return rm;
	}

	public ReturnObject<EHaiAd> ad_insert(HttpServletRequest request)
			throws Exception {
		// TODO Auto-generated method stub
		ReturnObject<EHaiAd> rm = new ReturnObject<EHaiAd>();	
		Integer store_id = (Integer)request.getSession().getAttribute(Constants.SESSION_STORE_ID);
		EHaiAd model = new EHaiAd();
		rm.setBootStrapList(this.formatBootStrapList(request,model));
		rm.setCode(1);
		return rm;
	}
	
	public ReturnObject<EHaiAd> ad_insert_submit(HttpServletRequest request,EHaiAd model)
			throws Exception {
		// TODO Auto-generated method stub
		ReturnObject<EHaiAd> rm = new ReturnObject<EHaiAd>();

		if(model.getAdName() == null || model.getAdName().equals("")){
			rm.setMsg("必填项不能为空");
			return rm;
		}


		Integer store_id = (Integer)request.getSession().getAttribute(Constants.SESSION_STORE_ID);
		model.setStoreId(store_id);

		EHaiAdExample example = new EHaiAdExample();
		EHaiAdExample.Criteria c = example.createCriteria();
		c.andAdNameEqualTo(model.getAdName());
		c.andStoreIdEqualTo(store_id);
		int count = eHaiAdMapper.countByExample(example);
		if(count > 0){
			rm.setMsg("存在相同的记录");
			return rm;
		}


		int code = eHaiAdMapper.insertSelective(model);
		rm.setCode(code);
		rm.setMsg("添加成功");
		return rm;
	}

	public ReturnObject<EHaiAd> ad_update(HttpServletRequest request,Integer adId)
			throws Exception {
		// TODO Auto-generated method stub
		ReturnObject<EHaiAd> rm = new ReturnObject<EHaiAd>();
		Integer store_id = (Integer)request.getSession().getAttribute(Constants.SESSION_STORE_ID);
		EHaiAd model = eHaiAdMapper.selectByPrimaryKey(Short.valueOf(adId+""));
		rm.setBootStrapList(this.formatBootStrapList(request,model));
		
		rm.setCode(1);
		rm.setModel(model);
		return rm;
	}
	
	public ReturnObject<EHaiAd> ad_update_submit(HttpServletRequest request,EHaiAd model)
			throws Exception {
		// TODO Auto-generated method stub
		ReturnObject<EHaiAd> rm = new ReturnObject<EHaiAd>();
		Integer store_id = (Integer)request.getSession().getAttribute(Constants.SESSION_STORE_ID);
		EHaiAdExample example = new EHaiAdExample();
		EHaiAdExample.Criteria c = example.createCriteria();
		
		example.CriteriaStoreId(c, this.storeIdCriteriaObject(request));
		c.andAdIdEqualTo(model.getAdId());
		c.andStoreIdEqualTo(store_id);

		int count = eHaiAdMapper.countByExample(example);
		if(count == 0){
			rm.setMsg("记录不存在");
			return rm;
		}

		int code = eHaiAdMapper.updateByExampleSelective(model, example);
		rm.setCode(code);
		rm.setMsg("编辑成功");
		return rm;
	}

	public ReturnObject<EHaiAd> ad_find(HttpServletRequest request,Integer adId)
			throws Exception {
		// TODO Auto-generated method stub
		ReturnObject<EHaiAd> rm = new ReturnObject<EHaiAd>();
		Integer store_id = (Integer)request.getSession().getAttribute(Constants.SESSION_STORE_ID);
		
		EHaiAd model = eHaiAdMapper.selectByPrimaryKey(Short.valueOf(adId+""));
		rm.setBootStrapList(this.formatBootStrapList(request,model));
		
		rm.setCode(1);
		rm.setModel(model);
		return rm;
	}

	public ReturnObject<EHaiAd> ad_delete(HttpServletRequest request,Integer adId)
			throws Exception {
		// TODO Auto-generated method stub
		ReturnObject<EHaiAd> rm = new ReturnObject<EHaiAd>();
		Integer store_id = (Integer)request.getSession().getAttribute(Constants.SESSION_STORE_ID);
		EHaiAdExample example = new EHaiAdExample();
		EHaiAdExample.Criteria c = example.createCriteria();
		example.CriteriaStoreId(c, this.storeIdCriteriaObject(request));
		c.andAdIdEqualTo(Short.valueOf(adId+""));
		int code = eHaiAdMapper.deleteByExample(example);
		rm.setCode(code);
		rm.setMsg("删除成功");
		return rm;
	}
	
	private Map<String, String> positionMap(HttpServletRequest request){
		EHaiAdPositionExample example = new EHaiAdPositionExample();
		EHaiAdPositionExample.Criteria c = example.createCriteria();
		example.CriteriaStoreId(c, this.storeIdCriteriaObject(request));
		Map<String, String> map = new HashMap<String, String>();
		List<EHaiAdPosition> list = eHaiAdPositionMapper.hai_ad_position_list_by_example(example);
		
		for (EHaiAdPosition eHaiAdPosition : list) {
			map.put(eHaiAdPosition.getPositionId().toString(), eHaiAdPosition.getPositionName());
		}
		
		
		return map;
	}
	
	private List<BootStrapModel> formatBootStrapList(HttpServletRequest request,EHaiAd model){
		
		List<BootStrapModel> bootStrapList = new ArrayList<BootStrapModel>();

		bootStrapList.add(new BootStrapModel("hidden", "adId", "", model.getAdId(), "请输入", "", "", null, 0));
		bootStrapList.add(new BootStrapModel("select", "positionId", "位置", model.getPositionId(), "请输入", "", "", this.positionMap(request), 0));
//		bootStrapList.add(new BootStrapModel("checkbox", "mediaType", "", model.getMediaType(), "请输入", "", "", null, 0));
		bootStrapList.add(new BootStrapModel("text", "adName", "名称", model.getAdName(), "请输入广告名称", "", "", null, 0));
		bootStrapList.add(new BootStrapModel("text", "adLink", "链接", model.getAdLink(), "请输入广告链接", "", "", null, 0));
		bootStrapList.add(new BootStrapModel("images", "adCode", "图片", model.getAdCode(), "请输入选择", "", "", null, 0));
//		bootStrapList.add(new BootStrapModel("text", "linkMan", "", model.getLinkMan(), "请输入", "", "", null, 0));
//		bootStrapList.add(new BootStrapModel("text", "linkEmail", "", model.getLinkEmail(), "请输入", "", "", null, 0));
//		bootStrapList.add(new BootStrapModel("text", "linkPhone", "", model.getLinkPhone(), "请输入", "", "", null, 0));
//		bootStrapList.add(new BootStrapModel("checkbox", "clickCount", "", model.getClickCount(), "请输入", "", "", null, 0));
//		bootStrapList.add(new BootStrapModel("select_format", "enabled", "", model.getEnabled(), "请输入", "", "", null, 0));
//		bootStrapList.add(new BootStrapModel("checkbox", "storeId", "", model.getStoreId(), "请输入", "", "", null, 0));
//		bootStrapList.add(new BootStrapModel("datepicker", "startTime", "", model.getStartTime(), "请输入", "", "", null, 0));
//		bootStrapList.add(new BootStrapModel("datepicker", "endTime", "", model.getEndTime(), "请输入", "", "", null, 0));
//		bootStrapList.add(new BootStrapModel("checkbox", "navId", "", model.getNavId(), "请输入", "", "", null, 0));
//		bootStrapList.add(new BootStrapModel("checkbox", "sort", "", model.getSort(), "请输入", "", "", null, 0));
//		bootStrapList.add(new BootStrapModel("checkbox", "isMobile", "", model.getIsMobile(), "请输入", "", "", null, 0));
		
		
		return bootStrapList;
	}
	
}











