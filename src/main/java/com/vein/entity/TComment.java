package com.vein.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_comment")
public class TComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 资源id
     */
    @Column(name = "item_id")
    private String itemId;

    /**
     * 评论内容
     */
    private String content;

    @Column(name = "from_user_id")
    private String fromUserId;

    @Column(name = "from_user_name")
    private String fromUserName;

    private Integer star;

    private Integer liked;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取资源id
     *
     * @return item_id - 资源id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置资源id
     *
     * @param itemId 资源id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取评论内容
     *
     * @return content - 评论内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置评论内容
     *
     * @param content 评论内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return from_user_id
     */
    public String getFromUserId() {
        return fromUserId;
    }

    /**
     * @param fromUserId
     */
    public void setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
    }

    /**
     * @return from_user_name
     */
    public String getFromUserName() {
        return fromUserName;
    }

    /**
     * @param fromUserName
     */
    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    /**
     * @return star
     */
    public Integer getStar() {
        return star;
    }

    /**
     * @param star
     */
    public void setStar(Integer star) {
        this.star = star;
    }

    /**
     * @return liked
     */
    public Integer getLiked() {
        return liked;
    }

    /**
     * @param liked
     */
    public void setLiked(Integer liked) {
        this.liked = liked;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}