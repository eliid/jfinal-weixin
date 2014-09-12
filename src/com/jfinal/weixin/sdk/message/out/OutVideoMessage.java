/**
 * Copyright (c) 2011-2014, James Zhan 詹波 (jfinal@126.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */

package com.jfinal.weixin.sdk.message.out;

/**
	回复视频消息
	<xml>
		<ToUserName><![CDATA[toUser]]></ToUserName>
		<FromUserName><![CDATA[fromUser]]></FromUserName>
		<CreateTime>12345678</CreateTime>
		<MsgType><![CDATA[video]]></MsgType>
			<Video>
				<MediaId><![CDATA[media_id]]></MediaId>
				<Title><![CDATA[title]]></Title>
				<Description><![CDATA[description]]></Description>
			</Video>
	</xml>
 */
public class OutVideoMessage extends OutMessage {
	public static final String TEMPLATE =
			"<xml>\n" +
			"<ToUserName><![CDATA[${toUser}]]></ToUserName>\n" +
			"<FromUserName><![CDATA[${fromUser}]]></FromUserName>\n" +
			"<CreateTime>${createTime}</CreateTime>\n" +
			"<MsgType><![CDATA[${msgType}]]></MsgType>\n" +
				"<Video>\n" +
					"<MediaId><![CDATA[${mediaId}]]></MediaId>\n" +
					"<Title><![CDATA[${title}]]></Title>\n" +
					"<Description><![CDATA[${description}]]></Description>\n" +
				"</Video>\n" +
			"</xml>";
	
	private String mediaId;
	private String title;
	private String description;
	
	public OutVideoMessage() {
		this.msgType = "video";
	}
	
	public String getMediaId() {
		return mediaId;
	}
	
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}






