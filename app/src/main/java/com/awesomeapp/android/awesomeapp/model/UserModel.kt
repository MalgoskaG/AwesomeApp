/*
 *    Copyright 2018 MalgoskaG & Bwaim
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.awesomeapp.android.awesomeapp.model

data class UserModel(var currentProject: String, var language: String, var slackName: String
                     , var userTrack: String) {
    constructor() : this("", "", "", "")

    fun getLanguage(index: Int): String {
        var lang = ""
        try {
            lang = language.split(",")[index]
        } catch (e: IndexOutOfBoundsException) {
            // It could happen, just ignore it
        }
        return lang
    }
}