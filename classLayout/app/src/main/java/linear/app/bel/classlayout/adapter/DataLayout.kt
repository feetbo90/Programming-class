package linear.app.bel.classlayout.adapter

import android.provider.ContactsContract
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.*
import linear.app.bel.classlayout.R
import linear.app.bel.classlayout.model.User

/**
 * Created by root on 15/03/18.
 **/


class DataLayout(val userList: ArrayList<User> ) : RecyclerView.Adapter<DataLayout.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.txtView?.text = userList.get(position).name
        //return
    }

    override fun getItemCount(): Int {
        return userList.size

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.datalayout, parent, false)
        return DataLayout.ViewHolder(v)
    }


    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        var txtView = itemView.findViewById<TextView>(R.id.text)
    }
}