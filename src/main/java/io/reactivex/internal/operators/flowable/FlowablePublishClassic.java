/**
 * Copyright (c) 2016-present, RxJava Contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */

package io.reactivex.internal.operators.flowable;

import org.reactivestreams.Publisher;

/**
 * Interface to mark classic publish() operators to
 * indicate refCount() should replace them with the Alt
 * implementation.
 * <p>
 * Without this, hooking the connectables with an intercept
 * implementation would result in the unintended lack
 * or presense of the replacement by refCount().
 *
 * @param <T> the element type of the sequence
 * @since 2.2.10
 */
public interface FlowablePublishClassic<T> {

    /**
     * The upstream source of this publish operator.
     * @return the upstream source of this publish operator
     */
    Publisher<T> publishSource();

    /**
     * The internal buffer size of this publish operator.
     * @return the internal buffer size of this publish operator
     */
    int publishBufferSize();
}
