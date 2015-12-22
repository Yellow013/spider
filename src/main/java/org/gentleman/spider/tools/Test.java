package org.gentleman.spider.tools;
//package com.cyanspring.adaptor.cstock.avro;
//
//import javax.jms.JMSException;
//
//import org.apache.activemq.ActiveMQConnection;
//
//import com.cyanspring.avro.AvroRequestSerializableObject;
//import com.cyanspring.avro.AvroSerialization;
//import com.cyanspring.avro.request.Request;
//import com.cyanspring.avro.types.wrap.WrapAvroRequestType;
//
//public class Test {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) throws JMSException, Exception {
//
//		Request request1 = Request.newBuilder().setFunction(10)
//				.setSerial(10000013).setExchangeAccount("20000056").build();
//		Request request2 = Request.newBuilder().setFunction(13)
//				.setSerial(10000025).setExchangeAccount("20000056").build();
//		Request request3 = Request.newBuilder().setFunction(15)
//				.setSerial(10000087).setExchangeAccount("20000056").build();
//
//		// Serialize Code Start
//		AvroSerialization avroSerialization = new AvroSerialization();
//		byte[] orderByte1 = (byte[]) avroSerialization.serialize(new AvroRequestSerializableObject(
//				request1, WrapAvroRequestType.QueryCash));
//		byte[] orderByte2 = (byte[]) avroSerialization.serialize(new AvroRequestSerializableObject(
//				request2, WrapAvroRequestType.QueryCash));
//		byte[] orderByte3 = (byte[]) avroSerialization.serialize(new AvroRequestSerializableObject(
//				request3, WrapAvroRequestType.QueryCash));
//		// Serialize Code End
//
//		ConsumerTool consumer = new ConsumerTool();
//		ProducerTool producer = new ProducerTool();
//		System.out.println(ActiveMQConnection.DEFAULT_BROKER_URL
//				+ "------------");
//		// 开始监听
//		consumer.consumeMessage();
//
//		// 延时500毫秒之后发送消息
//		Thread.sleep(500);
//		producer.produceMessage(orderByte1);
//		producer.produceMessage(orderByte2);
//		producer.produceMessage(orderByte3);
//		producer.close();
//
//		// 延时500毫秒之后停止接受消息
//		Thread.sleep(500);
//		consumer.close();
//	}
//}