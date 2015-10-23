/*
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jasig.cas;

import org.jasig.cas.adaptors.jdbc.QueryAndEncodeDatabaseAuthenticationHandlerTests;
import org.jasig.cas.adaptors.jdbc.QueryDatabaseAuthenticationHandlerTests;
import org.jasig.cas.adaptors.jdbc.SearchModeSearchDatabaseAuthenticationHandlerTests;
import org.jasig.cas.monitor.DataSourceMonitorTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The {@link AllTestsSuite} is responsible for
 * running all jdbc test cases.
 *
 * @author Misagh Moayyed
 * @since 4.2.0
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({QueryAndEncodeDatabaseAuthenticationHandlerTests.class, QueryDatabaseAuthenticationHandlerTests.class,
        SearchModeSearchDatabaseAuthenticationHandlerTests.class, DataSourceMonitorTests.class})
public class AllTestsSuite {
}
