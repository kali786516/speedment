/*
 *
 * Copyright (c) 2006-2019, Speedment, Inc. All Rights Reserved.
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

package com.speedment.runtime.compute.expression.orelse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.speedment.runtime.compute.ToEnumNullable;
import org.junit.jupiter.api.Test;

final class ToEnumOrThrowTest {

    @Test
    void nullStrategy() {
        assertEquals(TestEnum.class, new DummyToEnumOrThrowTest().enumClass());
    }

    private static final class DummyToEnumOrThrowTest implements ToEnumOrThrow<Integer, TestEnum> {

        @Override
        public Class<TestEnum> enumClass() {
            return TestEnum.class;
        }

        @Override
        public TestEnum apply(Integer integer) {
            return null;
        }

        @Override
        public ToEnumNullable<Integer, TestEnum> innerNullable() {
            return null;
        }
    }

    private enum TestEnum {

    }
}