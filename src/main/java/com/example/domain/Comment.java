package com.example.domain;


/**
 * コメントを表すドメインクラス.
 * 
 * @author kojiro0706
 *
 */
public class Comment {

	/** ID */
	private Integer id;
	/** 名前 */
	private String name;
	/** コンテント */
	private String content;
	/** 記事ID */
	private Integer articledID;

	public Comment() {

	}

	public Comment(Integer id, String name, String content, Integer articledID) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
		this.articledID = articledID;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getArticledID() {
		return articledID;
	}

	public void setArticledID(Integer articledID) {
		this.articledID = articledID;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", name=" + name + ", content=" + content + ", articledID=" + articledID + "]";
	}

	
}
