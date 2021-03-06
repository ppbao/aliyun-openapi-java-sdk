package com.aliyuncs.batchcompute.pojo.v20151111;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by guangchun.luo on 15/12/7.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Group {

    @JsonProperty("DesiredVMCount")
    private int desiredVMCount;

    @JsonProperty("ActualVMCount")
    private int actualVMCount;

    @JsonProperty("InstanceType")
    private String instanceType;


    @JsonProperty("ResourceType")
    private String resourceType = "OnDemand";


    @JsonProperty("Disks")
    private Disks disks;


    @JsonIgnore
    public Disks getDisks() {
        return disks;
    }
    @JsonIgnore
    public void setDisks(Disks disks) {
        this.disks = disks;
    }


    @JsonIgnore
    public int getDesiredVMCount() {
        return desiredVMCount;
    }

    @JsonIgnore
    public void setDesiredVMCount(int desiredVMCount) {
        this.desiredVMCount = desiredVMCount;
    }

    @JsonIgnore
    public int getActualVMCount() {
        return actualVMCount;
    }

    @JsonIgnore
    public void setActualVMCount(int actualVMCount) {
        this.actualVMCount = actualVMCount;
    }

    @JsonIgnore
    public String getInstanceType() {
        return instanceType;
    }

    @JsonIgnore
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    @JsonIgnore
    public String getResourceType() {
        return resourceType;
    }

    @JsonIgnore
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }


}
