package linear.app.bel.classlayout.adapter

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import linear.app.bel.classlayout.R
import linear.app.bel.classlayout.listener.OnItemClickListener
import linear.app.bel.classlayout.model.User

/**
 * Created by root on 15/03/18.
 **/

class RecyclerAdapter(val userlist : ArrayList<User>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){

    private companion object {
        var callback: RecyclerAdapter.onSuggestResultListener? = null
    }


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent?.context).inflate(R.layout.item_layout, parent, false)
        return RecyclerAdapter.ViewHolder(v);

    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {

        holder?.txtName?.setText(userlist.get(position).name)
        holder?.txtTitle?.setText(userlist.get(position).title)
    }

    override fun getItemCount(): Int {
               return userlist.size
    }


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        //private val itemClickListener: OnItemClickListener? = null
        var txtName : TextView? = null
        var txtTitle : TextView? = null
        init {
            txtName = itemView.findViewById<TextView>(R.id.txtName)
            txtTitle = itemView.findViewById<TextView>(R.id.txtTitle)
            itemView.setOnClickListener(View.OnClickListener {
                var value = adapterPosition
                Log.d("masuk" , "posisi : "+value)

                RecyclerAdapter.callback?.onSuggestResult(value)
                //onItemClickListener = itemClickListener
                //onItemClickListener?.onItemClick(value)
            })
        }

    }

    interface onSuggestResultListener {
        fun onSuggestResult(posisi : Int)
    }

    fun setOnSuggestResultListener(x: onSuggestResultListener) {
        RecyclerAdapter.callback = x
    }


}
