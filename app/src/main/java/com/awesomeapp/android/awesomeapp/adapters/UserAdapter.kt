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

package com.awesomeapp.android.awesomeapp.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.awesomeapp.android.awesomeapp.R
import com.awesomeapp.android.awesomeapp.model.UserModel

class UserAdapter (val usersList: ArrayList<UserModel>): RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.user_element, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return usersList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.slackName?.text = usersList[position].slackName
        holder?.workOrFinished?.text = usersList[position].projProgress
        holder?.languages?.text = usersList[position].userLanguages
    }

    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        val slackName = itemView.userSlackName
        val workOrFinished = itemView.duringWorkOrFinished
        val languages = itemView.languagesTxt
    }


}