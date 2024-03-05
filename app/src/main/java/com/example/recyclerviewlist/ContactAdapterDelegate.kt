package com.example.recyclerviewlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.hannesdorfmann.adapterdelegates4.AdapterDelegate


class ContactAdapterDelegate(private val onItemClick : (Contact) -> Unit,
    private val onItemLongClick:(RecyclerView.ViewHolder) -> Unit): AdapterDelegate<List<Contact>>() {

    override fun isForViewType(items: List<Contact>, position: Int): Boolean {
        return true
    }

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_contact, parent, false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(
        items: List<Contact>,
        position: Int,
        viewHolder: RecyclerView.ViewHolder,
        payloads: MutableList<Any>
    ) {
        val contact = items[position]
        val contactViewHolder = viewHolder as ContactViewHolder

        contactViewHolder.bind(contact)
        contactViewHolder.itemView.setOnClickListener { onItemClick(contact) }
        contactViewHolder.itemView.setOnLongClickListener {
            onItemLongClick(contactViewHolder)
            true
        }
    }
    class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val checkID: CheckBox = itemView.findViewById(R.id.checkID)
        private val name: TextView = itemView.findViewById(R.id.name)
        private val number: TextView = itemView.findViewById(R.id.number)


        fun bind(contact: Contact) {
          name.text = " ${contact.firstName} ${contact.lastName}"
            number.text = contact.phoneNumber
        }
    }


}



