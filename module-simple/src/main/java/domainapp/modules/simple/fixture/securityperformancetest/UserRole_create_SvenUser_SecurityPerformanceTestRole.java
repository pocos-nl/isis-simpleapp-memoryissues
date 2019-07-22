package domainapp.modules.simple.fixture.securityperformancetest;

import org.isisaddons.module.security.seed.scripts.IsisModuleSecurityAdminRoleAndPermissions;

public class UserRole_create_SvenUser_SecurityPerformanceTestRole extends AbstractUserRoleFixtureScript {
    public UserRole_create_SvenUser_SecurityPerformanceTestRole() {
        super(ApplicationUser_create_Sven.USER_NAME, "securityperformancetest");
    }
}
