package mybatis.bean;

import java.util.Date;

public class Area {
    private int areaId;

    private String areaName;

    private int proripoty;

    private Date cteateDate;

    private Date lastEditDate;

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public int getProripoty() {
        return proripoty;
    }

    public void setProripoty(int proripoty) {
        this.proripoty = proripoty;
    }

    public Date getCteateDate() {
        return cteateDate;
    }

    public void setCteateDate(Date cteateDate) {
        this.cteateDate = cteateDate;
    }

    public Date getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(Date lastEditDate) {
        this.lastEditDate = lastEditDate;
    }
}
