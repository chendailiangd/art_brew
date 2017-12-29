package com.util;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/*
 * �ʼ����͵Ĺ�����
 */
public class MailUtil {
	public static void sendMail(String to,String code){
		/**
		 * 1.���һ��Session����.
		 * 2.����һ�������ʼ��Ķ���Message.
		 * 3.�����ʼ�Transport
		 */
		// 1.������Ӷ���
		Properties props = new Properties();
		props.setProperty("mail.host", "localhost");
		Session session = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("service@shop.com", "123456");
			}
		});
		// 2.�����ʼ�����:
		Message message = new MimeMessage(session);
		// ���÷�����:
		try {
			message.setFrom(new InternetAddress("service@shop.com"));
			// �����ռ���:
			message.addRecipient(RecipientType.TO, new InternetAddress(to));
			// ���� CC   ����BCC
			// ���ñ���
			message.setSubject("������������ٷ������ʼ�");
			// �����ʼ�����:
			message.setContent("<h1>��������ٷ������ʼ�!������������ɼ������!</h1><h3><a href='http://192.168.2.127:8080/art/active.do?code="
			+code+"'>http://192.168.2.127:8080/art/active.do?code="+code+"</a></h3>", 
					"text/html;charset=UTF-8");
			// 3.�����ʼ�:
			Transport.send(message);
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		sendMail("aaa@shop.com","484654498");
	}
	

}