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
package com.speedment.common.tuple.nullable;

import com.speedment.common.tuple.MutableTuple;
import com.speedment.common.tuple.Tuple;
import com.speedment.common.tuple.TupleOfNullables;
import com.speedment.common.tuple.getter.TupleGetter0;
import com.speedment.common.tuple.getter.TupleGetter10;
import com.speedment.common.tuple.getter.TupleGetter11;
import com.speedment.common.tuple.getter.TupleGetter12;
import com.speedment.common.tuple.getter.TupleGetter13;
import com.speedment.common.tuple.getter.TupleGetter14;
import com.speedment.common.tuple.getter.TupleGetter15;
import com.speedment.common.tuple.getter.TupleGetter16;
import com.speedment.common.tuple.getter.TupleGetter17;
import com.speedment.common.tuple.getter.TupleGetter18;
import com.speedment.common.tuple.getter.TupleGetter19;
import com.speedment.common.tuple.getter.TupleGetter1;
import com.speedment.common.tuple.getter.TupleGetter20;
import com.speedment.common.tuple.getter.TupleGetter21;
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

/**
 * This interface defines a generic {@link TupleOfNullables} of degree22 that
 * can hold null values. A TupleOfNullable is type safe, immutable and thread
 * safe. For pure non-null value elements see {@link Tuple}. For mutable tuples
 * see {@link MutableTuple}
 * This {@link TupleOfNullables} has a degree of 22
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
 * @param <T13> type of element 13
 * @param <T14> type of element 14
 * @param <T15> type of element 15
 * @param <T16> type of element 16
 * @param <T17> type of element 17
 * @param <T18> type of element 18
 * @param <T19> type of element 19
 * @param <T20> type of element 20
 * @param <T21> type of element 21
 * 
 * @author Per Minborg
 * 
 * @see Tuple
 * @see TupleOfNullables
 * @see MutableTuple
 */
public interface Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> extends TupleOfNullables {
    
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
     * Returns the 13rd element from this tuple.
     * 
     * @return the 13rd element from this tuple.
     */
    Optional<T13> get13();
    
    /**
     * Returns the 14th element from this tuple.
     * 
     * @return the 14th element from this tuple.
     */
    Optional<T14> get14();
    
    /**
     * Returns the 15th element from this tuple.
     * 
     * @return the 15th element from this tuple.
     */
    Optional<T15> get15();
    
    /**
     * Returns the 16th element from this tuple.
     * 
     * @return the 16th element from this tuple.
     */
    Optional<T16> get16();
    
    /**
     * Returns the 17th element from this tuple.
     * 
     * @return the 17th element from this tuple.
     */
    Optional<T17> get17();
    
    /**
     * Returns the 18th element from this tuple.
     * 
     * @return the 18th element from this tuple.
     */
    Optional<T18> get18();
    
    /**
     * Returns the 19th element from this tuple.
     * 
     * @return the 19th element from this tuple.
     */
    Optional<T19> get19();
    
    /**
     * Returns the 20th element from this tuple.
     * 
     * @return the 20th element from this tuple.
     */
    Optional<T20> get20();
    
    /**
     * Returns the 21st element from this tuple.
     * 
     * @return the 21st element from this tuple.
     */
    Optional<T21> get21();
    
    @Override
    default int degree() {
        return 22;
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
            case 13 : return (Optional<Object>)get13();
            case 14 : return (Optional<Object>)get14();
            case 15 : return (Optional<Object>)get15();
            case 16 : return (Optional<Object>)get16();
            case 17 : return (Optional<Object>)get17();
            case 18 : return (Optional<Object>)get18();
            case 19 : return (Optional<Object>)get19();
            case 20 : return (Optional<Object>)get20();
            case 21 : return (Optional<Object>)get21();
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
     * @param <T13> the 13rd element type
     * @param <T14> the 14th element type
     * @param <T15> the 15th element type
     * @param <T16> the 16th element type
     * @param <T17> the 17th element type
     * @param <T18> the 18th element type
     * @param <T19> the 19th element type
     * @param <T20> the 20th element type
     * @param <T21> the 21st element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter0<Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, Optional<T0>> getter0() {
        return Tuple22OfNullables::get0;
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
     * @param <T13> the 13rd element type
     * @param <T14> the 14th element type
     * @param <T15> the 15th element type
     * @param <T16> the 16th element type
     * @param <T17> the 17th element type
     * @param <T18> the 18th element type
     * @param <T19> the 19th element type
     * @param <T20> the 20th element type
     * @param <T21> the 21st element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter1<Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, Optional<T1>> getter1() {
        return Tuple22OfNullables::get1;
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
     * @param <T13> the 13rd element type
     * @param <T14> the 14th element type
     * @param <T15> the 15th element type
     * @param <T16> the 16th element type
     * @param <T17> the 17th element type
     * @param <T18> the 18th element type
     * @param <T19> the 19th element type
     * @param <T20> the 20th element type
     * @param <T21> the 21st element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter2<Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, Optional<T2>> getter2() {
        return Tuple22OfNullables::get2;
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
     * @param <T13> the 13rd element type
     * @param <T14> the 14th element type
     * @param <T15> the 15th element type
     * @param <T16> the 16th element type
     * @param <T17> the 17th element type
     * @param <T18> the 18th element type
     * @param <T19> the 19th element type
     * @param <T20> the 20th element type
     * @param <T21> the 21st element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter3<Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, Optional<T3>> getter3() {
        return Tuple22OfNullables::get3;
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
     * @param <T13> the 13rd element type
     * @param <T14> the 14th element type
     * @param <T15> the 15th element type
     * @param <T16> the 16th element type
     * @param <T17> the 17th element type
     * @param <T18> the 18th element type
     * @param <T19> the 19th element type
     * @param <T20> the 20th element type
     * @param <T21> the 21st element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter4<Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, Optional<T4>> getter4() {
        return Tuple22OfNullables::get4;
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
     * @param <T13> the 13rd element type
     * @param <T14> the 14th element type
     * @param <T15> the 15th element type
     * @param <T16> the 16th element type
     * @param <T17> the 17th element type
     * @param <T18> the 18th element type
     * @param <T19> the 19th element type
     * @param <T20> the 20th element type
     * @param <T21> the 21st element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter5<Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, Optional<T5>> getter5() {
        return Tuple22OfNullables::get5;
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
     * @param <T13> the 13rd element type
     * @param <T14> the 14th element type
     * @param <T15> the 15th element type
     * @param <T16> the 16th element type
     * @param <T17> the 17th element type
     * @param <T18> the 18th element type
     * @param <T19> the 19th element type
     * @param <T20> the 20th element type
     * @param <T21> the 21st element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter6<Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, Optional<T6>> getter6() {
        return Tuple22OfNullables::get6;
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
     * @param <T13> the 13rd element type
     * @param <T14> the 14th element type
     * @param <T15> the 15th element type
     * @param <T16> the 16th element type
     * @param <T17> the 17th element type
     * @param <T18> the 18th element type
     * @param <T19> the 19th element type
     * @param <T20> the 20th element type
     * @param <T21> the 21st element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter7<Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, Optional<T7>> getter7() {
        return Tuple22OfNullables::get7;
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
     * @param <T13> the 13rd element type
     * @param <T14> the 14th element type
     * @param <T15> the 15th element type
     * @param <T16> the 16th element type
     * @param <T17> the 17th element type
     * @param <T18> the 18th element type
     * @param <T19> the 19th element type
     * @param <T20> the 20th element type
     * @param <T21> the 21st element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter8<Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, Optional<T8>> getter8() {
        return Tuple22OfNullables::get8;
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
     * @param <T13> the 13rd element type
     * @param <T14> the 14th element type
     * @param <T15> the 15th element type
     * @param <T16> the 16th element type
     * @param <T17> the 17th element type
     * @param <T18> the 18th element type
     * @param <T19> the 19th element type
     * @param <T20> the 20th element type
     * @param <T21> the 21st element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter9<Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, Optional<T9>> getter9() {
        return Tuple22OfNullables::get9;
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
     * @param <T13> the 13rd element type
     * @param <T14> the 14th element type
     * @param <T15> the 15th element type
     * @param <T16> the 16th element type
     * @param <T17> the 17th element type
     * @param <T18> the 18th element type
     * @param <T19> the 19th element type
     * @param <T20> the 20th element type
     * @param <T21> the 21st element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter10<Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, Optional<T10>> getter10() {
        return Tuple22OfNullables::get10;
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
     * @param <T13> the 13rd element type
     * @param <T14> the 14th element type
     * @param <T15> the 15th element type
     * @param <T16> the 16th element type
     * @param <T17> the 17th element type
     * @param <T18> the 18th element type
     * @param <T19> the 19th element type
     * @param <T20> the 20th element type
     * @param <T21> the 21st element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter11<Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, Optional<T11>> getter11() {
        return Tuple22OfNullables::get11;
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
     * @param <T13> the 13rd element type
     * @param <T14> the 14th element type
     * @param <T15> the 15th element type
     * @param <T16> the 16th element type
     * @param <T17> the 17th element type
     * @param <T18> the 18th element type
     * @param <T19> the 19th element type
     * @param <T20> the 20th element type
     * @param <T21> the 21st element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter12<Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, Optional<T12>> getter12() {
        return Tuple22OfNullables::get12;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 13rd element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 13rd position
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
     * @param <T13> the 13rd element type
     * @param <T14> the 14th element type
     * @param <T15> the 15th element type
     * @param <T16> the 16th element type
     * @param <T17> the 17th element type
     * @param <T18> the 18th element type
     * @param <T19> the 19th element type
     * @param <T20> the 20th element type
     * @param <T21> the 21st element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter13<Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, Optional<T13>> getter13() {
        return Tuple22OfNullables::get13;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 14th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 14th position
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
     * @param <T13> the 13rd element type
     * @param <T14> the 14th element type
     * @param <T15> the 15th element type
     * @param <T16> the 16th element type
     * @param <T17> the 17th element type
     * @param <T18> the 18th element type
     * @param <T19> the 19th element type
     * @param <T20> the 20th element type
     * @param <T21> the 21st element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter14<Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, Optional<T14>> getter14() {
        return Tuple22OfNullables::get14;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 15th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 15th position
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
     * @param <T13> the 13rd element type
     * @param <T14> the 14th element type
     * @param <T15> the 15th element type
     * @param <T16> the 16th element type
     * @param <T17> the 17th element type
     * @param <T18> the 18th element type
     * @param <T19> the 19th element type
     * @param <T20> the 20th element type
     * @param <T21> the 21st element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter15<Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, Optional<T15>> getter15() {
        return Tuple22OfNullables::get15;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 16th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 16th position
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
     * @param <T13> the 13rd element type
     * @param <T14> the 14th element type
     * @param <T15> the 15th element type
     * @param <T16> the 16th element type
     * @param <T17> the 17th element type
     * @param <T18> the 18th element type
     * @param <T19> the 19th element type
     * @param <T20> the 20th element type
     * @param <T21> the 21st element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter16<Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, Optional<T16>> getter16() {
        return Tuple22OfNullables::get16;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 17th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 17th position
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
     * @param <T13> the 13rd element type
     * @param <T14> the 14th element type
     * @param <T15> the 15th element type
     * @param <T16> the 16th element type
     * @param <T17> the 17th element type
     * @param <T18> the 18th element type
     * @param <T19> the 19th element type
     * @param <T20> the 20th element type
     * @param <T21> the 21st element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter17<Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, Optional<T17>> getter17() {
        return Tuple22OfNullables::get17;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 18th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 18th position
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
     * @param <T13> the 13rd element type
     * @param <T14> the 14th element type
     * @param <T15> the 15th element type
     * @param <T16> the 16th element type
     * @param <T17> the 17th element type
     * @param <T18> the 18th element type
     * @param <T19> the 19th element type
     * @param <T20> the 20th element type
     * @param <T21> the 21st element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter18<Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, Optional<T18>> getter18() {
        return Tuple22OfNullables::get18;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 19th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 19th position
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
     * @param <T13> the 13rd element type
     * @param <T14> the 14th element type
     * @param <T15> the 15th element type
     * @param <T16> the 16th element type
     * @param <T17> the 17th element type
     * @param <T18> the 18th element type
     * @param <T19> the 19th element type
     * @param <T20> the 20th element type
     * @param <T21> the 21st element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter19<Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, Optional<T19>> getter19() {
        return Tuple22OfNullables::get19;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 20th element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 20th position
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
     * @param <T13> the 13rd element type
     * @param <T14> the 14th element type
     * @param <T15> the 15th element type
     * @param <T16> the 16th element type
     * @param <T17> the 17th element type
     * @param <T18> the 18th element type
     * @param <T19> the 19th element type
     * @param <T20> the 20th element type
     * @param <T21> the 21st element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter20<Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, Optional<T20>> getter20() {
        return Tuple22OfNullables::get20;
    }
    
    /**
     * Returns a {@link TupleGetter getter} for the 21st element in the {@code
     * Tuple}.
     * 
     * @return      the element at the 21st position
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
     * @param <T13> the 13rd element type
     * @param <T14> the 14th element type
     * @param <T15> the 15th element type
     * @param <T16> the 16th element type
     * @param <T17> the 17th element type
     * @param <T18> the 18th element type
     * @param <T19> the 19th element type
     * @param <T20> the 20th element type
     * @param <T21> the 21st element type
     */
    static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> TupleGetter21<Tuple22OfNullables<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>, Optional<T21>> getter21() {
        return Tuple22OfNullables::get21;
    }
}