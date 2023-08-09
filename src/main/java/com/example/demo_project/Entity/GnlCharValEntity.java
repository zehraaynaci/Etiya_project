package com.example.demo_project.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "gnl_char_val")
public class GnlCharValEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gnl_char_val_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "char_id")
    private GnlCharEntity charId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "st_id")
    private GnlStEntity stId;

    @Column(name = "descr")
    private String  descr;

    @Column(name = "name")
    private String name;

    @Column(name = "shrt_code")
    private String shrtCode;

    @Column(name = "default_selected")
    private boolean defaultSelected;

    @Column(name = "val")
    private String val;

    public Long getGnl_char_val_id() {
        return gnl_char_val_id;
    }

    public void setGnl_char_val_id(Long gnl_char_val_id) {
        this.gnl_char_val_id = gnl_char_val_id;
    }

    public GnlCharEntity getCharId() {
        return charId;
    }

    public void setCharId(GnlCharEntity charId) {
        this.charId = charId;
    }

    public GnlStEntity getStId() {
        return stId;
    }

    public void setStId(GnlStEntity stId) {
        this.stId = stId;
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

    public boolean isDefaultSelected() {
        return defaultSelected;
    }

    public void setDefaultSelected(boolean defaultSelected) {
        this.defaultSelected = defaultSelected;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
