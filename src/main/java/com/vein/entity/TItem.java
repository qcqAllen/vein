package com.vein.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_item")
public class TItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "u_id")
    private String uId;

    private String link;

    private String title;

    private String summary;

    private Integer like;

    private Integer unlike;

    private Integer star;

    @Column(name = "dir_id")
    private Integer dirId;

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
     * @return u_id
     */
    public String getuId() {
        return uId;
    }

    /**
     * @param uId
     */
    public void setuId(String uId) {
        this.uId = uId;
    }

    /**
     * @return link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return like
     */
    public Integer getLike() {
        return like;
    }

    /**
     * @param like
     */
    public void setLike(Integer like) {
        this.like = like;
    }

    /**
     * @return unlike
     */
    public Integer getUnlike() {
        return unlike;
    }

    /**
     * @param unlike
     */
    public void setUnlike(Integer unlike) {
        this.unlike = unlike;
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
     * @return dir_id
     */
    public Integer getDirId() {
        return dirId;
    }

    /**
     * @param dirId
     */
    public void setDirId(Integer dirId) {
        this.dirId = dirId;
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