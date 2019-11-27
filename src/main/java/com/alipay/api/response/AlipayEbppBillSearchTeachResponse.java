package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QueryInstBillInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.bill.search.teach response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayEbppBillSearchTeachResponse extends AlipayResponse {

	private static final long serialVersionUID = 5714823551633878199L;

	/** 
	 * 1
	 */
	@ApiField("cachekey")
	private String cachekey;

	/** 
	 * 1
	 */
	@ApiListField("inst_bill_info_list")
	@ApiField("query_inst_bill_info")
	private List<QueryInstBillInfo> instBillInfoList;

	public void setCachekey(String cachekey) {
		this.cachekey = cachekey;
	}
	public String getCachekey( ) {
		return this.cachekey;
	}

	public void setInstBillInfoList(List<QueryInstBillInfo> instBillInfoList) {
		this.instBillInfoList = instBillInfoList;
	}
	public List<QueryInstBillInfo> getInstBillInfoList( ) {
		return this.instBillInfoList;
	}

}