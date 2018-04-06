package linear.app.bel.privatprogrammingmaster.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.TextView
import linear.app.bel.classlayout.listener.OnItemClickListener
import linear.app.bel.privatprogrammingmaster.R
import linear.app.bel.privatprogrammingmaster.model.User

/**
 * Created by root on 04/04/18.
 **/


class DataLayout(val userList : ArrayList<User>) : RecyclerView.Adapter<DataLayout.ViewHolder>(){


    private companion object {
        var callback: onSuggestResultListener? = null
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.datalayout, parent, false)
        return DataLayout.ViewHolder(v)
    }

    override fun getItemCount(): Int {

        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {

        holder?.nama?.text = userList.get(position).name
        holder?.title?.text = userList.get(position).title

    }


    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        private val itemClickListener: OnItemClickListener? = null
        var nama : TextView? = null
        var title : TextView? = null

        init{
            nama = itemView.findViewById<TextView>(R.id.nama)
            title = itemView.findViewById<TextView>(R.id.title)
            itemView.setOnClickListener(View.OnClickListener {

                var value = adapterPosition
                callback?.onSuggestResult(value)


            })
        }
    }

    interface onSuggestResultListener {
        fun onSuggestResult(posisi : Int)
    }

    fun setOnSuggestResultListener(x: onSuggestResultListener) {
        callback = x
    }


}
