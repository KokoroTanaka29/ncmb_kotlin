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

import android.app.Application

/**
 * Application's representative class.
 *
 * This class represent application and hold the state of the application
 *
 */

internal class NCMBApplicationController : Application() {
    /**
     *
     * Override super class method.
     * Do set application state property.
     *
     */
    override fun onCreate() {
        super.onCreate()
        applicationState = this
    }

    companion object {
        /**
         *
         * Get application state
         * @return ApplicationController
         *
         */
        var applicationState: NCMBApplicationController? = null
    }
}
