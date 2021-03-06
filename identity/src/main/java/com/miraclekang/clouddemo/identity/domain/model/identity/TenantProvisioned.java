package com.miraclekang.clouddemo.identity.domain.model.identity;

import com.miraclekang.clouddemo.infrastructure.domain.DomainEvent;
import lombok.Getter;

@Getter
public class TenantProvisioned extends DomainEvent {

    private TenantId tenantId;
    private String tenantName;

    public TenantProvisioned(TenantId tenantId, String tenantName) {
        this.tenantId = tenantId;
        this.tenantName = tenantName;
    }
}
