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
package com.speedment.runtime.field.predicate;

import com.speedment.runtime.compute.ToBoolean;
import com.speedment.runtime.field.predicate.trait.HasField;
import com.speedment.runtime.field.predicate.trait.HasPredicateType;

import java.util.function.Predicate;

/**
 * The base interface for all {@link Predicate predicates} generated by
 * Speedment entity fields.
 * 
 * @param <ENTITY>  the entity type that is being tested
 * 
 * @author  Per Minborg
 * @since   2.1.0
 */
public interface FieldPredicate<ENTITY>
extends ToBoolean<ENTITY>,
        HasField<ENTITY>,
        HasPredicateType {

    @Override
    FieldPredicate<ENTITY> negate();
}