package com.example.demo_project.Entity;

import jakarta.persistence.*;

//relations?
@Entity
@Table(name = "gnl_char")
public class GnlCharEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gnl_char_id;

    @Column(name = "descr")
    private String descr;

    @Column(name = "name")
    private String name;

    @Column(name = "shrt_code")
    private String shrtCode;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "st_id")
    private GnlStEntity stId;

    public Long getGnl_char_id() {
        return gnl_char_id;
    }

    public void setGnl_char_id(Long gnl_char_id) {
        this.gnl_char_id = gnl_char_id;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShrtCode() {
        return shrtCode;
    }

    public void setShrtCode(String shrtCode) {
        this.shrtCode = shrtCode;
    }

    public GnlStEntity getStId() {
        return stId;
    }

    public void setStId(GnlStEntity stId) {
        this.stId = stId;
    }
}
