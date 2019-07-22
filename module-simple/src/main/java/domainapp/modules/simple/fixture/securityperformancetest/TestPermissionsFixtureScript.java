package domainapp.modules.simple.fixture.securityperformancetest;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import domainapp.modules.simple.dom.securityperformancetest.SecurityPerformanceTestObject;
import org.apache.isis.applib.fixturescripts.FixtureScript;
import org.apache.isis.core.metamodel.services.appfeat.ApplicationFeatureType;
import org.isisaddons.module.security.dom.permission.ApplicationPermissionMode;
import org.isisaddons.module.security.dom.permission.ApplicationPermissionRepository;
import org.isisaddons.module.security.dom.permission.ApplicationPermissionRule;
import org.isisaddons.module.security.dom.role.ApplicationRole;
import org.isisaddons.module.security.dom.role.ApplicationRoleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.Arrays;

/**
 * This is to revoke permissions for users with Role, 'ROLE_VIEWER', for Reseller viewer
 *
 * @author "smitha <s.neeliagari@pocos.nl>"
 */
public class TestPermissionsFixtureScript extends FixtureScript {

    static final Logger log = LoggerFactory.getLogger(TestPermissionsFixtureScript.class);

    public TestPermissionsFixtureScript() {

    }

    private final String roleName = "securityperformancetest";
    private final String roleDescription = "Test";

    @Override
    protected void execute(final ExecutionContext executionContext) {
        String scriptName = getClass().getSimpleName();
        try {
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop0");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop1");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop2");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop3");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop4");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop5");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop6");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop7");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop8");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop9");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop10");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop11");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop12");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop13");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop14");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop15");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop16");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop17");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop18");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop19");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop20");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop21");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop22");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop23");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop24");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop25");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop26");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop27");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop28");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop29");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop30");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop31");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop32");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop33");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop34");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop35");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop36");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop37");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop38");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop39");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop40");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop41");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop42");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop43");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop44");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop45");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop46");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop47");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop48");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop49");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop50");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop51");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop52");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop53");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop54");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop55");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop56");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop57");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop58");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop59");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop60");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop61");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop62");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop63");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop64");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop65");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop66");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop67");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop68");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop69");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop70");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop71");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop72");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop73");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop74");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop75");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop76");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop77");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop78");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop79");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop80");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop81");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop82");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop83");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop84");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop85");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop86");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop87");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop88");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop89");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop90");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop91");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop92");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop93");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop94");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop95");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop96");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop97");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop98");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop99");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop100");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop101");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop102");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop103");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop104");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop105");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop106");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop107");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop108");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop109");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop110");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop111");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop112");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop113");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop114");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop115");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop116");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop117");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop118");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop119");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop120");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop121");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop122");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop123");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop124");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop125");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop126");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop127");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop128");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop129");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop130");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop131");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop132");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop133");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop134");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop135");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop136");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop137");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop138");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop139");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop140");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop141");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop142");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop143");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop144");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop145");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop146");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop147");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop148");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop149");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop150");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop151");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop152");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop153");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop154");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop155");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop156");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop157");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop158");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop159");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop160");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop161");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop162");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop163");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop164");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop165");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop166");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop167");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop168");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop169");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop170");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop171");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop172");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop173");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop174");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop175");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop176");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop177");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop178");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop179");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop180");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop181");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop182");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop183");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop184");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop185");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop186");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop187");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop188");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop189");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop190");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop191");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop192");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop193");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop194");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop195");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop196");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop197");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop198");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop199");
            newMemberPermissions(ApplicationPermissionRule.VETO, ApplicationPermissionMode.VIEWING, SecurityPerformanceTestObject.class, "prop200");
        } catch (Exception ex) {
            log.error("Error while executing post release script `" + scriptName + "`", ex);
        }
    }

    //region > newPackagePermissions, newClassPermissions, newMemberPermissions

    /**
     * For subclasses to call in {@link #execute(ExecutionContext)}.
     */
    protected void newPackagePermissions(
            final ApplicationPermissionRule rule,
            final ApplicationPermissionMode mode,
            final String... featureFqns) {

        newPermissions(rule, mode, ApplicationFeatureType.PACKAGE, Arrays.asList(featureFqns));
    }

    /**
     * For subclasses to call in {@link #execute(ExecutionContext)}.
     */
    protected void newClassPermissions(
            final ApplicationPermissionRule rule,
            final ApplicationPermissionMode mode,
            final Class... classes) {

        newPermissions(rule, mode, ApplicationFeatureType.CLASS, asFeatureFqns(classes));
    }


    /**
     * For subclasses to call in {@link #execute(ExecutionContext)}.
     */
    protected void newMemberPermissions(
            final ApplicationPermissionRule rule,
            final ApplicationPermissionMode mode,
            final Class cls,
            final String... members) {
        newPermissions(rule, mode, ApplicationFeatureType.MEMBER, asFeatureFqns(cls, members));
    }

    //endregion


    //region > helpers

    private void newPermissions(
            final ApplicationPermissionRule rule,
            final ApplicationPermissionMode mode,
            final ApplicationFeatureType featureType,
            final Iterable<String> featureFqns) {

        if(featureFqns == null) {
            return;
        }

        ApplicationRole securityRole = applicationRoleRepository.findByName(roleName);
        if(securityRole == null) {
            securityRole = applicationRoleRepository.newRole(roleName, roleDescription);
        }
        for (String featureFqn : featureFqns) {
            // can't use role#addPackage because that does a check for existence of the package, which is
            // not guaranteed to exist yet (the SecurityFeatures#init() may not have run).
            applicationPermissionRepository.newPermissionNoCheck(
                    securityRole,
                    rule,
                    mode,
                    featureType, featureFqn);
        }
    }

    private static Iterable<String> asFeatureFqns(Class<?>[] classes) {
        return Iterables.transform(Arrays.asList(classes), new Function<Class<?>, String>(){
            @Override
            public String apply(Class<?> input) {
                return input.getName();
            }
        });
    }

    private static Iterable<String> asFeatureFqns(final Class cls, final String[] members) {
        return Iterables.transform(Arrays.asList(members), new Function<String,String>(){
            @Override
            public String apply(String memberName) {
                final StringBuilder buf = new StringBuilder(cls.getName());
                if(!memberName.startsWith("#")) {
                    buf.append("#");
                }
                buf.append(memberName);
                return buf.toString();
            }
        });
    }


    //endregion

    //region  >  (injected)
    @Inject
    ApplicationRoleRepository applicationRoleRepository;
    @Inject
    ApplicationPermissionRepository applicationPermissionRepository;
    //endregion
}
