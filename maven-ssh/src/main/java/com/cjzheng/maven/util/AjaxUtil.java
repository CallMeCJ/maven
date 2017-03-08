package com.cjzheng.maven.util;

import java.io.IOException;
import org.apache.struts2.ServletActionContext;
import com.alibaba.fastjson.JSON;

/**
 * 
 * @Description: TODO
 * @author: zhengchaojie
 * @date 2017年3月8日 上午10:30:19
 *
 */

public class AjaxUtil {

	// ajax返回text
	public static void ajaxResponse(String text) {
		try {
			ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
			ServletActionContext.getResponse().getWriter().write(text);
			ServletActionContext.getResponse().getWriter().flush();
			ServletActionContext.getResponse().getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ajaxJSON返回
	public static void ajaxJSONResponse(Object object) {
		try {
			String json = JSON.toJSONStringWithDateFormat(object, "yyyy-MM-dd HH:mm:ss");
			ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
			ServletActionContext.getResponse().getWriter().write(json);
			ServletActionContext.getResponse().getWriter().flush();
			ServletActionContext.getResponse().getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}