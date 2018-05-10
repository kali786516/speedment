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
package com.speedment.common.tuple.mutable;

import com.speedment.common.tuple.MutableTuple;
import com.speedment.common.tuple.Tuple;
import com.speedment.common.tuple.TupleOfNullables;
import com.speedment.common.tuple.getter.TupleGetter0;
import com.speedment.common.tuple.getter.TupleGetter10;
import com.speedment.common.tuple.getter.TupleGetter11;
import com.speedment.common.tuple.getter.TupleGetter12;
import com.speedment.common.tuple.getter.TupleGetter1;
import com.speedment.common.tuple.getter.TupleGetter2;
import com.speedment.common.tuple.getter.TupleGetter3;
import com.speedment.common.tuple.getter.TupleGetter4;
import com.speedment.common.tuple.getter.TupleGetter5;
import com.speedment.common.tuple.getter.TupleGetter6;
import com.speedment.common.tuple.getter.TupleGetter7;
import com.speedment.common.tuple.getter.TupleGetter8;
import com.speedment.common.tuple.getter.TupleGetter9;
import com.speedment.common.tuple.getter.TupleGetter;
import java.util.Optional;
import java.util.function.BiConsumer;

/**
 * This interface defines a generic {@link MutableTuple} of any order that can
 * hold null values. A MutableTuple is type safe but <em>NOT</em> thread safe.
 * For pure non-null value elements see {@link Tuple}
 * This {@link MutableTuple} has a degree of 13
 * <p>
 * Generated by com.speedment.sources.pattern.tuple.TuplePattern
 * 
 * @param <T0>  type of element 0
 * @param <T1>  type of element 1
 * @param <T2>  type of element 2
 * @param <T3>  type of element 3
 * @param <T4>  type of element 4
 * @param <T5>  type of element 5
 * @param <T6>  type of element 6
 * @param <T7>  type of element 7
 * @param <T8>  type of element 8
 * @param <T9>  type of element 9
 * @param <T10> type of element 10
 * @param <T11> type of element 11
 * @param <T12> type of element 12
 * 
 * @author Per Minborg
 * 
 * @see Tuple
 * @see TupleOfNullables
 * @see MutableTuple
 */
public interface MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> extends MutableTuple {
    
    /**
     * Returns the 0th element from this tuple.
     * 
     * @return the 0th element from this tuple.
     */
    Optional<T0> get0();
    
    /**
     * Returns the 1st element from this tuple.
     * 
     * @return the 1st element from this tuple.
     */
    Optional<T1> get1();
    
    /**
     * Returns the 2nd element from this tuple.
     * 
     * @return the 2nd element from this tuple.
     */
    Optional<T2> get2();
    
    /**
     * Returns the 3rd element from this tuple.
     * 
     * @return the 3rd element from this tuple.
     */
    Optional<T3> get3();
    
    /**
     * Returns the 4th element from this tuple.
     * 
     * @return the 4th element from this tuple.
     */
    Optional<T4> get4();
    
    /**
     * Returns the 5th element from this tuple.
     * 
     * @return the 5th element from this tuple.
     */
    Optional<T5> get5();
    
    /**
     * Returns the 6th element from this tuple.
     * 
     * @return the 6th element from this tuple.
     */
    Optional<T6> get6();
    
    /**
     * Returns the 7th element from this tuple.
     * 
     * @return the 7th element from this tuple.
     */
    Optional<T7> get7();
    
    /**
     * Returns the 8th element from this tuple.
     * 
     * @return the 8th element from this tuple.
     */
    Optional<T8> get8();
    
    /**
     * Returns the 9th element from this tuple.
     * 
     * @return the 9th element from this tuple.
     */
    Optional<T9> get9();
    
    /**
     * Returns the 10th element from this tuple.
     * 
     * @return the 10th element from this tuple.
     */
    Optional<T10> get10();
    
    /**
     * Returns the 11st element from this tuple.
     * 
     * @return the 11st element from this tuple.
     */
    Optional<T11> get11();
    
    /**
     * Returns the 12nd element from this tuple.
     * 
     * @return the 12nd element from this tuple.
     */
    Optional<T12> get12();
    
    /**
     * Sets the 0th element in this tuple.
     * 
     * @param t0 the new value for the 0th element
     */
    void set0(T0 t0);
    
    /**
     * Sets the 1st element in this tuple.
     * 
     * @param t1 the new value for the 1st element
     */
    void set1(T1 t1);
    
    /**
     * Sets the 2nd element in this tuple.
     * 
     * @param t2 the new value for the 2nd element
     */
    void set2(T2 t2);
    
    /**
     * Sets the 3rd element in this tuple.
     * 
     * @param t3 the new value for the 3rd element
     */
    void set3(T3 t3);
    
    /**
     * Sets the 4th element in this tuple.
     * 
     * @param t4 the new value for the 4th element
     */
    void set4(T4 t4);
    
    /**
     * Sets the 5th element in this tuple.
     * 
     * @param t5 the new value for the 5th element
     */
    void set5(T5 t5);
    
    /**
     * Sets the 6th element in this tuple.
     * 
     * @param t6 the new value for the 6th element
     */
    void set6(T6 t6);
    
    /**
     * Sets the 7th element in this tuple.
     * 
     * @param t7 the new value for the 7th element
     */
    void set7(T7 t7);
    
    /**
     * Sets the 8th element in this tuple.
     * 
     * @param t8 the new value for the 8th element
     */
    void set8(T8 t8);
    
    /**
     * Sets the 9th element in this tuple.
     * 
     * @param t9 the new value for the 9th element
     */
    void set9(T9 t9);
    
    /**
     * Sets the 10th element in this tuple.
     * 
     * @param t10 the new value for the 10th element
     */
    void set10(T10 t10);
    
    /**
     * Sets the 11st element in this tuple.
     * 
     * @param t11 the new value for the 11st element
     */
    void set11(T11 t11);
    
    /**
     * Sets the 12nd element in this tuple.
     * 
     * @param t12 the new value for the 12nd element
     */
    void set12(T12 t12);
    
    @Override
    default int degree() {
        return 13;
    }
    
    @SuppressWarnings("unchecked")
    default Optional<Object> get(int index) {
        switch (index) {
            case 0 : return (Optional<Object>)get0();
            case 1 : return (Optional<Object>)get1();
            case 2 : return (Optional<Object>)get2();
            case 3 : return (Optional<Object>)get3();
            case 4 : return (Optional<Object>)get4();
            case 5 : return (Optional<Object>)get5();
            case 6 : return (Optional<Object>)get6();
            case 7 : return (Optional<Object>)get7();
            case 8 : return (Optional<Object>)get8();
            case 9 : return (Optional<Object>)get9();
            case 10 : return (Optional<Object>)get10();
            case 11 : return (Optional<Object>)get11();
            case 12 : return (Optional<Object>)get12();
            default : throw new IllegalArgumentException(String.format("Index %d is outside bounds of tuple of degree %s", index, degree()
            ));
        }
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 0th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 0th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> TupleGetter0<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, Optional<T0>> getter0() {
        return MutableTuple13::get0;
    }
    
    /**
     * Returns a setter for the 0th element in the {@code MutableTuple}.
     * 
     * @return      the element at the 0th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> BiConsumer<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, T0> setter0() {
        return MutableTuple13::set0;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 1st element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 1st position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> TupleGetter1<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, Optional<T1>> getter1() {
        return MutableTuple13::get1;
    }
    
    /**
     * Returns a setter for the 1st element in the {@code MutableTuple}.
     * 
     * @return      the element at the 1st position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> BiConsumer<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, T1> setter1() {
        return MutableTuple13::set1;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 2nd element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 2nd position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> TupleGetter2<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, Optional<T2>> getter2() {
        return MutableTuple13::get2;
    }
    
    /**
     * Returns a setter for the 2nd element in the {@code MutableTuple}.
     * 
     * @return      the element at the 2nd position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> BiConsumer<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, T2> setter2() {
        return MutableTuple13::set2;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 3rd element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 3rd position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> TupleGetter3<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, Optional<T3>> getter3() {
        return MutableTuple13::get3;
    }
    
    /**
     * Returns a setter for the 3rd element in the {@code MutableTuple}.
     * 
     * @return      the element at the 3rd position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> BiConsumer<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, T3> setter3() {
        return MutableTuple13::set3;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 4th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 4th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> TupleGetter4<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, Optional<T4>> getter4() {
        return MutableTuple13::get4;
    }
    
    /**
     * Returns a setter for the 4th element in the {@code MutableTuple}.
     * 
     * @return      the element at the 4th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> BiConsumer<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, T4> setter4() {
        return MutableTuple13::set4;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 5th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 5th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> TupleGetter5<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, Optional<T5>> getter5() {
        return MutableTuple13::get5;
    }
    
    /**
     * Returns a setter for the 5th element in the {@code MutableTuple}.
     * 
     * @return      the element at the 5th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> BiConsumer<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, T5> setter5() {
        return MutableTuple13::set5;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 6th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 6th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> TupleGetter6<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, Optional<T6>> getter6() {
        return MutableTuple13::get6;
    }
    
    /**
     * Returns a setter for the 6th element in the {@code MutableTuple}.
     * 
     * @return      the element at the 6th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> BiConsumer<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, T6> setter6() {
        return MutableTuple13::set6;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 7th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 7th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> TupleGetter7<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, Optional<T7>> getter7() {
        return MutableTuple13::get7;
    }
    
    /**
     * Returns a setter for the 7th element in the {@code MutableTuple}.
     * 
     * @return      the element at the 7th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> BiConsumer<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, T7> setter7() {
        return MutableTuple13::set7;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 8th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 8th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> TupleGetter8<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, Optional<T8>> getter8() {
        return MutableTuple13::get8;
    }
    
    /**
     * Returns a setter for the 8th element in the {@code MutableTuple}.
     * 
     * @return      the element at the 8th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> BiConsumer<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, T8> setter8() {
        return MutableTuple13::set8;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 9th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 9th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> TupleGetter9<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, Optional<T9>> getter9() {
        return MutableTuple13::get9;
    }
    
    /**
     * Returns a setter for the 9th element in the {@code MutableTuple}.
     * 
     * @return      the element at the 9th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> BiConsumer<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, T9> setter9() {
        return MutableTuple13::set9;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 10th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 10th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> TupleGetter10<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, Optional<T10>> getter10() {
        return MutableTuple13::get10;
    }
    
    /**
     * Returns a setter for the 10th element in the {@code MutableTuple}.
     * 
     * @return      the element at the 10th position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> BiConsumer<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, T10> setter10() {
        return MutableTuple13::set10;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 11st element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 11st position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> TupleGetter11<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, Optional<T11>> getter11() {
        return MutableTuple13::get11;
    }
    
    /**
     * Returns a setter for the 11st element in the {@code MutableTuple}.
     * 
     * @return      the element at the 11st position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> BiConsumer<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, T11> setter11() {
        return MutableTuple13::set11;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 12nd element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 12nd position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> TupleGetter12<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, Optional<T12>> getter12() {
        return MutableTuple13::get12;
    }
    
    /**
     * Returns a setter for the 12nd element in the {@code MutableTuple}.
     * 
     * @return      the element at the 12nd position
     * @param <T0>  the 0th element type
     * @param <T1>  the 1st element type
     * @param <T2>  the 2nd element type
     * @param <T3>  the 3rd element type
     * @param <T4>  the 4th element type
     * @param <T5>  the 5th element type
     * @param <T6>  the 6th element type
     * @param <T7>  the 7th element type
     * @param <T8>  the 8th element type
     * @param <T9>  the 9th element type
     * @param <T10> the 10th element type
     * @param <T11> the 11st element type
     * @param <T12> the 12nd element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> BiConsumer<MutableTuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, T12> setter12() {
        return MutableTuple13::set12;
    }
}