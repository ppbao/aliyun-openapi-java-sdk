/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeDisksRequest extends RpcAcsRequest<DescribeDisksResponse> {
	
	public DescribeDisksRequest() {
		super("Ecs", "2014-05-26", "DescribeDisks", "ecs");
	}

	private Boolean enableAutomatedSnapshotPolicy;

	private Integer pageSize;

	private Boolean portable;

	private String zoneId;

	private String filter2Key;

	private Boolean deleteWithInstance;

	private Boolean deleteAutoSnapshot;

	private String tag5Value;

	private String tag3Key;

	private String filter2Value;

	private String resourceOwnerAccount;

	private String snapshotId;

	private String filter1Value;

	private String tag1Key;

	private String tag1Value;

	private String diskChargeType;

	private Long resourceOwnerId;

	private String tag4Value;

	private String ownerAccount;

	private String diskName;

	private String resourceGroupId;

	private String diskIds;

	private String status;

	private Integer pageNumber;

	private Long ownerId;

	private String tag5Key;

	private String lockReason;

	private String category;

	private String diskType;

	private Boolean enableAutoSnapshot;

	private String tag2Key;

	private String filter1Key;

	private String autoSnapshotPolicyId;

	private String tag3Value;

	private String instanceId;

	private String tag2Value;

	private String tag4Key;

	public Boolean getEnableAutomatedSnapshotPolicy() {
		return this.enableAutomatedSnapshotPolicy;
	}

	public void setEnableAutomatedSnapshotPolicy(Boolean enableAutomatedSnapshotPolicy) {
		this.enableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
		if(enableAutomatedSnapshotPolicy != null){
			putQueryParameter("EnableAutomatedSnapshotPolicy", enableAutomatedSnapshotPolicy.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Boolean getPortable() {
		return this.portable;
	}

	public void setPortable(Boolean portable) {
		this.portable = portable;
		if(portable != null){
			putQueryParameter("Portable", portable.toString());
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getFilter2Key() {
		return this.filter2Key;
	}

	public void setFilter2Key(String filter2Key) {
		this.filter2Key = filter2Key;
		if(filter2Key != null){
			putQueryParameter("Filter.2.Key", filter2Key);
		}
	}

	public Boolean getDeleteWithInstance() {
		return this.deleteWithInstance;
	}

	public void setDeleteWithInstance(Boolean deleteWithInstance) {
		this.deleteWithInstance = deleteWithInstance;
		if(deleteWithInstance != null){
			putQueryParameter("DeleteWithInstance", deleteWithInstance.toString());
		}
	}

	public Boolean getDeleteAutoSnapshot() {
		return this.deleteAutoSnapshot;
	}

	public void setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
		this.deleteAutoSnapshot = deleteAutoSnapshot;
		if(deleteAutoSnapshot != null){
			putQueryParameter("DeleteAutoSnapshot", deleteAutoSnapshot.toString());
		}
	}

	public String getTag5Value() {
		return this.tag5Value;
	}

	public void setTag5Value(String tag5Value) {
		this.tag5Value = tag5Value;
		if(tag5Value != null){
			putQueryParameter("Tag.5.Value", tag5Value);
		}
	}

	public String getTag3Key() {
		return this.tag3Key;
	}

	public void setTag3Key(String tag3Key) {
		this.tag3Key = tag3Key;
		if(tag3Key != null){
			putQueryParameter("Tag.3.Key", tag3Key);
		}
	}

	public String getFilter2Value() {
		return this.filter2Value;
	}

	public void setFilter2Value(String filter2Value) {
		this.filter2Value = filter2Value;
		if(filter2Value != null){
			putQueryParameter("Filter.2.Value", filter2Value);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
		if(snapshotId != null){
			putQueryParameter("SnapshotId", snapshotId);
		}
	}

	public String getFilter1Value() {
		return this.filter1Value;
	}

	public void setFilter1Value(String filter1Value) {
		this.filter1Value = filter1Value;
		if(filter1Value != null){
			putQueryParameter("Filter.1.Value", filter1Value);
		}
	}

	public String getTag1Key() {
		return this.tag1Key;
	}

	public void setTag1Key(String tag1Key) {
		this.tag1Key = tag1Key;
		if(tag1Key != null){
			putQueryParameter("Tag.1.Key", tag1Key);
		}
	}

	public String getTag1Value() {
		return this.tag1Value;
	}

	public void setTag1Value(String tag1Value) {
		this.tag1Value = tag1Value;
		if(tag1Value != null){
			putQueryParameter("Tag.1.Value", tag1Value);
		}
	}

	public String getDiskChargeType() {
		return this.diskChargeType;
	}

	public void setDiskChargeType(String diskChargeType) {
		this.diskChargeType = diskChargeType;
		if(diskChargeType != null){
			putQueryParameter("DiskChargeType", diskChargeType);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getTag4Value() {
		return this.tag4Value;
	}

	public void setTag4Value(String tag4Value) {
		this.tag4Value = tag4Value;
		if(tag4Value != null){
			putQueryParameter("Tag.4.Value", tag4Value);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getDiskName() {
		return this.diskName;
	}

	public void setDiskName(String diskName) {
		this.diskName = diskName;
		if(diskName != null){
			putQueryParameter("DiskName", diskName);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getDiskIds() {
		return this.diskIds;
	}

	public void setDiskIds(String diskIds) {
		this.diskIds = diskIds;
		if(diskIds != null){
			putQueryParameter("DiskIds", diskIds);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getTag5Key() {
		return this.tag5Key;
	}

	public void setTag5Key(String tag5Key) {
		this.tag5Key = tag5Key;
		if(tag5Key != null){
			putQueryParameter("Tag.5.Key", tag5Key);
		}
	}

	public String getLockReason() {
		return this.lockReason;
	}

	public void setLockReason(String lockReason) {
		this.lockReason = lockReason;
		if(lockReason != null){
			putQueryParameter("LockReason", lockReason);
		}
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category);
		}
	}

	public String getDiskType() {
		return this.diskType;
	}

	public void setDiskType(String diskType) {
		this.diskType = diskType;
		if(diskType != null){
			putQueryParameter("DiskType", diskType);
		}
	}

	public Boolean getEnableAutoSnapshot() {
		return this.enableAutoSnapshot;
	}

	public void setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
		this.enableAutoSnapshot = enableAutoSnapshot;
		if(enableAutoSnapshot != null){
			putQueryParameter("EnableAutoSnapshot", enableAutoSnapshot.toString());
		}
	}

	public String getTag2Key() {
		return this.tag2Key;
	}

	public void setTag2Key(String tag2Key) {
		this.tag2Key = tag2Key;
		if(tag2Key != null){
			putQueryParameter("Tag.2.Key", tag2Key);
		}
	}

	public String getFilter1Key() {
		return this.filter1Key;
	}

	public void setFilter1Key(String filter1Key) {
		this.filter1Key = filter1Key;
		if(filter1Key != null){
			putQueryParameter("Filter.1.Key", filter1Key);
		}
	}

	public String getAutoSnapshotPolicyId() {
		return this.autoSnapshotPolicyId;
	}

	public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
		this.autoSnapshotPolicyId = autoSnapshotPolicyId;
		if(autoSnapshotPolicyId != null){
			putQueryParameter("AutoSnapshotPolicyId", autoSnapshotPolicyId);
		}
	}

	public String getTag3Value() {
		return this.tag3Value;
	}

	public void setTag3Value(String tag3Value) {
		this.tag3Value = tag3Value;
		if(tag3Value != null){
			putQueryParameter("Tag.3.Value", tag3Value);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getTag2Value() {
		return this.tag2Value;
	}

	public void setTag2Value(String tag2Value) {
		this.tag2Value = tag2Value;
		if(tag2Value != null){
			putQueryParameter("Tag.2.Value", tag2Value);
		}
	}

	public String getTag4Key() {
		return this.tag4Key;
	}

	public void setTag4Key(String tag4Key) {
		this.tag4Key = tag4Key;
		if(tag4Key != null){
			putQueryParameter("Tag.4.Key", tag4Key);
		}
	}

	@Override
	public Class<DescribeDisksResponse> getResponseClass() {
		return DescribeDisksResponse.class;
	}

}
