package com.example.demo_project.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "prod_ofr_char_val")
public class ProdOfrCharValEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prodOfrCharValId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prod_ofr_id")
    private ProdOfrEntity prodOfrId;

    @Column(name = "name")
    private String name;
    @Column(name = "descr")
    private String descr;
    @Column(name = "val")
    private String val;
    @Column(name = "is_actv")
    private String is_actv;
    @ManyToOne()
    @JoinColumn(name = "st_id", referencedColumnName = "gnlStId")
    private GnlStEntity stId;

    @Column(name = "tp_id")
    private Long tpId;
    @Column(name = "shrt_code")
    private String shrtCode;


    public Long getProdOfrCharValId() {
        return prodOfrCharValId;
    }

    public void setProdOfrCharValId(Long prodOfrCharValId) {
        this.prodOfrCharValId = prodOfrCharValId;
    }

    public ProdOfrEntity getProdOfrId() {
        return prodOfrId;
    }

    public void setProdOfrId(ProdOfrEntity prodOfrId) {
        this.prodOfrId = prodOfrId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public String getIs_actv() {
        return is_actv;
    }

    public void setIs_actv(String is_actv) {
        this.is_actv = is_actv;
    }

    public GnlStEntity getStId() {
        return stId;
    }

    public void setStId(GnlStEntity stId) {
        this.stId = stId;
    }

    public Long getTpId() {
        return tpId;
    }

    public void setTpId(Long tpId) {
        this.tpId = tpId;
    }

    public String getShrtCode() {
        return shrtCode;
    }

    public void setShrtCode(String shrtCode) {
        this.shrtCode = shrtCode;
    }

}
