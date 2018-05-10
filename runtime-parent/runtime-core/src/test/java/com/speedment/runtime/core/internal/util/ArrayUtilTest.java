/**
 *
 * Copyright (c) 2006-2018, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.speedment.runtime.core.internal.util;

import com.speedment.common.invariant.NullUtil;
import org.junit.*;

import static org.junit.Assert.fail;

/**
 *
 * @author pemi
 */
public class ArrayUtilTest {

    public ArrayUtilTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of requireNonNulls method, of class ArrayUtil.
     */
    @Test
    public void testRequireNonNulls_Object_Object() {
        Object o0 = "A";
        Object o1 = null;
        try {
            NullUtil.requireNonNulls(o0, o1);
            fail("No NPE");
        } catch (NullPointerException npe) {
            //System.out.println(npe);
// ignore
        }

    }

}
