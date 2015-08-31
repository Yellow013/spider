package org.opensource.spider.tools;
//package com.cyanspring.adaptor.cstock.avro;
//
////ProducerTool.java用于发送消息：
//import javax.jms.BytesMessage;
//import javax.jms.Connection;
//import javax.jms.DeliveryMode;
//import javax.jms.Destination;
//import javax.jms.JMSException;
//import javax.jms.MessageProducer;
//import javax.jms.Session;
//
//import org.apache.activemq.ActiveMQConnection;
//import org.apache.activemq.ActiveMQConnectionFactory;
//
//public class ProducerTool {
//
//	private String user = ActiveMQConnection.DEFAULT_USER;
//	private String password = ActiveMQConnection.DEFAULT_PASSWORD;
//	private String url = ActiveMQConnection.DEFAULT_BROKER_URL;
//	private String subject = "TOOL.DEFAULT";
//	private Destination destination = null;
//	private Connection connection = null;
//	private Session session = null;
//	private MessageProducer producer = null;
//	
//	public ProducerTool() throws JMSException, Exception{
//		initialize();
//	}
//
//	// 初始化
//	private void initialize() throws JMSException, Exception {
//		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
//				user, password, url);
//		connection = connectionFactory.createConnection();
//		session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//		destination = session.createQueue(subject);
//		producer = session.createProducer(destination);
//		producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
//	}
//
//	// 发送消息
//	public void produceMessage(byte[] bytes) throws JMSException, Exception {
//		//initialize();
//		//TextMessage msg = session.createTextMessage(message);
//		BytesMessage byteMsg = session.createBytesMessage();
//		byteMsg.writeBytes(bytes);
//		connection.start();
//		//System.out.println("Producer:->Sending message: bytes length is" + byteMsg.getBodyLength());
//		producer.send(byteMsg);
//		System.out.println("Producer:->Message sent complete!");
//	}
//
//	// 关闭连接
//	public void close() throws JMSException {
//		System.out.println("Producer:->Closing connection");
//		if (producer != null)
//			producer.close();
//		if (session != null)
//			session.close();
//		if (connection != null)
//			connection.close();
//	}
//
//}