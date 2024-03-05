package com.example.recyclerviewlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewlist.databinding.ActivityMainBinding
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter

class MainActivity : AppCompatActivity() {
    private var contact:ArrayList<Contact> = ArrayList()
    private lateinit var aContact: ContactListAdapter

    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        createContactList()

        aContact = ContactListAdapter()
        aContact.submitList(contact)

        binding.recycler.apply {
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
            adapter = aContact

        }
        


    
    }


    private fun createContactList():ArrayList<Contact> {
        contact.add(Contact(0, "Амелия","Никитина","(708)399-41-86)"))
        contact.add(Contact(1,"Дмитрий","Королев","(708)399-61-90)"))
        contact.add(Contact(2,"Эмилия","Емельянова","(708)399-80-90)"))
        contact.add(Contact(3,"Ольга","Лопатина","(708)450-61-90)"))
        contact.add(Contact(4,"Виктория ","Петрова","(708)499-60-85)"))
        contact.add(Contact(5,"Артём","Антонов","(908)999-61-95)"))
        contact.add(Contact(6,"Артём ","Савельев ","(990)699-55-90)"))
        contact.add(Contact(7,"Анастасия","Евдокимова","(708)399-61-90)"))
        contact.add(Contact(8,"Дмитрий","Королев","(955)399-70-61)"))
        contact.add(Contact(9,"Дмитрий","Королев","(985)465-80-90)"))
        contact.add(Contact(10,"Дмитрий","Королев","(708)655-45-90)"))
        contact.add(Contact(11,"Дмитрий","Королев","(708)366-16-91)"))
        contact.add(Contact(12,"Дмитрий","Королев","(708)366-16-92)"))
        contact.add(Contact(13,"Дмитрий","Королев","(708)366-16-93)"))
        contact.add(Contact(14,"Дмитрий","Королев","(708)399-61-66)"))
        contact.add(Contact(15,"Дмитрий","Королев","(708)399-85-32)"))
        contact.add(Contact(16,"Дмитрий","Королев","(708)399-33-66)"))
        contact.add(Contact(17,"Дмитрий","Королев","(708)399-45-45)"))
        contact.add(Contact(18,"Дмитрий","Королев","(708)399-20-66)"))
        contact.add(Contact(19,"Дмитрий","Королев","(708)399-90-66)"))
        contact.add(Contact(20,"Дмитрий","Королев","(708)399-45-45)"))
        contact.add(Contact(21,"Дмитрий","Королев","(708)399-61-61)"))
        contact.add(Contact(22,"Дмитрий","Королев","(708)399-90-90)"))
        contact.add(Contact(23,"Дмитрий","Королев","(708)399-12-22)"))
        contact.add(Contact(24,"Дмитрий","Королев","(708)399-12-13)"))
        contact.add(Contact(25,"Дмитрий","Королев","(708)399-12-14)"))
        contact.add(Contact(26,"Дмитрий","Королев","(708)399-12-15)"))
        contact.add(Contact(27,"Дмитрий","Королев","(708)399-12-16)"))
        contact.add(Contact(28,"Дмитрий","Королев","(708)399-12-17)"))
        contact.add(Contact(29,"Дмитрий","Королев","(708)399-12-18)"))
        contact.add(Contact(30,"Дмитрий","Королев","(708)399-12-19)"))
        contact.add(Contact(31,"Дмитрий","Королев","(708)399-30-31)"))
        contact.add(Contact(32,"Дмитрий","Королев","(708)399-90-92)"))
        contact.add(Contact(33,"Дмитрий","Королев","(708)399-90-55)"))
        contact.add(Contact(34,"Дмитрий","Королев","(708)399-62-93)"))
        contact.add(Contact(35,"Дмитрий","Королев","(708)399-61-90)"))
        contact.add(Contact(36,"Дмитрий","Королев","(708)399-55-55)"))
        contact.add(Contact(37,"Дмитрий","Королев","(708)399-32-32)"))
        contact.add(Contact(38,"Дмитрий","Королев","(708)399-60-60)"))
        contact.add(Contact(40,"Дмитрий","Королев","(708)399-33-33)"))
        contact.add(Contact(41,"Дмитрий","Королев","(708)399-35-35)"))
        contact.add(Contact(42,"Дмитрий","Королев","(708)399-90-35)"))
        contact.add(Contact(43,"Дмитрий","Королев","(708)399-44-47)"))
        contact.add(Contact(44,"Дмитрий","Королев","(708)399-95-95)"))
        contact.add(Contact(45,"Дмитрий","Королев","(708)399-99-99)"))
        contact.add(Contact(46,"Дмитрий","Королев","(708)400-01-10)"))
        contact.add(Contact(47,"Дмитрий","Королев","(708)400-01-11)"))
        contact.add(Contact(48,"Дмитрий","Королев","(708)400-01-12)"))
        contact.add(Contact(49,"Дмитрий","Королев","(708)400-01-13)"))
        contact.add(Contact(50,"Дмитрий","Королев","(708)400-01-14)"))
        contact.add(Contact(51,"Дмитрий","Королев","(708)400-01-15)"))
        contact.add(Contact(52,"Дмитрий","Королев","(708)400-01-16)"))
        contact.add(Contact(53,"Дмитрий","Королев","(708)400-01-17)"))
        contact.add(Contact(54,"Дмитрий","Королев","(708)400-01-18)"))
        contact.add(Contact(55,"Дмитрий","Королев","(708)400-01-19)"))
    return contact
    }

}