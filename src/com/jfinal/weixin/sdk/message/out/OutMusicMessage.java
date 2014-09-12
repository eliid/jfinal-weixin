/**
 * Copyright (c) 2011-2014, James Zhan 詹波 (jfinal@126.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */

package com.jfinal.weixin.sdk.message.out;

/**
	回复音乐消息
	<xml>
		<ToUserName><![CDATA[toUser]]></ToUserName>
		<FromUserName><![CDATA[fromUser]]></FromUserName>
		<CreateTime>12345678</CreateTime>
		<MsgType><![CDATA[music]]></MsgType>
			<Music>
				<Title><![CDATA[TITLE]]></Title>
				<Description><![CDATA[DESCRIPTION]]></Description>
				<MusicUrl><![CDATA[MUSIC_Url]]></MusicUrl>
				<HQMusicUrl><![CDATA[HQ_MUSIC_Url]]></HQMusicUrl>
				<ThumbMediaId><![CDATA[media_id]]></ThumbMediaId>
			</Music>
	</xml>
*/
public class OutMusicMessage extends OutMessage {
	
	public static final String TEMPLATE =
		"<xml>\n" +
			"<ToUserName><![CDATA[${toUser}]]></ToUserName>\n" +
			"<FromUserName><![CDATA[${fromUser}]]></FromUserName>\n" +
			"<CreateTime>${createTime}</CreateTime>\n" +
			"<MsgType><![CDATA[${msgType}]]></MsgType>\n" +
				"<Music>\n" +
					"<Title><![CDATA[${title}]]></Title>\n" +
					"<Description><![CDATA[${description}]]></Description>\n" +
					"<MusicUrl><![CDATA[${musicUrl}]]></MusicUrl>\n" +
					"<HQMusicUrl><![CDATA[${hQMusicUrl}]]></HQMusicUrl>\n" +
					"<ThumbMediaId><![CDATA[${thumbMediaId}]]></ThumbMediaId>\n" +
				"</Music>\n" +
		"</xml>";
			
	private String title;
	private String description;
	private String musicUrl;
	private String hQMusicUrl;
	private String thumbMediaId;
	
	public OutMusicMessage() {
		this.msgType = "music";
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
	
	public String getMusicUrl() {
		return musicUrl;
	}
	
	public void setMusicUrl(String musicUrl) {
		this.musicUrl = musicUrl;
	}
	
	public String gethQMusicUrl() {
		return hQMusicUrl;
	}
	
	public void sethQMusicUrl(String hQMusicUrl) {
		this.hQMusicUrl = hQMusicUrl;
	}
	
	public String getThumbMediaId() {
		return thumbMediaId;
	}
	
	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}
}





