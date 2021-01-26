package io.bf2fc6cc711aee1a0c2a.spi;

import io.bf2fc6cc711aee1a0c2a.spi.model.Tenant;
import io.bf2fc6cc711aee1a0c2a.spi.model.TenantManager;
import io.bf2fc6cc711aee1a0c2a.spi.model.TenantRequest;

import java.util.List;

public interface TenantManagerClient {

    Tenant createTenant(TenantManager tm, TenantRequest tenantRequest);

    List<Tenant> getAllTenants(TenantManager tm);

    void deleteTenant(TenantManager tm, String tenantId);

    /////

    boolean pingTenantManager(TenantManager tm);

    boolean pingTenant(TenantManager tm, String tenantId);
}
