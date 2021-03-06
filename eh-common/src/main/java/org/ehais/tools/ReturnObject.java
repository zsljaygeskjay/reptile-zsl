package org.ehais.tools;

import java.util.List;
import java.util.Map;

import org.ehais.model.BootStrapModel;
import org.ehais.model.ExtendsField.ExtendsFieldsTabs;
import org.ehais.model.ExtendsField.ExtendsFieldsXml;

public class ReturnObject<T> {
	private Integer code;//返回值,1:成功,非1则异常，参考异常码附件
	private String msg;//返回的值
	private Map<String, Object> map;
	private List<T> rows;//兼容easyui datagirl
	private T model;
	private Integer total;//兼容easyui的总记录数
	private List<ExtendsFieldsTabs> extendsFieldsTabs;//带tab的自动列表
	private List<BootStrapModel> bootStrapList;
	private String action;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public T getModel() {
		return model;
	}
	public void setModel(T model) {
		this.model = model;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<BootStrapModel> getBootStrapList() {
		return bootStrapList;
	}
	public void setBootStrapList(List<BootStrapModel> bootStrapList) {
		this.bootStrapList = bootStrapList;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public List<ExtendsFieldsTabs> getExtendsFieldsTabs() {
		return extendsFieldsTabs;
	}
	public void setExtendsFieldsTabs(List<ExtendsFieldsTabs> extendsFieldsTabs) {
		this.extendsFieldsTabs = extendsFieldsTabs;
	}
	
	
	
	
}