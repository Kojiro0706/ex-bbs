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
	private Integer articledId;

	public Comment() {

	}

	public Comment(Integer id, String name, String content, Integer articledID) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
		this.articledId = articledID;
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

	public Integer getArticledId() {
		return articledId;
	}

	public void setArticledId(Integer articledId) {
		this.articledId = articledId;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", name=" + name + ", content=" + content + ", articledId=" + articledId + "]";
	}

}
