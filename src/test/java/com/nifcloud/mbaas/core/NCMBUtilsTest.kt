/*
 * Copyright 2017-2021 FUJITSU CLOUD TECHNOLOGIES LIMITED All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nifcloud.mbaas.core

import org.junit.Test
import org.junit.Assert.*
import org.mockito.Mockito
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class NCMBUtilsTest {
    @Test
    fun example1() {
        val example = Mockito.mock(NCMBUtils::class.java)

        Mockito.`when`(example.getId()).thenReturn(100)
        Mockito.`when`(example.getUrl(100))
            .thenReturn("https://codechacha.com")

        assertEquals(100, example.getId())
        assertEquals(
            "https://codechacha.com",
            example.getUrl(example.getId())
        )
    }
}
