/*
 *  Copyright 2014 Dan Haywood
 *
 *  Licensed under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package domainapp.modules.simple.dom.securityperformancetest;

import lombok.Getter;
import lombok.Setter;
import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.BookmarkPolicy;
import org.apache.isis.applib.annotation.DomainObject;
import org.apache.isis.applib.annotation.DomainObjectLayout;
import org.apache.isis.applib.annotation.Title;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.VersionStrategy;

@javax.jdo.annotations.PersistenceCapable(identityType=IdentityType.DATASTORE)
@javax.jdo.annotations.DatastoreIdentity(
        strategy=javax.jdo.annotations.IdGeneratorStrategy.IDENTITY,
         column="id")
@javax.jdo.annotations.Version(
        strategy=VersionStrategy.VERSION_NUMBER, 
        column="version")
@DomainObject(
        objectType = "SecurityPerformanceTestObject"
)
@DomainObjectLayout(
        bookmarking = BookmarkPolicy.AS_ROOT
)
public class SecurityPerformanceTestObject {

    //region > name (property)
    @Getter
    @Setter
    @Column(allowsNull = "false")
    @Title(sequence = "1")
    private String name;
    //endregion

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop0;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop1;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop2;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop3;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop4;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop5;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop6;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop7;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop8;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop9;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop10;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop11;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop12;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop13;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop14;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop15;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop16;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop17;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop18;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop19;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop20;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop21;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop22;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop23;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop24;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop25;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop26;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop27;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop28;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop29;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop30;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop31;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop32;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop33;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop34;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop35;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop36;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop37;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop38;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop39;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop40;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop41;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop42;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop43;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop44;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop45;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop46;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop47;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop48;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop49;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop50;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop51;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop52;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop53;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop54;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop55;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop56;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop57;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop58;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop59;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop60;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop61;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop62;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop63;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop64;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop65;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop66;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop67;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop68;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop69;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop70;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop71;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop72;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop73;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop74;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop75;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop76;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop77;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop78;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop79;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop80;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop81;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop82;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop83;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop84;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop85;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop86;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop87;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop88;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop89;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop90;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop91;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop92;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop93;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop94;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop95;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop96;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop97;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop98;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop99;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop100;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop101;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop102;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop103;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop104;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop105;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop106;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop107;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop108;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop109;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop110;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop111;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop112;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop113;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop114;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop115;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop116;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop117;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop118;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop119;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop120;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop121;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop122;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop123;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop124;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop125;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop126;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop127;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop128;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop129;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop130;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop131;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop132;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop133;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop134;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop135;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop136;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop137;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop138;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop139;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop140;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop141;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop142;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop143;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop144;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop145;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop146;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop147;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop148;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop149;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop150;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop151;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop152;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop153;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop154;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop155;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop156;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop157;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop158;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop159;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop160;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop161;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop162;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop163;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop164;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop165;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop166;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop167;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop168;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop169;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop170;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop171;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop172;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop173;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop174;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop175;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop176;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop177;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop178;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop179;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop180;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop181;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop182;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop183;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop184;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop185;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop186;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop187;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop188;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop189;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop190;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop191;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop192;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop193;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop194;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop195;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop196;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop197;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop198;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop199;

    @Getter
    @Setter
    @Column(allowsNull = "true")
    private String prop200;

    //region > injected services

    @javax.inject.Inject
    @SuppressWarnings("unused")
    private DomainObjectContainer container;

    //endregion

}
