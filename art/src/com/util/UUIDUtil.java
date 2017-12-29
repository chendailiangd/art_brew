package com.util;

import java.util.UUID;

/**
 * @author little
 *生成随机字符串的工具类
 */
public class UUIDUtil {
	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
