package com.util;

import java.util.UUID;

/**
 * @author little
 *��������ַ����Ĺ�����
 */
public class UUIDUtil {
	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
