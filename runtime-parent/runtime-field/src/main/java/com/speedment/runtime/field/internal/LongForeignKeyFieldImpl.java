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
package com.speedment.runtime.field.internal;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.field.LongField;
import com.speedment.runtime.field.LongForeignKeyField;
import com.speedment.runtime.field.internal.comparator.LongFieldComparator;
import com.speedment.runtime.field.internal.comparator.LongFieldComparatorImpl;
import com.speedment.runtime.field.internal.method.BackwardFinderImpl;
import com.speedment.runtime.field.internal.method.FindFromLong;
import com.speedment.runtime.field.internal.method.GetLongImpl;
import com.speedment.runtime.field.internal.predicate.longs.LongBetweenPredicate;
import com.speedment.runtime.field.internal.predicate.longs.LongEqualPredicate;
import com.speedment.runtime.field.internal.predicate.longs.LongGreaterOrEqualPredicate;
import com.speedment.runtime.field.internal.predicate.longs.LongGreaterThanPredicate;
import com.speedment.runtime.field.internal.predicate.longs.LongInPredicate;
import com.speedment.runtime.field.internal.predicate.longs.LongLessOrEqualPredicate;
import com.speedment.runtime.field.internal.predicate.longs.LongLessThanPredicate;
import com.speedment.runtime.field.internal.predicate.longs.LongNotBetweenPredicate;
import com.speedment.runtime.field.internal.predicate.longs.LongNotEqualPredicate;
import com.speedment.runtime.field.internal.predicate.longs.LongNotInPredicate;
import com.speedment.runtime.field.method.BackwardFinder;
import com.speedment.runtime.field.method.FindFrom;
import com.speedment.runtime.field.method.GetLong;
import com.speedment.runtime.field.method.LongGetter;
import com.speedment.runtime.field.method.LongSetter;
import com.speedment.runtime.field.predicate.FieldPredicate;
import com.speedment.runtime.field.predicate.Inclusion;
import com.speedment.runtime.typemapper.TypeMapper;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import static com.speedment.runtime.field.internal.util.CollectionUtil.collectionToSet;
import static java.util.Objects.requireNonNull;

/**
 * Default implementation of the {@link LongField}-interface.
 * 
 * @param <ENTITY>    entity type
 * @param <D>         database type
 * @param <FK_ENTITY> foreign entity type
 * 
 * @author Emil Forslund
 * @since  3.0.0
 */
@GeneratedCode(value = "Speedment")
public final class LongForeignKeyFieldImpl<ENTITY, D, FK_ENTITY> implements LongField<ENTITY, D>, LongForeignKeyField<ENTITY, D, FK_ENTITY> {
    
    private final ColumnIdentifier<ENTITY> identifier;
    private final GetLong<ENTITY, D> getter;
    private final LongSetter<ENTITY> setter;
    private final LongField<FK_ENTITY, D> referenced;
    private final TypeMapper<D, Long> typeMapper;
    private final boolean unique;
    
    public LongForeignKeyFieldImpl(
            ColumnIdentifier<ENTITY> identifier,
            LongGetter<ENTITY> getter,
            LongSetter<ENTITY> setter,
            LongField<FK_ENTITY, D> referenced,
            TypeMapper<D, Long> typeMapper,
            boolean unique) {
        this.identifier = requireNonNull(identifier);
        this.getter     = new GetLongImpl<>(this, getter);
        this.setter     = requireNonNull(setter);
        this.referenced = requireNonNull(referenced);
        this.typeMapper = requireNonNull(typeMapper);
        this.unique     = unique;
    }
    
    @Override
    public ColumnIdentifier<ENTITY> identifier() {
        return identifier;
    }
    
    @Override
    public LongSetter<ENTITY> setter() {
        return setter;
    }
    
    @Override
    public GetLong<ENTITY, D> getter() {
        return getter;
    }
    
    @Override
    public LongField<FK_ENTITY, D> getReferencedField() {
        return referenced;
    }
    
    @Override
    public BackwardFinder<FK_ENTITY, ENTITY> backwardFinder(TableIdentifier<ENTITY> identifier, Supplier<Stream<ENTITY>> streamSupplier) {
        return new BackwardFinderImpl<>(this, identifier, streamSupplier);
    }
    
    @Override
    public FindFrom<ENTITY, FK_ENTITY> finder(TableIdentifier<FK_ENTITY> identifier, Supplier<Stream<FK_ENTITY>> streamSupplier) {
        return new FindFromLong<>(this, referenced, identifier, streamSupplier);
    }
    
    @Override
    public TypeMapper<D, Long> typeMapper() {
        return typeMapper;
    }
    
    @Override
    public boolean isUnique() {
        return unique;
    }
    
    @Override
    public LongFieldComparator<ENTITY, D> comparator() {
        return new LongFieldComparatorImpl<>(this);
    }
    
    @Override
    public LongFieldComparator<ENTITY, D> comparatorNullFieldsFirst() {
        return comparator();
    }
    
    @Override
    public FieldPredicate<ENTITY> equal(Long value) {
        return new LongEqualPredicate<>(this, value);
    }
    
    @Override
    public FieldPredicate<ENTITY> greaterThan(Long value) {
        return new LongGreaterThanPredicate<>(this, value);
    }
    
    @Override
    public FieldPredicate<ENTITY> greaterOrEqual(Long value) {
        return new LongGreaterOrEqualPredicate<>(this, value);
    }
    
    @Override
    public FieldPredicate<ENTITY> between(Long start, Long end, Inclusion inclusion) {
        return new LongBetweenPredicate<>(this, start, end, inclusion);
    }
    
    @Override
    public FieldPredicate<ENTITY> in(Collection<Long> values) {
        return new LongInPredicate<>(this, collectionToSet(values));
    }
    
    @Override
    public Predicate<ENTITY> notEqual(Long value) {
        return new LongNotEqualPredicate<>(this, value);
    }
    
    @Override
    public Predicate<ENTITY> lessOrEqual(Long value) {
        return new LongLessOrEqualPredicate<>(this, value);
    }
    
    @Override
    public Predicate<ENTITY> lessThan(Long value) {
        return new LongLessThanPredicate<>(this, value);
    }
    
    @Override
    public Predicate<ENTITY> notBetween(Long start, Long end, Inclusion inclusion) {
        return new LongNotBetweenPredicate<>(this, start, end, inclusion);
    }
    
    @Override
    public Predicate<ENTITY> notIn(Collection<Long> values) {
        return new LongNotInPredicate<>(this, collectionToSet(values));
    }
}