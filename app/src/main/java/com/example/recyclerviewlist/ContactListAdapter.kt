package com.example.recyclerviewlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class ContactListAdapter:ListAdapter<Contact, ContactListAdapter.ContactViewHolder>(ContactDiffUtil()) {
    private var isSelectionModeEnable = false
    private val checkedContacts = mutableListOf<Contact>()

    fun enableSelectionMode(enable:Boolean){
        isSelectionModeEnable = enable
        notifyDataSetChanged()
    }
    fun getCheckedContacts():List<Contact>{
        return checkedContacts
    }
    inner class ContactViewHolder(view:View):RecyclerView.ViewHolder(view) {
        private val checkID: CheckBox =view.findViewById(R.id.checkID)
        private val name: TextView = view.findViewById(R.id.name)
        private val number: TextView = view.findViewById(R.id.number)
        fun bind(contact: Contact) {
            name.text = "${contact.firstName} ${contact.lastName}"
            number.text = contact.phoneNumber
            checkID.isChecked = checkedContacts.contains(contact)
            checkID.visibility = if (isSelectionModeEnable) View.VISIBLE else
                View.GONE

            if (isSelectionModeEnable){
                checkID.setOnCheckedChangeListener { _, Checked ->
                checkID.isChecked = !checkID.isChecked
                    if (checkID.isChecked){
                        checkedContacts.add(contact)
                    }else{
                        checkedContacts.remove(contact)
                    }
                }
            }else{

            }
            }
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.item_contact, parent, false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}
