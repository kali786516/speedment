/**
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
package com.speedment.common.tuple.internal.mutable;

import com.speedment.common.tuple.MutableTuple;
import com.speedment.common.tuple.Tuple7;
import com.speedment.common.tuple.Tuple;
import com.speedment.common.tuple.TupleOfNullables;
import com.speedment.common.tuple.internal.AbstractMutableTuple;
import com.speedment.common.tuple.mutable.MutableTuple7;

import java.util.Optional;

/**
 * An implementation class of a {@link MutableTuple7}.
 * <p>
 * Generated by com.speedment.sources.pattern.tuple.TupleImplPattern
 * 
 * @param <T0> type of element 0
 * @param <T1> type of element 1
 * @param <T2> type of element 2
 * @param <T3> type of element 3
 * @param <T4> type of element 4
 * @param <T5> type of element 5
 * @param <T6> type of element 6
 * 
 * @author Per Minborg
 */
public final class MutableTuple7Impl<T0, T1, T2, T3, T4, T5, T6> 
extends AbstractMutableTuple 
implements MutableTuple7<T0, T1, T2, T3, T4, T5, T6> {
    
    /**
     * Constructs a {@link MutableTuple} of type {@link MutableTuple7}.
     */
    public MutableTuple7Impl() {
        super(MutableTuple7Impl.class, 7);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T0> get0() {
        return Optional.ofNullable((T0) values[0]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T1> get1() {
        return Optional.ofNullable((T1) values[1]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T2> get2() {
        return Optional.ofNullable((T2) values[2]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T3> get3() {
        return Optional.ofNullable((T3) values[3]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T4> get4() {
        return Optional.ofNullable((T4) values[4]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T5> get5() {
        return Optional.ofNullable((T5) values[5]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T6> get6() {
        return Optional.ofNullable((T6) values[6]);
    }
    
    @Override
    public void set0(T0 t0) {
        values[0] = t0;
    }
    
    @Override
    public void set1(T1 t1) {
        values[1] = t1;
    }
    
    @Override
    public void set2(T2 t2) {
        values[2] = t2;
    }
    
    @Override
    public void set3(T3 t3) {
        values[3] = t3;
    }
    
    @Override
    public void set4(T4 t4) {
        values[4] = t4;
    }
    
    @Override
    public void set5(T5 t5) {
        values[5] = t5;
    }
    
    @Override
    public void set6(T6 t6) {
        values[6] = t6;
    }
}