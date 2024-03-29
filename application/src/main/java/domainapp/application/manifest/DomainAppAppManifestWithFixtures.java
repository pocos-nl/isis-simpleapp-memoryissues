/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
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
package domainapp.application.manifest;

import domainapp.modules.simple.fixture.SimpleObject_persona;
import domainapp.modules.simple.fixture.securityperformancetest.ApplicationUser_create_Sven;
import domainapp.modules.simple.fixture.securityperformancetest.TestPermissionsFixtureScript;
import domainapp.modules.simple.fixture.securityperformancetest.UserRole_create_SvenUser_SecurityPerformanceTestRole;

import org.apache.isis.applib.fixturescripts.FixtureScript;

import java.util.List;

/**
 * Run the app but setting up any fixtures.
 */
public class DomainAppAppManifestWithFixtures extends DomainAppAppManifest {

    @Override
    protected void overrideFixtures(final List<Class<? extends FixtureScript>> fixtureScripts) {
        fixtureScripts.add(SimpleObject_persona.PersistAll.class);
        fixtureScripts.add(TestPermissionsFixtureScript.class);
        fixtureScripts.add(ApplicationUser_create_Sven.class);
        fixtureScripts.add(UserRole_create_SvenUser_SecurityPerformanceTestRole.class);
    }

}
